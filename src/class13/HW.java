package class13;

public class HW {
    public static void main(String[] args) {
        /* Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        For Example String str=hello =>l
         */
       // String str=new String("Java"); //we use below shortcut instead of this one

        String str="Ana";
        if(!str.isBlank()&&str.length()%2!=0&&str.length()>=3){
            int middleIndex=str.length()/2;
            char middleChar=str.charAt(middleIndex);
            System.out.println(middleChar);
            }
        }

    }

