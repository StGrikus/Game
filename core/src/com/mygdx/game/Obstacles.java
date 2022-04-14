package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Obstacles {
    class WallPair {
        Vector2 position;
        float speed;

        public WallPair(Vector2 pos) {
            position = pos;
            speed = 2;
        }

        public void update() {
            position.x -= speed;
        }
    }

    WallPair[] obs;
    Texture txt;
    int betweenDistance;

    public Obstacles() {
        txt = new Texture("wall.png");
        obs = new WallPair[4];
        betweenDistance = 400;
        int startPocitionX = 500;
        for (int i = 0; i < obs.length; i++) {
            obs[i] = new WallPair(new Vector2(startPocitionX,0));
            startPocitionX += 300;
        }
    }

    public void render(SpriteBatch batch) {
        for (int i = 0; i < obs.length; i++) {
            batch.draw(txt, obs[i].position.x, obs[i].position.y);
        }
    }

    public void update
}
