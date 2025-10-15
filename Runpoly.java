//program to use the concept of runtime polymorphism
class Syam{
		void sita()
			{
					System.out.println("Syam's sita");
			}
}

class Ram extends Syam{
		void sita(){
					System.out.println("Ram's sita");
			}
}

class Runpoly{
		public static void main(String[] args){
					Syam obj=new Ram();
					obj.sita();
		}
}
