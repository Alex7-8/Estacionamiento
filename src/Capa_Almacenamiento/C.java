package Capa_Almacenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class C {

    public String nombre, contraseña, secreto, Rnombre;
    public int eleccion;
    public String NOMBRE, APELLIDO, DPI, MODELO, CTIKET;

    public Double FECHA;
    public Double NTARIFA;
    public Double NOTIKET;

    public String BBDPI, CCFecha, CCNombre, CCApellido, CCDPI, CCTipoVehiculo, CCMarca, CCModelo, CCDescripcion, CCTarifa, CCCalificacion, CCPlaca;
    public int CCAño;
    public String PPFechaPago, PPFecha, PPHora, PPNombre, PPDPI, PPPlaca, PPAño, PPMarca, PPModelo, PPTarifa, PPDescripción, PPPago;

    public String guardar() {
        try {
            File asd = new File("C:\\Usuario");
            if (!asd.exists()) {
                asd.mkdirs();
            }
            FileWriter fl = new FileWriter("C:\\Usuario\\Confidencial.txt", true);
            BufferedWriter Bf = new BufferedWriter(fl);
            Bf.write(nombre + ";" + contraseña + ";" + secreto + ";" + eleccion);
            Bf.newLine();
            Bf.close();
        } catch (Exception e) {
            return "1-Error cath";
        }
        return "2-Guardado Correctamente";

    }

    public String Buscar() {
        try {
            String retornar;
            File as = new File("C:\\Usuario\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 4);
                if (Line[0].equals(nombre)) {
                    if (Line[1].equals(contraseña)) {
                        retornar = ("Fdlnoloadivaras" + ";" + Line[0] + ";" + Line[1] + ";" + Line[2] + ";" + Line[3]);
                        File.close();
                        return retornar;

                    }

                    return "1-Clave incorrecta";
                }
            }

        } catch (Exception e) {
        }
        return "1-No existe en la Base de Datos";
    }

    public String RBuscar() {
        try {
            String retornar;
            File as = new File("C:\\Usuario\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 4);
                if (Line[0].equals(nombre)) {
                    retornar = (Line[0] + ";" + Line[1] + ";" + Line[2] + ";" + Line[3]);
                    File.close();
                    return retornar;

                }
            }

        } catch (Exception e) {
        }
        return "";
    }

    public String ValidaPreguntayUsuario() {
        try {
            String retornar;
            File as = new File("C:\\Usuario\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 4);
                if (Line[0].equals(nombre)) {
                    if (Line[2].equals(contraseña)) {
                        retornar = (Line[0] + ";" + Line[1] + ";" + Line[2] + ";" + Line[3]);
                        File.close();
                        return retornar;

                    }

                }
            }

        } catch (Exception e) {
        }
        return "";
    }

    public String RevisarExistencia() {
        try {
            File asd = new File("C:\\Usuario");
            if (!asd.exists()) {
                asd.mkdirs();
            }
            FileWriter fl = new FileWriter("C:\\Usuario\\Confidencial.txt", true);
            String retornar = "";
            File as = new File("C:\\Usuario\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 4);
                if (Line[0].equals(nombre)) {
                    return "1-Ya esta Registrado Pruebe otro nombre";

                }
            }
            File.close();
            retornar = guardar();
            return retornar;
        } catch (Exception e) {
        }
        return "";

    }

    public String CoGuardar() {

        try {
            File asd = new File("C:\\COMERCIAL");
            if (!asd.exists()) {
                asd.mkdirs();
            }
            FileWriter fl = new FileWriter("C:\\COMERCIAL\\VEHICULOS.txt", true);
            BufferedWriter Bf = new BufferedWriter(fl);
            Bf.write(CCFecha + ";" + CCNombre + ";" + CCApellido + ";" + CCDPI + ";" + CCTipoVehiculo + ";" + CCPlaca + ";" + CCAño + ";"
                    + CCMarca + ";" + CCModelo + ";" + CCDescripcion + ";" + CCTarifa + ";" + CCCalificacion);
            Bf.newLine();
            Bf.close();
            return "";

        } catch (Exception e) {
            return "";
        }
    }

    public String CoBuscar() {
        try {
            String retornarCarro;
            File as = new File("C:\\COMERCIAL\\VEHICULOS.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 12);
                if (Line[3].equals(BBDPI)) {
                    retornarCarro = (Line[0] + ";" + Line[1] + ";" + Line[2] + ";" + Line[3] + ";" + Line[4] + ";" + Line[5] + ";"
                            + Line[6] + ";" + Line[7] + ";" + Line[8] + ";" + Line[9] + ";" + Line[10] + ";" + Line[11]);
                    File.close();
                    return retornarCarro;
                }
            }

        } catch (Exception e) {
        }
        return "";
    }

    public String PGuardar() {

        try {
            File asd = new File("C:\\COMERCIAL");
            if (!asd.exists()) {
                asd.mkdirs();
            }
            File sd = new File("C:\\COMERCIAL\\TicketsPagados");
            if (!sd.exists()) {
                sd.mkdirs();
            }
            FileWriter fl = new FileWriter("C:\\COMERCIAL\\TicketsPagados\\"+PPFechaPago+".txt", true);
            BufferedWriter Bf = new BufferedWriter(fl);
            Bf.write(PPFecha + ";" +PPHora+ ";" + PPNombre+ ";" + PPDPI+ ";" + PPPlaca  + ";" + PPAño + ";" + PPMarca + ";" + PPModelo + ";" + PPTarifa + ";" + PPDescripción);
            Bf.newLine();
            Bf.close();
            return "Si";

        } catch (Exception e) {
            return "";
        }
    }

}
