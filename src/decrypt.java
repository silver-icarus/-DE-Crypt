/*
The MIT License (MIT)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
and associated documentation files (the "Software"), to deal in the Software without restriction, 
including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial 
portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT 
NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package decrypt;
import java.util.Scanner;

/*************
 * By Silver *
 *************/
public class Decrypt {
    public static void main(String[] args) {
        
        
        mainMenu();
        
        
    }
    
    static void mainMenu (){
        Scanner sc = new Scanner(System.in);
        int selection;
        
        System.out.println("   _______  ________   _____                  _   ");
        System.out.println("  / /  __ \\|  ____\\ \\ / ____|                | |  ");
        System.out.println(" | || |  | | |__   | | |     _ __ _   _ _ __ | |_ ");
        System.out.println(" | || |  | |  __|  | | |    | '__| | | | '_ \\| __|");
        System.out.println(" | || |__| | |____ | | |____| |  | |_| | |_) | |_ ");
        System.out.println(" | ||_____/|______|| |\\_____|_|   \\__, | .__/ \\__|");
        System.out.println("  \\_\\             /_/              __/ | |        ");
        System.out.println("                                  |___/|_|        ");
        
        System.out.println("Select an option:");
        System.out.println("1.Encrypt");
        System.out.println("2.Decrypt");
        
        selection = sc.nextInt();
        
        switch(selection){
            case 1: 
               encryptMenu();
               break;
            case 2:
               decryptMenu();
               break;
            default:
                System.out.println("You chose an unexpected or not valid option.");
                System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
                mainMenu();
        }
    }
    
    static void encryptMenu(){
        Scanner sc = new Scanner(System.in);
        int selection;
        
        System.out.println("Choose a method:");
        System.out.println("1.Caesar");
        selection = sc.nextInt();
        
        switch(selection){
            case 1:
                enCaesar();
                break;
            default:
                System.out.println("You chose an unexpected or not valid option.");
                System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
                encryptMenu();
        }
    }
    
    static void decryptMenu(){
        Scanner sc = new Scanner(System.in);
        int selection;
        
        System.out.println("Choose a method:");
        System.out.println("1.Caesar");
        selection = sc.nextInt();
        
        switch(selection){
            case 1:
                deCaesar();
                break;
            default:
                System.out.println("You chose an unexpected or not valid option.");
                System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
                encryptMenu();
        }
    }
    
    static void enCaesar(){
        Scanner sc = new Scanner(System.in);
        String text;
        char character;
        
        System.out.println("Write the text you wish to encrypt:");
        text = sc.nextLine();
        text = text.toLowerCase();
        
        for(int i = 0;i<text.length();i++){
            character = text.charAt(i);
            
            switch(character){
                case 'a':
                    System.out.print("d");
                    break;
                case 'b':
                    System.out.print("e");
                    break;
                case 'c':
                    System.out.print("f");
                    break;
                case 'd':
                    System.out.print("g");
                    break;
                case 'e':
                    System.out.print("h");
                    break;
                case 'f':
                    System.out.print("i");
                    break;
                case 'g':
                    System.out.print("j");
                    break;
                case 'h':
                    System.out.print("k");
                    break;
                case 'i':
                    System.out.print("l");
                    break;
                case 'j':
                    System.out.print("m");
                    break;
                case 'k':
                    System.out.print("n");
                    break;
                case 'l':
                    System.out.print("o");
                    break;
                case 'm':
                    System.out.print("p");
                    break;
                case 'n':
                    System.out.print("q");
                    break;
                case 'o':
                    System.out.print("r");
                    break;
                case 'p':
                    System.out.print("s");
                    break;
                case 'q':
                    System.out.print("t");
                    break;
                case 'r':
                    System.out.print("u");
                    break;
                case 's':
                    System.out.print("v");
                    break;
                case 't':
                    System.out.print("w");
                    break;
                case 'u':
                    System.out.print("x");
                    break;
                case 'v':
                    System.out.print("y");
                    break;
                case 'w':
                    System.out.print("z");
                    break;
                case 'x':
                    System.out.print("a");
                    break;
                case 'y':
                    System.out.print("b");
                    break;
                case 'z':
                    System.out.print("c");
                    break;
                default:
                    System.out.print(character);
            }
        }
        System.out.println("");
        System.out.println("Enter b to go back to the main menu.");
        if(sc.next().charAt(0) == 'b'){
            System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
            mainMenu();
        }
    }
    
    static void deCaesar(){
        Scanner sc = new Scanner(System.in);
        String text;
        char character;
        
        System.out.println("Write the text you wish to decrypt:");
        text = sc.nextLine();
        text = text.toLowerCase();
        
        for(int i = 0;i<text.length();i++){
            character = text.charAt(i);
            
            switch(character){
                case 'd':
                    System.out.print("a");
                    break;
                case 'e':
                    System.out.print("b");
                    break;
                case 'f':
                    System.out.print("c");
                    break;
                case 'g':
                    System.out.print("d");
                    break;
                case 'h':
                    System.out.print("e");
                    break;
                case 'i':
                    System.out.print("f");
                    break;
                case 'j':
                    System.out.print("g");
                    break;
                case 'k':
                    System.out.print("h");
                    break;
                case 'l':
                    System.out.print("i");
                    break;
                case 'm':
                    System.out.print("j");
                    break;
                case 'n':
                    System.out.print("k");
                    break;
                case 'o':
                    System.out.print("l");
                    break;
                case 'p':
                    System.out.print("m");
                    break;
                case 'q':
                    System.out.print("n");
                    break;
                case 'r':
                    System.out.print("o");
                    break;
                case 's':
                    System.out.print("p");
                    break;
                case 't':
                    System.out.print("q");
                    break;
                case 'u':
                    System.out.print("r");
                    break;
                case 'v':
                    System.out.print("s");
                    break;
                case 'w':
                    System.out.print("t");
                    break;
                case 'x':
                    System.out.print("u");
                    break;
                case 'y':
                    System.out.print("v");
                    break;
                case 'z':
                    System.out.print("w");
                    break;
                case 'a':
                    System.out.print("x");
                    break;
                case 'b':
                    System.out.print("y");
                    break;
                case 'c':
                    System.out.print("z");
                    break;
                default:
                    System.out.print(character);
            }
        }
        System.out.println("");
        System.out.println("Enter b to go back to the main menu.");
        if(sc.next().charAt(0) == 'b'){
            System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
            mainMenu();
        }
    }
}
