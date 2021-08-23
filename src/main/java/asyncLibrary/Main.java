package asyncLibrary;

import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        Integer result = count(10);
        System.out.println(result);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i += 1) {
            sb.append(result).append("\n");
        }
        write(result, "/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes1.txt");
        write(result, "/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes2.txt");
        write(result, "/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes3.txt");

    }

    public static Integer count(Integer x){
        Integer res = 1;
        for (int i = 1; i < x; i+=1) {
            res *= i;
        }
        return res;
    }

    public static Integer write(Integer num, String path){
        try
        {
            FileWriter writer = new FileWriter(path, false);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 100; i += 1) {
                sb.append(num).append("\n");
                System.out.println(path + i);
            }
            writer.write(sb.toString());
            writer.flush();
            System.out.println("done: "+path);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return 0;
    }

}