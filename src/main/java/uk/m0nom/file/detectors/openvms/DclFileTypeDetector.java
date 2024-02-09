package uk.m0nom.file.detectors.openvms;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import uk.m0nom.file.detectors.AbstractFileTypeDetector;

/**
 * Detects DCL (DIGITAL Command Language) files
 * 
 * @author msw
 * 
 */
public class DclFileTypeDetector extends AbstractFileTypeDetector {

	public static String MIMETYPE = "vms/dcl-script";
	public static String[] VALID_EXTENSIONS = { "com", "BAT" };
	public static int NO_OF_LINES_STARTING_WITH_PREFIX_REQUIRED = 3;
	public static int MAX_LINES_TO_READ = 12;
	public static String PREFIX = "$";

	@Override
	public String[] getValidExtensions() {
		return VALID_EXTENSIONS;
	}

	@Override
	public String getMimeType() {
		return MIMETYPE;
	}

	/**
	 * Determine whether this is an OpenVMS DCL script by checking the
	 * extension, then looking on the file for lines starting with '$'.
	 */
	@Override
	public String probeContentType(Path path) {
		if (isExtensionMatched(path, false)) {
			// Check inside the file for a couple of key strings
			if (Files.isRegularFile(path, LINK_OPTIONS)) {
				BufferedReader br = null;
				try {
					br = Files.newBufferedReader(path,
							Charset.forName(OPENVMS_TEXTFILE_CHARSET));
					int matchingLines = 0;
					int linesRead = 0;
					while (br.ready()
							&& matchingLines < NO_OF_LINES_STARTING_WITH_PREFIX_REQUIRED
							&& linesRead++ < MAX_LINES_TO_READ) {
						String line = br.readLine();
						if (line != null && line.startsWith(PREFIX)) {
							matchingLines++;
						}
					}
					if (matchingLines >= NO_OF_LINES_STARTING_WITH_PREFIX_REQUIRED) {
						return MIMETYPE;
					}
				} catch (IOException e) {
					return null;
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

}
