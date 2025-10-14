public class DemoString {
  public static void main(String[] args) {
    //!String for storing things other than number, e.g. chinese charactoers
    String name = "John";
    String tutor = "Vincent Lau";
    String s1 = "Ni Hao";

    //!String has + operation
    String firstName = "Jennie";
    String lastName = "Wong";
    String fullName = firstName + "  " + lastName;
    System.out.println(fullName); 
    //short cut = sysout
    String emptyString = "";
    System.out.println(emptyString);

    // ! String has no -, *, / operations)
    // ! For + operation in String, it becomes String no matter the reason
    //string value + double value ->
    String s3= "Sally"+ 0.3;
    System.out.println(s3);
    String s4 = "Leo" +102;
    System.out.println(s4);
    double result = "Vincent" +8.4; //error
        // java methodsk,
    // ! Methods (functions)
    //double x + 0.3;
    String return this;
    String teacher = "Steven";
    System.out.println(teacher.length());
    
    // 2. isEmpty
    System.out.println(teacher.isEmpty());
    System.out.println(emptyString.isEmpty());
    //3. equals
    String s6 = "abc";
    String s7 = "abc";
    System.out.println(s6.equals(s7));
    String s8 = "abc";
    System.out.println(s8.equals(7));
    //4. charAt
    //! Index begins at 0
    System.out.println(s8.charAt(0));
    System.out.println(s8.charAt(1));
    System.out.println(s8.charAt(2));
    System.out.println(s8.charAt(3));
    System.out.println(s8.charAt(4));//error
    System.out.println(s8.charAt(-1));//error
  }
}
