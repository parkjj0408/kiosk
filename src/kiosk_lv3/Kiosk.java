package kiosk_lv3;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Kiosk {

    //속성
    //MENUITEM을 관리하는 리스트가 필드로 존재
    private List<MenuItem> menuItems = new ArrayList<>();


    //생성자
    // MAIN함수에서 객체생서할때 필요한 생성자 만들기

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;

    }
    //기능
    //START라는 함수를 사용해서 레벨 2의 메인에서 입력,반복문 로직을 수해해라.

    public void start() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("주문을 할려면 아무 숫자를 눌러 주세요");
        num = sc.nextInt();
            for (MenuItem menuItem : menuItems) {
                System.out.printf("%-15s| ₩%.1f | %s%n",
                        menuItem.getName(),
                        menuItem.getPrice(),
                        menuItem.getBurgerInfo());
            }
            while (true) {
                try {
                    System.out.println("메뉴번호를 눌러주세요, 0을 누르면 종료됩니다");


                    num = sc.nextInt();
                    if (num == 1) {
                        System.out.println(menuItems.get(0));
                    } else if (num == 2) {
                        System.out.println(menuItems.get(1));

                    } else if (num == 3) {
                        System.out.println(menuItems.get(2));

                    } else if (num == 4) {
                        System.out.println(menuItems.get(3));

                    } else if (num == 0) {
                        System.out.println("종료되었습니다");
                        break;
                    } else {
                        System.out.println("메뉴 번호 확인 후 다시 눌러주세요");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("문자말고 숫자로 입력해주세요");
                    sc.next();
                }
            }


    }
}