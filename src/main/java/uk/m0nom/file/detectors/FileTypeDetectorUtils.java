package uk.m0nom.file.detectors;

import java.nio.file.Path;

public class FileTypeDetectorUtils {
	/**
	 * Retrieve the body of the pathname with the extension stripped off (if it
	 * has one)
	 * 
	 * @param path
	 *            to check
	 * @return basename of path (this may contain '.' but not part of path name
	 *         after final '.')
	 */
	public static String getBasenameNoExtension(Path path) {
		String basename = path.toString();
		int mid = basename.lastIndexOf(".");
		if (mid >= 0) {
			basename = basename.substring(0, mid);
		}
		return basename;
	}

	/**
	 * Retrieve the extension from a path (part of pathname after last '.'). If
	 * the path contains no '.' an empty string is returned.
	 * 
	 * @param path
	 *            to check
	 * @return "" or extension without leading '.'
	 */
	public static String getExtension(Path path) {
		String basename = path.toString();
		int mid = basename.lastIndexOf(".");
		String ext = "";
		if (mid >= 0) {
			ext = basename.substring(mid + 1);
		}
		return ext;
	}

}
