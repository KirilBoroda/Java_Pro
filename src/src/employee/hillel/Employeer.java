package employee.hillel;

public class Employeer {
    private String fullname;
    private String email;
    private String numberphone;
    private String yearsold;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getYearsold() {
        return yearsold;
    }

    public void setYearsold(String yearsold) {
        this.yearsold = yearsold;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", numberphone='" + numberphone + '\'' +
                ", yearsold='" + yearsold + '\'' +
                '}';
    }

    public Employeer(String fullname, String email, String numberphone, String yearsold) {
        this.fullname = fullname;
        this.email = email;
        this.numberphone = numberphone;
        this.yearsold = yearsold;


    }
}
