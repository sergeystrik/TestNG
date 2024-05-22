package class01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority =2)
    public  void AtestCase(){
        System.out.println("i am test case A");
    }
    @Test(priority =3)
    public  void BtestCase(){
        System.out.println("i am test case B");
    }

    @Test(priority =1)
    public  void CtestCase(){
        System.out.println("i am test case C");
    }
}
