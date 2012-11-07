package ie.stephenking.t_gene.engine;

import ie.stephenking.t_gene.engine.Graphics.PixmapFormat;


public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
