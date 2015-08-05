
public class SubstitutionCipher implements MessageEncoder {
    public int shift;

    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encode(String encode) {
        int length = encode.length();
        String newCode = "";
        for (int j = 0; j < length; j++) {
            String i = String.valueOf(encode.charAt(j));
            if (!(i.equals(" "))) {
                int asciiString = (int) encode.charAt(j);
                asciiString = asciiString + shift;
                newCode += Character.toString((char) asciiString);
            }
        }
        return newCode;
    }
}
