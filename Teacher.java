class Teacher{
int    prize          ;
String name           ;
int    batteryCapacity;
String brand          ;
String time           ;

class TeacherRunner{
public static void main(String[] info)
{
 Teacher teacher=new Teacher();
 //Teacher teacher1=new Teacher();
 System.out.println(teacher.prize);
 System.out.println(teacher.name);
 System.out.println(teacher. batteryCapacity);
 System.out.println(teacher.brand);
 System.out.println(teacher.time);
 Teacher teacher1=new Teacher();
 teacher.prize=1500;
 teacher.name  ="smart fit gym";
    teacher.batteryCapacity=90;
    teacher.brand  ="mi";
    teacher.time ="6-8"; 
 System.out.println("============================");
    System.out.println(teacher.prize  );
 System.out.println(teacher.name   );
 System.out.println(teacher. batteryCapacity);
 System.out.println(teacher.brand   );
 System.out.println(teacher.time   );
}
}
}