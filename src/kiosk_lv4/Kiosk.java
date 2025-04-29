package kiosk_lv4;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Kiosk {
    private Menu menu;

    Kiosk(Menu menu) {
        this.menu = menu;
    }

    Scanner sc = new Scanner(System.in);

    public void start() { // 전체화면 출력을 담당하는 메서드

        int num1;
        while (true) {
            showMenu();
            try {
                System.out.println("번호를 눌러 주세요");
                num1 = sc.nextInt();
                switch (num1) {
                    case 1:
                        showBurgerMenu();
                        break;
                    case 2 :
                        System.out.println("아직 메뉴 준비중입니다");
                        break;
                    case 3 :
                        System.out.println("아직 메뉴 준비중입니다");
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자로 입력 바랍니다");
                sc.next();
            }

        }
    }

    public void showBurgerMenu() { //버거메뉴만 보여주는 메서드
        menu.showBurgers();
        int input1 = sc.nextInt();
        try {
            switch (input1) {
                case 1:
                    menu.showBurger(0);
                    break;
                case 2:
                    menu.showBurger(1);
                    break;
                case 3:
                    menu.showBurger(2);
                    break;
                case 4:
                    menu.showBurger(3);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 입력입니다");
            }
        } catch (InputMismatchException e) {
            System.out.println("입력 오류입니다. 숫자를 입력해주세요.");
            sc.nextLine();
        }
    }
    public void showMenu(){ //키오스크 시작화면으로 전체화면
        String menu = "MAIN MENU";
        System.out.printf("[%10s]%n",menu);
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료 | 종료");
    }

}

