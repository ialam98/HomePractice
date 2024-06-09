package CodingBatPractice;

public class BatPractice1 {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return ("Hello " + name);
    }

    public String makeAbba(String a, String b) {
        return (a +b + b+ a);
    }

    public String extraEnd(String str) {
        String last2 = str.substring(str.length()-2);
        return (last2+last2+last2);
    }

    public String firstHalf(String str) {
        String firstHalf = str.substring(0, str.length()/2);
                return (firstHalf);
    }

}
