import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class InformeGitHub {
    public static void main(String[] args) {
        String rutaInformeTxt = "C:\\Users\\User\\OneDrive\\Desktop\\programaCD1_Carlos_Acosta_NRC.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaInformeTxt))) {
            // Agregar contenido al informe en formato de texto
            writer.write("Informe del Proceso de Subida a GitHub\n");
            writer.write(repeat("=", 40) + "\n");
            
            writer.write("Descripción de la Actividad\n");
            writer.write("Se creó un archivo de manera local con un código sencillo en Python ('Hola Mundo') "
                          + "y se subió mediante línea de comandos a GitHub.\n\n");

            writer.write("Pasos Realizados\n");
            writer.write(repeat("-", 20) + "\n");

            writer.write("1. Creación del archivo local\n");
            writer.write("Se generó un archivo llamado 'CD1_Carlos_Acosta_NRC.txt' con el siguiente contenido:\n");
            writer.write("print(\"Hola Mundo\")\n\n");

            writer.write("2. Configuración de Git\n");
            writer.write("Inicialización de un repositorio local:\n");
            writer.write("git init\n\n");

            writer.write("Configuración del nombre de usuario y correo:\n");
            writer.write("git config --global user.name \"Carlos Acosta\"\n");
            writer.write("git config --global user.email \"carlosac101@hotmail.com\"\n\n");

            writer.write("3. Subida del archivo al repositorio\n");
            writer.write("Se agregó el archivo al área de preparación:\n");
            writer.write("git add CD1_Carlos_Morillo_NRC.txt\n\n");

            writer.write("Se realizó un commit con un mensaje descriptivo:\n");
            writer.write("git commit -m \"Primera versión del archivo Hola Mundo\"\n\n");

            writer.write("Se conectó el repositorio local a un repositorio remoto en GitHub:\n");
            writer.write("git remote add origin https://github.com/carlosac101/Hola-mundo.git\n\n");

            writer.write("Se subió el archivo al repositorio remoto:\n");
            writer.write("git push -u origin main\n\n");

            writer.write("Evidencias\n");
            writer.write(repeat("-", 20) + "\n");
            writer.write("Se subieron los siguientes archivos al repositorio de GitHub:\n");
            writer.write("1. CD1_Carlos_Acosta_NRC.txt (archivo de código).\n");
            writer.write("2. informe.txt (este informe).\n\n");

            writer.write("Link al repositorio\n");
            writer.write("[Repositorio en GitHub](https://github.com/carlosac101/Hola-mundo.git)\n\n");

            writer.write("---\n");
            writer.write("Fecha de Entrega: 20 de Noviembre del 2024.\n");

            System.out.println("Archivo guardado en: " + rutaInformeTxt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para repetir un String un número determinado de veces
    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}

