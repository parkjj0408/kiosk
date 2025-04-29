package kiosk_lv4;

public class MenuItem {
    //속성
   private String name;
    private double price;
    private String burgerInfo;


    //생성


    MenuItem(String name, double price, String burgerInfo) {
        this.name = name;
        this.price = price;
        this.burgerInfo = burgerInfo;

    }


    //기능

        String getName(){
            return name;
        }
        double getPrice(){
            return price;
        }
        String getBurgerInfo(){
            return burgerInfo;
        }

    }

