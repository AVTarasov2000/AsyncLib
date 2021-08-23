package asyncLibrary;
import java.io.FileWriter;
import java.io.IOException;
public class Main1 {
   public static void main (String[] args) {
   Valuable<Integer> result = AsyncLib.async(()->count(new Promise(10)));
      System.out.println(result.value());
      StringBuilder sb =  new StringBuilder();
      for (int i = 0 ; i < 10000 ; i += 1){
      sb.append(result.value()).append("\n");
   }
      AsyncLib.async(()->write(new Promise(result.value()), new Promise("/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes1.txt")));
      AsyncLib.async(()->write(new Promise(result.value()), new Promise("/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes2.txt")));
      AsyncLib.async(()->write(new Promise(result.value()), new Promise("/Users/andrejtarasov/Desktop/компили/asyncLibrary/src/main/java/asyncLibrary/notes3.txt")));
   }
   
   public static Integer count (Valuable<Integer> x) {
   Integer res = 1;
      for (int i = 1 ; i < x.value() ; i += 1){
      res *= i;
   }
      return res;
   }
   
   public static Integer write (Valuable<Integer> num, Valuable<String> path) {
   try{
      FileWriter writer =  new FileWriter(path.value(), false);
         StringBuilder sb =  new StringBuilder();
         for (int i = 0 ; i < 100 ; i += 1){
         sb.append(num.value()).append("\n");
            System.out.println(path.value() + i);
      }
         writer.write(sb.toString());
         writer.flush();
         System.out.println("done: " + path.value());
   }
      catch (IOException ex){
      System.out.println(ex.getMessage());
   }
      return 0;
   }
   }