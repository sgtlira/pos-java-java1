/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv05_interface;

import java.util.Scanner;

/**
 *
 * @author guigu
 */
public class Leitura {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static String entDados(String m) {
        System.out.print(m);
        return sc.next();
    }
    
}
