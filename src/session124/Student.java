package session124;

public class Student {
    private String name;
    private String gender;

    private String adddress;
    private String mobile;


    public String getName() {
        return name;
    }

    public Student(String name, String gender, String mobile) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
    }

    public Student(String name, String gender, String adddress, String mobile) {
        this.name = name;
        this.gender = gender;
        this.adddress = adddress;
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
