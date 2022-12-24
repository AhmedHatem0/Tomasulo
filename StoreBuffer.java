
public class StoreBuffer {
	String id;
	boolean busy;
	double vValue;
	String qValue;
	int vAddress;
	String qAddress;
	
	public StoreBuffer(String id, boolean busy, double vValue, String qValue, int vAddress, String qAddress) {
		this.id = id;
		this.busy = busy;
		this.vValue = vValue;
		this.qValue = qValue;
		this.vAddress = vAddress;
		this.qAddress = qAddress;
	}
}
