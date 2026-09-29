package com.uis.springmasteryhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JohnTravoltaController {

    @GetMapping("/john-travolta")
    public String getJohnTravoltaInfo(@RequestParam(value = "name", defaultValue = "John Travolta") String name) {
        return "<!DOCTYPE html>" +
                "<html lang='id'>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<title>Program John Travolta</title>" +
                "<style>" +
                "body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif; background: #fdfdfd; color: #2d3748; max-width: 600px; margin: 80px auto; padding: 0 20px; line-height: 1.6; }" +
                ".card { background: #ffffff; border: 1px solid #e2e8f0; border-radius: 8px; padding: 30px; box-shadow: 0 2px 4px rgba(0,0,0,0.02); }" +
                "h2 { font-size: 18px; font-weight: 600; color: #1a202c; margin-top: 0; margin-bottom: 16px; }" +
                "p { font-size: 14px; color: #4a5568; margin-bottom: 24px; }" +
                ".btn { display: inline-block; background: #2b6cb0; color: white; padding: 8px 16px; border-radius: 6px; text-decoration: none; font-size: 13px; font-weight: 500; }" +
                ".btn:hover { background: #2c5282; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='card'>" +
                "<h2>Topik: " + name + "</h2>" +
                "<p>Halo! Ini adalah program Spring Boot untuk topik <strong>" + name + "</strong>. Aktor legendaris penari disko di film <em>Saturday Night Fever</em>!</p>" +
                "<a class='btn' href='/'>&larr; Kembali ke Beranda</a>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}