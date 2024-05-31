package TaskStar;

public class Consumer extends Thread{
    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                store.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
