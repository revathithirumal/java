public class ifelse{
    public static void main(String[] args){
        char c='e';
        if (Character.isLetter(c)){  
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("It is a vowel")
            } else {
                System.out.println("It is a consonant");
            }
        } else {
            System.out.println("It is not a character");
        }
    }
}
