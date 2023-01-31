package app;

public class pair<T, U> {

    private T first;
    private U second;

    public pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first){
        this.first = first;
    }
    public U getSecond(){
        return second;
    }

    public void setSecond(U second){
        this.second = second;
    }
    
}