//out of range exception
public class OutOfRangeException extends RuntimeException {

    //constructor to display error message
    public OutOfRangeException(String errorMessage){
        System.out.println("Range must be between 50-499");
        
    }
}
