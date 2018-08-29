import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class JUnit5AppTest {

@BeforeAll
 static void setup() {



// Initialize connection to file.
System.out.println("@BeforeAll1111 - Execute once before all test methods in this class.");

    }

 @BeforeEach
 void init() {

// Insert some sample data before each test
System.out.println("@BeforeEach - Executed before each test method in this class.");

    }

@DisplayName("Test add user successfully.")
@Test
 void testAddUserSuccess() {
        System.out.println("Test add user successfully");
    }

@DisplayName("Test add user with passed argument is null.")
@Test
void testAddUserNull() {
    assertEquals(2,2);
        System.out.println("Test add null user.");

    }

@Test
 @Disabled("Not implemented yet.")
 void testDeleteUser() {}

@AfterEach
 void tearDown() {

// Reset the file content.
System.out.println("@AfterEach - This method is called after each test method.");

    }

@AfterAll
static void done() {

// Closes connection to the file
System.out.println("@AfterAll - This method is called after all test methods.");

    }

}
