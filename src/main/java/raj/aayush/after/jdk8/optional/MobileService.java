package raj.aayush.after.jdk8.optional;
import java.util.Optional;

import raj.aayush.before.jdk8.optional.ScreenResolution;

public class MobileService {

  public Integer getMobileScreenWidth(Optional<Mobile> mobile){
	return mobile.flatMap(Mobile::getDisplayFeatures)
		 .flatMap(DisplayFeatures::getResolution)
		 .map(ScreenResolution::getWidth)
		 .orElse(0);

  }

}