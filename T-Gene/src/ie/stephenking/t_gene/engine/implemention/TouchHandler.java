package ie.stephenking.t_gene.engine.implemention;

import ie.stephenking.t_gene.engine.Input.TouchEvent;

import java.util.List;

import android.view.View.OnTouchListener;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);
    
    public int getTouchX(int pointer);
    
    public int getTouchY(int pointer);
    
    public List<TouchEvent> getTouchEvents();
}
