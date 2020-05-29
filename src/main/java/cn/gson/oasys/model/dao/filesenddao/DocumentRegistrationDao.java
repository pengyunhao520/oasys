package cn.gson.oasys.model.dao.filesenddao;

import cn.gson.oasys.model.entity.file.FilePath;
import cn.gson.oasys.model.entity.filesenddao.DocumentRegistration;
import cn.gson.oasys.model.entity.humanresources.PersonnelBaseInformation;
import cn.gson.oasys.model.entity.process.ProcessList;
import cn.gson.oasys.model.entity.system.SystemTypeList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.util.List;

public interface DocumentRegistrationDao extends PagingAndSortingRepository<DocumentRegistration,Long> {
    //List<DocumentRegistration> findById(Long id);

    DocumentRegistration findByProidl(Long proid);
    //List<DocumentRegistration> findByProidl(Long proid);

    List<DocumentRegistration> findByProId(ProcessList pro);

    List<DocumentRegistration> findByApprover(String approver);

   /* @Query("select u.name from DocumentRegistration  where u.id=:id")
    String findname(Long id);*/

}
