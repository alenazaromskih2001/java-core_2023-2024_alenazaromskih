package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int Harry = in.nextInt();
        int Larry = in.nextInt();


        int number = Larry + Harry - 1;
        int L = number - Larry;
        int H = number - Harry;
        out.println(H);
        out.println(L);
        out.flush();
    }
}
