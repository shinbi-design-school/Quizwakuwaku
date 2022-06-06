package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hantei5 {

	private List<Result> results;
	private List<Question> questions;
	
	private Hantei5() {
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
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				),
				new Result(
						"５問中１点",
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				),
				new Result(
						"５問中２点",
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				),
				new Result(
						"５問中３点",
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				),
				new Result(
						"５問中４点",
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				),
				new Result(
						"５問中５点",
						"解説<br>"
						+ "第１問　ワシントン・ウィザーズです<br>"
						+ "第２問　帝丹高校が正解<br>"
						+ "第３問　黄色いビートルが愛車<br>"
						+ "第４問　松中信彦さんがダイエーホークス時代の２００４年に三冠王を獲得されたのが最後。<br>"
						+ "第５問　８人です<br>"
				)			
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "NBAにいる八村塁の所属しているチーム名は？");
		question1.addItem(0, "ワシントン・ウィザーズ");
		question1.addItem(1, "ニューヨーク・ニックス");
		question1.addItem(2, "ロサンゼルス・レイカーズ");
		question1.addItem(3, "ボストンセル・ティックス");
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
		
		Question question4 = new Question("q4", "２０２２年の日本プロ野球界において、"
				+ "一番最後に三冠王のタイトルを獲得した選手は誰？");
		question4.addItem(0, "松中信彦");
		question4.addItem(1, "落合博満");
		question4.addItem(2, "ランディ・バース");
		question4.addItem(3, "王貞治");
		list.add(question4);
		
		Question question5 = new Question("q5", "shinbiのjavaプログラミング科3期のメンバーは何人？");
		question5.addItem(0, "８人");
		question5.addItem(1, "６人");
		question5.addItem(2, "１１人");
		question5.addItem(3, "９人");
		list.add(question5);
		
		return list;
	}
		
	public static Hantei5 createHantei() {
		Hantei5 hantei = new Hantei5();
		
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