/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ndprojectwithteacher;
import java.util.ArrayList;
/**
 *
 * @author lab502
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(60);
        a1.add(50);
        a1.add(85);
        ArrayList<Integer> a2 = new ArrayList(a1);
        ArrayList<Integer> a3 = new ArrayList();
        a3.add(13);
        a3.addAll(a1);
//        System.out.println(a3);
//        System.out.println(a3);
//        a3.addAll(0,a1);
        //clear()
        a1.clear();
        System.out.println(a1);
        //clone()  
        //shallow copy
        //لم يكون في relaiton بين object 
        //بنسخ أول obj
        //deep copy : copy all obj
        //(ArrayList<Integer>) casting 
        ArrayList<Integer> a4 = (ArrayList<Integer>)a3.clone();
        System.out.println(a4);
        //contains: for serch
        System.out.println(a3.contains(50));
        //get
        System.out.println(a3.get(2));
        //indexof 
        System.out.println(a3.indexOf(50));
        //lastIndexOf
        ArrayList<Integer> a7 = new ArrayList();
        a7.add(600);
        a7.add(300);
        a7.add(500);
        a7.add(600);
        System.out.println(a7.indexOf(600));
        System.out.println(a7.lastIndexOf(600));
    }
}
