package root;

public class Main {
    public static void main(String[] args) {
        Country russia = new Country("Russia",171000000,146700000,"Moscow",12600000);
        Country finland = new Country("Finland",338000,5500000,"Helsinki",655000);
        Country france = new Country("France",643800,67800000,"Paris",2100000);
        Country andorra = new Country("Andorra",467000,85400,"Andorra la Vella",22600);
        Country singapore = new Country("Singapore",725000,5700000);
        Country niger = new Country("Niamey",1267000,0,"Niamey",0);

        Country[] countries = {russia,finland,france,andorra,singapore,niger};





        Country.printAll(countries);


    }
}
