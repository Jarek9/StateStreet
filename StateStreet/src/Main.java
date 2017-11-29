import java.io.File;

public class Main {

	public static void main(String[] args) {
		
				
		File path1 = new File("res/data/gmbh");
		File path2 = new File("res/data/ssc");
		
		File[] checkFile1 = path1.listFiles();
		
		for(File file : checkFile1)
		{
			if(file.getName().startsWith("gmbh_20161212")) {
				System.out.println("Nav file " + file.getName() + " exist in folder " + path1);
			}
		} 
		
		File[] checkFile2 = path2.listFiles();
		
		for(File file : checkFile2)
		{
			if(file.getName().startsWith("ssc_20161212")) {
				System.out.println("Nav file " + file.getName() + " exist in folder " + path2);
			}
		} 

}
}
