package basics.java8;

/**
 * Created by coffee on 10/31/14.
 * Default methods - Diamond problem caught at compile time
 */
public class Giant implements Foo,Fum {
    @Override
    public String doIt() {
        return "Fee, Fii, Foe, Fum";
    }


    @Override
    public String doThat() {
        return "the implementation";
    }
}
