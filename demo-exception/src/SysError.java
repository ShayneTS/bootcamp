public enum SysError {
  CUSTOMER_NOT_FOUND(47893, "Customer Not Found"), // and add as many as you wish
  ;


  private int code;
  private String message;

  private SysError(int code, String message){
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage(){
    return this.message;
  }
}
