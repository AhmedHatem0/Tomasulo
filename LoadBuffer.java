
public class LoadBuffer {
	String id;
	boolean busy;
	int vAddress;
	String qAddress;
	
	public LoadBuffer(String id, boolean busy, int vAddress, String qAddress) {
		this.id = id;
		this.busy = busy;
		this.vAddress = vAddress;
		this.qAddress = qAddress;
	}

}
