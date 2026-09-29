package com.uis.springmasteryhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<!DOCTYPE html>" +
                "<html lang='id'>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<title>Spring Mastery Hub</title>" +
                "<style>" +
                "body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif; background: #ffffff; color: #2d3748; max-width: 680px; margin: 60px auto; padding: 0 20px; line-height: 1.6; }" +
                "h1 { font-size: 20px; font-weight: 600; color: #1a202c; border-bottom: 1px solid #e2e8f0; padding-bottom: 12px; margin-bottom: 6px; }" +
                ".subtitle { color: #718096; font-size: 13px; margin-bottom: 40px; text-transform: uppercase; letter-spacing: 0.05em; }" +
                "h2 { font-size: 15px; font-weight: 600; color: #2d3748; margin-top: 32px; margin-bottom: 8px; }" +
                "p { margin: 4px 0 12px 0; font-size: 14px; color: #4a5568; }" +
                "ul { margin: 4px 0 16px 0; padding-left: 20px; font-size: 14px; color: #4a5568; }" +
                "li { margin-bottom: 6px; }" +
                "a { color: #3182ce; text-decoration: none; font-weight: 500; }" +
                "a:hover { text-decoration: underline; }" +
                ".divider { border: 0; border-top: 1px solid #edf2f7; margin: 24px 0; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>Spring Mastery Hub</h1>" +
                "<div class='subtitle'>UTS Mandiri &bull; Pemrograman Berbasis Framework</div>" +

                "<h2>1. Analisis 5W Spring Framework</h2>" +
                "<ul>" +
                "<li><strong>What:</strong> Framework berbasis Java untuk pengembangan aplikasi backend & web.</li>" +
                "<li><strong>Why:</strong> Menyederhanakan struktur kode dan mendukung <em>Dependency Injection</em>.</li>" +
                "<li><strong>When:</strong> Digunakan untuk membangun REST API dan sistem berskala besar.</li>" +
                "<li><strong>Who:</strong> Diciptakan oleh Rod Johnson, kini dikelola oleh VMware.</li>" +
                "</ul>" +

                "<hr class='divider'>" +

                "<h2>2. Program John Travolta</h2>" +
                "<p>Uji endpoint layanan web Spring:</p>" +
                "<p><a href='/john-travolta' target='_blank'>&rarr; /john-travolta</a></p>" +

                "<hr class='divider'>" +

                "<h2>3. Program Persamaan Kuadrat</h2>" +
                "<p>Uji perhitungan diskriminan dan akar kuadrat otomatis:</p>" +
                "<p><a href='/kuadrat?a=1&b=-3&c=2' target='_blank'>&rarr; /kuadrat?a=1&b=-3&c=2 (Contoh Data)</a></p>" +

                "</body>" +
                "</html>";
    }
}