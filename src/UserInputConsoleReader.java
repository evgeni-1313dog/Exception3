import java.util.Scanner;


public class UserInputConsoleReader implements UserInputReader {
    private Scanner scanner;

    public UserInputConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public UserData readUserData() throws UserDataException {
        while (true) {
            System.out.println("Введите данные в следующем порядке, разделяя их пробелом: Фамилия Имя Отчество Номер телефона)");

            try {
                String input = scanner.nextLine();
                String[] data = input.split(" ");

                if (data.length != 4) {
                    throw new UserDataException("Введено неверное количество данных ");
                }

                int phoneNumber = (int) parsePhoneNumber(data[8]);

                return new UserData(data[0], data[1], data[2], phoneNumber);
            } catch (ParseException | NumberFormatException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }



    private long parsePhoneNumber(String phoneNumberString) throws ParseException {
        try {
            return Long.parseLong(phoneNumberString);
        } catch (NumberFormatException e) {
            throw new ParseException("Неверный формат номера телефона");
        }
    }


}