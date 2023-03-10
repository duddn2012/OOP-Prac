package Model;

public class CardIm implements Card, Effect{

    int type;   //0 : 몬스터카드, 1 : 마법 카드
    int tribe;  //0 : 마법사, 1 : 드래곤
    int atk;    //공격력
    int eff;

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
