package kiosk_lv2;

public class MenuItem {// 햄버거만 관리
    //속성
    private String name;
    private int price;
    private String burgerInfo;


    //생성자
    MenuItem() {

    }

    MenuItem(String name, int price, String burgerInfo) {
        this.name = name;
        this.price = price;
        this.burgerInfo = burgerInfo;

    }

    //기능
   @Override
    public String toString() {
        return name + price + burgerInfo;
    }
}


   // String getName(){
       // return name;
  //  }
  //  int getPrice(){
     //   return price;
   // }String getBurgerInfo(){
       // return burgerInfo;
  //  }
//}



