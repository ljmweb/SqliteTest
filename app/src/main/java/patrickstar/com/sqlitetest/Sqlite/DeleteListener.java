package patrickstar.com.sqlitetest.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 */

public class DeleteListener implements View.OnClickListener {
    private Context context;
    public DeleteListener(Context context1)
    {
        context=context1;
    }

    @Override
    public void onClick(View view) {
        MySqlite dbHelper = new MySqlite(context,"stu_db",null,1);
//得到一个可写的数据库
        SQLiteDatabase db =dbHelper.getReadableDatabase();
     /*   String whereClauses = "id=?";
        String [] whereArgs = {String.valueOf(2)};*/
//调用delete方法，删除数据
        db.delete("stu_db", null, null);
    }

}
