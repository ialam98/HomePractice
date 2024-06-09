package StringPractice;

public class String1 {
    public static void main(String[] args) {

        String name = "Iftekhar_Alam";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('e', 'a'));
        System.out.println(name.replace("r_", "rul " ));

        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("ekh"));

        String [] countries = {"Bangladesh", "India", "Nepal", "Maldives", "USA"} ;
        String str = "Bangladesh, India, Nepal, Maldives, USA";
        String[] cuntries = str.split(",");


        int countrycount = 0;
        for (int i = 0; i < cuntries.length; i++) {
            countrycount++;
            System.out.println("Country "+countrycount +" is : "+ cuntries[i].trim());
        }


        // Find how many character are there in coutries array.
        int cuncharcount = 0;

        for (int i = 0; i< countries.length; i++) {
            cuncharcount = cuncharcount + countries[i].length();
        }
        System.out.println("There are " + cuncharcount+ " character inside countries.");

        //find total numbers of 'a' in the countries array
        //String [] countries = {"Bangladesh", "India", "Nepal", "Maldives", "USA"} ;

        int chara = 0;

        for (int i = 0; i< countries.length; i++) {
            for (int j = 0; j < countries[i].length(); j++) {
                if (countries[i].charAt(j) == 'a') {
                    chara = chara + 1;
                }
            }
        }
        System.out.println("Total number of 'a' in countries array is "+ chara);

        String [] countries2 = {"Uganda", "Sumalia", "Oman", "Spain", "Papua"} ;

        int count2a = 0;

        for (int i = 0; i < countries2.length; i++) {
            for (int k = 0; k < countries2[i].length(); k++) {
                if (countries2[i].charAt(k) == 'a'){
                    count2a = count2a + 1;
                }
            }
        }
        System.out.println("Total number of 'a' in countries array is "+ count2a);

        //Print the country with the largest length
        //String [] countries2 = {"Uganda", "Somalia", "Oman", "Spain", "Papua"} ;

        int countrylength = 0;
        int index = 0;

        for (int i = 0; i< countries2.length; i++) {
            if (countrylength < countries2[i].length()) {
                countrylength = countries2[i].length();
                index = i;
            }
        }
        System.out.println(countries2[index]);

        String city1 = "New York";
        String city2 = "New-York";

        if (city1.equals(city2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not Equal");
        }

        System.out.println(city1.contains("new"));







    }
}

