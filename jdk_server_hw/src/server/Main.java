package com.javacurse.ce.JavaDevKitSeminar1.jdk_server_hw.src.server;


import com.javacurse.ce.JavaDevKitSeminar1.jdk_server_hw.src.server.client.ui.ClientGUI;
import com.javacurse.ce.JavaDevKitSeminar1.jdk_server_hw.src.server.server.ui.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
