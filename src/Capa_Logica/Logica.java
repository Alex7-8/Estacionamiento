package Capa_Logica;

import Capa_Almacenamiento.C;
import javax.swing.JTextField;

public class Logica {

    public String Nombre, Contraseña, Contraseña1, Secreto, Usuario, clave, Rnombre;
    public int Eleccion;

    public String CFecha, CNombre, CApellido, CDPI, CTipoVehiculo, CMarca, CModelo, CDescripcion, CTarifa, CCalificacion, CPlaca;
    public int CAño;
    public String BDPI;
    public String PFechaPago,PFecha, PHora, PNombre, PDPI, PPlaca, PAño, PMarca, PModelo, PTarifa, PDescripción, PPago;

    public Logica(String nombre, String contraseña, String contraseña1, int eleccion, String secre) {
        Nombre = nombre;
        Contraseña = contraseña;
        Eleccion = eleccion;
        Secreto = secre;
        Contraseña1 = contraseña1;
    }

    public Logica(String Usuari, String Clav) {
        Usuario = Usuari;
        clave = Clav;

    }

    public Logica(String name) {
        Rnombre = name;
    }

    public Logica(String FECHA, String txtNOMBRE, String txtAPELLIDO, String txtDPI, String tipovehiculo, String Placa, String Marca, String Modelo, int Año, String Descripcion, String Tarifa, String Calificación) {
        
        CFecha = FECHA;
        CNombre = txtNOMBRE;
        CApellido = txtAPELLIDO;
        CDPI = txtDPI;
        CTipoVehiculo = tipovehiculo;
        CMarca = Marca;
        CModelo = Modelo;
        CDescripcion = Descripcion;
        CTarifa = Tarifa;
        CCalificacion = Calificación;
        CAño = Año;
        CPlaca = Placa;
    }

    public Logica(String Fechapago,String Fecha, String Hora, String Nombre, String Dpi, String Placa, String Año, String Marca, String Modelo,
            String Tarifa, String Descripcion, String Total) {
        PFechaPago=Fechapago;
        PFecha = Fecha;
        PHora = Hora;
        PNombre = Nombre;
        PDPI = Dpi;
        PPlaca = Placa;
        PAño = Año;
        PMarca = Marca;
        PModelo = Modelo;
        PTarifa = Tarifa;
        PDescripción = Descripcion;
        PPago = Total;
        PFechaPago=Fechapago;
    }

    public String Buscar() {
        if (Usuario.equals("")) {
            return "1-Nombre de Usuario Vacio";
        }
        if (clave.equals("")) {
            return "1-Campo de Clave vacia";
        }
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.nombre = Usuario;
        almacenamiento.contraseña = clave;
        respuesta = almacenamiento.Buscar();

        return respuesta;
    }

    public String RBuscar() {
        if (Rnombre.equals("")) {
            return "";
        }
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.nombre = Rnombre;
        respuesta = almacenamiento.RBuscar();

        return respuesta;
    }

    public String RevisarExistencia() {
        if (Nombre.equals("")) {
            return "1-Campo nombre Vacio";
        } else if (Secreto.equals("")) {
            return "1-Campo Pregunta de Seguridad ";
        } else if (Contraseña.equals("")) {
            return "1-Campo Contraseña Vacio";
        } else if (Contraseña1.equals("")) {
            return "1-Debe rellenar el Campo Validacion de Contraseña";
        }
        C Almacenamiento = new C();
        Almacenamiento.contraseña = Contraseña;
        Almacenamiento.eleccion = Eleccion;
        Almacenamiento.nombre = Nombre;
        Almacenamiento.secreto = Secreto;
        String Funciona = Almacenamiento.RevisarExistencia();
        return Funciona;
    }

    public String BuscarValidar() {
        if (Usuario.equals("")) {
            return "";
        }
        if (clave.equals("")) {
            return "";
        }
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.nombre = Usuario;
        almacenamiento.contraseña = clave;
        respuesta = almacenamiento.ValidaPreguntayUsuario();

        return respuesta;
    }

    public String CGuardar() {
//        if (Usuario.equals("")) {
//            return "";
//        }
//        if (clave.equals("")) {
//            return "";
//        }
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.CCFecha = CFecha;
        almacenamiento.CCNombre = CNombre;
        almacenamiento.CCApellido = CApellido;
        almacenamiento.CCDPI = CDPI;
        almacenamiento.CCTipoVehiculo = CTipoVehiculo;
        almacenamiento.CCMarca = CMarca;
        almacenamiento.CCModelo = CModelo;
        almacenamiento.CCDescripcion = CDescripcion;
        almacenamiento.CCTarifa = CTarifa;
        almacenamiento.CCCalificacion = CCalificacion;
        almacenamiento.CCAño = CAño;
        almacenamiento.CCPlaca = CPlaca;
        respuesta = almacenamiento.CoGuardar();
        return respuesta;
    }

    public String BBuscar() {
        if (BDPI.equals("")) {
            return "";
        }
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.BBDPI = BDPI;
        respuesta = almacenamiento.CoBuscar();

        return respuesta;
    }

    public String PGuardar() {
        String respuesta = "";
        C almacenamiento = new C();
        almacenamiento.PPFechaPago= PFechaPago;
        almacenamiento.PPFecha = PFecha;
        almacenamiento.PPHora = PHora;
        almacenamiento.PPNombre = PNombre;
        almacenamiento.PPDPI = PDPI;
        almacenamiento.PPPlaca = PPlaca;
        almacenamiento.PPAño = PAño;
        almacenamiento.PPMarca = PMarca;
        almacenamiento.PPModelo = PModelo;
        almacenamiento.PPTarifa = PTarifa;
        almacenamiento.PPDescripción = PDescripción;
              
        respuesta = almacenamiento.PGuardar();
        return respuesta;
        
    }

}
