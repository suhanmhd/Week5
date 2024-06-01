package samples;

public class OuterClass {
    int instanceVariable =10;
    static  int staticVariable =11;


    private   static class InnerClass{
        public void printFunction(){
            System.out.println(staticVariable+" "+"");

        }
    }
    public  static InnerClass getInstance(){
        return new InnerClass();
    }
}
