package DailyTask1.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DailyTask1.app.Model.ReportData;
import DailyTask1.app.Repository.ReportRepository;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public List<ReportData> findAll() {
        return reportRepository.findAll();
    }

}

