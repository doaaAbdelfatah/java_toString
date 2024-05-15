package session126;

public class MainUser {
    public static void main(String[] args) {
        User u = new User();
        u.name = "ahmed";
        u.email ="ahmed@gmail.com";

        User.Address a = u.new Address();
        a.country = "Egypt";
        a.city = "Alex";
        a.street = "Janaklis";
        a.zipCode = "234234";

        User u2 = new User();
        u2.name ="Dina";
        User.Address a2 = u2.new Address();


    }
}
