package raj.aayush.after.jdk8.optional;

import java.util.Optional;

import raj.aayush.before.jdk8.optional.ScreenResolution;
/**
 *  Where does Java Optional fits?
If we observe above real-time Retail Domain use-case, we should know that Java Optional construct is useful at the following places.

8.1 Method Parameter

public void setResolution(Optional<ScreenResolution> resolution) {
	this.resolution = resolution;
}
8.2 Method Return Type

public Optional<ScreenResolution> getResolution() {
	return resolution;
}
8.3 Constructor Parameter

public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
	this.size = size;
	this.resolution = resolution;
}
8.4 Variable Declaration

private Optional<ScreenResolution> resolution;
8.5 Class Level

public class B

public class A<T extends Optional<B>> { }


 * @author aayushraj
 *
 */
public class MobileTesterWithOptional {
	
  public static void main(String[] args) {
	ScreenResolution resolution = new ScreenResolution(750,1334);
	DisplayFeatures dfeatures = new DisplayFeatures("4.7", Optional.of(resolution));
	Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));
		
	MobileService mService = new MobileService();
		
	int width = mService.getMobileScreenWidth(Optional.of(mobile));
	System.out.println("Apple iPhone 6s Screen Width = " + width);

	Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());		
	int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
	System.out.println("Apple iPhone 16s Screen Width = " + width2);
	
	int width3 = mService.getMobileScreenWidth(Optional.empty());
	
	System.out.println("Empty Mobile Screen Width = " + width3);
  }
}