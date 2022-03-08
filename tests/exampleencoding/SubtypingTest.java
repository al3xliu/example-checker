import org.checkerframework.checker.exampleencoding.qual.*;

// Test basic subtyping relationships for the Example Encoding Checker.
class SubtypeTest {
    void allSubtypingRelationships(@ExampleEncodingUnknown int x, @ExampleEncodingBottom int y) {
        @ExampleEncodingUnknown int a = x;
        @ExampleEncodingUnknown int b = y;
        // :: error: assignment
        @ExampleEncodingBottom int c = x; // expected error on this line
        @ExampleEncodingBottom int d = y;
    }
}
