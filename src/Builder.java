import java.util.Optional;
import java.util.function.Supplier;

public class Builder {
    private final String firstName;
    private final String lastName;
    private Optional<Integer> age;
    private Optional<String> address;

    public Builder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Optional.empty();
        this.address = Optional.empty();
    }

    public Integer getAge() {
        // Supplier<RuntimeException> exceptionSupplier=()->new RuntimeException("age");
        return age.orElse(0);
    }

    public String getAddress() {
        return address.orElse("Undefined");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Builder addAge(int age) {
        this.age = Optional.of(age);
        return this;
    }

    public Builder addAddress(String address) {
        this.address = Optional.of(address);
        return this;
    }
//    public Person personBuilder(){
//        return new Person(firstName,lastName,age,address);
//    }

    @Override
    public String toString() {
        return "Builder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
