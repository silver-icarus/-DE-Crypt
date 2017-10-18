/*
MIT License

Copyright (c) 2017 Silver

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package main;

/******************
 *                *
 *  Silver_Icarus *
 *                *
 ******************/

public class Decrypt {

    public Decrypt() {
        
    }
    
    public String enCaesar(String textToCrypt){
        String text;
        StringBuilder sb = new StringBuilder();
        char character;
       
        text = textToCrypt;
        text = text.toLowerCase();
        
        for(int i = 0;i<text.length();i++){
            character = text.charAt(i);
            
            //This switch prints the correct character depending on the one that it reads using charAt at the above line
            switch(character){
                case 'a':
                    sb.append("d");
                    break;
                case 'b':
                    sb.append("e");
                    break;
                case 'c':
                    sb.append("f");
                    break;
                case 'd':
                    sb.append("g");
                    break;
                case 'e':
                    sb.append("h");
                    break;
                case 'f':
                    sb.append("i");
                    break;
                case 'g':
                    sb.append("j");
                    break;
                case 'h':
                    sb.append("k");
                    break;
                case 'i':
                    sb.append("l");
                    break;
                case 'j':
                    sb.append("m");
                    break;
                case 'k':
                    sb.append("n");
                    break;
                case 'l':
                    sb.append("o");
                    break;
                case 'm':
                    sb.append("p");
                    break;
                case 'n':
                    sb.append("q");
                    break;
                case 'o':
                    sb.append("r");
                    break;
                case 'p':
                    sb.append("s");
                    break;
                case 'q':
                    sb.append("t");
                    break;
                case 'r':
                    sb.append("u");
                    break;
                case 's':
                    sb.append("v");
                    break;
                case 't':
                    sb.append("w");
                    break;
                case 'u':
                    sb.append("x");
                    break;
                case 'v':
                    sb.append("y");
                    break;
                case 'w':
                    sb.append("z");
                    break;
                case 'x':
                    sb.append("a");
                    break;
                case 'y':
                    sb.append("b");
                    break;
                case 'z':
                    sb.append("c");
                    break;
                default:
                    sb.append(character);
            }
        }
       return sb.toString();
    }
    
    public String deCaesar(String textToDecrypt){
        String text;
        char character;
        StringBuilder sb = new StringBuilder();
        
        text = textToDecrypt;
        text = text.toLowerCase();
        
        for(int i = 0;i<text.length();i++){
            character = text.charAt(i);
            
            //This switch prints the correct character depending on the one that it reads using charAt at the above line, like the encryption, but reverse
            switch(character){
                case 'd':
                    sb.append("a");
                    break;
                case 'e':
                    sb.append("b");
                    break;
                case 'f':
                    sb.append("c");
                    break;
                case 'g':
                    sb.append("d");
                    break;
                case 'h':
                    sb.append("e");
                    break;
                case 'i':
                    sb.append("f");
                    break;
                case 'j':
                    sb.append("g");
                    break;
                case 'k':
                    sb.append("h");
                    break;
                case 'l':
                    sb.append("i");
                    break;
                case 'm':
                    sb.append("j");
                    break;
                case 'n':
                    sb.append("k");
                    break;
                case 'o':
                    sb.append("l");
                    break;
                case 'p':
                    sb.append("m");
                    break;
                case 'q':
                    sb.append("n");
                    break;
                case 'r':
                    sb.append("o");
                    break;
                case 's':
                    sb.append("p");
                    break;
                case 't':
                    sb.append("q");
                    break;
                case 'u':
                    sb.append("r");
                    break;
                case 'v':
                    sb.append("s");
                    break;
                case 'w':
                    sb.append("t");
                    break;
                case 'x':
                    sb.append("u");
                    break;
                case 'y':
                    sb.append("v");
                    break;
                case 'z':
                    sb.append("w");
                    break;
                case 'a':
                    sb.append("x");
                    break;
                case 'b':
                    sb.append("y");
                    break;
                case 'c':
                    sb.append("z");
                    break;
                default:
                    sb.append(character);
            }
        }
        
        return sb.toString();
    }
}
