package root2;

public class Publisher {
    private String namePublisher;
    private String city;

    public String getCity() {
        return city;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        if (namePublisher!=null && !namePublisher.isEmpty()){
            this.namePublisher = namePublisher;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setCity(String city) {
        if (city!=null && !city.isEmpty()){
            this.city = city;
        }else {
            throw new IllegalArgumentException();
        }
    }
}
