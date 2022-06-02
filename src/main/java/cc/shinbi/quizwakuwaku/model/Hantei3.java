package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hantei3 {

	private List<Result> results;
	private List<Question> questions;
	
	private Hantei3() {
		this.results = new ArrayList<Result>();
		this.questions = new ArrayList<Question>();
	}
	
	public List<Result> getResults() {
		return results;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void shuffle() {
		for(Question question : this.questions) {
			question.shuffle();
		}
		Collections.shuffle(this.questions);
	}
	
	private static List<Result> getResultList() {
		Result[] results = {
				new Result(
						"5問中0点",
						"解説<br>"
						+ "第1問　高校生名探偵の工藤新一<br>"
						+ "第2問　帝丹高校が正解<br>"
						+ "第3問　黄色いビートルが愛車<br>"
						+ "第4問　3人<br>"
						+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中1点",
						"解説<br>"
								+ "第1問　高校生名探偵の工藤新一<br>"
								+ "第2問　帝丹高校が正解<br>"
								+ "第3問　黄色いビートルが愛車<br>"
								+ "第4問　3人<br>"
								+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中2点",
						"解説<br>"
								+ "第1問　高校生名探偵の工藤新一<br>"
								+ "第2問　帝丹高校が正解<br>"
								+ "第3問　黄色いビートルが愛車<br>"
								+ "第4問　3人<br>"
								+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中3点",
						"解説<br>"
								+ "第1問　高校生名探偵の工藤新一<br>"
								+ "第2問　帝丹高校が正解<br>"
								+ "第3問　黄色いビートルが愛車<br>"
								+ "第4問　3人<br>"
								+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中4点",
						"解説<br>"
						+ "第1問　高校生名探偵の工藤新一<br>"
						+ "第2問　帝丹高校が正解<br>"
						+ "第3問　黄色いビートルが愛車<br>"
						+ "第4問　3人<br>"
						+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
						+ "でした。"
														
						),
				new Result(
						"5問中5点",
						"解説<br>"
								+ "第1問　高校生名探偵の工藤新一<br>"
								+ "第2問　帝丹高校が正解<br>"
								+ "第3問　黄色いビートルが愛車<br>"
								+ "第4問　3人<br>"
								+ "第5問　APTX4869。新一のほかも宮野志保とメアリーも飲まされた<br>"
								+ "でした。"
								
								
						),
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "江戸川コナンの正体は？");
		question1.addItem(0, "工藤新一");
		question1.addItem(1, "松田優作");
		question1.addItem(2, "毛利小五郎");
		question1.addItem(3, "明智光秀");
		list.add(question1);
		
		Question question2 = new Question("q2", "毛利蘭が通う高校は？");
		question2.addItem(0, "帝丹高校");
		question2.addItem(1, "杯戸高校");
		question2.addItem(2, "明青学園");
		question2.addItem(3, "須見工");
		list.add(question2);
		
		Question question3 = new Question("q3", "阿笠博士の愛車は？");
		question3.addItem(0, "フォルクスワーゲン　ビートル");
		question3.addItem(1, "クーパーミニ");
		question3.addItem(2, "RX-8");
		question3.addItem(3, "セルシオ");
		list.add(question3);
		
		Question question4 = new Question("q4", "少年探偵団は何人いる？");
		question4.addItem(0, "3人");
		question4.addItem(1, "4人");
		question4.addItem(2, "5人");
		question4.addItem(3, "2人");
		list.add(question4);
		
		Question question5 = new Question("q5", "新一が飲まされた毒薬の名前は？");
		question5.addItem(0, "APTX4869");
		question5.addItem(1, "パブロン");
		question5.addItem(2, "イソジン");
		question5.addItem(3, "葛根湯");
		list.add(question5);
		
		return list;
	}
		
	public static Hantei3 createHantei() {
		Hantei3 hantei = new Hantei3();
		
		List<Result> results = getResultList();
		hantei.getResults().addAll(results);
		
		List<Question> questions = getQuestionList();
		hantei.getQuestions().addAll(questions);
		
		//hantei.shuffle();
		return hantei;
	}
	
	
	
	public Result check(List<Integer> answers) {
				
		int ans = 0;
		for(int i = 0; i < answers.size(); i++) {
			if(answers.get(i) == 0) {
				ans++;				
			}
		}
		return this.results.get(ans);
	}	
	
	public static Integer checkNum(List<Integer> answers) {
		int ans = 0;
		for(int i = 0; i < answers.size(); i++) {
			if(answers.get(i) == 0) {
				ans++;				
			}
		}
		return ans;
	}
}