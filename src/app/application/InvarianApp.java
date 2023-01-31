package app.application;

import app.MyData;
public class InvarianApp {
    public static void main(String[] args) {
        //MyData<String> stringMyData = new MyData("Angga");
        //doIt(stringMyData); //Error
        // MyData<Object> objectMyData = stringMyData; //Error

       // MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; //Error
        // doItInteger(objectMyData); //error

    }

    public static void doIt(MyData<Object> objectMyData){
        //do nothing
    }
    public static void doItInteger(MyData<Integer> objectMyData){
        //do nothing
    }
    
}
