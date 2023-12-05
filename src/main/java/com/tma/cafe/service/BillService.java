package com.tma.cafe.service;

import com.tma.cafe.POJO.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BillService {
    ResponseEntity<String> generateReport(Map<String,Object> requestMap);

    ResponseEntity<List<Bill>> getBills();

    ResponseEntity<byte[]> getPdf(Map<String,Object> requestMap);

    ResponseEntity<String> deleteBill(Integer id);
}
