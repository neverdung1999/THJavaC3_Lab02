/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class Bai4 {

    public static Scanner input= new Scanner(System.in); 
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Nhap vao 1 xau: "); 
        String strInput= input.nextLine(); 
        System.out.println("Xau duoc chuan hoa la: "+chuanHoa(strInput)); 
    }
    
    public static String chuyenInHoa(String str){ 
        String s,strOutput; 
        s= str.substring(0, 1); 
        strOutput= str.replaceFirst(s,s.toUpperCase()); 
        return (strOutput); 
    } 

    public static String chuanHoa(String strInput){ 
        String strOutput=""; 
        StringTokenizer strToken= new StringTokenizer(strInput," ,\t,\r");
        strOutput+=""+chuyenInHoa(strToken.nextToken()); 
        while(strToken.hasMoreTokens()){ 
        strOutput+=" "+chuyenInHoa(strToken.nextToken()); 
        } 
        return(strOutput); 
    }
}
