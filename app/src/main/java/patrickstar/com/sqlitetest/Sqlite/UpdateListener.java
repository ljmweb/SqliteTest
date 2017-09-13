package patrickstar.com.sqlitetest.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 * 更新数据库版本……
 */
public class UpdateListener implements View.OnClickListener {
    private Context context;
    public UpdateListener(Context context1)
    {
        context=context1;
    }
    @Override
    public void onClick(View view) {
// 数据库版本的更新,由原来的1变为2
        MySqlite dbHelper = new MySqlite(context,"stu_db",null,2);
        SQLiteDatabase db =dbHelper.getReadableDatabase();
    }
}
