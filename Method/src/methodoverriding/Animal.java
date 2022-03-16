package methodoverriding;

class Animal {
	public void Sound()
	{
		System.out.println("No Sound");
	}
	public void Sleep()
	{
		System.out.println("I am from parent class");
	}
}
class Dog extends Animal{
	public void Sound()
	{
			System.out.println("Bark Bark");
    }
	public void Sleep()
	{
		System.out.println("I am from Dog class");
	}
}		
	  
 class Cat extends Animal{
    	public void Sound() 
    	{
    			System.out.println("Meaw");
    	}
       
 
        public static void main(String[] args) {
        // TODO Auto-generated method stub
	        Cat obj=new Cat();
	        obj.Sound();

	}

        }
