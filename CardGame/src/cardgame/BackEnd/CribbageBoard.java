/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.BackEnd;

import java.util.ArrayList;

/**
 *
 * @author GamingPC
 */
public class CribbageBoard {
    
    final int MAXSCORE = 121;
    int players;
    int[] scores;
    ArrayList<Score> ScoreHistory;
    
    boolean gameIsFinished;
    
    public CribbageBoard(int players){
        gameIsFinished = false;
        
        if(players > 0 && players < 4){
        scores = new int[players];    
        }
        else{
            scores = new int[2+(players%2)];
        }
        
    }
    
    public void addScore(int player, int points){
        ScoreHistory.add(new Score(player, points));
        scores[player-1] += points;
    }
    
    public void undo(){
        if(!ScoreHistory.isEmpty()){
            
            int lastIndex = ScoreHistory.size()-1;
            
            Score temp = ScoreHistory.get(lastIndex);
            
            int tempPlayer = temp.getPlayer();
            int tempScore = temp.getScore();
        
            scores[tempPlayer-1] -= tempScore;
            ScoreHistory.remove(lastIndex);
        }
        else{
            System.out.println("Cannot Undo, no scores made");
        }
        
    }
    
    public void checkCompletion(){
        for(int i = 0; i < players; i++){
            if(scores[i] > MAXSCORE){
                gameIsFinished = true;
                System.out.println("Player " + (i+1) + " has won!!!");
            }
        }
    }
    
}
