//package org.example.CarRental;
//
//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.time.OffsetDateTime;
//
//import static org.example.CarRental.HtmlSchema.htmlSchema;
//
//public class BasicHttpHandler implements HttpHandler {
//    @Override
//    public void handle(HttpExchange exchange) throws IOException {
//        // Pobierz metodę żądania (GET, POST, itp.)
//        String requestMethod = exchange.getRequestMethod();
//
//        // Pobierz ścieżkę żądania
//        String requestPath = exchange.getRequestURI().getPath();
//
//        // Pobierz ciało żądania (jeśli istnieje)
//        InputStream requestBody = exchange.getRequestBody();
//
//        // Ustaw nagłówki odpowiedzi
//        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
//
//        // Uzyskaj obiekt OutputStream do wysłania odpowiedzi
//        OutputStream responseBody = exchange.getResponseBody();
//
//        // Wyślij odpowiedź
//        String response = htmlSchema();
//        exchange.sendResponseHeaders(200, response.getBytes().length);
//        responseBody.write(response.getBytes());
//
//        // Zamknij strumień odpowiedzi
//        responseBody.close();
//    }
//}
