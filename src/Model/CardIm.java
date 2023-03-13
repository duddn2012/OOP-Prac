package Model;

public class CardIm implements Card, Effect{

    int type;   //0 : 몬스터카드, 1 : 마법 카드
    int tribe;  //0 : 없음(마법카드), 1 : 드래곤, 2 : 마법사
    int atk;    //공격력
    int eff;

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
