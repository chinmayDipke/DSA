package Questions;

public class LeetCode1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for(int i = 'a'; i <= 'z'; i++){
            if(sentence.indexOf(i) == -1){
                return false;
            }
        }
        return true;

    }
}
