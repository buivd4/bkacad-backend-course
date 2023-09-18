public class Lec08Prac01 {
    static class Contact{
        String name;
        String phoneNum;
        String email;

        Contact(String name, String phoneNum, String email){
            this.name=name;
            this.phoneNum=phoneNum;
            this.email=email;
        }

        public void display(){
            System.out.printf("------ Name: %s ------\n", this.name);
            System.out.printf("-- Phone number: %s\n", this.phoneNum);
            System.out.printf("-- Email: %s\n",this.email);
        }
    }

    // Để add một item vào array, có thể sử dụng ArrayUtils lib
    static class AddressBook{
        Contact records[];
        int maxNoOfRecord;
        int currentNoOfRecord;

        AddressBook(int maxNoOfRecord){
            this.maxNoOfRecord=maxNoOfRecord;
            this.records = new Contact[maxNoOfRecord];
            this.currentNoOfRecord = 0;
        }

        public void addContact(Contact contact){
            if (!(this.maxNoOfRecord>currentNoOfRecord)){
                // Throw a Exception class
                return;
            }
            else{
                this.records[this.currentNoOfRecord]=contact;
                this.currentNoOfRecord++;
            }
        }
        // [ O O O O X X X ]
        // [ O X O O X X X ] <- Xoá
        // [ O O O O X X X ] <- Dịch vào
        public void removeContact(String name){
            int recordIndex = searchContact(name);
            if (recordIndex==-1){
                return;
            }
            for (int i=recordIndex; i<this.currentNoOfRecord-1; i++){
                this.records[i]=this.records[i+1];
            }
            // Giảm số lượng records đi 1 đơn vị
            this.currentNoOfRecord--;
        }

        public int searchContact(String name){
            for (int i=0;i<this.currentNoOfRecord;i++){
                if (this.records[i].name==name){
                    return i;
                }
            }
            // Nếu không có record nào thoả mãn
            return -1;
        }

        public void displayAllContacts(){
            for (int i=0;i<this.currentNoOfRecord;i++){
                this.records[i].display();
            }
        }

        public Contact getContact(int idx){
            return this.records[idx];
        }
    }
    public static void main(String[] args) {
        // Chuong trinh chinh
        AddressBook addressBook = new AddressBook(10);
        Contact firstContact = new Contact("A", "00", "email0@email");
        Contact secondContact = new Contact("B", "01", "email1@email");
        Contact thirdContact = new Contact("C", "02", "email2@email");

        addressBook.addContact(firstContact);
        addressBook.addContact(secondContact);
        addressBook.addContact(thirdContact);

        addressBook.displayAllContacts();
        System.out.println("-----------------------------------");
        int vt = addressBook.searchContact("D");
        if (vt==-1){
            System.out.println("Không tìm thấy contact có tên B");
        }
        else{
            addressBook.getContact(vt).display();
        }
        System.out.println("-----------------------------------");
        addressBook.removeContact("D");
        addressBook.displayAllContacts();
    }
}
