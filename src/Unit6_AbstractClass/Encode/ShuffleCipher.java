public class ShuffleCipher implements MessageEncoder{
    private int n;
    public ShuffleCipher(int n){
        this.n = n;
    }

    // public String encode(String encode){return null;}

    public String encode(String message){

        String newMessage = message;
        for(int j=0; j<n; j++){newMessage = singleShuffle(newMessage);}
        return newMessage;
    }

    private String singleShuffle(String message) {
        String newMessage[] = new String[2];
        String shuffledString = "";
        newMessage[0] = message.substring(0, (message.length() / 2));
        newMessage[1] = message.substring((message.length() / 2));
        for (int j = 0; j < newMessage[1].length(); j++) {
            if (j < newMessage[0].length()) {
                shuffledString += newMessage[0].charAt(j);
            }
            shuffledString += newMessage[1].charAt(j);
        }
        return shuffledString;
    }
}
