public class Lec07Example {
    static class SinhVien{
        // Thuoc tinh
        private String tenSv, maSv, dcLienLac;
        int tuoi;
        static int soLuongSv = 0;

        // Khoi tao
        SinhVien(){
            this.tenSv = "Default";
            this.maSv = "Default";
            this.dcLienLac = "Default";
            this.tuoi = 1;
        }
    
        SinhVien(String tenSv, String maSv, String dcLienLac, int tuoi){
            this.tenSv = tenSv;
            this.maSv = maSv;
            this.dcLienLac = dcLienLac;
            this.tuoi = tuoi;
        }
    
        SinhVien(String ten, String dcLienLac, int tuoi){
            this.maSv = "Default";
            this.tenSv = ten;
            this.dcLienLac = dcLienLac;
            this.tuoi = tuoi;
        }
        
        void xemThongTin(){
            System.out.printf("Ma sinh vien: %s\n", this.maSv);
            System.out.printf("Ten sinh vien: %s\n", this.tenSv);
            System.out.printf("Dia chi lien lac: %s\n", this.dcLienLac);
            System.out.printf("Tuoi: %d\n", this.tuoi);
        }

        String getTen(){
            return this.tenSv;
        }
    }

    public static void main(String[] args) {
        SinhVien sv1 = new Lec07Example.SinhVien();
        SinhVien sv2 = new Lec07Example.SinhVien("Nguyen Van A", "MSV001", "Hanoi", 25);
        SinhVien sv3 = new Lec07Example.SinhVien("Nguyen Van A", "Hanoi", 25);

        System.out.println(sv1.soLuongSv);
        System.out.println(sv2.soLuongSv);
        sv1.soLuongSv+=1;
        System.out.println(sv2.soLuongSv);

        //String ten = sv1.getTen();
    }
}
