import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileMgmt {

  public String readFile(String inputfilename) {
    String result = "";
    try {
      File file = new File(inputfilename);

      Scanner s = new Scanner(file);

      while (s.hasNext()) {
        String str = s.nextLine();
        result = result + str + "\n";
      }
      s.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }

  public boolean writeFile(String outputfilename, String textencoded) {
    try {
      File f = new File(outputfilename);
      FileWriter fileWriter = new FileWriter(f);
      fileWriter.write(textencoded);
      fileWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public String encode(String text, int key) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      result = result + (char) (text.charAt(i) + key);
    }
    return result;
  }

  public String decode(String text, int key) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      result = result + (char) (text.charAt(i) - key);
    }
    return result;
  }
}
