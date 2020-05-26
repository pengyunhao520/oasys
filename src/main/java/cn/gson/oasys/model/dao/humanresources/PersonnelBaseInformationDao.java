package cn.gson.oasys.model.dao.humanresources;

import cn.gson.oasys.model.entity.humanresources.PersonnelBaseInformation;
import cn.gson.oasys.model.entity.user.Unit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 * @author Administrator
 * 基本信息
 * 继承PagingAndSortingRepository，已得到分页和排序功能
 */
public interface PersonnelBaseInformationDao extends PagingAndSortingRepository<PersonnelBaseInformation,Long> {
    List<PersonnelBaseInformation> findById(Long id);

    @Query("select u.name from Unit u where u.id=:id")
    String findname(Long id);
}
