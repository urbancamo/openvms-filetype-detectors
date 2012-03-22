package eu.hecnet.file.detectors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomMimeTypeLibrary {
	protected Map<String, CustomMimeType> map = new HashMap<String, CustomMimeType>();

	protected void add(CustomMimeType mimeType) {
		map.put(mimeType.getMimeType(), mimeType);
	}

	public CustomMimeType get(String mimeType) {
		return map.get(mimeType);
	}

	public Set<String> keySet() {
		return map.keySet();
	}

	public Collection<CustomMimeType> values() {
		return map.values();
	}
}
