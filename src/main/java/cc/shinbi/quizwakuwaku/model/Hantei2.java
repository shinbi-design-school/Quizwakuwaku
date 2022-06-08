package cc.shinbi.quizwakuwaku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hantei2 {

	private List<Result> results;
	private List<Question> questions;
	
	private Hantei2() {
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
						"5問中0点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中1点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中2点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中3点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
						
						),
				new Result(
						"5問中4点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
														
						),
				new Result(
						"5問中5点",
						"解説<br>"
						+ "第1問　映画のタイトルは「劇場版　鬼滅の刃無限列車編」国内興行収入400億円を超えて歴代1位<br>"
						+ "第2問　トニートニー・チョッパー：ヒトヒトの実を食べて人間の能力を得た青っ鼻のトナカイ<br>"
						+ "第3問　「俺は高校生探偵、工藤新一。幼馴染で同級生の毛利蘭と遊園地へ遊びに行って、黒ずくめの男の怪しげな取引現場を目撃した。・・・」<br>"
						+ "第4問　謎の生物は暗殺教室のE組の担任であり、暗殺のターゲット殺せんせー<br>"
						+ "第5問　進撃の巨人はマガジン作品<br>"
						+ "でした。"
								
						),
		};
		
		List<Result> list = Arrays.asList(results);
		return list;
	}
	
	
		
	
	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();
		
		Question question1 = new Question("q1", "2021年に国内興行収入が歴代1位になった映画のタイトルは劇場版　鬼滅の刃　何編？");
		question1.addItem(0, "無限列車編");
		question1.addItem(1, "兄妹の絆編");
		question1.addItem(2, "那田蜘蛛山編");
		question1.addItem(3, "遊郭編");
		list.add(question1);
		
		Question question2 = new Question("q2", "大人気漫画「ONE PIECE」に出てくる麦わらの一味の中で動物の姿をしたキャラクターは誰？");
		question2.addItem(0, "トニートニー・チョッパー");
		question2.addItem(1, "モンキー・D・ルフィ");
		question2.addItem(2, "ロロノア・ゾロ");
		question2.addItem(3, "ナミ");
		list.add(question2);
		
		Question question3 = new Question("q3", "「体は子供、頭脳は大人」でお馴染みの人気漫画の名前は？");
		question3.addItem(0, "名探偵コナン");
		question3.addItem(1, "ドラゴンボール");
		question3.addItem(2, "古見さんは、コミュ症です。");
		question3.addItem(3, "小林さんちのメイドラゴン");
		list.add(question3);
		
		Question question4 = new Question("q4", "マッハ20で移動して月の7割を破壊したタコのような姿をした謎の生物が出てくる漫画はどれ？");
		question4.addItem(0, "暗殺教室");
		question4.addItem(1, "HUNTER×HUNTER");
		question4.addItem(2, "チェンソーマン");
		question4.addItem(3, "NARUTO");
		list.add(question4);
		
		Question question5 = new Question("q5", "この中でジャンプ作品ではないものはどれ？");
		question5.addItem(0, "進撃の巨人");
		question5.addItem(1, "食戟のソーマ");
		question5.addItem(2, "僕のヒーローアカデミア");
		question5.addItem(3, "SPY×FAMILY");
		list.add(question5);
		
		return list;
	}
		
	public static Hantei2 createHantei() {
		Hantei2 hantei = new Hantei2();
		
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