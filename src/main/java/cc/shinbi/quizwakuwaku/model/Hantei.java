package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hantei {

	private List<Result> results;
	private List<Question> questions;
	
	private Hantei() {
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
		Collections.shuffle(this.questions);;
	}
	
	private static List<Result> getResultList() {
		Result[] results = {
				new Result(
						"5問中0点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中1点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"
						),
				new Result(
						"5問中2点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"
						),
				new Result(
						"5問中3点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"
						),
				new Result(
						"5問中4点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"								
						),
				new Result(
						"5問中5点",
						"解説<br>"
						+ "第1問　イルカは漢字で書くと海豚<br>"
						+ "第2問　クラゲは漢字で書くと水母<br>"
						+ "第3問　バッタは漢字で書くと飛蝗<br>"
						+ "第4問　ヒトデを英語にするとstarfish<br>"
						+ "第5問　惑星で一番重たいのは木星<br>"
						+ "でした。"
								
						),
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "イルカを漢字で書くとどれ？");
		question1.addItem(0, "海豚");
		question1.addItem(1, "蝸牛");
		question1.addItem(2, "海牛");
		question1.addItem(3, "河豚");
		list.add(question1);
		
		Question question2 = new Question("q2", "クラゲを漢字で書くとどれ？");
		question2.addItem(0, "水母");
		question2.addItem(1, "水星");
		question2.addItem(2, "水浮");
		question2.addItem(3, "水曜");
		list.add(question2);
		
		Question question3 = new Question("q3", "バッタを漢字で書くとどれ？");
		question3.addItem(0, "飛蝗");
		question3.addItem(1, "蟋蟀");
		question3.addItem(2, "飛蟻");
		question3.addItem(3, "飛脚");
		list.add(question3);
		
		Question question4 = new Question("q4", "ヒトデを英語にするとどれ？");
		question4.addItem(0, "starfish");
		question4.addItem(1, "starshell");
		question4.addItem(2, "starmine");
		question4.addItem(3, "starship");
		list.add(question4);
		
		Question question5 = new Question("q5", "惑星の中で最も重たいのはどれ？");
		question5.addItem(0, "木星");
		question5.addItem(1, "太陽");
		question5.addItem(2, "天王星");
		question5.addItem(3, "土星");
		list.add(question5);
		
		return list;
	}
		
	public static Hantei createHantei() {
		Hantei hantei = new Hantei();
		
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