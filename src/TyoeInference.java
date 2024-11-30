import com.sun.jdi.Type;

public class TyoeInference {
    public static void main(String[] args) {
        var helloString = "Hello world";
        var num = 1;
        var condition = true;
        System.out.println(((Object) helloString).getClass().getSimpleName());
        System.out.println(((Object) num).getClass().getSimpleName());
        System.out.println(((Object) condition).getClass().getSimpleName());

    }

}
