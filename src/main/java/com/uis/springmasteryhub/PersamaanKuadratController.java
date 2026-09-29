package com.uis.springmasteryhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersamaanKuadratController {

    @GetMapping("/kuadrat")
    public String hitungPersamaanKuadrat(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestParam(required = false) Double c) {

        String hasilHtml = "";

        // Jika tombol hitung ditekan dan nilai a, b, c sudah diisi
        if (a != null && b != null && c != null) {
            if (a == 0) {
                hasilHtml = "<div class='box error'>Nilai A tidak boleh 0 karena ini bukan persamaan kuadrat!</div>";
            } else {
                double diskriminan = (b * b) - (4 * a * c);
                String akar;

                if (diskriminan > 0) {
                    double x1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
                    double x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
                    akar = "Akar real dan berbeda:<br><strong>x1 = " + x1 + "</strong><br><strong>x2 = " + x2 + "</strong>";
                } else if (diskriminan == 0) {
                    double x = -b / (2 * a);
                    akar = "Akar kembar:<br><strong>x1 = x2 = " + x + "</strong>";
                } else {
                    akar = "Akar imajiner (diskriminan bernilai negatif: " + diskriminan + ")";
                }

                hasilHtml = "<div class='box'>" +
                        "Persamaan: <strong>" + a + "x&sup2; + (" + b + "x) + " + c + " = 0</strong><br>" +
                        "Diskriminan (D): " + diskriminan + "<br><br>" +
                        akar +
                        "</div>";
            }
        }

        return "<!DOCTYPE html>" +
                "<html lang='id'>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<title>Kalkulator Persamaan Kuadrat</title>" +
                "<style>" +
                "body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif; background: #fdfdfd; color: #2d3748; max-width: 600px; margin: 60px auto; padding: 0 20px; line-height: 1.6; }" +
                ".card { background: #ffffff; border: 1px solid #e2e8f0; border-radius: 8px; padding: 30px; box-shadow: 0 2px 4px rgba(0,0,0,0.02); }" +
                "h2 { font-size: 18px; font-weight: 600; color: #1a202c; margin-top: 0; margin-bottom: 16px; }" +
                ".form-group { margin-bottom: 14px; }" +
                "label { display: block; font-size: 13px; font-weight: 500; color: #4a5568; margin-bottom: 4px; }" +
                "input { width: 100%%; padding: 8px 12px; border: 1px solid #cbd5e0; border-radius: 6px; font-size: 14px; box-sizing: border-box; }" +
                ".box { background: #f7fafc; border-left: 4px solid #3182ce; padding: 14px 16px; margin: 20px 0; font-size: 14px; border-radius: 0 6px 6px 0; }" +
                ".error { border-left-color: #e53e3e; color: #c53030; }" +
                ".btn { background: #2b6cb0; color: white; border: none; padding: 9px 18px; border-radius: 6px; font-size: 14px; font-weight: 500; cursor: pointer; }" +
                ".btn:hover { background: #2c5282; }" +
                ".back { display: inline-block; margin-top: 16px; color: #3182ce; text-decoration: none; font-size: 13px; font-weight: 500; }" +
                ".back:hover { text-decoration: underline; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='card'>" +
                "<h2>Kalkulator Persamaan Kuadrat</h2>" +
                "<p style='font-size: 13px; color: #718096; margin-bottom: 20px;'>Masukkan nilai koefisien a, b, dan c di bawah ini:</p>" +

                "<form action='/kuadrat' method='GET'>" +
                "<div class='form-group'><label>Nilai a:</label><input type='number' step='any' name='a' required value='" + (a != null ? a : "") + "'></div>" +
                "<div class='form-group'><label>Nilai b:</label><input type='number' step='any' name='b' required value='" + (b != null ? b : "") + "'></div>" +
                "<div class='form-group'><label>Nilai c:</label><input type='number' step='any' name='c' required value='" + (c != null ? c : "") + "'></div>" +
                "<button type='submit' class='btn'>Hitung Persamaan</button>" +
                "</form>" +

                hasilHtml +

                "<br><a class='back' href='/'>&larr; Kembali ke Beranda</a>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}