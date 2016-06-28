package weibo4j.myapp;


import java.util.List;

import weibo4j.Account;
import weibo4j.Timeline;
import weibo4j.Weibo;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;



public class DeleteWeibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String access_token = "2.00FEjBKCTP2dPDfbf9d604db0589wI";
		Timeline tm = new Timeline();
		tm.client.setToken(access_token);
		
		for (int j = 0 ;j<10;j++)
		{
		try {
			StatusWapper sw = tm.getUserTimeline();
			List<Status> list = sw.getStatuses();
			System.out.println("size:"+list.size());
			for(int i=0;i<list.size();i++)
			{
				Status s = list.get(i);
				String id = s.getId();
				tm.Destroy(id);
			}
		} catch (WeiboException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
//		try {
//			Status status = tm.Destroy(id);
//			Log.logInfo(status.toString());
//		} catch (WeiboException e) {
//			e.printStackTrace();
//		}

	}

}
