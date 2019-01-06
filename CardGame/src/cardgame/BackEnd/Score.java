/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.BackEnd;

/**
 *
 * @author GamingPC
 */
public class Score {
    
    private int player;
    private int score;
    
    public Score(int player, int score){
        this.player = player;
        this.score = score;
    }
    
    public int getPlayer(){
        return player;
    }
    
    public int getScore(){
        return score;
    }
    
}
