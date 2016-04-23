
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kvs1132b
 */
public class Main {

    static int k = 1;
    String exit;
    public static int[] f = new int[100];
    public static int[] b = new int[100];
    public static int[] g = new int[100];
   // public static int[] un = new int[100];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Human[] arr = new Human[100];
        club(arr);

    }

    static void vvod(Human[] arr) {
        Scanner sc = new Scanner(System.in);

        for (k = k; k < 100; k++) {
            arr[k] = new Human(k);
            System.out.println("Продолжить? (y/n) ");
            String yn = sc.nextLine();

            if ("n".equals(yn)) {
                break;
            }
        }
    }

    static void changeClub(Human[] arr) {
        System.out.print("id клиента и название секции: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String c = sc.nextLine();
        if ("футбол".equals(arr[i].club)) {
            for (int j = 0; j < f.length - 1; j++) {
                if (f[j] >= i) {
                    f[j] = f[j + 1];
                    if (j == f.length - 1) {
                        f[j + 1] = 0;
                    }
                }
            }
        }
        if ("бокс".equals(arr[i].club)) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j] >= i) {
                    b[j] = b[j + 1];
                    if (j == b.length - 1) {
                        b[j + 1] = 0;
                    }
                }
            }
        }
        if ("гребля".equals(arr[i].club)) {
            for (int j = 0; j < g.length - 1; j++) {
                if (g[j] >= i) {
                    g[j] = g[j + 1];
                    if (j == g.length - 1) {
                        g[j + 1] = 0;
                    }
                }
            }
        }

        if ("футбол".equals(c)) {
            f[f.length + 1] = arr[i].id;
        }
        if ("бокс".equals(c)) {
            b[b.length + 1] = arr[i].id;
        }
        if ("гребля".equals(c)) {
            g[g.length + 1] = arr[i].id;
        }
    }

    static void clubPers(Human[] arr) {
        System.out.print("название секции: ");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        if ("футбол".equals(c)) {
            for (int i = 0; i < f.length; i++) {
                System.out.print((i + 1) + ". " + arr[f[i]].name + " " + arr[f[i]].sname);
            }
        }
        if ("бокс".equals(c)) {
            for (int i = 0; i < b.length; i++) {
                System.out.println((i + 1) + ". " + arr[b[i]].name + " " + arr[b[i]].sname);
            }
        }
        if ("гребля".equals(c)) {
            for (int i = 0; i < g.length; i++) {
                System.out.println((i + 1) + ". " + arr[g[i]].name + " " + arr[g[i]].sname);
            }
        }

    }

    public static void club(Human[] arr) {

        help();

        for (int z = 0; z <= 100000; z++) {

            String i = null;
            Scanner sc = new Scanner(System.in);
            try {
                i = sc.nextLine();
            } catch (Exception ex) {
                System.out.println("Ошибка ввода " + ex);
            }
            if ("help".equals(i)) help();
            else {
                if ("1".equals(i)) vvod(arr);
                if ("2".equals(i)) {
                    System.out.println("Введите id клиента ");
                    int id = sc.nextInt();
                    arr[id].showInfo();
                }
                if ("3".equals(i)) changeClub(arr);
                if ("4".equals(i)) clubPers(arr);
                if ("exit".equals(i)) return;
            }
        }
    }

    static void help() {
        System.out.println("Что ты хочешь?");
        System.out.println("    1. Внести клиента");
        System.out.println("    2. Показать информацию о клиенте");
        System.out.println("    3. Перевести клиента в другую секцию");
        System.out.println("    4. Вывести список клиентов в секции");
        System.out.println("Для повотрения данного сообщения введите - help");
        System.out.println("Введите 'exit' чтобы выйти");

    }

}
