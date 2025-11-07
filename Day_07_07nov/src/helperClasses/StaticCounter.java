package helperClasses;

public class StaticCounter {

    static int count = 0 ;

    public StaticCounter(){
        count++;
    }

    public void displayCounter(){
        System.out.println(count);
    }

}
