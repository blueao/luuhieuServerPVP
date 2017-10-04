package Calculate;

import com.smartfoxserver.v2.protocol.serialization.SerializableSFSType;

public class DataObject implements SerializableSFSType {

	public int[] items;
	public int a;
	String b;

	public DataObject() {
	};

	public DataObject(int[] objdata, int a) {

		this.items = objdata;
		this.a = a;
	}

	public int[] getItems(int[] itemsReponse) {
		return items;
	}

	public void getA() {
		this.a = a;
	}

	public String getB() {
		return b;
	}

}
