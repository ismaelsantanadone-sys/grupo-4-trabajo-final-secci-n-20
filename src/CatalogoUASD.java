import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class CatalogoUASD extends JFrame {

    private JComboBox<String> comboEscuelas;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaCarreras;
    private JButton btnMostrar;

    public CatalogoUASD() {

        setTitle("Catálogo UASD");
        setSize(500, 350);
        setLayout(null);

        comboEscuelas = new JComboBox<>();
        comboEscuelas.setBounds(50, 30, 300, 25);
        add(comboEscuelas);

        btnMostrar = new JButton("Mostrar Carreras");
        btnMostrar.setBounds(360, 30, 130, 25);
        add(btnMostrar);

        modeloLista = new DefaultListModel<>();
        listaCarreras = new JList<>(modeloLista);

        JScrollPane scroll = new JScrollPane(listaCarreras);
        scroll.setBounds(50, 80, 400, 200);
        add(scroll);

        cargarEscuelas();

        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarCarreras();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void cargarEscuelas() {
        try {
            Connection con = ConexionSQLite.conectar();

            if (con == null) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
                return;
            }

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                "SELECT DISTINCT Escuela FROM CATALOGO ORDER BY Escuela"
            );

            while (rs.next()) {
                comboEscuelas.addItem(rs.getString("Escuela"));
            }

            if (comboEscuelas.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay escuelas registradas");
            }

        } catch (Exception e) {
            System.out.println("Error al cargar escuelas: " + e.getMessage());
        }
    }

    private void mostrarCarreras() {
        modeloLista.clear();

        if (comboEscuelas.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una escuela");
            return;
        }

        String escuela = comboEscuelas.getSelectedItem().toString();

        try {
            Connection con = ConexionSQLite.conectar();

            String sql = "SELECT Carrera FROM CATALOGO WHERE Escuela = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, escuela);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloLista.addElement(rs.getString("Carrera"));
            }

            if (modeloLista.isEmpty()) {
                modeloLista.addElement("No hay carreras disponibles");
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar carreras: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new CatalogoUASD();
    }
}
