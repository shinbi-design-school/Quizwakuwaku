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
						+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
						+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
						+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
						+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
						+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中1点",
						"解説<br>"
								+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
								+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
								+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
								+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
								+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中2点",
						"解説<br>"
								+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
								+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
								+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
								+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
								+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中3点",
						"解説<br>"
								+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
								+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
								+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
								+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
								+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
								+ "でした。"
								
						),
				new Result(
						"5問中4点",
						"解説<br>"
								+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
								+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
								+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
								+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
								+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
								+ "でした。"
														
						),
				new Result(
						"5問中5点",
						"解説<br>"
								+ "第1問　フィナンシェは金融家やお金持ちの意味があり、金融街で働く人々にとって縁起のいいお菓子といわれています。美しい焼き色と形が金の延べ棒に似ているのが特徴です。<br>"
								+ "第2問　マシュマロは卵白を泡立ててメレンゲにし。砂糖と水で作ったシロップを戻したゼラチンと混ぜて、型に入れて固めてできます。<br>"
								+ "第3問　シュークリームの「シュー」は「chou」と表記するフランス語でキャベツという意味があります。焼きあがったシュークリームの皮の形やふっくらとした形体が野菜のキャベツに似ていることから名づけられました。<br>"
								+ "第4問　ティラミスはマスカルポーネチーズとコーヒーベースのスポンジ、ココアパウダーが織りなす、ちょっぴり大人向けのスイーツです。<br>"
								+ "第5問　チュロスなどは揚げることで生地から水蒸気が生地を押し上げ膨らみ、外に逃げ出します。星形の口金を使って生地を絞ることで、生地に凹凸ができ生地中の水蒸気が上手く外に出ることができ、爆発を防ぐ事ができます。<br>"
								+ "でした。"
								
								
						),
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "「金融家」や「お金持ち」を意味する美しい焼き色が特徴のお菓子はどれ？");
		question1.addItem(0, "フィナンシェ");
		question1.addItem(1, "マドレーヌ");
		question1.addItem(2, "バウムクーヘン");
		question1.addItem(3, "パウンドケーキ");
		list.add(question1);
		
		Question question2 = new Question("q2", "砂糖、卵白、ゼラチン、水あめが原料のお菓子はどれ？");
		question2.addItem(0, "マシュマロ");
		question2.addItem(1, "グミ");
		question2.addItem(2, "ゼリービーンズ");
		question2.addItem(3, "ガム");
		list.add(question2);
		
		Question question3 = new Question("q3", "シュークリームの「シュー」が意味するものはどれ？");
		question3.addItem(0, "キャベツ");
		question3.addItem(1, "レタス");
		question3.addItem(2, "綿");
		question3.addItem(3, "雲");
		list.add(question3);
		
		Question question4 = new Question("q4", "マスカルポーネチーズが使われているケーキはどれ？");
		question4.addItem(0, "ティラミス");
		question4.addItem(1, "スフレチーズケーキ");
		question4.addItem(2, "ミルクレープ");
		question4.addItem(3, "ザッハトルテ");
		list.add(question4);
		
		Question question5 = new Question("q5", "チュロスを作るときに星形口金が使われるが丸形口金で作るとどうなるか？");
		question5.addItem(0, "爆発する");
		question5.addItem(1, "食感が悪くなる");
		question5.addItem(2, "膨らみすぎる");
		question5.addItem(3, "中まで火が通らない");
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