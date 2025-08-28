package jp.co.sss.lms.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.lms.dto.UserDetailDto;

/**
 * LMSユーザーマスタマッパー
 * 
 * @author 東京ITスクール
 */
@Mapper
public interface MLmsUserMapper {

	/**
	 * ユーザー基本情報取得
	 * 
	 * @param lmsUserId
	 * @param deleteFlg
	 * @return ユーザー基本情報DTO
	 */
	UserDetailDto getUserDetail(@Param("lmsUserId") Integer lmsUserId,
			@Param("deleteFlg") Short deleteFlg);
	
    /**
     * 勤怠情報確認（受講生一覧）取得
     * 
     * @param courseName
     * @param companyName
     * @param userName
     * @param placeIdList
     * @param role
     * @param leaveFlg
     * @param closeTime
     * @param deleteFlg
     * @return ユーザー基本情報リスト
     */
    List<UserDetailDto> selectUsersForAttendance(@Param("courseName")   String courseName,
            @Param("companyName") String companyName, @Param("userName") String userName,
            @Param("placeIdList") List<Integer> placeIdList, @Param("role") String role,
            @Param("leaveFlg") Integer leaveFlg, @Param("closeTime") Date closeTime,
            @Param("deleteFlg") Integer deleteFlg);

}
