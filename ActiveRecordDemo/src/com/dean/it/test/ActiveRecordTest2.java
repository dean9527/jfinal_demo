package com.dean.it.test;

import com.dean.it.model.Student;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.jfinal.plugin.druid.DruidPlugin;

public class ActiveRecordTest2 {
	public static void main(String[] args){
		//获取配置的数据库连接参数
		PropKit.use("jdbc.properties");
		String JDBC_URL = PropKit.get("jdbcUrl2");
		String USERNAME = PropKit.get("userName2");
		String PASSWORD = PropKit.get("password2");
		String DRIVERCLASS = PropKit.get("driverClass2");
		//获取数据库数据源
		DruidPlugin dp = new DruidPlugin(JDBC_URL, USERNAME, PASSWORD);
		dp.setDriverClass(DRIVERCLASS);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		//设置oracle方言
		arp.setDialect(new OracleDialect());
		//配置oracle大小写不敏感
		arp.setContainerFactory(new CaseInsensitiveContainerFactory());
		//建立student表Student类的关联映射
		arp.addMapping("student", Student.class);
		dp.start();
		arp.start();
		//开始查询数据库表记录
		Record rec = Db.findById("student", 1);
		String name = rec.get("name");
		String password = rec.get("password");
		System.out.println("name: " + name +", password: "+ password);
	}
}
