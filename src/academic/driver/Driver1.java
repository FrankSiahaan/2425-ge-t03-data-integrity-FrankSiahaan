package academic.driver;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author 12S23012 - Genesis Tombak Panjaitan
 * @author 12S23016 - Frank Niroy Siahaan
 */
public class Driver1 {

    public static void main(String[] _args) {
        //arraylist course
        ArrayList<Course> course = new ArrayList<Course>();
        //arraylist student
        ArrayList<Student> student = new ArrayList<Student>();
        //arraylist enroll
        ArrayList<Enrollment> enrol = new ArrayList<Enrollment>();
        Scanner input = new Scanner(System.in);
        String temp;
        String temp1;

        //objek course
        String id;
        String matkul;
        String sks;
        String nilai;

        //objek student
        String nim;
        String nama;
        String tahun;
        String prodi;

        //objek enroll
        String ids;
        String nims;
        String year;
        String sems;

        while (true) {
            temp = input.nextLine();
            if (temp.equals("---")) {
                break;
            }
            String[] hasil = temp.split("#");
            temp1 = hasil[0];
            //pengecekan ke course
            if (temp1.equals("course-add")) {
                id = hasil[1];
                matkul = hasil[2];
                sks = hasil[3];
                nilai = hasil[4];
                course.add(new Course(id,matkul,sks,nilai));
            //pengecekan ke student
            } else if (temp1.equals("student-add")) {
                nim = hasil[1];
                nama = hasil[2];
                tahun = hasil[3];
                prodi = hasil[4];
                student.add(new Student(nim,nama,tahun,prodi));
            //pengecekan ke enrol
            } else if(temp1.equals("enrollment-add")) {
                ids = hasil[1];
                nims = hasil[2];
                year = hasil[3];
                sems = hasil[4];
                enrol.add(new Enrollment(ids,nims,year,sems));
            }
        }
        // for (Course i : course) {
        //     System.out.println(i.toString1());
        //     input.close();
        // }

        for (int i = course.size() - 1; i >= 0; i--) {
            System.out.println(course.get(i));
        }

        // for (Student j : student) {
        //     System.out.println(j.toString());
        // }

        for (int j = student.size(); j >= 0; j--) {
            System.out.println(student.get(j));
        }

        // for (Enrollment k : enrol) {
        //     System.out.println(k.toString());
        // }

        for (int k = enrol.size(); k >= 0; k--) {
            System.out.println(enrol.get(k));
        }

        input.close();
    }
    

}