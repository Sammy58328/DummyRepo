import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Bimapy {
	
	public static void main (String args[]) 
	{
	
	BiMap<String, String> capitalCountryBiMap = HashBiMap.create();
    capitalCountryBiMap.put("Mumbai", "India");
    capitalCountryBiMap.put("Washington, D.C.", "USA");
    capitalCountryBiMap.put("Moscow", "Russia");
    capitalCountryBiMap.forcePut("New Delhi", "India");
    
    String keyFromBiMap = capitalCountryBiMap.inverse().get("Russia");
    String valueFromBiMap = capitalCountryBiMap.get("Washington, D.C.");
    
    System.out.println(keyFromBiMap);
    System.out.println(capitalCountryBiMap);
    System.out.println(valueFromBiMap);
	}

}
