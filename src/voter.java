import java.time.LocalDate;

public class voter {
    private String voterName;
    private String city;
    private String voterId;
    LocalDate DOB;
    private int OTP;

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
    }

    public voter(String voterName, String city, String voterId, LocalDate DOB, int OTP) {
        this.voterName = voterName;
        this.city = city;
        this.voterId = voterId;
        this.DOB = DOB;
        this.OTP = OTP;
    }

    @Override
    public String toString() {
        return "{" +
                "voterName='" + voterName + '\'' +
                ", city='" + city + '\'' +
                ", voterId='" + voterId + '\'' +
                ", DOB=" + DOB +
                ", OTP=" + OTP +
                '}';
    }
}
