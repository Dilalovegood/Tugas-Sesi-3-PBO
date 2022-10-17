
public class Mahasiswa {

     String nim, nama, grade;
    int nilai;
    
    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        setGrade();
    }

   
    
    public void setGrade(){
        if(getNilai()<=100 && getNilai() >=80){
            SetGrade ("A");
        }
        else if(getNilai()<=79 && getNilai() >=70){
            SetGrade ("B");
        }
        else if((getNilai()<=69 && getNilai() >=60)){
            SetGrade ("C");
        }
        else if((getNilai()<=59 && getNilai() >=50)){
            SetGrade ("D");
        }
        else if((getNilai()<50)){
            SetGrade ("E");
        }
        else{
            SetGrade("Input nilai anda salah");
        }
        
    }
    
    public void SetGrade(String grade){
       this.grade = grade;
    }
    
    public String getGrade(){
        return this.grade;
    }
    public void infoMahasiswa(){
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        System.out.println("Nilai: " + getNilai());
        System.out.println("GRADE: " + getGrade());
        System.out.println("========================================");
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
