class DefaultValue {
     byte byteval;
     
     int intval;
     long longval;
    float floatval;
     double doubleval;
      boolean boolval;
     char charval;
 public DefaultValue()
 {
    System.out.println("defalult value of byte value :"+byteval);
    
    System.out.println("defalult value of int value :"+intval);
    System.out.println("defalult value of long value :"+longval);
      System.out.println("defalult value of float value :"+floatval);
    System.out.println("defalult value of double value :"+doubleval);
    System.out.println("defalult value of byte value :"+boolval);
    System.out.println("defalult value of byte value :"+charval);
    
}    
}
public class Main
{
    public static void main(String[] args)
    {
        DefaultValue obj = new DefaultValue();
    }
}
OUTPUT :
defalult value of byte value :0
defalult value of int value :0
defalult value of long value :0
defalult value of float value :0.0
defalult value of double value :0.0
defalult value of byte value :false
defalult value of byte value :0.0