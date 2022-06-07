package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hantei4 {

	private List<Result> results;					//　resultsと名付けたリストを宣言
	private List<Question> questions;				//　questionsと名付けたリストを宣言
	
	private Hantei4() {
		this.results = new ArrayList<Result>();			//　resultsと名付けたリストを用意する
		this.questions = new ArrayList<Question>();		//　questionsと名付けたリストを用意する
	}
	
	public List<Result> getResults() {					//　resultsリストの中の情報をゲットするためのメソッドを用意しておく
		return results;									//　（中の情報はまだ空っぽなのでこの後のメソッドで用意する）
	}
	
	public List<Question> getQuestions() {				//　questionsリストの中の情報をゲットするためのメソッドを用意しておく
		return questions;								//　（中の情報はまだ空っぽなのでこの後のメソッドで用意する）
	}
	
	public void shuffle() {							//　シャッフルするためのメソッドを用意しておく
		for(Question question : this.questions) {		//　questionsリストの中の情報がある限りquestion（選択肢）を・・・
			question.shuffle();							//　シャッフルする
		}
		//Collections.shuffle(this.questions);　　　　　そのあとでquestions(問題文)もシャッフルする（今は混ぜたくないのでコメントオフにして混ぜていない）
	}
	
	private static List<Result> getResultList() {		//　一番最初に用意したresultsリストの中に情報を入れるためのメソッドを用意する
		Result[] results = {							//　まずメソッドの中でresultsと名付けた配列を準備して
				new Result(								//　Resultオブジェクトをひとつずつ配列に入れていく（ここでは計６個）
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
		
		List<Result> list = Arrays.asList(results);				//  ６個のResultを持ったresults配列の情報をlistと名付けたリストに入れて・・・
		return list;												//	 その値をgetResultList()メソッドが使われたときに返す
	}
	
	
		
	
	private static List<Question> getQuestionList() {			//　こっちも一番最初に用意したquestionsリストの中に情報を入れるためのメソッドを用意する
		List<Question> list = new ArrayList<Question>();		//　listと名付けたリストを用意して・・・
		
		Question question1 = new Question("q1", "読売ジャイアンツが本拠地にしている球場はどこでしょう？");
		question1.addItem(0, "東京ドーム");
		question1.addItem(1, "神宮球場");
		question1.addItem(2, "札幌ドーム");
		question1.addItem(3, "甲子園球場");
		list.add(question1);						//	問題文と選択肢を持ったquestionの情報を、listの中に加えていく（１つめ）
		
		Question question2 = new Question("q2", "野球のアウトはいくつ取れば攻守交替になる？");
		question2.addItem(0, "３つ");
		question2.addItem(1, "２つ");
		question2.addItem(2, "５つ");
		question2.addItem(3, "１つ");
		list.add(question2);						//	問題文と選択肢を持ったquestionの情報を、listの中に加えていく（２つめ）
		
		Question question3 = new Question("q3", "ボールを打つ人のことを何といいますか？");
		question3.addItem(0, "バッター");
		question3.addItem(1, "ヒッター");
		question3.addItem(2, "ブレイカー");
		question3.addItem(3, "アタッカー");
		list.add(question3);						//	問題文と選択肢を持ったquestionの情報を、listの中に加えていく（３つめ）
		
		Question question4 = new Question("q4", "ボールを投げる人のことを何といいますか？");
		question4.addItem(0, "ピッチャー");
		question4.addItem(1, "スローワー");
		question4.addItem(2, "ボーラー");
		question4.addItem(3, "プレイヤー");
		list.add(question4);						//	問題文と選択肢を持ったquestionの情報を、listの中に加えていく（４つめ）
		
		Question question5 = new Question("q5", "大谷翔平選手がエンゼルスに所属している時の背番号は？");
		question5.addItem(0, "１７番");
		question5.addItem(1, "２０番");
		question5.addItem(2, "５番");
		question5.addItem(3, "１８番");
		list.add(question5);						//	問題文と選択肢を持ったquestionの情報を、listの中に加えていく（５つめ）
		
		return list;								//	 そのquestionたちの情報をgetQuestionList()メソッドが使われたときに返す
	}
		
	public static Hantei4 createHantei() {			//	判定結果と問題文と選択肢の全ての情報を用意するためのcreateHantei()メソッド。
		Hantei4 hantei = new Hantei4();			//　hanteiと名付けたオブジェクトを生み出す。（resultsとquestionsのリストをすでに持ってる）
		
		List<Result> results = getResultList();	//	さっき用意したgetResultList()を使ってresultsリストの中に情報を入れる
		hantei.getResults().addAll(results);		//	resultsリストの全ての情報をgetResults()メソッドに加えて、それをhanteiの中に入れる
		
		List<Question> questions = getQuestionList();	//	さっき用意したgetQuestionList()を使ってquestionsリストの中に情報を入れる
		hantei.getQuestions().addAll(questions);		//	questionsリストの全ての情報をgetQuestions()メソッドに加えて、それをhanteiの中に入れる
		
		hantei.shuffle();				//	全部のResultと全部のQuestionの情報を持ったhanteiをシャッフルして・・・
		return hantei;					//　その情報をこのcreateHantei()メソッドが使われるときに返す
	}
	
	
	
	public Result check(List<Integer> answers) {		//	プレイヤーの正解数によってどのResultを表示させるかをチェックするメソッドを用意しておく
														//（getResultList()の中に書いたresults配列の０、１、２、３、４、５のどれを表示させるか）
		int ans = 0;									//	正解数を持たせるためのansと名付けた変数を用意。値は０を持たせる。
		for(int i = 0; i < answers.size(); i++) {		//	ResultServletの中で使われているanswersの中の情報がある限り・・・
			if(answers.get(i) == 0) {					//	そのanswersの値が０であるかどうかをひとつひとつ調べていって・・・
				ans++;									//	０だったらその都度ansの値を１ずつ増やしていって・・・
			}											//	
		}
		return this.results.get(ans);				//	results配列はgetResultList()の中でリストに変わっているのでget(ans)で表示させる文を取り出す
	}												
	
	public static Integer checkNum(List<Integer> answers) {	//	プレイヤーの正解数を知るためのメソッドを用意しておく
		int ans = 0;									//	正解数を持たせるためのansと名付けた変数を用意。値は０を持たせる。
		for(int i = 0; i < answers.size(); i++) {		//	ResultServletの中で使われているanswersの中の情報がある限り・・・
			if(answers.get(i) == 0) {					//	そのanswersの値が０であるかどうかをひとつひとつ調べていって・・・
				ans++;									//	０だったらその都度ansの値を１ずつ増やしていって・・・
			}
		}
		return ans;										//	その正解数をこのcheckNum()メソッドが使われたときに返す
	}
}