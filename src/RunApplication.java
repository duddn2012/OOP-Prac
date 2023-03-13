import Model.CardIm;
import Model.Game;
import Model.PlayerIm;

import java.util.ArrayList;
import java.util.List;

public class RunApplication {
    public static void main(String[] args){
        List<CardIm> cardList1 = new ArrayList<CardIm>();
        List<CardIm> cardList2 = new ArrayList<CardIm>();

        //플레이어 별 카드 리스트 조회
        CardIm card1 = new CardIm(1, 0, 25, 10);
        CardIm card2 = new CardIm(1,0,10, 10);
        cardList1.add(card1);
        cardList2.add(card2);

        //플레이어 생성
        PlayerIm player1 = new PlayerIm("player1", "p0001", 100, cardList1, 0);
        PlayerIm player2 = new PlayerIm("player2", "p0002", 100, cardList2, 0);

        Game game = new Game(player1, player2, 1);
        game.duel();
    }
}
