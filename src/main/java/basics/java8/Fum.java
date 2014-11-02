package basics.java8;

/**
 * Created by coffee on 10/31/14.
 */
public interface Fum {
    String doIt();
    default String doThat() {
        return "Doing another That";
    }
}
