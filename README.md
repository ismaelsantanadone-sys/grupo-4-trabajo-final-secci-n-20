Lista de dependencia:
*Netbeans IDE 8.2 o superior
*jdk 26
*JDBC 3.45.2.0

Requisitos minimos del sistema:

windows 10 64bits
intel celeron n4020
uhd 600
4 GB ram
por lo menos 1 GB libre de espacio

Instalación y Ejecución del Sistema

El sistema fue desarrollado en Java utilizando interfaces gráficas Swing y una base de datos SQLite. Está compuesto por los archivos formulario.java, CatalogoUASD.java y ConexionSQLite.java , los cuales trabajan en conjunto para permitir el acceso al formulario y la visualización de las carreras registradas en la base de datos.
Para instalar el sistema, primero se debe abrir el proyecto en NetBeans. Luego, es necesario agregar el driver JDBC de SQLite al proyecto. Esto se realiza haciendo clic derecho sobre la carpeta “Libraries”, seleccionando la opción “Add JAR/Folder” y agregando el archivo sqlite-jdbc.jar.
Después de agregar el driver, la base de datos UASD2.db debe colocarse dentro de la carpeta principal del proyecto, junto a los archivos Java. Esta base de datos contiene la tabla CATALOGO, desde donde el sistema obtiene las escuelas y carreras que se muestran en pantalla.

La conexión a la base de datos se realiza mediante la clase ConexionSQLite.java, utilizando la instrucción:

java
DriverManager.getConnection("jdbc:sqlite:UASD2.db");


Por esta razón, el archivo de la base de datos debe conservar exactamente ese nombre y permanecer en la misma ubicación del proyecto.
Para ejecutar el sistema desde NetBeans, se debe abrir el archivo formulario.java y ejecutar el proyecto. Al iniciar, aparecerá un formulario donde el usuario deberá completar los campos de nombre, apellido, matrícula y contraseña. El botón “Terminar” permanecerá deshabilitado hasta que todos los campos estén completos.
Cuando el usuario presiona el botón “Terminar”, el sistema abre automáticamente la ventana del catálogo. En esta ventana se muestran las escuelas registradas y, al seleccionar una de ellas, aparecen las carreras correspondientes almacenadas en la base de datos SQLite.
El archivo formulario.java se encarga de controlar la interfaz principal y validar los datos ingresados. El archivo CatalogoUASD.java administra la visualización de escuelas y carreras utilizando componentes gráficos como JComboBox y JList. Finalmente, ConexionSQLite.java realiza la conexión entre el sistema y la base de datos SQLite.
Si ocurre el error “No suitable driver” o “Driver SQLite no encontrado”, significa que el archivo sqlite-jdbc.jar no fue agregado correctamente al proyecto. En caso de aparecer el mensaje “Error al conectar con la base de datos”, se debe verificar que el archivo `UASD2.db` exista y se encuentre en la carpeta principal del sistema.

