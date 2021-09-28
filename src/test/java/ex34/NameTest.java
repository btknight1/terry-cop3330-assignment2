package ex34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    @DisplayName("Ensure name is deleted")
    void delete() {
        Name myNames = new Name();
        String delThis = "Chris Jones";
        myNames.delete(delThis);
        assertEquals(true, myNames.isDeleted());
    }
}