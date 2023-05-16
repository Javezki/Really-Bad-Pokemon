package io.github.javezki.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * The main menu screen for the game with whatever functionality
 */
public class MainMenu extends BadPokemonScreen {

    private TextureRegion title;
    private SpriteBatch batch;
    private float time;

    public MainMenu(Game game) {
        super(game);
    }

    @Override
    public void show() {
        title = new TextureRegion(new Texture(Gdx.files.internal("assets/Welcome.png")), 0, 100, 800, 600);
        batch = new SpriteBatch();
        batch.getProjectionMatrix().setToOrtho2D(title.getRegionX(), title.getRegionY(), title.getRegionWidth(),
                title.getRegionHeight());
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(title, title.getRegionX(), title.getRegionY());
        batch.end();

        time += delta;
        if (time > 1)
            if (Gdx.input.isKeyPressed(Keys.ANY_KEY) || Gdx.input.justTouched()) {
                System.out.println("hi");
            }
    }

}
