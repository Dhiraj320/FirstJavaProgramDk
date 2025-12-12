package DSA.Recursion.RecursionQuestion4Strings.Permutation4_2.LeetCodeQuestion;

public class LetterCombinationOfPhoneNumber17 {
    public static void main(String[] args) {
//        phone("", "23");
//        ArrayList<String> ans= phone("", "79");
//        System.out.println(ans);

//           ArrayList<String> ans= (ArrayList<String>) letterCombinations("23");
//           System.out.println(ans);

       ;
        System.out.println( phoneCount("", "23"));





    }
    /*
    static void phone(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        int digit= up.charAt(0)-'0'; // this will covert '2' into 2
        for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch=(char)('a'+i);
            phone(p+ch, up.substring(1));
        }
    }

     */


/* //Returning ArrayList of String as answer
    static ArrayList<String> phone(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0'; // this will covert '2' into 2
        ArrayList<String> list = new ArrayList<String>();
        for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch=(char)('a'+i);
            list.addAll(phone(p+ch, up.substring(1)));
        }
        return list;
    }




 */
    //Returning ArrayList of String as answer
static int phoneCount(String p, String up){
    if(up.isEmpty()){

        return 1;
    }
    int count=0;
    int digit= up.charAt(0)-'0'; // this will covert '2' into 2
    for(int i=(digit-2)*3;i<(digit-1)*3;i++){
        char ch=(char)('a'+i);
        count =count+phoneCount(p+ch, up.substring(1));
    }
    return count;
}


    //way 2 With complete leetcode solution
    /*
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            List<String> forEmptyList = new ArrayList<>();
            return forEmptyList;
        }
        List<String> result = combo("", digits);

        return result;


    }

    static List<String> combo(String p, String up){
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        int start= (digit-2)*3;
        int end = (digit-1)*3;
        if(digit==8) {
            List<String> exe3 = new ArrayList<>();
            for(int i=start+1;i<end+1;i++) {
                char ch = (char)('a'+i);
                exe3.addAll(combo(p+ch, up.substring(1)));
            }
            return exe3;
        }
        if(digit==9) {
            List<String> exe2 = new ArrayList<>();
            for(int i=start+1;i<=end+1;i++) {
                char ch = (char)('a'+i);
                exe2.addAll(combo(p+ch, up.substring(1)));
            }
            return exe2;
        }
        if(digit==7 ) {
            List<String> exe = new ArrayList<>();
            for(int i=start;i<=end;i++) {
                char ch = (char)('a'+i);
                exe.addAll(combo(p+ch, up.substring(1)));
            }
            return exe;
        }
        List<String> list = new ArrayList<>();
        for(int i=start;i<end;i++) {
            char ch = (char)('a'+i);
            list.addAll(combo(p+ch, up.substring(1)));
        }
        return list;
    }

     */
}
