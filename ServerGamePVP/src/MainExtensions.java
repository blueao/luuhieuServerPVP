import com.smartfoxserver.v2.extensions.SFSExtension;

import Calculate.CalculateArrayItems;

public class MainExtensions extends SFSExtension {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		addRequestHandler("ABC", CalculateArrayItems.class);
	}

}
