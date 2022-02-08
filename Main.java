import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Main {

  static void CWE_23_Path_traversal(String name){
    String parent = "/path/to/parent/directory";
    File prefix = new File(parent);
    File path = new File(prefix,name);
    try{
        System.out.println(path.getCanonicalPath());
    }
    catch(IOException e)
    {
      return -1;
    }
  }


  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    String name = myObj.nextLine();
    CWE_23_Path_traversal(name);
  }
}
