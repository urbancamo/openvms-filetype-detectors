package uk.m0nom.file.detectors.openvms;

import uk.m0nom.file.detectors.CustomMimeTypeLibrary;

public class VmsCustomMimeTypeLibrary extends CustomMimeTypeLibrary {

	public VmsCustomMimeTypeLibrary() {
		add(new VmsCustomMimeType("vms/dcl-script", "DCL Script", new String[] { "*\\.com", ".*\\.bat" }, true,
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/readme", "Readme File", new String[] { ".*readme.txt", ".*read.me", "read.me",
				".*readme.1st", "readme.txt" }));
		add(new VmsCustomMimeType("vms/make-mms", "MMS Makefile", new String[] { ".*\\.mms", ".*\\.mmk" },
				new VmsFeature[] { VmsFeature.MAKEFILE }));
		add(new VmsCustomMimeType("vms/link-options", "Linker Options File", new String[] { ".*\\.opt" }));
		add(new VmsCustomMimeType("vms/object", "Binary Object File", new String[] { ".*\\.obj" }));
		add(new VmsCustomMimeType("vms/object-library", "Binary Object Library", new String[] { ".*\\.olb" }));
		add(new VmsCustomMimeType("vms/macro-source", "Macro Source File", new String[] { ".*\\.ma[rc]" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/macro-library", "Macro Library", new String[] { ".*\\.mlb" }));
		add(new VmsCustomMimeType("vms/text-library", "Text Library", new String[] { ".*\\.tlb" }));
		add(new VmsCustomMimeType("vms/help-library", "Help Library", new String[] { ".*\\.hlb" }));
		add(new VmsCustomMimeType("vms/executable", "Executable", new String[] { ".*\\.exe" }));
		add(new VmsCustomMimeType("vms/help", "Help File", new String[] { ".*\\.hlp" }));
		add(new VmsCustomMimeType("vms/cmd-def", "Command Definition File", new String[] { ".*\\.cld" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/fortran-source", "Fortran Source", new String[] { ".*\\.for", ".*\\.fle", ".*\\.f" },
				new VmsFeature[] { VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/fortran-include", "Fortran Include File", new String[] { ".*\\.inc" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/fortran-message", "Fortran Message File", new String[] { ".*\\.msg" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/c-source", "C-language Source File", new String[] { ".*\\.c", ".*\\.h" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/pascal-source", "Pascal Source File", new String[] { ".*\\.pas" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/documentation", "Documentation File", new String[] { ".*\\.doc" }));
		add(new VmsCustomMimeType("vms/data", "Data File", new String[] { ".*\\.dat" }));
		add(new VmsCustomMimeType("vms/listing", "Listing File", new String[] { ".*\\.lis" }));
		add(new VmsCustomMimeType("vms/log", "Log File", new String[] { ".*\\.log" }));
		add(new VmsCustomMimeType("vms/runoff", "VMS Runoff File", new String[] { ".*\\.rnh" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/patch", "Patch File", new String[] { ".*\\.pat" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/mail", "VMS Mail File", new String[] { ".*\\.mai", ".*\\.mail" }));
		add(new VmsCustomMimeType("vms/vax-document", "VAX Document File", new String[] { ".*\\.tex" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/pli-source", "PLI Source File", new String[] { ".*\\.pli", ".*\\.plm" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/snobol-source", "SNOBOL Source File", new String[] { ".*\\.sno" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/bliss-source", "BLISS Source File",
				new String[] { ".*\\.bli", ".*\\.bliss", ".*\\.blissf" }, new VmsFeature[] { VmsFeature.CALLING_STANDARD_LANGUAGE,
						VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/datatrieve-source", "Datatrieve Source File", new String[] { ".*\\.dtr" }));
		add(new VmsCustomMimeType("vms/file-definition-language", "VMS File Definition", new String[] { ".*\\.fdl" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/vax-rally-adl", "VAX Rally Source File", new String[] { ".*\\.adl" }));
		add(new VmsCustomMimeType("vms/tpu-source", "TPU Source File", new String[] { ".*\\.tpu" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/fms-form", "FMS Form Definition", new String[] { ".*\\.frm" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/basic-source", "BASIC Source File", new String[] { ".*\\.bas" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/code-management-system", "Code Management System File", new String[] { ".*\\.cms" }));
		add(new VmsCustomMimeType("vms/edt-editor-command", "EDT Source File", new String[] { ".*\\.edt" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/lse-editor-command", "LSE Source File", new String[] { ".*\\.lse" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/performance-coverage-analyser", "Performance Coverage Analyser File",
				new String[] { ".*\\.pca" }));
		add(new VmsCustomMimeType("vms/ln03-dump", "LN03 Printer Dump File", new String[] { ".*\\.ln03" }));
		add(new VmsCustomMimeType("vms/mail-archive-share", "Mail Archive", new String[] { "patch.*\\.share", "part.*\\.share" }));
		add(new VmsCustomMimeType("vms/sci-apl-source", "SCI APL Source File", new String[] { ".*\\.sci" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/sixel-output", "Sixel Graphics Output File", new String[] { ".*\\.sixel" }));
		add(new VmsCustomMimeType("vms/apl-source", "APL Source File", new String[] { ".*\\.apl" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/wpsplus-document", "WPS-PLUS Document", new String[] { ".*\\.wps" }));
		add(new VmsCustomMimeType("vms/stvos-source", "STVOS Source File", new String[] { ".*\\.tcs" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/icon-source", "ICON Source File", new String[] { ".*\\.icn" },
				new VmsFeature[] { VmsFeature.SOURCE_FILE }));
		add(new VmsCustomMimeType("vms/ada-source", "ADA Source File", new String[] { ".*\\.ada" }, new VmsFeature[] {
				VmsFeature.CALLING_STANDARD_LANGUAGE, VmsFeature.SOURCE_FILE }));
	}
}
