package arnoldEncrypt;

public class ArnoldID {
	String id;
	long arnold_encrypted;
	
	public ArnoldID(String id, long arnold_encrypted) {
		this.id=id;
		this.arnold_encrypted=arnold_encrypted;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id){
		this.id=id;
	}
	
	public long getArnold() {
		return arnold_encrypted;
	}
	
	public void setArnold(long arnold_encrypted) {
		this.arnold_encrypted=arnold_encrypted;
	}
}
