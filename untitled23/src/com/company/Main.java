package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Regestr r = new Regestr();
        while (true){
            System.out.println("[1] sign up");
            System.out.println("[2] sign in");
            System.out.println("[3] search ");
            System.out.println("[4] List");
            System.out.println("[5] remove");
            System.out.println("[6] update");
        int n = scanner.nextInt();
        switch (n){
            case 1->{
                r.add();
            }
            case 2->{
                r.sign();
            }
            case 3->{
                r.search();
            }
            case 4->{
                r.list();
            }
            case 5->{
                r.remove();
            }
            case 6->{
                r.update();
            }
        }

        }
    }
}
