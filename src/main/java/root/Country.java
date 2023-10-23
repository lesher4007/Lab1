package root;



public class Country {
    private String name;
    private int square;
    private int population;
    private String capital;
    private  int populationCapital;

    public Country(String name, int square, int population, String capital, int populationCapital) {
        setName(name);
        setSquare(square);
        setPopulation(population);
        setCapital(capital);
        setPopulationCapitol(populationCapital);
    }

    public Country(String name, int square, int population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
    }

    public int getPopulation() {
        return population;
    }

    public int getPopulationCapital() {
        return populationCapital;
    }

    public String getCapital() {
        return capital;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }
    public double getPopulationDensity(){
        return (double) square /population;
    }

    public void setName(String name) {
        if (name!=null && !name.isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setSquare(int square) {
        if (square>0){
            this.square = square;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setPopulation(int population) {
        if (population>=0){
            this.population = population;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationCapitol(int populationCapital) {
        this.populationCapital = populationCapital;
    }
    public void resetCapitalData(){
        this.capital=null;
        this.populationCapital=0;

    }
    public void setCapital(String capital,int populationCapital){
        this.capital = capital;
        this.populationCapital = populationCapital;
    }
    public void print(){
        if(getCapital()==null){
            if(getPopulation()==0){
                System.out.println(getName()+", square "+getSquare()+" sq. km., "+"country population unknown");
            }else {
                System.out.println(getName() + ", square " + getSquare() + " sq. km., population " + getPopulation() + " people");
            }
        }else {
            if(getPopulation()==0){
                System.out.println(getName() + ", square " + getSquare() + " sq. km., " + "country population unknown, capital " + getCapital() + ", capital population unknown");
            }else {
                System.out.println(getName() + ", square " + getSquare() + " sq. km., population " + getPopulation() + " people, capital " + getCapital() + ", capital population " + getPopulationCapital() + " people");
            }
        }
    }
    public static void printAll(Country[] array){
        for (int i = 0; i < array.length; i++) {
            array[i].print();

        }

    }
}
