package main;

import ast.impl.*;
import ast.interfaces.*;
import java.io.FileReader;

import scanner.Scanner;
import parser.Parser;


public class Piloto {

    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("teste.txt");
        Scanner scanner = new Scanner(in);
        Factory fac = new Factory();
        Parser parser = new Parser(scanner, fac);
        try {
            Object obj = parser.parse().value;
            System.out.println("Arquivo sem erros de sintaxe!");
            if (obj != null) {
                IExpression e = (IExpression) obj;
                PrinterVisitor pv = new PrinterVisitor(System.out);
               // ByteCodeVisitor pv = new ByteCodeVisitor(System.out);
                e.accept(pv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
}
