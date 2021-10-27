
import java.io.*;


public class Persistencia {
    public void moduloP(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./Alimentus.txt");
            pw = new PrintWriter(fichero);
               pw.println("--------Datos del Usuario--------");
               pw.println("__________________________________\n");
               pw.println("Nombre : " + DatosPersonales.nombreTxt.getText());
               pw.println("Apellido: " + DatosPersonales.apellidoTxt.getText());
               pw.println("Email: " + DatosPersonales.emailTxt.getText());
               pw.println("Peso: " + CaracteristicasFisicas.pesoTxt.getText() + " Kg.");
               pw.println("Altura: " + CaracteristicasFisicas.alturaTxt.getText() + " Cm.");
               pw.println("Género: " + CaracteristicasFisicas.generoCmb.getSelectedItem().toString());
               pw.println("Enfermedad: " + CaracteristicasFisicas.enfermedadCmb.getSelectedItem().toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
