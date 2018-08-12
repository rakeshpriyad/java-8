package raj.aayush.after.jdk8.optional;
import java.util.Optional;

import raj.aayush.before.jdk8.optional.ScreenResolution;

public class DisplayFeatures {

	private String size; // In inches
	private Optional<ScreenResolution> resolution;
	
	public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}
	
	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	
}