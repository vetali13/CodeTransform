package main;
import java.lang.reflect.InvocationTargetException;
import original.BoxInterface;
import tool.ClassTransformer;

public class Application {

	public static void main(String[] args) {
		
		BoxInterface b;
		
		try {
			b =  (BoxInterface)ClassTransformer.transform().getConstructor().newInstance();
			System.out.println( b.getId() );
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
