package uk.m0nom.file.detectors.openvms;

public enum VmsFeature {
	/***/
	CALLING_STANDARD_LANGUAGE("Calling Standard Language"),
	/***/
	SOURCE_FILE("Source File"),
	/***/
	MAKEFILE("Makefile");

	private final String description;

	VmsFeature(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
