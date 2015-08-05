
public class MessageEncoderDriver {
    public static void main(String[] args){
        SubstitutionCipher subCipher = new SubstitutionCipher(3);
        System.out.println(subCipher.encode("A"));
        ShuffleCipher shufCipher = new ShuffleCipher(2);
        System.out.println(shufCipher.encode("abcdefghi"));
    }
}
