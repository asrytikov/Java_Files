import java.io.*;

public class Prog {

    public static void main(String[] args) {
    //Create file
        String path = "C://1//1.txt";

        try {
            File nf = new File(path);
            nf.createNewFile();
        }catch (IOException exp){
            System.out.println("Error create file");
        }

    //Rename file
        File file = new File(path);
        if (file.exists()) {
            File file2 = new File("C://1//text.txt");
            boolean rename = file.renameTo(file2);
            //В переменную path записываем новое название файла(file2.getName()) и его путь(file2.getParent())
            path = file2.getParent() + "//"+file2.getName();
            if (!rename){
                System.out.println("error rename");
            }
            }

        // Write file
        String text = "ddhsgfhhfjgsdhjgfsdgfjhgsdh";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.write(text);
            writer.newLine();
            writer.close();
        }catch (IOException e){
            System.out.println("Error_write");
        }

        // Read file

        String line;

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            line = bufferedReader.readLine();
            while ( line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (IOException ex){
            System.out.println("Error");
        }

        //Delete file
        File nf = new File(path);
        if (nf.exists()){
            nf.delete();
        }


    }
}
