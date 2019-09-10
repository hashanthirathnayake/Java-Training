import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {
    public static void main(String[] args){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/home/user/Desktop/Hashanthi/tryWithResource/src/files/fileout.txt"))){

            for (int i = 1; i < 11; i++) {
                writer.write("" + i + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
