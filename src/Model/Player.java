package Model;

import java.awt.*;

public interface Player{

    int pick(int cardNum);
    void damage(int dam);
    void draw(int cardCnt);

    void viewCardList();
}
