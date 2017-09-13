package patrickstar.com.sqlitetest.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 * 插入数据的数据库
 */

public class InsertListener implements View.OnClickListener {
    private Context context;
    private String tablename;
    private String dbname;
    private ContentValues contentValues;
 /*   public InsertListener(Context context1,String tablename1,String dbname1,ContentValues contentValues1)
    {
        context=context1;
        tablename=tablename1;
        dbname=dbname1;
        contentValues=contentValues1;
    }*/
    public InsertListener(Context context1)
    {
        context=context1;
    }
    @Override
    public void onClick(View view) {
        MySqlite dbHelper = new MySqlite(context,"stu_db1",null,1);
//得到一个可写的数据库
        SQLiteDatabase db =dbHelper.getWritableDatabase();
  /*      String sql = "create table stu_table(id int,sname varchar(20),sage int,ssex varchar(10))";
//输出创建数据库的日志信息
//execSQL函数用于执行SQL语句
        db.execSQL(sql);*/


//生成ContentValues对象 //key:列名，value:想插入的值
        ContentValues cv = new ContentValues();
//往ContentValues对象存放数据，键-值对模式
        cv.put("id", 1);
        cv.put("sname", "xiaoming");
        cv.put("sage", 21);
        cv.put("ssex", "male");
//调用insert方法，将数据插入数据库
        db.insert("stu_table", null, cv);
//关闭数据库
        db.close();
    }
}

