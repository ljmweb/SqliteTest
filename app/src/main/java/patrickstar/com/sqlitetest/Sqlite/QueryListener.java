package patrickstar.com.sqlitetest.Sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 * 查询数据
 */

public class QueryListener implements View.OnClickListener {
    private Context context;
    public QueryListener(Context context1)
    {
        context=context1;
    }
    @Override
    public void onClick(View v) {

        MySqlite dbHelper = new MySqlite(context,"stu_db1",null,1);
//得到一个可写的数据库
        SQLiteDatabase db =dbHelper.getReadableDatabase();//
//参数1：表名
//参数2：要想显示的列
//参数3：where子句
//参数4：where子句对应的条件值
//参数5：分组方式
//参数6：having条件
//参数7：排序方式
        Cursor cursor = db.query("stu_table", new String[]{"id","sname","sage","ssex"}, "id=?", new String[]{"1"}, null, null, null);
        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("sname"));
            String age = cursor.getString(cursor.getColumnIndex("sage"));
            String sex = cursor.getString(cursor.getColumnIndex("ssex"));
            Toast.makeText(context,"query------->" + "姓名："+name+" "+"年龄："+age+" "+"性别："+sex,Toast.LENGTH_LONG);
        }
//关闭数据库
        db.close();
    }
}
