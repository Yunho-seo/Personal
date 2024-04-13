package example33;

public class ResourceClose implements AutoCloseable {

	public ResourceClose() {
		System.out.println("정상적실행");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("정상적종료");
	}
}