package com.sampler.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sampler.core.ApplicationListenerSample;

public class DesktopLauncherApplicationListener {

    public static void main(String[] argv) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "ApplicationListenerSample";
        config.useGL30 = false;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new ApplicationListenerSample(), config);
    }
}
