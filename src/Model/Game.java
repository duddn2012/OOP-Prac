package Model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    int player1Hp;
    int player2Hp;
    int turn;
    //int endCondition;   //승리 조건 ex) hp 0, effect에 의한 승리, 카드 소진 등


    public Game(int player1Hp, int player2Hp, int turn) {
        this.player1Hp = player1Hp;
        this.player2Hp = player2Hp;
        this.turn = turn;

        List<CardIm> cardList = new ArrayList<CardIm>();

        PlayerIm player1 = new PlayerIm("player1", "p0001", player1Hp, cardList, 0);
        
    }

    public int duel(int turn){
        while(play(turn) <0){
            turn++;
        }

        return turn%2;  //1p가 선턴, 2p는 후턴
    }

    public int play(int turn){
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 턴입니다.");
        return 0;
    }
}
