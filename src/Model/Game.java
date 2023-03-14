package Model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    int tr;
    PlayerIm p1;
    PlayerIm p2;

    public Game(PlayerIm player1, PlayerIm player2, int turn) {
        p1 = player1;
        p2 = player2;
        tr = turn;
    }

    public int duel(){
        int hp=100;
        int winning = 0;

        //게임 시작 시 양 플레이어 모두 5장씩 드로우
        for (int i=0; i<5;i++) {
            p1.draw(p1.deckList.size());
            p2.draw(p2.deckList.size());
        }

        while(hp > 0){
            play(tr);
            tr++;
            System.out.println("남은 체력 1p : "+p1.hp);
            System.out.println("남은 체력 2p : "+p2.hp);
            hp = Math.min(p1.hp, p2.hp);
            winning = (p1.hp>p2.hp?1:2);
        }

        System.out.println("승자는"+ winning+"입니다.");

        return 0;
    }

    public int play(int turn){
        Scanner scanner = new Scanner(System.in);
        int atk;

        System.out.println(turn + "turn 당신의 턴입니다");
        System.out.println("카드를 드로우 합니다.");
        p1.draw(p1.deckList.size());
        p1.viewCardList();

        System.out.println("공격을 수행할 카드를 선택하세요.");
        //핸드에 있는 카드의 순서를 입력 후, 해당 카드의 공격력 반환
        atk = p1.pick(scanner.nextInt());

        p2.damage(atk);

        return p2.hp;
    }
}
