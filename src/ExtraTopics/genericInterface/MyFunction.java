package ExtraTopics.genericInterface;


// functional interface takes only one method
@FunctionalInterface
public interface MyFunction<Thing> {

    void function(Thing n);

}
