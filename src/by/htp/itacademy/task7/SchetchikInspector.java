package by.htp.itacademy.task75;

public class SchetchikInspector {

	public static void main(String[] args) {
		Schetchik st=new Schetchik(3,10,6);
		
		//Schetchik st=new Schetchik();
		
		System.out.println(st.getCurrentState());
		
		st.toDecrease();
		System.out.println("was decreased");
		
		System.out.println(st.getCurrentState());
		
		st.toIncrease();
        System.out.println("was increased");
		
		System.out.println(st.getCurrentState());

	}

}
