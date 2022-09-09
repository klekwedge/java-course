public class Director {
    public void force(Cookable cookable) {
        cookable.cook();
    }

    public void force2(Counter counter, int i) {
        String report = counter.report(i);
        System.out.println(report);
    }
}
