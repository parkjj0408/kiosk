package kiosk_lv4;

import java.util.*;

public class Main {
    public static void main(String[] args) { // 햄버거 담을 그릇 생성후 값 만듦 햄버거 4개 만들어짐. 배열안에 값이 들어가있음
        List<MenuItem> items = new ArrayList<>();

        items.add(new MenuItem("1.ShackBurger",6900,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("2.SmokeShack",8900,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("3.Cheeseburger",6900,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("4.Hamburger",5400,"비프패티를 기반으로 야채가 들어간 기본버거"));



        Menu menu = new Menu(items);
       Kiosk kiosk = new Kiosk(menu);

      kiosk.start();

    }
}
