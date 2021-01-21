package statements;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes () {
                return hours * 60 + minutes;
    }

    public int getInSeconds() {
        return getInMinutes() * 60 + seconds;

    }

    public boolean earlierThan (Time other) {
        return this.getInSeconds() < other.getInSeconds();
    }

    public String toString(){
        return "Az idő: " + this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
