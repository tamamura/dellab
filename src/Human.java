/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kvs1132b
 */
import java.util.Scanner;

public class Human {
    
    String name;
    String sname;
    String sex;
    String club;
    int age;
    int id;
    int ids;
    //"Ошибка ввода(воспользуйтесь' ')"
    public Human(int i) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите имя: ");
            name = sc.nextLine();
            System.out.print("Введите фамилию: ");
            sname = sc.nextLine();
            System.out.print("Введите пол: ");
            sex = sc.nextLine();
            System.out.print("Введите секцию(футбол/бокс/гребля): ");
            club = sc.nextLine();
            System.out.print("Введите возраст: ");
            age = sc.nextInt();
            
        } catch (Exception ex) {
            System.out.println("Ошибка ввода " + ex);
        }  
        id = i;
        
        if(club.equals("футбол")) Main.f[Main.f.length + 1] = i;
        else if(club.equals("бокс")) Main.b[Main.b.length + 1] = i;
        else if(club.equals("гребля")) Main.g[Main.g.length + 1] = i;
        //else Main.un[Main.un.length + 1] = i;
    }
    
    public void showInfo(){
        System.out.println("ФИ: " + name + " " + sname);
        System.out.println("Пол: " + sex);
        System.out.println("Возраст: " + age);
        System.out.println("Секция: " + club);
    }
}
