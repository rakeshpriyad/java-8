package raj.aayush.after.jdk8.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValue {

	public static void main(String[] args) {
		List<String> res=filterNullValue(getStringStream());
		System.out.println(res);
	}
	public static List<String> filterNullValue(Stream<String> strStream){
		return strStream.filter(s -> s != null).collect(Collectors.toList());
	}
	public static Stream<String> getStringStream(){
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		return language;
	}
}
