import java.util.Objects;

public class ReplaceSpace {
	public static String replaceSpaces(String str) {
		Objects.requireNonNull(str);
		String[] array = str.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length - 1; ++i) {
			sb.append(array[i]).append("%20");
		}
		sb.append(array[array.length - 1]);
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "hello world";
		System.out.println(replaceSpaces(str));
	}
}