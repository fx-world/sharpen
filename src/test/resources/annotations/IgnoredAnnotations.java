package annotations;

@interface IgnoreThisAnnotation {
}

@IgnoreThisAnnotation
public class IgnoredAnnotations {

    @IgnoreThisAnnotation
    public String field;

    @IgnoreThisAnnotation
    public void work() {

    }

}
