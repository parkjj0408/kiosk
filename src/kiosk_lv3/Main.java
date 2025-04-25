package kiosk_lv3;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

//원래라면 Kiosk kiosk = new Kiosk(여기에 생성자 값넣어서 만닮==
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("1.ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("2.SmokeShack", 8.9, "베이컨과 체리페퍼가 들어간 치즈버거"));
        menuItems.add(new MenuItem("3.Cheeseburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("4.Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();


        //
    }
}
