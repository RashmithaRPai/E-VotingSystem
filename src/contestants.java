public class contestants {
    private String city;
    private String partyName;
    private int age;
    private String name;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public contestants(String city, String partyName, int age, String name) {
        this.city = city;
        this.partyName = partyName;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "city='" + city + '\'' +
                ", partyName='" + partyName + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
