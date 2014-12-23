package com.example.messging_json;

import org.json.JSONArray;
import org.json.JSONObject;


public class JSONobj_array {
	JSONArray jsonarray;
	int jsonarr_length;
	public JSONobj_array() {
		// TODO Auto-generated constructor stub
		 jsonarray = new JSONArray();
	}

	public void putJSONobj(JSONObject jobj)
	{
			jsonarray.put(jobj);
			jsonarr_length=jsonarray.length();
	}
	
	public JSONArray getJSONArray()
	{
		return this.jsonarray;
	}

}
