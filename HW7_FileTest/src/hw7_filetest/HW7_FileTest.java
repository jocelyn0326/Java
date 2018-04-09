
package hw7_filetest;

/**
 *
 * @author gyc12
 */
import java.io.*;

public class HW7_FileTest {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader("TextFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("Result.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        try {
            int index = 1;
            while (bufferedReader.ready()) {
                String data = bufferedReader.readLine();

                if (data.indexOf("Name") == -1 && data.indexOf("ID") == -1) {
                    Members member = new Members(data);
                    System.out.println(member.toString(index));
                   // bufferedWriter.write(member.toString(index));
                    index++;
                }

            }

        } catch (Exception e) {
        }

        if (new File("Result.txt").exists()) {
            System.out.println("檔案建立完成，檔案位於：" + new File("Result.txt").getAbsolutePath());
        } else {
            System.out.println("建立失敗");
        }
        bufferedWriter.close();
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();

    }

}
