package first;

public class SecondClassofFirst {
    public String secondHello(){
        return "Hello from the second class";
    }

    public static void main(String[] args) {
        FirstClassOfFirst first = new FirstClassOfFirst();
//        first.firstSecHello();//private method, to make package private remove private keyword
        first.firstThirdHello();
        System.out.println(first.firstHello());
        first.firstFourthHello();
    }

}


