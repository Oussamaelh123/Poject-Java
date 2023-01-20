public class Som {

    private double getal1;
    private double getal2;

    final double overloop = 100;
    final double onderloop = 0;

    public Som(double getal1, double getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public double berekenSom() throws BovenloopException, OnderloopException{
        double uitkomst = this.getal1 + this.getal2;
        if (uitkomst > overloop){
            throw new BovenloopException();
        } else if (uitkomst < onderloop) {
            throw new OnderloopException(uitkomst);

        }
        return uitkomst;

    }


}
