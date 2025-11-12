package Lab_5;

import java.util.regex.Pattern;
//Task_4
public class IpCheck {
    public static void main(String[] args){
        System.out.println(ipCheck("192.168.0.1"));
        System.out.println(ipCheck("10.0.0.1"));
        System.out.println(ipCheck("256.0.0.1"));
        System.out.println(ipCheck("192.168.0"));
        System.out.println(ipCheck("abc.def.ghi.jkl"));
        System.out.println(ipCheck("10.500.1.1"));
    }

    public static String ipCheck(String ipAddress){
        Pattern pattern = Pattern.compile("^(((25[0-5]|2[0-4]\\d{1}|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d{1}|1\\d{2}|[1-9]?\\d))$");
        try {
            if (pattern.matcher(ipAddress).matches()) {
                return("IP-адрес "+ ipAddress+ " корректен.");
            } else {
                return ("IP-адрес " + ipAddress +" некорректен.");
            }
        } catch (Exception e) {
            return("Произошла ошибка при проверке IP-адреса: " + e.getMessage());
        }
    }
}
