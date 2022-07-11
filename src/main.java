import model.Book;
import model.FictionBook;
import model.ProgrammingBook;

public class main {
    public static void main(String[] args) {
    Book books[] = new Book[10];

    books[0] = new ProgrammingBook("xyz0", "Nụ hôn đầu", 23, "TG0", "Java", "all");
    books[1] = new ProgrammingBook("xyz1", "Bóng ma bên cửa sổ", 27, "TG1", "Mẹ đẻ", "all");
    books[2] = new ProgrammingBook("xyz2", "Hồn về từ đáy mộ", 21, "TG2", "Java", "all");
    books[3] = new ProgrammingBook("xyz3", "Bóng ai thấp thoáng bên đình", 29, "TG3", "Nhật", "all");
    books[4] = new ProgrammingBook("xyz4", "Hồn ma báo mộng", 20, "TG4", "Java", "all");
    books[5] = new FictionBook("xyz5", "Ma đói", 22, "TG5", "Kinh dị");
    books[6] = new FictionBook("xyz6", "Oan hồn cô dâu", 28, "TG6", "Kinh dị");
    books[7] = new FictionBook("xyz7", "Cưới vợ ma", 24, "TG7", "Viễn tưởng 1");
    books[8] = new FictionBook("xyz8", "Bách quỷ bộ hành", 26, "TG8", "Kinh dị");
    books[9] = new FictionBook("xyz9", "Ma da làng chài", 30, "TG9", "Kinh dị");

//    Tính tổng
    int sum = getSumTotalPrice(books);
        System.out.println(sum);

//        đếm số sách ProgrammingBook có language là "Java".
    int count = countBylanguage(books, "Java");
        System.out.println(count);

//        Đếm số sách Fiction có category là “Viễn tưởng 1”.
    int count1 = countbyCategory(books, "Viễn tưởng 1");
        System.out.println(count1);

//        Đếm số sách Fiction có giá <100.
    int count2 = countMoney(books);
        System.out.println(count2);

    }

//    Phương thức tính tổng
    public static int getSumTotalPrice (Book book[]) {
    int sum = 0;
        for (int i = 0; i < book.length; i++) {
            sum+=book[i].getPrice();
        }
        return sum;
    }
//    Phương thức đếm sách ProgrammingBook có language là "Java".
    public static int countBylanguage(Book book[], String language) {
        int count=0;
        for (int i = 0; i < book.length; i++) {
//            ép kiểu Book sang kiểu ProgrammingBook
            if (book[i] instanceof ProgrammingBook) {
                String languege1 = ((ProgrammingBook)book[i]).getLanguage();
//                equals là bằng
                if (languege1.equals(language)) {
                    count++;
                }
            }
        } return count;
    }
//    phương thứ đếm số sách Fiction có category là “Viễn tưởng 1”.
    public static int countbyCategory(Book  book[], String category) {
        int count1 = 0;
        for (int i = 0; i < book.length; i++) {
//            ép kiểu Book sang kiểu FictonBook
            if (book[i] instanceof FictionBook) {
                String category1 = ((FictionBook)book[i]).getCategory();
                if (category1.equals(category)) {
                    count1++;
                }
            }
        } return count1;
    }
//    phương thức Đếm số sách Fiction có giá <100.
    private static int countMoney(Book book[]) {
        int count2 = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i].getPrice() < 100) {
                count2++;
            }
        } return count2;
    }
}
