package com.bottomline.projecttool;

import com.bottomline.projecttool.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends CrudRepository<Project,Long>{

    @Override
    Iterable<Project> findAllById(Iterable<Long> ids);
}
