
public class ClassTest {
    public static void main(String[] args) {

        String sent = "bangalore is capital of karnataka";
        ClassTest m = new ClassTest();
        String newSent = m.senMethod(sent);
        System.out.println(newSent);
    }

    String senMethod(String sent) {
        String word[] = sent.split(" ");
        String revSen = "", revWord = "";
        for (int i = 0; i < word.length; i++) {
            StringBuilder sb = new StringBuilder(word[i].substring(1));
			revWord = word[i].substring(0, 1).toUpperCase() + String.valueOf(sb.reverse()) + " ";
			revSen = revSen + revWord;
        }
        return revSen;				//Berolagna Is Clatipa Of Kakatanra
    }
}
