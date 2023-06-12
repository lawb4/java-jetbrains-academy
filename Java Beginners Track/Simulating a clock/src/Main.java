class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (minutes == 59 && hours <= 11) {
            minutes = 0;
            hours++;
        } else if (hours == 12 && minutes == 59) {
            hours = 1;
            minutes = 0;
        } else {
            minutes++;
        }
    }
}