/*	
Nama    : Nadhifal A R
NPM		: 180048
Kelas	: B
*/

import java.util.Scanner;

public class cipher{
    public static StringBuffer encrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    } 
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Kalimat: ");
        String str = sc.nextLine();
     
        System.out.println("Masukan K: ");
        int n = sc.nextInt();

        System.out.println("Text  : " + str); 
        System.out.println("Shift : " + n); 
        System.out.println("Cipher: " + encrypt(str, n)); 
    
    
    }
}