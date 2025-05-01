package kiosk_lv4;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;



public class Menu {
    //속성
    private List<MenuItem> items = new ArrayList<>(); // 햄버거 1개를 담을 그릇
    //생성자
    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    //기능
    public List<MenuItem> getItems(){ // 리스트를 리턴하는 메서드
        return items;
    }
    public void showBurgers(){ //햄버거 전체메뉴
        for (MenuItem item : items) {
            System.out.printf("%-15s| ₩%.1f | %s%n",
                    item.getName(),
                    item.getPrice()/ 1000.0,
                    item.getInfo());

        }
        System.out.println("0번 누르면 뒤로가기");
    }
    public void showBurger(int index){ //인덱스 별로 메뉴 하나하나 출력메서드
       if(index >=0 && index<items.size()){
            MenuItem menuitem = items.get(index);
           System.out.printf("%-15s| ₩%.1f | %s%n",
                    menuitem.getName(),
                    menuitem.getPrice()/ 1000.0,
                    menuitem.getInfo());
        }else{
            System.out.println("잘못된 메뉴 선택입니다");
             }

    }


}