package di_01;

public class MyLogFile implements ILog{
	private String filename;
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void log(String msg) {
		System.out.println("파일출력:"+filename+":"+msg);
	}
}
