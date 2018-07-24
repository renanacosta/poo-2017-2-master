package agenda;

import com.google.gson.Gson;

public class JsonTransformer implements spark.ResponseTransformer {

	private Gson gson = new Gson();
	
	public String render(Object o) throws Exception {		
		return gson.toJson(o);
	}

}
