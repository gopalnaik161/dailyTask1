package DailyTask1.app.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DailyTask1.app.Model.ReportData;

@Repository
public class ReportRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ReportData> findAll() {
	
    	
    	String sql = "SELECT configuration.System_Code , configuration.system_name , screenconfig.screen_code ,screenconfig.Screen_Name ,objects.object_code , \r\n"
    			+ "objects.Object_Name , objects.Object_Type ,objects.path  ,setupvalue.SetUpValue_Desc \r\n"
    			+ "FROM configuration  ,screenconfig , objects , setupvalue WHERE configuration.System_Code = 'Aceapplication' AND \r\n"
    			+ "setupvalue.SetupValue_Val_Cd = objects.Object_Type AND\r\n"
    			+ "setupvalue.SetupValue_Type_Cd = 'OBJECTS-TYP-CD' AND screenconfig.System_code = configuration.System_Code AND screenconfig.screen_code=objects.screen_code;\r\n"
    			+ "";
        List<ReportData> list = jdbcTemplate.query(sql, (rs, rowNum) -> new ReportData( rs.getString("System_Code"),  rs.getString("system_name"),rs.getString("screen_code"),rs.getString("Screen_Name"),rs.getString("object_code"),rs.getString("Object_Name"),rs.getString("Object_Type"),rs.getString("SetUpValue_Desc"),rs.getString("path")));
        return list;
    }



	
}