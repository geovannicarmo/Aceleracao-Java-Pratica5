public class App {
    public static void main(String[] args) throws Exception {
        
        Holydays holydays = new Holydays();
        
        
        System.out.println(holydays.isHolyday("25/12/2023"));
        holydays.listHolydays();

    }
}
