package eu.hecnet.file.detectors.openvms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.spi.FileTypeDetector;

import eu.hecnet.file.detectors.CustomMimeType;

/**
 * Generic detector that matches mime types to patterns in filenames
 * 
 * @author msw
 * 
 */
public class FilenameBasedDetector extends FileTypeDetector {

	private VmsCustomMimeTypeLibrary mimeTypeLibrary;

	public FilenameBasedDetector() {
		mimeTypeLibrary = new VmsCustomMimeTypeLibrary();
	}

	@Override
	public String probeContentType(Path path) throws IOException {
		if (Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
			for (String mimeType : mimeTypeLibrary.keySet()) {
				CustomMimeType customMimeType = mimeTypeLibrary.get(mimeType);
				if (!customMimeType.isCustomDetector()) {
					String filename = path.toFile().getName();
					for (String regexp : customMimeType.getMatchingFilenames()) {
						if (filename.toLowerCase().matches(regexp)) {
							return customMimeType.getMimeType();
						}
					}
				}
			}
		}
		return null;
	}

}
