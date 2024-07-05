package org.example;

/**
 * Hello world!
 *
 */
public class Continents {
    //This program prints out a continent and its largest City
    public static void main(String[] args) {
        int continent = 4;

        switch(continent){
            case(1):
                System.out.println("North America: <MExico City, Mexico");
                break;
            case(2):
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case(3):
                System.out.println("Europe: Moscow, Russia");
                break;
            case(4):
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case(5):
                System.out.println("Asia: Shanghai, China");
                break;
            case(6):
                System.out.println("Australia: Sydney, Australlia");
                break;
            case(7):
                System.out.println("Antartica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined continent!");
        }
    }
}