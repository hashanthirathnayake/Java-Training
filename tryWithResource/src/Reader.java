import java.io.*;

public class Reader {

    public static void main(String[] args)  {
        // write your code here
        try(BufferedReader br = new BufferedReader(new FileReader("/home/user/Desktop/Hashanthi/tryWithResource/src/files/file"))){


        String currentLine;

        while ((currentLine = br.readLine()) != null) {
            System.out.println(currentLine);
        }


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
