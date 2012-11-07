package ie.stephenking.t_gene.game;

import ie.stephenking.t_gene.engine.Screen;
import ie.stephenking.t_gene.engine.implemention.AndroidGame;


public class TGeneGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return  new Screen(); 
    }
}