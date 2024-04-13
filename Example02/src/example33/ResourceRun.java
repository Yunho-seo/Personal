package example33;

public class ResourceRun {
	public static void main(String[] args) {
		// ResourceClose resource = new ResourceClose();
		try(ResourceClose resource = new ResourceClose()) {
			
		} catch(Exception e) {
			
		}
	}
}
