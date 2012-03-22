package eu.hecnet.file.detectors;


/**
 * This class stores custom mime types together with a human-readable
 * description and the set of matching filenames.
 * 
 * @author msw
 * 
 */
public class CustomMimeType {
	private String mimeType;
	private String description;
	private String matchingFilenames[];
	private boolean customDetector;

	public CustomMimeType(String mimeType, String description, String matchingFilenames[]) {
		this(mimeType, description, matchingFilenames, false);
	}

	public CustomMimeType(String mimeType, String description, String matchingFilenames[], boolean customDetector) {
		setMimeType(mimeType);
		setDescription(description);
		setMatchingFilenames(matchingFilenames);
		setCustomDetector(customDetector);
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getMatchingFilenames() {
		return matchingFilenames;
	}

	public void setMatchingFilenames(String matchingFilenames[]) {
		this.matchingFilenames = matchingFilenames;
	}

	public boolean isCustomDetector() {
		return customDetector;
	}

	public void setCustomDetector(boolean customDetector) {
		this.customDetector = customDetector;
	}

}
