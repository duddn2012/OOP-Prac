package Model;

import java.util.List;

public class PlayerIm implements Player{
    String usernm;
    String usercd;
    int hp;
    List<CardIm> handList;
    int cost;

    public PlayerIm(String usernm, String usercd, int hp, List<CardIm> handList, int cost) {
        this.usernm = usernm;
        this.usercd = usercd;
        this.hp = hp;
        this.handList = handList;
        this.cost = cost;
    }

    @Override
    public void play() {

    }

    @Override
    public void damage(int dam) {

    }

    @Override
    public void draw(CardIm card) {

    }
}
