public class Main {
    public static void main(String[] args) {

        System.out.println("Билет 3. Задача: Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.");
        //String text = "Эта произвольная строка, предназначена для разделения на две части ровно пополам по количеству символов.";
        String text = "0,1,2,3,4,5,6,7,8,9,10,11,12,13,";
        System.out.println("Произвольная строка имеет вид: "+ text);
        int totalSymbols = text.length();
        if (totalSymbols % 2 == 0) {
            System.out.println("Произвольная строка состоит из " + totalSymbols + " символов. Её можно разделить на две части длиной по " + totalSymbols / 2 + " символов");
        } else {
            System.out.println("Произвольная строка состоит из " + totalSymbols + " символов. Это нечетное число, такую строку нельзя разделить на две равные части");
            return;
        }
        String text1 = text.substring(0, text.length() / 2);
        String text2 = text.substring(text.length() / 2, totalSymbols);
        System.out.println("Часть 1 имеет вид: " + text1);
        System.out.println("Часть 2 имеет вид: " + text2);
    }
}