package app.application;

import app.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        
        String[] names = {"Angga", "Nur", "Gunawan"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(
            ArrayHelper.<String>count(names)
        );

        System.out.println(
            ArrayHelper.count(numbers)
        );
    }
    
}
