package by.training.tasks.aliv.masmas;

public class Main {

    public static void main(String[] args) {
        //массив из тасков
        Task[] mas = new Task[40];

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
        Task18 t18 = new Task18();
        Task19 t19 = new Task19();
        Task20 t20 = new Task20();
        Task21 t21 = new Task21();
        Task22 t22 = new Task22();
        Task23 t23 = new Task23();
        Task24 t24 = new Task24();
        Task25 t25 = new Task25();
        Task26 t26 = new Task26();
        Task27 t27 = new Task27();
        Task28 t28 = new Task28();
        Task29 t29 = new Task29();
        Task30 t30 = new Task30();
        Task31 t31 = new Task31();
        Task32 t32 = new Task32();
        Task33 t33 = new Task33();
        Task34 t34 = new Task34();
        Task35 t35 = new Task35();
        Task36 t36 = new Task36();
        Task37 t37 = new Task37();
        Task38 t38 = new Task38();
        Task39 t39 = new Task39();
        Task40 t40 = new Task40();
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
        mas[19]=t20;
        mas[20]=t21;
        mas[21]=t22;
        mas[22]=t23;
        mas[23]=t24;
        mas[24]=t25;
        mas[25]=t26;
        mas[26]=t27;
        mas[27]=t28;
        mas[28]=t29;
        mas[29]=t30;
        mas[30]=t31;
        mas[31]=t32;
        mas[32]=t33;
        mas[33]=t34;
        mas[34]=t35;
        mas[35]=t36;
        mas[36]=t37;
        mas[37]=t38;
        mas[38]=t39;
        mas[39]=t40;


        for (Task t : mas) {
            t.execute();
            System.out.println();
            System.out.println("------------------");

        }
    }
}
