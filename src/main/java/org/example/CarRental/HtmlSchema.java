package org.example.CarRental;

import org.springframework.stereotype.Component;

public class HtmlSchema {
    public static String htmlSchema(){
        return "<html><head><h1 style='color: #5e9ca0;'>Wypożyczalnia samochodowa CarRental by Kamil Minkowski!</head></h1>" +
                "<body>" +
                "<body style=\"background-color: EEEEEE;\">" +
                "<p style='color: #5e9ca0;'>Wybierz interesującą Cię sprawę:</p>" +
                "<button type='button' onclick= \"window.location.href='http://127.0.0.1:8090/login'\">Zaloguj się</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/register'\">Zarejestruj się</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars'\">Wypożycz auto</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/allcars'\">Sprawdź ofertę</button>" +
                "<input type='search'><br><br>" +
                "<img class= 'test' src='https://as2.ftcdn.net/v2/jpg/03/89/37/69/1000_F_389376945_Pyv6xMkltpMM16gG5tumjYtVniFkz3pF.jpg' alt='...' />" +
                "</body>" +
                "</html>";
    }

    public static String rentCar(){
        return "<html><head><title>Wypożycz samochód</title></head>" +
                "<body>" +
                "<body style=\"background-color: white;\">" +
                "<h1><b>Wybierz jaki samochód chciałbyś wypożyczyć</b></h1>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars/bmw'\">BMW</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars/opel'\">Opel</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars/fiat'\">Fiat</button>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars/audi'\">Audi</button><br><br>" +
                "<button type='button' onclick=\"window.location.href='http://127.0.0.1:8090/rentcars/sortByPriceDesc'\">Sortuj od najdroższych</button>" +
                "</body>" +
                "</html>";
    }

    public static String layout(){
        return  "<html><h1 style='color: #5e9ca0;'>You can edit <span style='color: #2b2301;'>this demo</span> text!</h1>" +
                "<h2 style='color: #2e6c80;'>How to use the editor:</h2>" +
                "<p>Paste your documents in the visual editor on the left or your HTML code in the source editor in the right. <br />Edit any of the two areas and see the other changing in real time.&nbsp;</p>" +
                "<p>Click the <span style='background-color: #2b2301; color: #fff; display: inline-block; padding: 3px 10px; font-weight: bold; border-radius: 5px;'>Clean</span> button to clean your source code.</p>" +
                "</html>";
    }

    public static String login(){
        return  "<body>" +
                "<form>" +
                "<label for='username'>Nazwa użytkownika:</label><br>" +
                "<input type='text' id='username' name='username'><br>" +
                "<label for='password'>Hasło:</label><br>" +
                "<input type='password' id='password' name='password'><br><br>" +
                "<button type ='button'>Zaloguj</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    public static String register(){
        return "<body>" +
                "<form>" +
                "<label for='username'>Nazwa użytkownika:</label><br>" +
                "<input type='text' id='username' name='username'><br>" +
                "<label for='password'>Hasło:</label><br>" +
                "<input type='password' id='password' name='password'><br>" +
                "<label for='password'>Powtórz hasło:</label><br>" +
                "<input type='password' id='password' name='password'><br>" +
                "<label for='name'>Imię:</label><br>" +
                "<input type='text' id='name' name='name'><br>" +
                "<label for='surname'>Nazwisko:</label><br>" +
                "<input type='text' id='surname' name='surname'><br><br><br>" +
                "<input type='submit' value='Załóż konto'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
