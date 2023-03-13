package Model;

import java.awt.*;

public interface Player{

    int pick(int cardNum);
    void damage(int dam);
    void draw(CardIm card);

    void viewCardList();
}
