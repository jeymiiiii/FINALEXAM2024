package GameRules;

import TypeOfCharacter.Blue;
import TypeOfCharacter.Green;
import TypeOfCharacter.Red;
import TypeOfCharacter.Yellow;

public abstract class Gameplay {

   public abstract int playerARandom();
   public abstract int playerBRandom();

    public Gameplay() {
    }

    //A Green vs B Green
    public void play(Green playerA, Green playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Green vs B Blue
    public void play(Green playerA, Blue playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Green vs B Yellow
    public void play(Green playerA, Yellow playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    // A Green vs B Red
    public void play(Green playerA, Red playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Blue vs B Green
    public void play(Blue playerA, Green playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Blue vs B Blue
    public void play(Blue playerA, Blue playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Blue vs B Yellow
    public void play(Blue playerA, Yellow playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Blue vs B Red
    public void play(Blue playerA, Red playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Yellow vs B Green
    public void play(Yellow playerA, Green playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Yellow vs B Blue
    public void play(Yellow playerA, Blue playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Yellow vs B Yellow
    public void play(Yellow playerA, Yellow playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Yellow vs B Red
    public void play(Yellow playerA, Red playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Red vs B Green
    public void play(Red playerA, Green playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Red vs B Blue
    public void play(Red playerA, Blue playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Red vs B Yellow
    public void play(Red playerA, Yellow playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

    //A Red vs B Red
    public void play(Red playerA, Red playerB) {
        if (playerARandom() > playerBRandom()) {
            //player A wins
            playerA.setWinner();
            playerB.setLoser();
        } else if (playerARandom() < playerBRandom()) {
            //player B wins
            playerA.setLoser();
            playerB.setWinner();
        } else {
            if (playerA.getLifePoints() >= playerB.getLifePoints()) {
                //player A wins
                playerA.setWinner();
                playerB.setLoser();
            } else {
                //player B wins
                playerA.setLoser();
                playerB.setWinner();
            }
        }
    }

}
