package lab_5;

public class lab_5 {
    public static void main(String[] args) {
        String[] words = {"ut", "sit", "amet", "diam"};
        Text text = new Text("Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit. Donec massa ipsum," +
                " accumsan dignissim mi ut, posuere maximus orci." +
                " Fusce porttitor velit sapien, non sodales augue " +
                "faucibus eget. Nullam vitae condimentum orci. In sed" +
                " erat risus. Aliquam euismod massa eget convallis ferm" +
                "entum. Nam sit amet ultricies tortor, ut eleifend diam.");

        for (int i = 0; i < words.length; i++) {
            int counter = text.inHowManySentences(words[i]);
            System.out.println("Word " + words[i] + " is in " + counter + " sentences");
        }

    }


}
