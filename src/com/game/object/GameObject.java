package com.game.object;

import com.game.object.util.ObjectId;

import java.awt.*;

public abstract class GameObject
{
    private float x;
    private float y;
    private ObjectId id;
    private float velX, velY;
    private float width, height;
    private int scale;

    public GameObject(float x, float y, ObjectId id, float width, float height, int scale)
    {
        this.x = x * scale;
        this.y = y * scale;
        this.id = id;
        this.width = width * scale;
        this.height = height * scale;
        this.scale = scale;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

}
