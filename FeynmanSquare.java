package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*A problem based on Math; Formulae.
 *Tried using PrintWriter instead of System.out.println (which internally uses PrintStream).
 *No visible performance advantage for PrintWriter over PrintStream!!!
 */
public class FeynmanSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            System.out.println(((n * (n + 1) * ((2 * n) + 1)) / 6)); //The formula for sum of squares of first n numbers
        }
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            if(n==1) {
                out.println(1);
                out.flush();
                continue;
            }
            int result = ((n * (n + 1) * ((2 * n) + 1)) / 6);
            out.println(result);
            out.flush();
        }*/
    }
}
