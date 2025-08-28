package jp.co.sss.lms.form;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 勤怠情報確認（受講生一覧）用のフォームクラス
 */
@Data
public class UserSearchForm {
	
    private String courseName;
    private String companyName;
    private String userName;
    private List<Integer> placeIdList;
    private String role;
    private Integer leaveFlg;
    private Date closeTime;

}
