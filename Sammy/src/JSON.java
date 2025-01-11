//
//  import org.json.simple.JSONObject;
//  import org.json.simple.JSONArray;
//
//  public class JSON {
//
//	   @SuppressWarnings("unchecked")
//	public static void main(String[] args) throws Exception {
//		      JSONObject obj = new JSONObject();
//
//		      obj.put("name", "foo");
//		      obj.put("num", 100);
//		      obj.put("balance", 1000.21); // String, Number, Null, boolean object, array
//		      obj.put("is_vip", true);
//		      obj.put("genda", null);
//
//		      System.out.println(obj);
//
//		      JSONArray ja = new JSONArray();
//		      ja.add(obj);
//		      ja.add("Sammy");
//
//		      System.out.println(ja);
//
//		      JSONObject jo = new JSONObject();
//
//
//		      jo.put("name", "Sam");
//		      jo.put("year", 2023);
//
//		      JSONObject je = new JSONObject();
//		      je.put("reading", true);
//		      je.put("sport", "football");
//
//		      JSONArray jara = new JSONArray();
//		      jara.add(je);
//
//		      jo.put("hobby", jara);
//
//		      System.out.println(jo);
//		   }
//
//  }
//
//
//
//// Fork vs Clone, Commit vs Stash, Merge vs Rebase, Pull vs Fetch in Git/BitBucket