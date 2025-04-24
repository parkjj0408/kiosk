package kiosk_lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        MenuItem burger1 = new MenuItem("1. ShackBurger  | W ", 6900, " | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem burger2 = new MenuItem("2. SmokeShack   | W ", 8900, " | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem burger3 = new MenuItem("3. Cheeseburger | W ", 6900, " | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem burger4 = new MenuItem("4. Hamburger    | W ", 5400, " | 비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(burger1);
        menuItems.add(burger2);
        menuItems.add(burger3);
        menuItems.add(burger4);

        for (MenuItem i : menuItems) {
            System.out.println(i);
        }
           while (true) {
               try {
                   System.out.println("메뉴번호를 입력해주세요");
                   int n = sc.nextInt();
                   if (n < 5) {
                       switch (n) {
                           case 1:
                               System.out.println(menuItems.get(0));
                               break;
                           case 2:
                               System.out.println(menuItems.get(1));
                               break;
                           case 3:
                               System.out.println(menuItems.get(2));
                               break;
                           case 4:
                               System.out.println(menuItems.get(3));
                               break;
                       }
                       if (n == 0) {
                           System.out.println("종료합니다");
                           break;
                       }
                   }else{
                       System.out.println("숫자를 다시 확인해주세요");
                   }
               }
                catch(Exception e){
                       System.out.println("숫자로 입력해주세요");
                       sc.next();
                   }

        }
       }


    }






