package com.dd;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(Log4jServlet.class, "/instrumented-logs/log4j");
        handler.addServletWithMapping(Log4j2Servlet.class, "/instrumented-logs/log4j2");
        handler.addServletWithMapping(Slf4jServlet.class, "/instrumented-logs/slf4j");
        server.start();
        server.join();
    }
}
