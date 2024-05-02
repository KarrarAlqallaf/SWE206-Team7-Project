public class Individual {
    private String name;
    private String id;
    private String email;
    private Gender gender;
    private String password;

    // Constructors, getters, setters, and other methods can be added here

    // Example constructor
    public Individual(String name, String id, String email, Gender gender, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

    // Getters and setters for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
