package eu.hecnet.file.detectors;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.spi.FileTypeDetector;

public abstract class AbstractFileTypeDetector extends FileTypeDetector {

	public final static String OPENVMS_TEXTFILE_CHARSET = "iso-8859-1";

	public String[] getValidExtensions() {
		return new String[] {};
	};

	public abstract String getMimeType();

	protected static LinkOption[] LINK_OPTIONS = {};

	/**
	 * Determine if the given path has a matching extension
	 * 
	 * @param path
	 * @param matchExtensions
	 * @param caseSensistive
	 * @return
	 */
	protected boolean isExtensionMatched(Path path, boolean caseSensitive) {
		String extension = FileTypeDetectorUtils.getExtension(path);

		for (String matchExtension : getValidExtensions()) {
			if (caseSensitive) {
				if (extension.equals(matchExtension)) {
					return true;
				}
			} else {
				if (extension.toLowerCase()
						.equals(matchExtension.toLowerCase())) {
					return true;
				}
			}
		}
		return false;
	}
}
