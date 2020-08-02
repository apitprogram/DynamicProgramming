	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class MaxChar {
	//abccccccd => c
	//apple 111123 => 1	
		public static void main(String[] args) {
			String str = "abccccccd";
			String str1 = "apple 1231111";
			String str2 = "aabbc";

			System.out.println(maxChar(str));
			System.out.println(maxChar(str1));
			System.out.println(maxChar(str2));


		}

		private static char maxChar(String str) {
			Map charMap = new HashMap();

			char[] charArray = str.toCharArray();
			int count = 1;
			for (int i = 0; i <= charArray.length - 1; i++) {

				if (charMap.containsKey(charArray[i])) {
					charMap.put(charArray[i], count);
					count++;
				} else {
					charMap.put(charArray[i], 1);

				}

			}

			Set<Entry<Character, Integer>> entrySet = charMap.entrySet();

			int maxCount = 0;

			char maxChar = 0;

			for (Entry<Character, Integer> entry : entrySet) {
				if (entry.getValue() > maxCount) {
					maxCount = entry.getValue();

					maxChar = entry.getKey();
				}
			}

			return maxChar;
		}

	}
