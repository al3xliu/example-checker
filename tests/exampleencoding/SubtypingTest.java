import org.checkerframework.checker.exampleencoding.qual.*;

// Test basic subtyping relationships for the Example Encoding Checker.
class SubtypeTest {
    void allSubtypingRelationships(@ExampleEncodingUnknown int x, @ExampleEncoding int y) {
        @ExampleEncodingUnknown int a = x;
        @ExampleEncodingUnknown int b = y;
        // :: error: assignment
        @ExampleEncoding int c = x; // expected error on this line
        @ExampleEncoding int d = y;
    }
}
