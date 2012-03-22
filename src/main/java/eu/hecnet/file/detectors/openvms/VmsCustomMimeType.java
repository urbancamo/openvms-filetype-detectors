package eu.hecnet.file.detectors.openvms;

import java.util.Collection;
import java.util.HashSet;

import eu.hecnet.file.detectors.CustomMimeType;

/**
 * Custom VMS mime-type. Here we're adding the ability to associate VMS Features
 * 
 * @author msw
 * 
 */
public class VmsCustomMimeType extends CustomMimeType {

	private Collection<VmsFeature> features = new HashSet<VmsFeature>();

	public VmsCustomMimeType(String mimeType, String description, String[] matchingFilenames) {
		super(mimeType, description, matchingFilenames);
	}

	public VmsCustomMimeType(String mimeType, String description, String[] matchingFilenames, boolean customDetector) {
		super(mimeType, description, matchingFilenames, customDetector);
	}

	public VmsCustomMimeType(String mimeType, String description, String[] matchingFilenames, boolean customDetector,
			VmsFeature features[]) {
		super(mimeType, description, matchingFilenames, customDetector);

	}

	public VmsCustomMimeType(String mimeType, String description, String[] matchingFilenames, VmsFeature features[]) {
		this(mimeType, description, matchingFilenames, false, features);
	}

	public boolean hasFeature(VmsFeature feature) {
		return features.contains(feature);
	}

	public Collection<VmsFeature> getFeatures() {
		return features;
	}

	public VmsFeature[] getFeaturesAsArray() {
		return (VmsFeature[]) features.toArray();
	}

	public void setFeatures(VmsFeature newFeatures[]) {
		features = new HashSet<VmsFeature>();
		for (VmsFeature feature : newFeatures) {
			features.add(feature);
		}
	}

}
