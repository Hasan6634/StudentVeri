public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String StuNo;
    String classes;
    double average;
    boolean isPass = false;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.StuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note1 >= 0 && note1 <= 100) {
            this.c2.note = note2;
        }
        if (note1 >= 0 && note1 <= 100) {
            this.c3.note = note3;
        }

    }void addBulkSozluNote ( int sNote1, int sNote2, int sNote3){
        if (sNote1 >= 0 && sNote1 <= 100) {
            this.c1.sNote = sNote1;
        }
        if (sNote2 >= 0 && sNote2 <= 100) {
            this.c2.sNote = sNote2;
        }
        if (sNote3 >= 0 && sNote3 <= 100) {
            this.c3.sNote = sNote3;
        }

    }void isPass(){

        this.average= ((this.c1.note*0.80)+(this.c2.note*0.80)+(this.c3.note*0.80)+(this.c1.sNote*0.20)+(this.c2.sNote*0.20)+ (this.c3.sNote*0.20))/3;
        if (this.average>55){
            System.out.println("Tebrikler sınıfı geçtiniz. Ortalamanız :"+average);
        }else System.out.println("Sınıfta kaldınız. Ortalamanız :"+average);
        System.out.println("=================");
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu :" + this.c1.note);
        System.out.println(this.c2.name + " Notu :" + this.c2.note);
        System.out.println(this.c3.name + " Notu :" + this.c3.note);
    }
    void printSNote(){
        System.out.println(this.c1.name + " Sözlü Notu :" + this.c1.sNote);
        System.out.println(this.c2.name + " Sözlü Notu :" + this.c2.sNote);
        System.out.println(this.c3.name + " Sözlü Notu :" + this.c3.sNote);

    }


}
