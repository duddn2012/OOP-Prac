package Model;

//카드의 효과 클래스
public interface Effect {
    void damage(int atk);
    void heal(int val);
    void draw(Card card);
}
