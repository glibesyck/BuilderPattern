package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void builderWithoutSingularity() {
        User user = User.builder().name("Someone").age(23).sex("male").build();
        assertEquals(user.toString(), "User(name=Someone, age=23, sex=male, city=null, height=0.0, weight=0.0, occupations=[])");
    }
    @Test
    void builderWithSingularity() {
        User user = User.builder().name("Someone").age(23).sex("male").occupation("student").occupation("barista").build();
        assertEquals(user.toString(), "User(name=Someone, age=23, sex=male, city=null, height=0.0, weight=0.0, occupations=[student, barista])");
    }
}