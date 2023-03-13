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
        while(hp > 0){
            hp=play(tr);
            tr++;
        }

        System.out.println("승자는"+ tr%2+"입니다.");

        return tr%2 == 0? 2:1 ;  //1p가 선턴, 2p는 후턴
    }

    public int play(int turn){
        Scanner scanner = new Scanner(System.in);
        int atk;

        System.out.println(turn + "turn");
        System.out.println("당신의 턴입니다.");
        System.out.println("카드를 드로우 합니다.");
        //player1.draw(card);

        //핸드에 있는 카드의 순서를 입력 후, 해당 카드의 공격력 반환
        atk = p1.pick(scanner.nextInt());

        p2.damage(atk);

        return p2.hp;
    }
}
