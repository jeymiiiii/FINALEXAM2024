import GameRules.Gameplay;
import Player.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Characters characters = new Characters();
        Player playerA = new Player();
        Player playerB = new Player();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Player A
        System.out.println("Enter Player A Name: ");
        String playerAName = reader.readLine();
        playerA.setName(playerAName);
        playerA.setGreenCharacter(characters.Magnus);
        playerA.setBlueCharacter(characters.Celine);
        playerA.setYellowCharacter(characters.David);
        playerA.setRedCharacter(characters.Paouri);

        System.out.println("Player A Name: " + playerAName);
        System.out.println("Player A level:" + playerA.getLevel());
        System.out.println("Player A Green Character: " + characters.Magnus.getCharacterName());
        System.out.println("Player A Blue Character: " + characters.Celine.getCharacterName());
        System.out.println("Player A Yellow Character: " + characters.David.getCharacterName());
        System.out.println("Player A Red Character: " + characters.Paouri.getCharacterName());
        System.out.println();

        //Player B
        System.out.println("Enter Player B Name: ");
        String playerBName = reader.readLine();
        playerB.setName(playerBName);
        playerB.setGreenCharacter(characters.Eula);
        playerB.setBlueCharacter(characters.Zach);
        playerB.setYellowCharacter(characters.Lily);
        playerB.setRedCharacter(characters.Aciel);

        System.out.println("Player B Name: " + playerBName);
        System.out.println("Player B level:" + playerB.getLevel());
        System.out.println("Player B Green Character: " + characters.Eula.getCharacterName());
        System.out.println("Player B Blue Character: " + characters.Zach.getCharacterName());
        System.out.println("Player B Yellow Character: " + characters.Lily.getCharacterName());
        System.out.println("Player B Red Character: " + characters.Aciel.getCharacterName());
        System.out.println();

        System.out.print("PRESS ENTER TO START GAME:");
        reader.readLine();
        System.out.println();

    boolean done=false;
    while(!done) {

        //Player A
        if (playerA.getGreenCharacter().getLifePoints() > 0) {
            System.out.println("[A] " + playerA.getGreenCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerA.getGreenCharacter().getCharacterName());
        }

        if (playerA.getBlueCharacter().getLifePoints() > 0) {
            System.out.println("[B] " + playerA.getBlueCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerA.getBlueCharacter().getCharacterName());
        }

        if (playerA.getYellowCharacter().getLifePoints() > 0) {
            System.out.println("[C] " + playerA.getYellowCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerA.getYellowCharacter().getCharacterName());
        }

        if (playerA.getRedCharacter().getLifePoints() > 0) {
            System.out.println("[D] " + playerA.getRedCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerA.getRedCharacter().getCharacterName());
        }

        System.out.println("Player A, choose a Character: ");
        String playerACharacterChoice = reader.readLine();
        System.out.println();

        //Player B
        if (playerB.getGreenCharacter().getLifePoints() > 0) {
            System.out.println("[A] " + playerB.getGreenCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerB.getGreenCharacter().getCharacterName());
        }

        if (playerB.getBlueCharacter().getLifePoints() > 0) {
            System.out.println("[B] " + playerB.getBlueCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerB.getBlueCharacter().getCharacterName());
        }

        if (playerB.getYellowCharacter().getLifePoints() > 0) {
            System.out.println("[C] " + playerB.getYellowCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerB.getYellowCharacter().getCharacterName());
        }

        if (playerB.getRedCharacter().getLifePoints() > 0) {
            System.out.println("[D] " + playerB.getRedCharacter().getCharacterName());
        } else {
            System.out.println("[X] " + playerB.getRedCharacter().getCharacterName());
        }

        System.out.println("Player B, choose a Character: ");
        String playerBCharacterChoice = reader.readLine();
        System.out.println();

        System.out.println("!!BATTLE BEGINS!!");
        System.out.println();
        TimeUnit.SECONDS.sleep(3);

        Gameplay game = new Gameplay() {

            @Override
            public int playerARandom() {
                Random rand = new Random();
                int ranInt = rand.nextInt(10);
//                System.out.println("RANDOM A = "+ ranInt);
                return ranInt;
            }

            @Override
            public int playerBRandom() {
                Random rand = new Random();
                int ranInt = rand.nextInt(10);
//                System.out.println("RANDOM B = "+ ranInt);
                return ranInt;
            }
        };

        switch (playerACharacterChoice) {
            case "A":
                if (playerBCharacterChoice.equals("A")) {
                    game.play(playerA.getGreenCharacter(), playerB.getGreenCharacter());
                    System.out.println(playerA.getGreenCharacter().getCharacterName() +
                            " life points = " + playerA.getGreenCharacter().getLifePoints());

                    System.out.println(playerB.getGreenCharacter().getCharacterName() +
                            " life points = " + playerB.getGreenCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("B")) {
                    game.play(playerA.getGreenCharacter(), playerB.getBlueCharacter());
                    System.out.println(playerA.getGreenCharacter().getCharacterName() +
                            " life points = " + playerA.getGreenCharacter().getLifePoints());

                    System.out.println(playerB.getBlueCharacter().getCharacterName() +
                            " life points = " + playerB.getBlueCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("C")) {
                    game.play(playerA.getGreenCharacter(), playerB.getYellowCharacter());
                    System.out.println(playerA.getGreenCharacter().getCharacterName() +
                            " life points = " + playerA.getGreenCharacter().getLifePoints());

                    System.out.println(playerB.getYellowCharacter().getCharacterName() +
                            " life points = " + playerB.getYellowCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("D")) {
                    game.play(playerA.getGreenCharacter(), playerB.getRedCharacter());
                    System.out.println(playerA.getGreenCharacter().getCharacterName() +
                            " life points = " + playerA.getGreenCharacter().getLifePoints());

                    System.out.println(playerB.getRedCharacter().getCharacterName() +
                            " life points = " + playerB.getRedCharacter().getLifePoints());

                }
                if (playerA.getGreenCharacter().getLifePoints() > 0) {
                    System.out.println("PLAYER A WINS!");
                    playerA.levelUp();
                    System.out.println("PLAYER A LEVEL UP! NEW LEVEL = "
                            +playerA.getLevel());

                } else {
                    System.out.println("PLAYER B WINS!");
                    playerB.levelUp();
                    System.out.println("PLAYER B LEVEL UP! NEW LEVEL = "
                            +playerB.getLevel());
                }
                break;
            case "B":
                if (playerBCharacterChoice.equals("A")) {
                    game.play(playerA.getBlueCharacter(), playerB.getGreenCharacter());
                    System.out.println(playerA.getBlueCharacter().getCharacterName() +
                            " life points = " + playerA.getBlueCharacter().getLifePoints());

                    System.out.println(playerB.getGreenCharacter().getCharacterName() +
                            " life points = " + playerB.getGreenCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("B")) {
                    game.play(playerA.getBlueCharacter(), playerB.getBlueCharacter());
                    System.out.println(playerA.getBlueCharacter().getCharacterName() +
                            " life points = " + playerA.getBlueCharacter().getLifePoints());

                    System.out.println(playerB.getBlueCharacter().getCharacterName() +
                            " life points = " + playerB.getBlueCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("C")) {
                    game.play(playerA.getBlueCharacter(), playerB.getYellowCharacter());
                    System.out.println(playerA.getBlueCharacter().getCharacterName() +
                            " life points = " + playerA.getBlueCharacter().getLifePoints());

                    System.out.println(playerB.getYellowCharacter().getCharacterName() +
                            " life points = " + playerB.getYellowCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("D")) {
                    game.play(playerA.getBlueCharacter(), playerB.getRedCharacter());
                    System.out.println(playerA.getBlueCharacter().getCharacterName() +
                            " life points = " + playerA.getBlueCharacter().getLifePoints());

                    System.out.println(playerB.getRedCharacter().getCharacterName() +
                            " life points = " + playerB.getRedCharacter().getLifePoints());

                }
                if (playerA.getBlueCharacter().getLifePoints() > 0) {
                    System.out.println("PLAYER A WINS!");
                    playerA.levelUp();
                    System.out.println("PLAYER A LEVEL UP! NEW LEVEL = "
                            +playerA.getLevel());

                } else {
                    System.out.println("PLAYER B WINS!");
                    playerB.levelUp();
                    System.out.println("PLAYER B LEVEL UP! NEW LEVEL = "
                            +playerB.getLevel());
                }
                break;
            case "C":
                if (playerBCharacterChoice.equals("A")) {
                    game.play(playerA.getYellowCharacter(), playerB.getGreenCharacter());
                    System.out.println(playerA.getYellowCharacter().getCharacterName() +
                            " life points = " + playerA.getYellowCharacter().getLifePoints());

                    System.out.println(playerB.getGreenCharacter().getCharacterName() +
                            " life points = " + playerB.getGreenCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("B")) {
                    game.play(playerA.getYellowCharacter(), playerB.getBlueCharacter());
                    System.out.println(playerA.getYellowCharacter().getCharacterName() +
                            " life points = " + playerA.getYellowCharacter().getLifePoints());

                    System.out.println(playerB.getBlueCharacter().getCharacterName() +
                            " life points = " + playerB.getBlueCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("C")) {
                    game.play(playerA.getYellowCharacter(), playerB.getYellowCharacter());
                    System.out.println(playerA.getYellowCharacter().getCharacterName() +
                            " life points = " + playerA.getYellowCharacter().getLifePoints());

                    System.out.println(playerB.getYellowCharacter().getCharacterName() +
                            " life points = " + playerB.getYellowCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("D")) {
                    game.play(playerA.getYellowCharacter(), playerB.getRedCharacter());
                    System.out.println(playerA.getYellowCharacter().getCharacterName() +
                            " life points = " + playerA.getYellowCharacter().getLifePoints());

                    System.out.println(playerB.getRedCharacter().getCharacterName() +
                            " life points = " + playerB.getRedCharacter().getLifePoints());

                }
                if (playerA.getYellowCharacter().getLifePoints() > 0) {
                    System.out.println("PLAYER A WINS!");
                    playerA.levelUp();
                    System.out.println("PLAYER A LEVEL UP! NEW LEVEL = "
                            +playerA.getLevel());

                } else {
                    System.out.println("PLAYER B WINS!");
                    playerB.levelUp();
                    System.out.println("PLAYER B LEVEL UP! NEW LEVEL = "
                            +playerB.getLevel());
                }
                break;
            default:
            case "D":
                if (playerBCharacterChoice.equals("A")) {
                    game.play(playerA.getRedCharacter(), playerB.getGreenCharacter());
                    System.out.println(playerA.getRedCharacter().getCharacterName() +
                            " life points = " + playerA.getRedCharacter().getLifePoints());

                    System.out.println(playerB.getGreenCharacter().getCharacterName() +
                            " life points = " + playerB.getGreenCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("B")) {
                    game.play(playerA.getRedCharacter(), playerB.getBlueCharacter());
                    System.out.println(playerA.getRedCharacter().getCharacterName() +
                            " life points = " + playerA.getRedCharacter().getLifePoints());

                    System.out.println(playerB.getBlueCharacter().getCharacterName() +
                            " life points = " + playerB.getBlueCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("C")) {
                    game.play(playerA.getRedCharacter(), playerB.getYellowCharacter());
                    System.out.println(playerA.getRedCharacter().getCharacterName() +
                            " life points = " + playerA.getRedCharacter().getLifePoints());

                    System.out.println(playerB.getYellowCharacter().getCharacterName() +
                            " life points = " + playerB.getYellowCharacter().getLifePoints());

                } else if (playerBCharacterChoice.equals("D")) {
                    game.play(playerA.getRedCharacter(), playerB.getRedCharacter());
                    System.out.println(playerA.getRedCharacter().getCharacterName() +
                            " life points = " + playerA.getRedCharacter().getLifePoints());

                    System.out.println(playerB.getRedCharacter().getCharacterName() +
                            " life points = " + playerB.getRedCharacter().getLifePoints());

                }
                if (playerA.getRedCharacter().getLifePoints() > 0) {
                    System.out.println("PLAYER A WINS!");
                    playerA.levelUp();
                    System.out.println("PLAYER A LEVEL UP! NEW LEVEL = "
                            +playerA.getLevel());

                } else {
                    System.out.println("PLAYER B WINS!");
                    playerB.levelUp();
                    System.out.println("PLAYER B LEVEL UP! NEW LEVEL = "
                            +playerB.getLevel());
                }
                break;
            }
            System.out.println();
            if(playerA.getLevel()==3){
                done = true;
            }
            if(playerB.getLevel()==3){
                done = true;
            }
        }
    }
}