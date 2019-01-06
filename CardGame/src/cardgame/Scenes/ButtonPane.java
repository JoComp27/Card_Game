/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.Scenes;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author GamingPC
 */
public class ButtonPane extends BorderPane{
    
    GridPane gridPane = new GridPane();
    
    public ButtonPane(int playerNb){
        if(playerNb < 2){
            onePlayerButtons();
        }
        else if(playerNb % 2 == 0){
            twoPlayerButtons();
        }
        else if(playerNb % 2 == 1){
            threePlayerButtons();
        }
        
        HBox hbox = new HBox();
        Button undoBtn = new Button();
        hbox.getChildren().add(undoBtn);
        
        setCenter(gridPane);
        setBottom(hbox);
        
    }
    
    private void onePlayerButtons(){
        Button[] buttons = new Button[29];
        int temp = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                temp++;
                if(temp == 19 || temp == 25 || temp == 26 || temp == 27){
                    continue;
                }
                else{
                        
                        }
                
            }
        }
        gridPane.add(this, 0, 0);
    }
    
    private void twoPlayerButtons(){
        
    }
    
    private void threePlayerButtons(){
        
    }
    
}
