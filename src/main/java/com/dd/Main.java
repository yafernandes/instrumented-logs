package com.dd;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(Log4jServlet.class, "/log4j");
        handler.addServletWithMapping(Log4j2Servlet.class, "/log4j2");
        handler.addServletWithMapping(Slf4jServlet.class, "/slf4j");
        server.start();
        server.join();
    }
}
