
package javaadvanced.Martes;

class PruebaEstudiante{
    //Caso 5
    int dato = 5;
    
    PruebaEstudiante(){
    Student s5 = new Student(this);
    s5.s();
    }
    public static void main(String[] args) {
        Student s1 = new Student(111," Fer","ITLeon\n");
        Student s2 = new Student(112," Ara","UG\n");
        Student s3 = new Student(113," Avril","ITR\n");
        
        //3
        //Student s4 = new Student(10);
        
        //
        Student s4 = new Student(114," Jane"," UDEO\n",10);
        
        /*
        s1.display();
        s2.display();
        s3.display();
        */
        
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        
        //4
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
        
        //5
        PruebaEstudiante ps2 = new PruebaEstudiante();
        
        //6
        new Student().getStudent().msg();
    }
    //4
   void muestra(PruebaEstudiante obj){
       System.out.println("Metodo invocado");
   }
   void despliega(){
   muestra(this);
   }
   
}