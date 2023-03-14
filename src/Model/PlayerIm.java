package Model;

import java.util.ArrayList;
import java.util.List;

public class PlayerIm implements Player{
    String usernm;
    String usercd;
    int hp;
    List<CardIm> deckList;
    List<CardIm> handList;
    int cost;

    public PlayerIm(String usernm, String usercd, int hp, List<CardIm> deckList, int cost) {
        this.usernm = usernm;
        this.usercd = usercd;
        this.hp = hp;
        this.deckList = deckList;
        this.handList = new ArrayList<>();
        this.cost = cost;
    }

    //선택한 카드의 공격력 반환
    @Override
    public int pick(int cardNum) {
        int atk = handList.remove(cardNum-1).atk;//idx = cardNum -1
        return atk;
    }

    @Override
    public void damage(int dam) {
        this.hp -=dam;
    }

    @Override
    public void draw(int cardCnt) {
       CardIm card =  this.deckList.remove(cardCnt-1);   //index = cnt -1
       this.handList.add(card);
    }

    @Override
    public void viewCardList() {
        CardIm card;
        for (int i=1; i<=handList.size();i++) {
            card = handList.get(i-1);
            System.out.println(i+"번 카드");
            System.out.println("Atk : " +card.atk);
            System.out.println("Eff : " +card.eff);
            //System.out.println("tribe : " +card.tribe);
            //System.out.println("Type : " +card.type);
        }
    }
}
