package patrickstar.com.sqlitetest.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 */

public class ModifyListener implements View.OnClickListener {
    private Context context;
    public ModifyListener(Context context1)
    {
        context=context1;
    }

    @Override
    public void onClick(View view) {
        MySqlite dbHelper = new MySqlite(context,"stu_db",null,1);
//得到一个可写的数据库
        SQLiteDatabase db =dbHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("sage", "23");
//where 子句 "?"是占位符号，对应后面的"1",
        String whereClause="id=?";
        String [] whereArgs = {String.valueOf(1)};
//参数1 是要更新的表名
//参数2 是一个ContentValeus对象
//参数3 是where子句
        db.update("stu_table", cv, whereClause, whereArgs);
    }
}
