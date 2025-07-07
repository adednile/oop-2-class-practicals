import java.io.*;

public class FileProcessor {
    public void processsFile(String filePath) {
        FileReader reader = null;
        try {
            reader = new FileReader(filePath); // Corrected class name casing
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) { // Fixed misplaced parenthesis
                // You can process the line here
                System.out.println(line); // Example processing
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }
}



// public class FileProcessor {
//     public void processsFile(String filePath) {
//         FileReader reader = null;
//         try {
//             reader = new fileReader(filePath);
//             BufferedReader bufferedReader = new BufferedReader(reader);
//             String line;
//             while ((line = bufferedReader.readLine() != null)){

//             }
//         } catch (FileNotFoundException e) {
//             System.err.println("File not found: " + e.getMessage());
//         }
//         catch (IOException e) {
//             System.err.println("Error reading file: " + e.getMessage());
//         }
//         finally {
//             if (reader != null) {
//                 try {
//                     reader.close();
//                 }
//                 catch (IOException e) {
//                     System.err.println("Error closing reader: " + e.getMessage());
//                 }
//             }
//         }
//     }    
// }
