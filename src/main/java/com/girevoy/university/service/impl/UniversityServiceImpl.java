package com.girevoy.university.service.impl;

import com.girevoy.university.dao.UniversityDAO;
import com.girevoy.university.model.entity.University;
import com.girevoy.university.service.UniversityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl extends AbstractServiceImpl<University> implements UniversityService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityServiceImpl.class);

    public UniversityServiceImpl(UniversityDAO universityDAO) {
        super(universityDAO);
    }

    @Override
    protected Logger getLogger() {
        return LOGGER;
    }

    @Override
    protected String getObjectSimpleName() {
        return "University";
    }

    @Override
    public University findByID(long id) {
        return getDao().findByID(id).orElse(new University());
    }
}
