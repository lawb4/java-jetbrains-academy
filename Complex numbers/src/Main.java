class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        this.image = this.image + num.image;
        this.real = this.real + num.real;
    }

    public void subtract(Complex num) {
        this.image -= num.image;
        this.real -= num.real;
    }
}