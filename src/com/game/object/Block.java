package com.game.object;

import com.game.object.util.ObjectId;

import java.awt.*;

public class Block extends GameObject
{
    public Block(int x, int y, int width, int height, int scale)
    {
        super(x, y, ObjectId.Block, width, height, scale);
    }

    @Override
    public void tick()
    {

    }

    @Override
    public void render(Graphics g)
    {
        //temporary code
        g.setColor(Color.white);
        g.drawRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }

    @Override
    public Rectangle getBounds()
    {
        return new Rectangle((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }
}
