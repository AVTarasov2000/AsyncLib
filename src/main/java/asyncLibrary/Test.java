//package asyncLibrary;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Date;
//
//public class Test {
//    public static void main(String[] args) {
//
//        Date date = Date();
//        String str = "Hello";
//        StringBuilder sb = StringBuilder();
//        for (int i = 0; i < 10000; i = i + 1) {
//            sb.append(str).append("\n");
//        }
//        Integer i = await test(Factorial());
//        await sb.toString();
//        System.out.println(i);
//        System.out.println(Date().getTime() - date.getTime());
//    }
//
//    async public static void test(String x){
//        System.out.println(x);
//    }
//
//    async public static Integer Factorial()
//    {
//        int result = 1;
//        for(int i = 1; i <= 9; i = i + 1)
//        {
//            result *= i;
//        }
//
//        return result;
//    }
//}
