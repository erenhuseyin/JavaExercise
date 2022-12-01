import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public static void main(String[] args) {
        PhoneBookCrawler p = new PhoneBookCrawler(new PhoneBook());
        System.out.println(p.findPhoneNumberByNameOrNameByPhoneNumber("Jos de Vos", "016/161616"));
    }


    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
                .orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        StringBuilder result = new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(result::append, //java11, result yoksa lamba func çalışacak
                () -> System.out.println(phoneBook.getPhoneBookEntries()));
        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        String result = "";
        Optional<String> phoneNumberOptional = phoneBook.findNameByPhoneNumber(name);
        Optional<String> nameOptional = phoneBook.findPhoneNumberByName(name);
        if(phoneNumberOptional.isPresent()){
            return phoneNumberOptional.get();
        } else if(nameOptional.isPresent()){
            return nameOptional.get();
        }
        //return new ArrayList<>(phoneBook.getPhoneBookEntries().values()).get(0);

        return phoneBook.findPhoneNumberByName(name)
                .orElse(phoneBook.findNameByPhoneNumber(phoneNumber)
                        .orElse(phoneBook.findPhoneNumberByName("Jos de Vos")
                                .orElse(null)
                        )
                );
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}