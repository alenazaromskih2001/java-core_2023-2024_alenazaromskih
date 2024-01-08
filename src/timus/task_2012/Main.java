package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int d = 12 - n;
        int t = d * 45;


        if (t <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
        out.flush();
    }
}