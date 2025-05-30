package kiosk_lv1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[SHAKESHACK MENU]");
        System.out.println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거  ");
        System.out.println("2. SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거  ");
        System.out.println("3. Cheseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거  ");
        System.out.println("4. Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거  ");
        System.out.println("0. 종료      |  종료");


        while (true) {
            System.out.println("메뉴 번호를 입력해주세요");

            try {
                int n = sc.nextInt();
                if (n == 1) {
                    System.out.println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거  ");
                } else if (n == 2) {
                    System.out.println("2. SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거  ");
                } else if (n == 3) {
                    System.out.println("3. Cheseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거  ");
                } else if (n == 4) {
                    System.out.println("4. Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거  ");
                } else if (n == 0) {
                    System.out.println("종료 되었습니다");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자로 입력해주세요");
                sc.next(); // 문자를 입력하면 오류가 터짐 근데 이 문자는 처리못하고 아직 남아있어서 숫자로 입력해주세요 메세지가 무한 출력됨.
            } // 해결위에 sc.next();입력해서 남아있는 문자열 버리기. 다시 정상 루프

        }

    }
}
