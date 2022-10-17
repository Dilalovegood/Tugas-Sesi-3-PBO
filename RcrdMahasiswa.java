
import java.util.ArrayList;
import java.util.Scanner;


public class RcrdMahasiswa extends Mahasiswa {
    RcrdMahasiswa(String nama, String nim, int nilai){
        super(nama, nim, nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Mahasiswa> mhssw = new ArrayList<>();
        ArrayList <Mahasiswa> lulus = new ArrayList<>();
        ArrayList <Mahasiswa> tidaklulus = new ArrayList<>();
        

        for (int i = 0; i < 4; i++) {
            System.out.print("isikan NIM: ");
            String nim = sc.nextLine();
            
            System.out.print("isikan Nama: ");
            String nama = sc.nextLine();

            System.out.print("isikan nilai: ");
            int nilai = Integer.parseInt(sc.nextLine());
            
            mhssw.add(new Mahasiswa(nama, nim, nilai));
            if((mhssw.get(i).getGrade().compareTo("A") == 0) || (mhssw.get(i).getGrade().compareTo("B") == 0) || (mhssw.get(i).getGrade().compareTo("C") == 0)){
                lulus.add(new Mahasiswa(nama, nim, nilai));
            }
            else{
                tidaklulus.add(new Mahasiswa(nama, nim, nilai));
            }
            System.out.println("===================================");
        }

        System.out.println("jumlah mahasiswa : " + mhssw.size());
        System.out.print("jumlah mahasiswa yang lulus : ");
        printMhs(lulus);
        System.out.print("jumlah mahasiswa yang tidak lulus: ");
        printMhs(tidaklulus);
        printNilai(mhssw, "A");
        printNilai(mhssw, "B");
        printNilai(mhssw, "C");
        printNilai(mhssw, "D");
        printNilai(mhssw, "E");
        System.out.println();
        System.out.println("rata rata nilai: ");
        rataRata(mhssw);
        
        sc.close();
    }

    public static void printMhs(ArrayList<Mahasiswa> mhssw){
        System.out.print(mhssw.size() + " yaitu ");
        for (int i = 0; i < mhssw.size(); i++) {
            System.out.print(mhssw.get(i).getNama() + ", ");
        }
        System.out.println();

    }

    public static void printNilai(ArrayList<Mahasiswa> mhssw, String nilai){
        if(jumlahGrade(mhssw, nilai) > 0){
            System.out.println();
            System.out.print("Jumlah mahasiswa dengan nilai " + nilai +  " : " + jumlahGrade(mhssw, nilai) + " yaitu ");
        }
        
        for(int i = 0; i < mhssw.size(); i++){
            if(mhssw.get(i).getGrade().equals(nilai)){
                System.out.print(mhssw.get(i).getNama() + ", ");
            }
        }
    }

    public static int jumlahGrade(ArrayList<Mahasiswa> mhssw, String nilai){
        int jumlah = 0;
        for(int i = 0; i < mhssw.size(); i++){
            if(mhssw.get(i).getGrade().equals(nilai)){
                jumlah++;       
            }
        }
        return jumlah;
    }

    public static float rataRata(ArrayList<Mahasiswa> mhssw){
        System.out.println();
        int jumlah = 0;
        for(int i = 0; i < mhssw.size(); i++){
            if(mhssw.get(i).getNilai() <= 100 && mhssw.get(i).getNilai() >= 0){
                jumlah += mhssw.get(i).getNilai();
                System.out.print(mhssw.get(i).getNilai() + " + ");
            }
            else{
                System.out.println("0 + ");
            }
        }

        System.out.print(" = " + (float)jumlah/mhssw.size());

        return jumlah / mhssw.size();
    }   
}
    
