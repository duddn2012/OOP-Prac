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

    //선택한 카드의 공격력 반환
    @Override
    public int pick(int cardNum) {
        CardIm card = handList.get(cardNum);
        return card.atk;
    }

    @Override
    public void damage(int dam) {
        this.hp -=dam;
    }

    @Override
    public void draw(CardIm card) {

    }

    @Override
    public void viewCardList() {

    }
}
