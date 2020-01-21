package com.sejong.hungryduck.data;

import com.sejong.hungryduck.model.Postings;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

	private static SampleData sampleDatas;
	private List<Postings> postings;

	public static SampleData getInstance() {
		if (sampleDatas == null) {
			sampleDatas = new SampleData();
		}
		return sampleDatas;
	}

	public Postings getListItems(int position) {
		return postings.get(position);
	}

	private SampleData() {
		postings = new ArrayList<>();
		Postings firstItem = new Postings();
		firstItem.setMainTitle("스토리, 세대를 잇다!");
		firstItem.setSecondTitle("스토리, 세대를 잇다!");
		firstItem.setEndDate("2016_12_30");
		firstItem.setHost("한국문화예술위원회");
		firstItem.setLimitingCondition("제한 없음");
		firstItem.setContents("세대간 서로의 삶을 이해할 수 있는 다양한 사건이나 문화, 생활 속에서 겪은 사연과 기록들을 바탕으로 작성" +
			" 사실 위주의 사건 나열이 아닌 사건에 대한 당시의 생각, 필자의 견해 등도 함께 작성" +
			" 집필자를 중심으로 윗세대의 삶, 아랫세대의 삶, 서로의 삶을 집필하는 것 모두 가능평전\n");
		firstItem.setWinnerPrize("최우수 1편 500만원\n" +
			"우수 2편 각100만원\n" +
			"장려 3편 각 50만원\n");
		firstItem.setReception("홈페이지 접수 : inmun360.culture.go.kr을 통한 접수");
		firstItem
			.setNotice("- 응모작에 대한 저작권은 응모자에게 있으며, 국내·외의 저작권, 초상권에 저촉되지 않은 순수한 창작품이어야 한다.\n" +
				"  - 한국문화예술위원회(이하 위원회)는 수상작에 한하여 저작자와 별도의 사용권한 협의 및 사용료 지불 없이 \n" +
				"    인문360° 관련 사업의 사업 및 홍보 목적 달성을 위하여 필요한 한도 내에서 발표, 게시, 배포, \n");
		firstItem.setContact("공모전 운영사무국 : 02-6395-3127 (평일 09:00 ~ 18:00)");
		this.postings.add(firstItem);

		Postings secondItem = new Postings();
		secondItem.setMainTitle("보안취약점 자동분석 아이디어 공모전");
		secondItem.setSecondTitle("보안취약점 자동분석 아이디어 공모전");
		secondItem.setEndDate("2017_01_22");
		secondItem.setStartDate("2017_01_22");
		secondItem.setHost("SW봉안국제공동연구센터");
		secondItem.setLimitingCondition("제한없음");
		secondItem.setContents("1. 보안 취약점 자동분석 기능 및 신규 취약점 분석에 관한 아이디어\n" +
			"2. IoTcube 플랫폼의 개선, 확대 아이디어\n" +
			"3. SW보안성 향상, 오픈소스 프로젝트 기여 사례 등 구체적인 활용 후기 등\n" +
			"* 형식 무제한, 참가자 제한 없음 (논문, 시나리오, 수기, 보고사, 제안서 등 어떤 형태의 문서도 가능)\n");
		secondItem.setWinnerPrize("- 대상 : 300만원, 컨퍼런스 발표\n" +
			"- 최우수상 : 200만원, 컨퍼런스 발표\n" +
			"- 우수상 : 100만원\n" +
			"- 아이디어 창의상 : 아이패드 미니2\n" +
			"- 아이디어 발굴상 : 아이패드 미니2\n" +
			"- 오픈소스 기여상 : IoTcube를 활용하여 오픈소스 커뮤니티에 기여한 사례를 대상으로 평가, 컨퍼런스 발표\n" +
			"※ 심사 기준에 충족되지 않을 경우 수상자가 선정되지 않을 수 있습니다.\n" +
			"※ 시상내역은 향후 변경될 수 있습니다.");
		secondItem.setReception("- 전자파일로 작성하여 이메일 접수 (iotcube@concert.or.kr)\n" +
			"- 보안취약점 자동분석 홈페이지(http://iotcube.korea.ac.kr/)에 접속하여 소프트웨어 소스 코드, 프로그램(바이너리), 장비 등의 보안 취약점을 테스트 하고 관련한 결과를 기록하여 이메일로 제출\n" +
			"- 제출시 파일 제목은 'CSSA2017_대표자1인성명'");
		secondItem.setNotice("Nothing");
		secondItem.setContact("한국침해사고대응팀협의회(CONCERT)사무국\n" +
			"- Tel : 02-3474-2490\n" +
			"- 홈페이지 : www.concert.or.kr");
		this.postings.add(secondItem);

		Postings thirdItem = new Postings();
		thirdItem.setMainTitle("2016 경북 스토리콘텐츠 공모전");
		thirdItem.setSecondTitle("2016 경북 스토리콘텐츠 공모전");
		thirdItem.setStartDate("2017_01_10");
		thirdItem.setEndDate("2017_01_10");
		thirdItem.setHost("경상북도문화콘텐츠진흥원");
		thirdItem.setLimitingCondition("제한없음");
		thirdItem.setContents("- 경북문화자원을 소재로 활동한 웹소설, 웹툰, 웹드라마 3개 분야\n" +
			" - 연재 및 콘텐츠화 가능한 순수 창작 스토리 공모");
		thirdItem.setWinnerPrize("＊대상\n" +
			"-일반 부문(1명) : 상금 1,000만원과 상패 (경상북도지사상 시상)\n" +
			"-학생 부문(1명) : 상금 300만원과 상패 (경상북도교육감상 시상)\n" +
			" \n" +
			"＊최우수상\n" +
			"-일반 부문(1명) : 상금 300만원과 상패\n" +
			"-학생 부문(1명) : 상금 150만원과 상패\n" +
			"\n" +
			"＊우수상 \n" +
			"-일반 부문(1명) : 상금 100만원과 상패\n" +
			"-학생 부문(1명) : 상금 100만원과 상패\n" +
			"\n" +
			"＊장려상 \n" +
			"-일반 부문(1명) : 상금 50만원과 상패\n" +
			"-학생 부문(1명) : 상금 50만원과 상패");
		thirdItem.setReception(
			"우편접수 : 대구시 동구 동대구로 441 영남타워 6층 영남일보 편집국 영남일보 부설 한국스토리텔링연구원 <2016 칠곡 역사·문화 스토리텔링 전국 공모전> 담당자 앞 (겉봉투에 <2016 칠곡 역사·문화 스토리텔링 전국 공모전 응모작>이라고 명시할 것)\n" +
				"∙ E-mail 접수 : story@yeongnam.com");
		thirdItem.setNotice(" 기발표된 작품(출판, 공연, 문학지 게재 등)이나 타 공모전 수상작품은 심사에서 제외\n" +
			"∙ 응모작은 반환되지 않으며, 외부기관에 중복 공모하여 당선된 원고이거나 국내외 기존 작품을 표절 또는 모방한 것이 객관적으로 밝혀질 경우에는 당선되었더라도 무효처리\n" +
			"∙ 입상된 작품이 대리작, 위작 등의 허위사실이 밝혀질 경우 입상은 무효처리 되며, 해당 작품의 수상 취소 및 상금이 환수되고, 법적인 모든 책임은 응모자에게 있음");
		thirdItem.setContact("영남일보 부설 한국스토리텔링연구원 053)757-5245, 5258");
		this.postings.add(thirdItem);

		Postings fourthItem = new Postings();
		fourthItem.setMainTitle("제3회 레진코믹스");
		fourthItem.setSecondTitle("제3회 레진코믹스");
		fourthItem.setEndDate("2017_02_28");
		fourthItem.setStartDate("2017_02_28");
		fourthItem.setHost("레진코믹스");
		fourthItem.setLimitingCondition("제한없음");
		fourthItem.setContents("- BL, 백합, 성인 등 모든 장르");
		fourthItem.setWinnerPrize("- 대상(1작품) : 상금 1억원, 글로벌 진출 기회, CLIP STUDIO PAINT EX\n" +
			"- 최우수상(1작품) : 상금 2천만원, 글로벌 진출 기회, CLIP STUDIO PAINT EX\n" +
			"- 우수상(10작품) : 상금 각 3백만원, 글로벌 진출 기회, CLIP STUDIO PAINT PRO\n" +
			"* 응모자 전원에게 CLIP STUDIO PAINT PRO 3개월 라이선스 제공");
		fourthItem.setReception("- 공모전 참가 신청서 작성 후 원고와 함께 이메일 접수\n" +
			"- 이메일 : contest@lezhin.");
		fourthItem.setNotice("- 스크롤 만화 최소 2화 이사잉라면 무조건 심사");
		fourthItem.setContact("- E-mail : contest_help@lezhin.com");
		this.postings.add(fourthItem);

		Postings fifthItem = new Postings();
		fifthItem.setMainTitle("서울백병원 개원 85주년 UCC 공모전");
		fifthItem.setSecondTitle("서울백병원 개원 85주년 UCC 공모전");
		fifthItem.setEndDate("2017_03_31");
		fifthItem.setStartDate("2017_03_31");
		fifthItem.setHost("서울백병원");
		fifthItem.setLimitingCondition("제한없음");
		fifthItem.setContents("- 서울백병원의 사랑, 감동, 희망을 주제로 다큐, CF, 드라마 등 형식에 상관없이 자유롭게 만들어주세요.\n" +
			"- avi, mp4, mov, wmv");
		fifthItem.setWinnerPrize("- 대상(1명) : 100만원\n" +
			"- 우수상(2명) : 50만원\n" +
			"- 장려상(5명) : 10만원");
		fifthItem.setReception("- 동영상 파일을 E-mail 전송 또는 Youtube에 업로드 후 URL 입력\n" +
			"* E-mail : seoulpaik85@paik.ac.");
		fifthItem.setNotice("1. 응모하는 모든 컨텐츠의 저작권(음원, 이미지)의 사용은 법적인 문제가 없어야 합니다.\n" +
			"2. 제출하신 컨텐츠와 당선작은 추후 편집하여 서울백병원 홍보용으로 활용 될 수 있으며, 저작권은 서울백병원에 있으며, 별도로 저작권 료는 지급하지 않습니다.\n" +
			"3. 본인이 제작한 영상이 아닐 경우 수상에서 제외될 수 있습니다.\n" +
			"4. 경품 증정을 위해 개인정보를 수집할 수 있습니다.");
		fifthItem.setContact("http://www.paik.ac.kr/seoul/");
		this.postings.add(fifthItem);
	}

}
