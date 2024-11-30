import lombok.Getter;

public class ClassesTypes {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.met();
    }
}
//1.Regular Inner Class
class Outer{
    int flat =2;
    void met(){
        new Inner().in();//in order to expose the methods and data variables of inner class to the world
    }
    class Inner{
        int flat =1;
        void in(){
            int flat=0;
            System.out.println("Inner's method..");
            System.out.println("local flat:"+flat);
            System.out.println("Inner's flat: "+this.flat);
            System.out.println("Outer's flat: "+Outer.this.flat);
        }
    }
}

//2.Anonymous Inner Class implementing an interface:
class Anonymous1 {
    public static void main(String[] args) {
        Remote remote = new Remote() {
            @Override
            public void wfh() {
                System.out.println("Anonymous wfh version1");
            }
        };
        remote.wfh();
    }
}

interface Remote{
    void wfh();
}

//3.Anonymous Inner Class as an argument:
class Anonymous2 {

    public static void main(String[] args) {
        new IntImp().met(new Remote() {
            @Override
            public void wfh() {
                System.out.println("Anonymous wfh version2");
            }
        });
    }

}

class IntImp{
    void met(Remote remote){
        remote.wfh();
    }
}