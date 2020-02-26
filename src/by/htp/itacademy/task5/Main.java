package by.training.tasks.aliv.mas;

public class Main {

    public static void main(String[] args) {
        //массив из тасков
        Task[] mas = new Task[19];

        Task01 t1 = new Task01();
        Task02 t2 = new Task02();
        Task03 t3 = new Task03();
        Task04 t4 = new Task04();
        Task05 t5 = new Task05();
        Task06 t6 = new Task06();
        Task07 t7 = new Task07();
        Task08 t8 = new Task08();
        Task09 t9 = new Task09();
        Task10 t10 = new Task10();
        Task11 t11 = new Task11();
        Task12 t12 = new Task12();
        Task13 t13 = new Task13();
        Task14 t14 = new Task14();
        Task15 t15 = new Task15();
        Task16 t16 = new Task16();
        Task17 t17 = new Task17();
        Task19 t18 = new Task19();
        Task20 t19 = new Task20();

        mas[0]=t1;
        mas[1]=t2;
        mas[2]=t3;
        mas[3]=t4;
        mas[4]=t5;
        mas[5]=t6;
        mas[6]=t7;
        mas[7]=t8;
        mas[8]=t9;
        mas[9]=t10;
        mas[10]=t11;
        mas[11]=t12;
        mas[12]=t13;
        mas[13]=t14;
        mas[14]=t15;
        mas[15]=t16;
        mas[16]=t17;
        mas[17]=t18;
        mas[18]=t19;



        for (Task t : mas) {
            t.execute();
            System.out.println();
            System.out.println("------------------");

        }
    }
}

