package DailyTask1.app.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DailyTask1.app.Model.ReportData;
import DailyTask1.app.Repository.ReportRepository;
import DailyTask1.app.Service.ExcelGenerator;
import DailyTask1.app.Service.ReportService;


@RestController
@RequestMapping("/api")
public class ReportController {
//	 @Autowired
//	    private ReportService reportService;
	 
	 @Autowired
	 private ReportRepository reportrepo;

	 @GetMapping("/export")
	    public ResponseEntity<InputStreamResource> exportUsersToExcel() throws IOException {
	    	  List<ReportData> data=  reportrepo.findAll();


		    ByteArrayInputStream in = ExcelGenerator.usersToExcel(data);

		   
		    HttpHeaders headers = new HttpHeaders();
		    headers.add("Content-Disposition", "attachment; filename=ReportData.xlsx");

		    return ResponseEntity
		            .ok()
		            .headers(headers)
		            .body(new InputStreamResource(in));
		
	 }
	    }







