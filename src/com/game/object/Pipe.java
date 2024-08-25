package com.game.object;

import com.game.object.util.ObjectId;

import java.awt.*;

public class Pipe extends GameObject
{
    private boolean enterable;

    public Pipe(int x, int y, int width, int height, int scale, boolean enterable)
    {
        super(x, y, ObjectId.Pipe, width, height, scale);
        this.enterable = enterable;
    }

    @Override
    public void tick()
    {

    }

    @Override
    public void render(Graphics g)
    {

    }

    @Override
    public Rectangle getBounds()
    {
        return new Rectangle((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }
}
