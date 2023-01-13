import java.util.HashMap;
import java.util.Map;

public class Holydays {
    Map<String, String> holydays = new HashMap<String, String>();

    Holydays(){
        holydays.put("01/01/2023", "Confraternização mundial");
        holydays.put("21/02/2023", "Carnaval");
        holydays.put("17/04/2023", "Páscoa");
        holydays.put("21/04/2023", "Tiradentes");
        holydays.put("01/05/2023", "Dia do trabalho");
        holydays.put("08/06/2023", "Corpus Christi");
        holydays.put("07/09/2023", "Independência do Brasil");
        holydays.put("12/10/2023", "Nossa Senhora Aparecida");
        holydays.put("02/11/2023", "Finados");
        holydays.put("15/11/2023", "Proclamação da República");
        holydays.put("25/12/2023", "Natal");
    }
    
    String isHolyday(String date){
       String isAHolyday =  (String)holydays.get(date);
       if(isAHolyday==null){
           return "Não é um feriado";
       }else{
        return isAHolyday;
       } 
    }

    void listHolydays(){
        holydays.forEach((k, v)-> System.out.println(k + v));
    }
}
