package StringPractice;

public class String2 {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 15;

        int num3 = (num1 > num2) ? num1 : num2;
        System.out.println(num3);

        totalNumberofString("eurhguergherugh", 'u');


        String name = "Iftekhar";
        System.out.println(name.substring(name.length() - 2));

        // Find the
        String[] memberName = {"Ifty", "Umme", "Nazma", "Rezaul", "Natim", "Jhumu"};

        int memberNum = 0;

        for (int i = 0; i < memberName.length; i++) {
            String memberNameLast2 = memberName[i].substring(memberName[i].length() - 2);
            memberNum++;
            System.out.println("Last 2 digit of member's " + memberNum + "'s name is : " + memberNameLast2);
        }

        // Find the last name of the family members
        String[] memberName2 = {"Ifty Alam", "Umme Honey", "Nazma Banu", "Rezaul Karim", "Naim Molla", "Jhumu Mia"};

        int memberNumber2 = 0;
        String LastNameofFamilymember = "";

        for (int i = 0; i < memberName2.length; i++) {
//             System.out.println(memberName2[i]);
            for (int k = 0; k < memberName2[i].length(); k++) {
                String[] LastName = memberName2[i].split(" ");
                for (int j = 0; j < LastName.length; j++) {
                    LastNameofFamilymember = LastName[1];
                }
            } memberNumber2++;
            System.out.println("Last name of member number "+ memberNumber2+ " is " + LastNameofFamilymember);
        }

        String[] ClassMember = {"Ifty Alam", "Shuvashish Debnath", "Hannan Bro", "Ishak Rahman", "Arefin Rayhan", "Shakrukh Khan"};

        int membercount = 0 ;
        for (int i = 0; i < ClassMember.length; i++) {
            String fm = ClassMember[i];
            String [] MemberName = fm.split(" ");
            String MemberLastName = MemberName[1];
            membercount++;

            System.out.println("Class Member " + membercount+ "'s Last name is " + MemberLastName);
        }


        String [] str = {"eurjguerugeuorgjeougr" , "kgjrtiljeh"};

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


        //Create a method which will have 2 param (string and Char)
        //Print total numberof char presentin the string
        //String str = "eurjguerugeuorgjeougr";

        public static void totalNumberofString (String str,char car){

            int totalchar = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == car) {
                    totalchar++;
                }
            }
            System.out.println("total number of character in this string is : " + totalchar);



    }
}


