/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Coder;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OOP {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Coder> coderlist = new ArrayList<>();
        System.out.println("nhap vao so luong coder: ");
        int so_luong = sc.nextInt();
        
        for (int i = 0; i < so_luong; i++) {
            System.out.println("nhap vao thong tin coder " + i + ":");
            Coder coder = new Coder();
            System.out.println("Nhap ten");
            String name = sc.next();
            coder.setName(name);
            System.out.println("Nhap vao tuoi");
            int age = sc.nextInt();
            coder.setAge(age);
            while (coder.getAge() == 0) {
                age = sc.nextInt();
                coder.setAge(age);
            }
            System.out.println("Nhap so dien thoai");
            String sdt = sc.next();
            coder.setPhone(sdt);
            System.out.println("Nhap ngon ngu");
            String language = null;
            while (language == null) {
                System.out.println("Nhap 1 2 3 4 de chon trong 4 ngon ngu java c++ c# paython");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        language = "java";
                        break;
                    case 2:
                        language = "c++";
                        break;
                    case 3:
                        language = "c#";
                        break;
                    case 4:
                        language = "paython";
                        break;
                    default:
                        System.out.println("lua chon khong hop le vui long nhap lai");
                        language = null;
                }
            }
            coder.setProgramming_Language(language);
            coderlist.add(coder);
        }
        System.out.println("Hien thi thong tin cac coder: ");
        for(int j=0; j < coderlist.size(); j++){
        System.out.println("code"+j+":" +coderlist.get(j). toString());
        }

//        System.out.println("Ngon ngu: " + coder.getProgramming_Language());
//        System.out.println("Ten: " + coder.getName());
//        System.out.println("Tuoi: " + coder.getAge());
//        System.out.println("sdt: " + coder.getPhone());
//        coder.getAge();
//        coder.getName();
//        coder.getPhone();
//        coder.getProgramming_Language();
    }
    
}
