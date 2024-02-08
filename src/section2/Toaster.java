package section2;

public class Toaster {
    private int capacity;
    private int numOfToastsIn;

    public Toaster(int capacity) {
        this.capacity = capacity;
        this.numOfToastsIn = 0;
    }

    public void setNumOfToastIn(int numOfToastsIn) {
        if(numOfToastsIn <= this.capacity) {
            this.numOfToastsIn = numOfToastsIn;
        }
    }

    @Override
    public String toString() {
        return capacity + " " + numOfToastsIn;
    }
}

class Tester {
    public static void main(String[] args) {
        Toaster t = new Toaster(2);
        System.out.println(t);
        
        t.setNumOfToastIn(2);
        System.out.println(t);

        Toaster t2 = new Toaster(4);
        System.out.println(t2);
        
        t2.setNumOfToastIn(5);
        System.out.println(t2);
    }
}