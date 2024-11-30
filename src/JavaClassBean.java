import lombok.Getter;
import lombok.Lombok;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class JavaClassBean {
    //Tell about CamelContext
    //By default all the data types of class are private
    //While creating a bean it is always necessary to have a public methods that would expose these data types to the world
    //This is done using getters and setters
    private String name;
    private double amount;
    private int custId;

    //always have a default contructor with no args
    JavaClassBean(){

    }

    JavaClassBean(String name,double amount,int custId){
        this.name=name;
        this.amount=amount;
        this.custId=custId;
    }//args name can be diff but for better readability we keep it same

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    public void setCustId(int custId) {
//        this.custId = custId;
//    }
//
//    public int getCustId() {
//        return custId;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "JavaClassBean{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", custId=" + custId +
                '}';
    }




}

class BeanRetriever{
    public static void main(String[] args) {
        JavaClassBean javaClassBean = new JavaClassBean();
        javaClassBean.setAmount(50000);
        javaClassBean.setName("Purush");
        javaClassBean.setCustId(1);
        System.out.println(javaClassBean.toString());
        new Participants("Washi",4000.00);
        System.out.println(new Participants("Washi",4000.00).equals(new Participants("Washi",446346.00)));
        System.out.println(new Participants("Rashmi",4000.00).compareTo(new Participants("Washo",446346.00)));
        ArrayList<Participants> participantsArrayList = new ArrayList<>();
        participantsArrayList.add(new Participants("Washi",4000.00));
        participantsArrayList.add(new Participants("Rashmi",4000.00));
        participantsArrayList.add(new Participants("Purush",43400.00,1));
        Collections.sort(participantsArrayList,new NameComparer());
        System.out.println(participantsArrayList);
        Collections.sort(participantsArrayList, new Comparator<Participants>() {
            @Override
            public int compare(Participants o1, Participants o2) {
                return o1.amount().compareTo(o2.amount());
            }
        });
        System.out.println(participantsArrayList);

//        System.out.println("The set values are: name: " + javaClassBean.getName() + "  amount: "+ javaClassBean.getAmount()+"  customer id: "+ javaClassBean.getCustId());
        //Rather than using manual getters and setters we can use lombok notations, show how to install lombok plugin
    }
}

//However classes can be too hectic o use given you have to use getter and setter, we can make use of an alternate i.e, records introduces n java version 14 but accepted in java version 16
record Participants(String name,Double amount,Integer custId) implements Comparable<Participants>{
//    Participants(String name,double amount){
//        this.name=name;
//        this.amount=amount;
//        this.custId=custId();this will return error because a record expects you to define and initialize the data in non-cannonical form in contengency to cannonical form. i.e, the value not being used for the constructor should be set to null setters.
//    }
Participants(String name,Double amount){
    this(name,amount,0);
    System.out.println("Participant has been called");
}
    Participants(String name,Integer custId){
        this(name,0.0,custId);
        System.out.println("Participant has been called");
    }

    Participants(Double amount,Integer custId){
        this(null,amount,custId);
        System.out.println("Participant has been called");
    }
//some more overrides

    @Override
    public boolean equals(Object o) {
        return !this.name().equals(((Participants)o).name());//tell tem how to refer data members using ()
    }


    @Override
    public int compareTo(Participants o) {
        return this.amount().compareTo(o.amount());//however this is only one dimensional and will only perform 1 dimensional sort based upon paramter type and not the object that we are using
    }
}

class NameComparer implements Comparator<Participants>{

    @Override
    public int compare(Participants o1, Participants o2) {
        return o1.name().compareTo(o2.name());
    }
}

