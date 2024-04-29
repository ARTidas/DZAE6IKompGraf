package hu.the.dzae6i;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;
import static org.lwjgl.glfw.GLFW.glfwSetKeyCallback;
import static org.lwjgl.glfw.GLFW.glfwSetWindowShouldClose;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.GL_BLUE;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_RED;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_UNSIGNED_BYTE;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glTexImage2D;
import static org.lwjgl.system.MemoryUtil.NULL;

public class SimpleGame {
    private long window;

    public void run() {
        init();
        loop();
        cleanup();
    }

    private void init() {
        // Initialize GLFW
        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        // Configure GLFW
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_TRUE);
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_FALSE);

        // Create the window
        window = GLFW.glfwCreateWindow(800, 600, "Simple LWJGL Game", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }
        
        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true); // We will detect this in the rendering loop
            }
        });

        // Center the window
        GLFWVidMode vidMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        GLFW.glfwSetWindowPos(window, (vidMode.width() - 800) / 2, (vidMode.height() - 600) / 2);

        // Make the OpenGL context current
        GLFW.glfwMakeContextCurrent(window);
        // Enable v-sync
        GLFW.glfwSwapInterval(1);

        // Make the window visible
        GLFW.glfwShowWindow(window);

        // Initialize OpenGL
        GL.createCapabilities();
    }

    ByteBuffer pixels = this.getByteBufferFromString();
    private void loop() {
        while (!GLFW.glfwWindowShouldClose(window)) {
            // Render
            GL11.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Poll for window events
            GLFW.glfwPollEvents();

            // Swap buffers
            GLFW.glfwSwapBuffers(window);
            
            ByteBuffer pixels = this.getByteBufferFromString();
            glEnable(GL_TEXTURE_2D);
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RED, 1000, 200, 5, GL_BLUE, GL_UNSIGNED_BYTE, pixels);
            glEnd();
        }
    }

    private void cleanup() {
        // Destroy the window
        GLFW.glfwDestroyWindow(window);

        // Terminate GLFW
        GLFW.glfwTerminate();
    }
    
    
    private ByteBuffer getByteBufferFromString(){
        String text = "ABCD";
        int s = 256; //Take whatever size suits you.
        BufferedImage b = new BufferedImage(s, s, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g = b.createGraphics();
        g.drawString(text, 0, 0);

        int co = b.getColorModel().getNumComponents();

        byte[] data = new byte[co * s * s];
        b.getRaster().getDataElements(0, 0, s, s, data);

        ByteBuffer pixels = BufferUtils.createByteBuffer(data.length);
        pixels.put(data);
        pixels.rewind();
        return pixels;
    }
    

    public static void main(String[] args) {
        new SimpleGame().run();
    }
}