package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Background {
    private Texture tx;
    private Vector2 pos;

    public Background() {
        tx = new Texture("back.png");
        pos = new Vector2(0, 0)
    }
}
