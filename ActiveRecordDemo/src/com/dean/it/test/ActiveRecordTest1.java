package com.dean.it.test;

import com.dean.it.model.News;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;

public class ActiveRecordTest1 {
	public static void main(String[] args){
		PropKit.use("jdbc.properties");
		String jdbcUrl = PropKit.get("jdbcUrl");
		String userName = PropKit.get("userName");
		String password = PropKit.get("password");
		String driverClass = PropKit.get("driverClass");
		DruidPlugin dp = new DruidPlugin(jdbcUrl, userName, password);
		dp.setDriverClass(driverClass);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		arp.setDialect(new MysqlDialect());
		arp.addMapping("news", News.class);
		dp.start();
		arp.start();
		Record rec = Db.findById("news", 1);
		String title = rec.get("title");
		String content = rec.get("content");
		System.out.println("title: " + title +", content: "+ content);
	}
}
