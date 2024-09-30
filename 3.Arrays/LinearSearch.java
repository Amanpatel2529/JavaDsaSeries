import java.util.*;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static int linearSearchMenu(String menu[], String value){
        for(int  i=0; i<menu.length; i++){
            if(menu[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        String menu[] = {"dosa", "chole bhature", "samosa", "panipuri"};
        String value = "samosa";

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is at index : " + index);
        }

        int menuIndex= linearSearchMenu(menu, value);
        if(index == -1){
            System.out.println("Menu item not available");
        }
        else{
            System.out.println("Menu item available at menuIndex :" +menuIndex);
        }
    }    
}
