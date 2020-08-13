/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivo;
import java.io.*;
/**
 * 
 * @author jose eduardo ramirez
 */
public class Archivo {
    public static void main(String[] args ){
        File file =new File("carpeta");
       System.out.println(file.exists());
       System.out.println(file.isDirectory());
       System.out.println(file.getName());         
    } 

}
