package io.github.startforkiller.jminecraft.engine;

public interface IGameLogic {

    void init(Window window) throws Exception;
    void input(Window window, MouseInput mouseInput);
    void update(float delta, MouseInput mouseInput);
    void render(Window window);
    void cleanup();

}
