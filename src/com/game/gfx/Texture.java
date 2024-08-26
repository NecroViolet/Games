package com.game.gfx;

import java.awt.image.BufferedImage;

public class Texture
{
    private final String PARENT_FOLDER = "/tile";

    private final int MARIO_L_COUNT = 21;
    private final int MARIO_S_COUNT = 14;

    private final int TILE_1_COUNT = 28;
    private final int TILE_2_COUNT =33;

    private BufferedImageLoader loader;
    private BufferedImage player_sheet, enemy_sheet, npc_sheet, block_sheet, tile_sheet, game_over_sheet, into_sheet;
    public BufferedImage[] mario_l, mario_s, tile_1, tile_2, tile_3, tile_4, pipe_1;

    public Texture()
    {
        mario_l = new BufferedImage[MARIO_L_COUNT];
        mario_s = new BufferedImage[MARIO_S_COUNT];
        tile_1 = new BufferedImage[TILE_1_COUNT+TILE_2_COUNT];
        tile_2 = new BufferedImage[TILE_1_COUNT+TILE_2_COUNT];
        tile_3 = new BufferedImage[TILE_1_COUNT+TILE_2_COUNT];
        tile_4 = new BufferedImage[TILE_1_COUNT+TILE_2_COUNT];
        pipe_1 = new BufferedImage[4];

        loader = new BufferedImageLoader();

        try
        {
            player_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Mario & Luigi.png");
            enemy_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Enemies & Bosses.png");
            npc_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Items Objects and NPCs.png");
            block_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Item and Brick Blocks.png");
            tile_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Tileset.png");
            game_over_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Time Up Game Over Screens.png");
            into_sheet = loader.loadImage(PARENT_FOLDER + "/NES - Super Mario Bros - Title Screen.png");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        getPlayerTextures();
        getTileTextures();
        getPipeTextures();

    }

    private void getPlayerTextures()
    {
        int x_off = 80;
        int y_off = 1;
        int width = 16;
        int height = 32;

        for(int i = 0; i < MARIO_L_COUNT; i++)
        {
            mario_l[i] = player_sheet.getSubimage(x_off + i*(width+1), y_off, width, height);
        }

        y_off += height+1;
        height = 16;

        for (int i = 0; i < MARIO_S_COUNT; i++)
        {
            mario_s[1] = player_sheet.getSubimage(x_off + i*(width+1), y_off, width, height);
        }
    }

    private void getTileTextures()
    {
        int x_off = 0;
        int y_off = 0;
        int width = 16;
        int height = 16;

        for (int j = 0; j < 4; j++ )
        {
            for (int i = 0; i < TILE_1_COUNT; i++)
            {
                if (j == 0)
                {
                    tile_1[i] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
                else if (j == 1)
                {
                    tile_2[i] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
                else if (j == 2)
                {
                    tile_3[i] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                } else if (j == 3)
                {
                    tile_4[i] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
            }

            y_off += height;

            for (int i = 0; i < TILE_2_COUNT; i++)
            {
                if (j == 0)
                {
                    tile_1[i + TILE_1_COUNT] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
                else if (j == 1)
                {
                    tile_2[i + TILE_1_COUNT] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
                else if (j == 2)
                {
                    tile_3[i + TILE_1_COUNT] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                } else if (j == 3)
                {
                    tile_4[i + TILE_1_COUNT] = tile_sheet.getSubimage(x_off + i*width, y_off + j*height*2, width, height);
                }
            }
        }
    }

    private void getPipeTextures()
    {
        int x_off = 0;
        int y_off = 16*8;
        int width = 32;
        int height = 16;

        pipe_1[0] = tile_sheet.getSubimage(x_off, y_off, width, height);
        pipe_1[1] = tile_sheet.getSubimage(x_off, y_off + height, width, height);
        pipe_1[2] = tile_sheet.getSubimage(x_off + width, y_off, width, height);
        pipe_1[3] = tile_sheet.getSubimage(x_off + width, y_off + height, width, height);

    }

    public BufferedImage[] getMarioL()
    {
        return mario_l;
    }

    public BufferedImage[] getMarioS()
    {
        return mario_s;
    }

    public BufferedImage[] getTile1()
    {
        return tile_1;
    }

    public BufferedImage[] getTile2()
    {
        return tile_2;
    }

    public BufferedImage[] getTile3()
    {
        return tile_3;
    }

    public BufferedImage[] getTile4()
    {
        return tile_4;
    }

    public BufferedImage[] getPipe1()
    {
        return pipe_1;
    }

}
