package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hantei4 {

	private List<Result> results;
	private List<Question> questions;
	
	private Hantei4() {
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
		//Collections.shuffle(this.questions);
	}
	
	private static List<Result> getResultList() {
		Result[] results = {
				new Result(
						"５問中０点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　ロサンゼルス・エンゼルスに所属していて背番号は１７番！<br>"
				),
				new Result(
						"５問中１点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　ロサンゼルス・エンゼルスに所属していて背番号は１７番！<br>"
				),
				new Result(
						"５問中２点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　ロサンゼルス・エンゼルスに所属していて背番号は１７番！<br>"
				),
				new Result(
						"５問中３点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　大谷翔平選手の背番号は１７番！<br>"
				),
				new Result(
						"５問中４点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　大谷翔平選手の背番号は１７番！<br>"
				),
				new Result(
						"５問中５点",
						"解説<br><br>"
						+ "第１問　東京ドームが正解！JR水道橋駅と東京メトロ後楽園駅が最寄りにあるので"
						+ "とってもアクセスしやすい素晴らしい球場。<br>"
						+ "第２問　正解は３つ。<br>"
						+ "第３問　ボールを打つ人のことをバッターといいます。<br>"
						+ "第４問　ピッチャーは投手のことです。ちなみにキャッチャーは捕手のこと。<br>"
						+ "第５問　大谷翔平選手の背番号は１７番！<br>"
				)
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "読売ジャイアンツが本拠地にしている球場はどこでしょう？");
		question1.addItem(0, "東京ドーム");
		question1.addItem(1, "神宮球場");
		question1.addItem(2, "札幌ドーム");
		question1.addItem(3, "甲子園球場");
		list.add(question1);
		
		Question question2 = new Question("q2", "野球のアウトはいくつ取れば攻守交替になる？");
		question2.addItem(0, "３つ");
		question2.addItem(1, "２つ");
		question2.addItem(2, "５つ");
		question2.addItem(3, "１つ");
		list.add(question2);
		
		Question question3 = new Question("q3", "ボールを打つ人のことを何といいますか？");
		question3.addItem(0, "バッター");
		question3.addItem(1, "ヒッター");
		question3.addItem(2, "ブレイカー");
		question3.addItem(3, "アタッカー");
		list.add(question3);
		
		Question question4 = new Question("q4", "ボールを投げる人のことを何といいますか？");
		question4.addItem(0, "ピッチャー");
		question4.addItem(1, "スローワー");
		question4.addItem(2, "ボーラー");
		question4.addItem(3, "プレイヤー");
		list.add(question4);
		
		Question question5 = new Question("q5", "大谷翔平選手がエンゼルスに所属している時の背番号は？");
		question5.addItem(0, "１７番");
		question5.addItem(1, "２０番");
		question5.addItem(2, "５番");
	//	question5.addItem(3, "１８番");
		list.add(question5);
		
		return list;
	}
		
	public static Hantei4 createHantei() {
		Hantei4 hantei = new Hantei4();
		
		List<Result> results = getResultList();
		hantei.getResults().addAll(results);
		
		List<Question> questions = getQuestionList();
		hantei.getQuestions().addAll(questions);
		
		hantei.shuffle();
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