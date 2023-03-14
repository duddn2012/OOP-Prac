package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CardIm implements Card, Effect{
    private static final int MIN_CARD_NUMBER = 1;
    private static final int MAX_CARD_NUMBER = 50;

    private static List<CardIm> cardCache = new ArrayList<CardIm>();

    static{
        IntStream.range(MIN_CARD_NUMBER, MAX_CARD_NUMBER)
                .forEach(i -> cardCache.add(new CardIm(1,1,(int)(Math.random() * 100)+1,10)));
    }

    int type;   //0 : 몬스터카드, 1 : 마법 카드
    int tribe;  //0 : 없음(마법카드), 1 : 드래곤, 2 : 마법사
    int atk;    //공격력
    int eff;

    public static CardIm of(int idx){
        return cardCache.get(idx);
    }

    public CardIm(int type, int tribe, int atk, int eff) {
        this.type = type;
        this.tribe = tribe;
        this.atk = atk;
        this.eff = eff;
    }

    @Override
    public void attack() {

    }

    @Override
    public void damage(int atk) {

    }

    @Override
    public void heal(int val) {

    }

    @Override
    public void draw(Card card) {

    }
}
