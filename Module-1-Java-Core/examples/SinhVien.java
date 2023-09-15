package examples;

public class SinhVien{
    // Thuoc tinh
    String tenSv, maSv, dcLienLac;
    int tuoi;

    // Khoi tao
    SinhVien(){

    }

    SinhVien(String ten, String maSv, String dcLienLac, int tuoi){
        this.tenSv = ten;
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
}