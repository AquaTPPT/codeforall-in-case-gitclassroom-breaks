public class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number counter: " + number;
    }
}
