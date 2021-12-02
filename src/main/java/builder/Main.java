package builder;

public class Main {
    public static void main(String[] args) {
        User newUser = User.builder().age(18).occupation("teacher").occupation("student").build();
        System.out.println(newUser);

    }
}
