package tel_ran.Garage.Model;

public class Car implements Comparable<Car> {
    String vender;
    int year;
    int volume;

    public Car(String vender, int year, int volume) {
        this.vender = vender;
        this.year = year;
        this.volume = volume;
    }

    public String getVender() {
        return vender;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(int volume) {
        this.volume = volume;


    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
