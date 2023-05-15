package io.github.javezki.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

/**
 * Use this class to get instance of Screen, then extend this so you don't need to implement all methods.
 * Over and over again
 */
public abstract class BadPokemonScreen implements Screen {
     
    Game game;

    public BadPokemonScreen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
    
}
