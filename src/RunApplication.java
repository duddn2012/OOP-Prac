import Model.CardIm;
import Model.Game;
import Model.PlayerIm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunApplication {
    public static void main(String[] args){
        List<CardIm> cardList1 = new ArrayList<CardIm>();
        List<CardIm> cardList2 = new ArrayList<CardIm>();

        //사용자가 선택한 카드들.. 일단 직접 입력하여 테스트
        ArrayList<Integer> idxs = new ArrayList<Integer>(Arrays.asList(1,3,5,7,11,13,17,19,23));

        //플레이어 별 카드 리스트 조회 및 삽입
        for (int idx: idxs) {
            cardList1.add(CardIm.of(idx));
            cardList2.add(CardIm.of(idx));
        }

        //플레이어 생성
        PlayerIm player1 = new PlayerIm("player1", "p0001", 100, cardList1, 0);
        PlayerIm player2 = new PlayerIm("player2", "p0002", 100, cardList2, 0);

        Game game = new Game(player1, player2, 1);
        game.duel();
    }
}
