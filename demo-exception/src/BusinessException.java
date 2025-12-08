// ! if a class extending Exception/ RuntimeException, you can "throw" this exception object

// ! "Checked Exception" -> a class extends Exception
// ! "Unchecked Exception" -> a class extends RuntimeException
public class BusinessException extends RuntimeException {
  // code + message
  // 1. 47893 -> Customer Not Found
  private int code;
  
  public BusinessException(SysError sysError) {
    super(sysError.getMessage());
  }

  public static void main(String[] args) {
    new RuntimeException("abc");
    
    throw new BusinessException(SysError.CUSTOMER_NOT_FOUND); // RuntimeException
  }
}