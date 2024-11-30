import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) throws IllegalBalanceException {
        int balance = 0;
        CheckBalance(balance);
    }
    static void CheckBalance(int balance) throws IllegalBalanceException {
//        try(FileInputStream fileInputStream = new FileInputStream("inst.txt")){
//        } catch (FileNotFoundException e) {
//            System.out.println("File error"+e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            System.out.println("File was not found");
//        }
        try(FileInputStream fileInputStream = new FileInputStream("inst.txt")){
        } catch (FileNotFoundException e) {
            throw new IllegalBalanceException("File was not found");
        } catch (IOException e) {
            throw new IllegalBalanceException("File was not found");
        }
//        }finally {
//            System.out.println("File was not found");
//        }



    }
}

class IllegalBalanceException extends Exception{
    public IllegalBalanceException(String message){
        super(message);
    }
}