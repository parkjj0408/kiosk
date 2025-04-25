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
    List<MenuItem> orderHistory = new ArrayList<>();


    //생성자
    // MAIN함수에서 객체생서할때 필요한 생성자 만들기

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    //기능
    public void start() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("=====================메뉴====================");
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

                    if (num >= 1 && num<= menuItems.size()) {
                        System.out.println(menuItems.get(num-1));
                        orderHistory.add(menuItems.get(num-1));

                    } else if (num == 0) {
                        System.out.println("종료되었습니다, 주문 내역을 출력합니다.");
                        printOrder();
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
    //주문내역 출력하는 메서드
    public void printOrder() {
        for (MenuItem menuItem : orderHistory) {
            System.out.println(menuItem.getName());
        }
    
    
    }
}