

public class formulario extends javax.swing.JFrame {

    public formulario() {
        initComponents();

        // BOTON DESHABILITADO AL INICIO
        jButton2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        matricula = new javax.swing.JLabel();
        recibir_nombre = new javax.swing.JTextField();
        recibir_apellido = new javax.swing.JTextField();
        recibir_matricula = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        recibir_password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel1.setText("Formulario de datos UASD");

        nombre.setFont(new java.awt.Font("Verdana", 0, 12));
        nombre.setText("Nombre:");

        apellido.setFont(new java.awt.Font("Verdana", 0, 12));
        apellido.setText("Apellido:");

        matricula.setFont(new java.awt.Font("Verdana", 0, 12));
        matricula.setText("Matricula:");

        recibir_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibir_nombreKeyTyped(evt);
            }
        });

        recibir_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibir_apellidoKeyTyped(evt);
            }
        });

        recibir_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibir_matriculaKeyTyped(evt);
            }
        });

        password.setFont(new java.awt.Font("Verdana", 0, 12));
        password.setText("Contraseña");

        recibir_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibir_passwordKeyTyped(evt);
            }
        });

        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre)
                    .addComponent(apellido)
                    .addComponent(matricula)
                    .addComponent(password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recibir_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibir_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibir_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibir_password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(recibir_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(recibir_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula)
                    .addComponent(recibir_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(recibir_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)

                .addComponent(jButton2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    // METODO PARA VERIFICAR CAMPOS
    private void verificarCampos(){

        String nom = recibir_nombre.getText().trim();
        String ape = recibir_apellido.getText().trim();
        String mat = recibir_matricula.getText().trim();
        String pass = String.valueOf(recibir_password.getPassword()).trim();

        if(!nom.isEmpty() &&
           !ape.isEmpty() &&
           !mat.isEmpty() &&
           !pass.isEmpty()){

            jButton2.setEnabled(true);

        }else{

            jButton2.setEnabled(false);
        }
    }

    private void recibir_nombreKeyTyped(java.awt.event.KeyEvent evt) {

        char car = evt.getKeyChar();

        if(Character.isLetter(car) || Character.isSpaceChar(car)){
        }else{
            evt.consume();
        }

        verificarCampos();
    }

    private void recibir_apellidoKeyTyped(java.awt.event.KeyEvent evt) {

        char car = evt.getKeyChar();

        if(Character.isLetter(car) || Character.isSpaceChar(car)){
        }else{
            evt.consume();
        }

        verificarCampos();
    }

    private void recibir_matriculaKeyTyped(java.awt.event.KeyEvent evt) {

        if(recibir_matricula.getText().length() >= 8){
            evt.consume();
        }

        char c = evt.getKeyChar();

        if(c < '0' || c > '9'){
            evt.consume();
        }

        verificarCampos();
    }

    private void recibir_passwordKeyTyped(java.awt.event.KeyEvent evt) {

        if(recibir_password.getPassword().length > 10){
            evt.consume();
        }

        verificarCampos();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        CatalogoUASD catalogo = new CatalogoUASD();
        catalogo.setVisible(true);

        this.dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration                   
    private javax.swing.JLabel apellido;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel password;
    private javax.swing.JTextField recibir_apellido;
    private javax.swing.JTextField recibir_matricula;
    private javax.swing.JTextField recibir_nombre;
    private javax.swing.JPasswordField recibir_password;
    // End of variables declaration
}