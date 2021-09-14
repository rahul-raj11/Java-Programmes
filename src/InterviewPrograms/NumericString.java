package InterviewPrograms;

public class NumericString {

    public static void main(String[] args) {
        System.out.println((isNumeric(" ")));
    }

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNumeric(String cs) {
        if(cs == null || cs.isEmpty()) return false;
        //if(isEmpty(cs)) return false;

        int len = cs.length();

        for(int i = 0; i < len; i++) {
            if(!Character.isDigit(cs.charAt(i))){
//                char c = cs.charAt(i);
//                boolean val = Character.isDigit(cs.charAt(i));
                return false;
            }
        }
        return true;
    }
}
