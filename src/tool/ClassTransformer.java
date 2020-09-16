package tool;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtNewConstructor;

public class ClassTransformer {

	public static Class<?> transform() {
		
		// Get the class manipulation tool = pool
		ClassPool pool = ClassPool.getDefault();
		
		
		try {
			// in case the classes are not found
			//pool.appendClassPath("C:\\Users\\vital\\eclipse-workspace\\CodeTransform\\bin\\original.Box.class");
			
			pool.insertClassPath(new ClassClassPath(original.Box.class));
			// load the desired class
			CtClass cc = pool.get("original.Box");
			
			// find the default constructor
			CtConstructor ccon= cc.getDeclaredConstructor(null);
			// remove it
			cc.removeConstructor(ccon);
			
			// create a new default constructor
			CtConstructor cstructor = CtNewConstructor.defaultConstructor( cc );
			
			// modify the constructor behavior
			cstructor.setBody( "this.id = 100;");
			
			// add the constructor to the class
			cc.addConstructor(cstructor);
			
			// return the modified class
			return cc.toClass();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return null;
	}
}
