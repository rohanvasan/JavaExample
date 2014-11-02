package basics;

/**
 * Created by coffee on 10/31/14.
 */
public interface Foo {
    String doIt();
    default String  doThat() {
        return "Doing that";
    }
}
