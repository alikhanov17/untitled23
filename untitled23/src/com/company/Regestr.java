package com.company;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.in;

public class Regestr implements Regestration{
    String name;
    String password;
    static String[] arrlogin = new String[100];
    static String[] arrPassword = new String[100];
    int count=0;

    boolean isHave=false;
    Scanner scanner = new Scanner(in);
    @Override
    public void add() {
        System.out.println("input login: ");
        String name =scanner.next();
        System.out.println("input password: ");
        String password = scanner.next();
        arrlogin[count]=name;
        arrPassword[count]=password;
        count++;
    }

    @Override
    public void search() {
        System.out.println("search");
        System.out.println("input name: ");
        String s = scanner.next();
        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrlogin[i],s)){
                isHave=true;
break;
            }
        }
        if (isHave){
            System.out.println("bor");
        }
        else {
            System.out.println("yo'q");
        }
    }

    @Override
    public void sign() {
        System.out.println("Sign in");
        System.out.println("input login: ");
        String name = scanner.next();
        System.out.println("input password: ");
        String password = scanner.next();

        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrlogin[i],name)&&Objects.equals(arrPassword[i],password)){
                isHave=true;

            }
            if (isHave){
                System.out.println("Tizimga xush kelibsiz ");
            }
            else {
                System.out.println("login or password error ");
            }
        }
    }

    @Override
    public void list() {
        boolean isEmpty = false;
        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrlogin,null)&&Objects.equals(arrPassword,null)){
         isEmpty=true;
         break;
            }

        }
        if (isEmpty){
            System.out.println("list is empty ");
        } else {

            for (int i = 0; i < count; i++) {
                System.out.println(arrlogin[i]);
                System.out.println(arrPassword[i]);
            }
        }
    }
    public static String[] removeElement(String[] arr, String item) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeAll(List.of(item));
        return list.toArray(String[]::new);
    }
    @Override
    public void remove() {
        System.out.println("input login");
        String item = scanner.next();
        System.out.println("input password");
        String password =scanner.next();

        arrlogin =removeElement(arrlogin,item);
        arrPassword=removeElement(arrPassword,password);


    }

    @Override
    public void update() {
        int c = 0;
        System.out.println("choose: ");
        for (int i = 0; i < count; i++) {
            c++;
            System.out.println(c+arrlogin[i]);
            System.out.println(c+arrPassword[i]);
        }

       int a = scanner.nextInt();
        System.out.println("input new name:");
        String name = scanner.next();
        System.out.println("input new password");
        String password= scanner.next();
   Array.set(arrlogin,a,name);
   Array.set(arrPassword,a,password);
    }
}
