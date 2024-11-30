package second;

import first.FirstClassOfFirst;
import first.SecondClassofFirst;

public class PackageClassTwo {
    public static void main(String[] args) {
        FirstClassOfFirst first = new FirstClassOfFirst();
        SecondClassofFirst secondClassofFirst = new SecondClassofFirst();
        System.out.println(first.firstHello());
        System.out.println(secondClassofFirst.secondHello());
        TestAdapt testAdapt = new TestAdapt();
        System.out.println(testAdapt.InvokeHello());

    }

}
class TestAdapt extends FirstClassOfFirst{

    public String InvokeHello(){
        return firstFourthHello();
    }
}
