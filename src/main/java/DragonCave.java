import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        DragonCave dragonCave = new DragonCave();
        System.out.println(dragonCave.getIntroduction());

        Scanner scan = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("1") && !userInput.equals("2"))
            userInput = scan.nextLine();

        if (userInput.equals("1"))
            System.out.println("\n" + dragonCave.getResponse());
    }

    private final String introduction;
    private final String response;

    public DragonCave() {
        this.introduction = """
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.
                Which cave will you go into? (1 or 2)
                """;
        this.response = """
                You approach the cave...
                It is dark and spooky...
                A large dragon jumps out in front of you! He opens his jaws and...
                Gobbles you down in one bite!
                """;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getResponse() {
        return response;
    }
}
