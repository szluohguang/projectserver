package com.eagle.projectserver.model;

import java.util.List;

import com.eagle.projectserver.mapper.StaffStatusMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StaffStatusService<StaffStatusInfo> {

    @Autowired
    private StaffStatusMapper staffStatusMapper;
    public List<StaffStatus> getAllStaffStatus() {
        return staffStatusMapper.getAllStaffStatus();
    }
}