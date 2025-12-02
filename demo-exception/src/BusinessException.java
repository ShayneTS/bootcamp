// ! if a class extends Exception/ RunTimeException, you can "throw"

// ! "Checked Exception" -> a class extends Exception
// ! "Unchecked Exception" -> a class extends RuntimeException
public class BusinessException extends RuntimeException {
  // code + message
  // 1. 47893 -> Customer Not Found
  // can use HashMap or enum
  private int code;

  public BusinessException(SysError sysError) {
    super(sysError.getMessage()); //super the parent constructor
  }

  public static void main(String[] args) {
    new RuntimeException("abc");
    throw new BusinessException(SysError.CUSTOMER_NOT_FOUND);
  }
}
