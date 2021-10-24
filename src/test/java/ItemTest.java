import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void testToString() {
        //create an instance of the Item class
        //hardcode an expected string that the ToString method should return when our instance calls it
        //use AssertEquals to confirm our expected string and our actual string are the same
    }

    @Test
    void setDueDate() {
        //create an instance of the Item class without a due date
        //attempt to set its due date to an invalid string
        //assert that the due date is null, because it should not be updated
        //attempt to set its due date to a valid string
        //assert that the due date is equal to the valid string we entered
    }
}