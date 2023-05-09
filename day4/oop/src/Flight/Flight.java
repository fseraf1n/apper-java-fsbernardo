package Flight;

public class Flight {
    int seats;
    int passengers;

    Flight() {
        seats = 10;
        passengers = 0;
    }

    public void addPassenger() {
        if (this.seats == 0) {
            System.out.println("Full");
        } else {
            seats--;
            passengers++;
        }

    }

    public void setNumberOfSeats(int seats) {
        this.seats += seats;
        this.seats = this.seats - passengers;
    }
}
