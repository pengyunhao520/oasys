package cn.gson.oasys.model.dao.user;

import cn.gson.oasys.model.entity.user.Dept;
import cn.gson.oasys.model.entity.user.Unit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableArgumentResolver;

import java.util.List;


public interface UnitDao extends PagingAndSortingRepository<Unit,Long> {
    List<Unit> findById(Long id);


    @Query("select u.name from Unit u where u.id=:id")
    String findname(Long id);
}
