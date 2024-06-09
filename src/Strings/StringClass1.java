package Strings;

public class StringClass1 {
    public static void main(String[] args) {

        String myName = "Iftakharul Alam";

        System.out.println(myName.length());
        System.out.println(myName.charAt(6));
        System.out.println(myName.indexOf("u"));
        System.out.println(myName.replace("Iftakharul", "Umme"));


        String[] countries = {"Bangladesh", "Pakistan", "India", "USA", "Canada"};
        String[] countrys = {"Bangldesh, Pakistan, India, USA, Canada"};
        String country = "Bangldesh, Pakistan, India, USA, Canada";

        String[] country1 = country.split(", ");


//        int i =0;
//        while (i<countrys.length) {
//            System.out.println(countries[i]);
//            i++;
//        }

        for (int k = 0; k < country1.length; k++) {
            System.out.println(country1[k].toUpperCase());
        }


        // Find total number of characters in the array
        int count = 0;
        for (int i = 0; i < countrys.length; i++) {
//            System.out.println(countrys[i].length());
            count = count + countrys[i].length();
        }
        System.out.println("Total number of characters in countrys : " + count);

        int count2 = 0;
        int i = 0;
        while (i < countries.length) {
            System.out.println(countries[i].length());
            count2 = count2 + countries[i].length();
            i++;
        }
        System.out.println("Total :" + count2);


        // Find which country name is the longest
        String[] anothertCountries = {"Ugand", "Brazilo", "Uk", "German", "Fran"};


        int max = 0;
        String desh = "";

        for (int k = 0; k < anothertCountries.length; k++) {
            if (anothertCountries[k].length() > max) {
                max = anothertCountries[k].length();
                desh = anothertCountries[k];
            }
        }
        System.out.println(desh);



//        int counta = 0;
//        for (int a = 0; a < anothertCountries.length; a++) {
//            for (int b = 0; b < anothertCountries[a].length(); b++) {
//                if (anothertCountries[a].charAt(b) == 'a') {
//                    counta = counta + 1;
//                }
//            }
//        }
//            System.out.println("Total number of a is: " + counta);


//        int counta = 0;
//        for (int f =0; f < anothertCountries.length; f++ ) {
//            for (int k = 0; k< anothertCountries[f].length() ; k++) {
//                if (anothertCountries[f].charAt(k) == 'a' ) {
//                    counta = counta + 1;
//                }
//            }
//        }
//        System.out.println("Total number of a is: "+ counta);

        String[] stn = {"uefgeytoguew5ghe5jtg"};
        char chr = 'e';


        int counte = 0;
        for (int x= 0; x< stn.length; x++) {
            String stn1 = stn[x]; {
                for (int y = 0; y< stn[x].length(); y++ ) {
                    if (stn[x].charAt(y) == 'e') {
                        counte++;
                    }
                }
            }
        }
        System.out.println(counte);

    }
}
