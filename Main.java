public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","123","TRH");
        Teacher t2=new Teacher("Graham Bell","555","FZK");
        Teacher t3=new Teacher("Külyutmaz","111","BIO");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);

        Course biyoji=new Course("Biyoji","101","BIO");
        biyoji.addTeacher(t3);


        Student s1=new Student("Kemal","111","4",tarih,fizik,biyoji);
        s1.addBulkExamNote(60,80,30);
        s1.printNote();
        s1.addBulkSozluNote(10,10,10);
        s1.printSNote();
        s1.isPass();

        Student s2=new Student("Hasan","222","4",tarih,fizik,biyoji);
        s2.addBulkExamNote(30,90,60);
        s2.printNote();
        s2.addBulkSozluNote(60,80,70);
        s2.printSNote();
        s2.isPass();
    }
}
