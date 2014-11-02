package basics;

/**
 * Created by coffee on 10/31/14.
 */
public class Giant implements Foo,Fum {
    @Override
    public String doIt() {
        return "Fee, Fii, basics.Foo, basics.Fum";
    }


    @Override
    public String doThat() {
        return "the implementation";
    }
}
