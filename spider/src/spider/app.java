package spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class app {
	public static void main(String[] args) {
		//Ŀ�� URL
//		for(int i=0;i<=250;i=i+25)
//		{
//		String url = "https://movie.douban.com/top250?start='+ i +'&filter=";
		String url = "https://movie.douban.com/top250?start=25&filter=";
		
		//ץȡ�ĵ�
		try {
			Document doc = Jsoup.connect(url).get();
			
			Elements es = doc.select(".grid_view .item");
			System.out.println(es.size());
		//����һ����Ӱ���б�
//			ArrayList<film> list = new ArrayList<>();
			
			for (Element e :es) {
//				film f = new film();
				//ÿһ����Ӱ
				Element t = e.select(".title").first();
				String num = e.select(".star span").last().text();
				System.out.println(t.text() + "," + num);
				
			}
			
//			String title = doc.title();
//			String text = doc.data();
//			
//			System.out.println(title);
//			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
