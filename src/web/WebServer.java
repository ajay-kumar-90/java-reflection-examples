package web;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;

import static init.ServerConfiguration.getInstance;

public class WebServer {
    public void startServer() throws IOException {
        HttpServer httpServer = HttpServer.create(getInstance().getServerAddress(), 0);
        httpServer.createContext("/greeting").setHandler(exchange -> {
            String responseMessage = getInstance().getGreetingMessage();
            exchange.sendResponseHeaders(200, responseMessage.length());
            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(responseMessage.getBytes());
            responseBody.flush();
            responseBody.close();
        });
        System.out.printf("Starting server on address %s:%d%n", getInstance().getServerAddress()
                .getHostName(), getInstance().getServerAddress().getPort());
        httpServer.start();
    }
}
