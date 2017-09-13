package patrickstar.com.sqlitetest.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import patrickstar.com.sqlitetest.MySqlite;

/**
 * Created by ios16 on 17/9/12.
 */

public class CreateListener implements View.OnClickListener {
    private Context context;
    public CreateListener(Context context1)
    {
        context=context1;
    }
    @Override
    public void onClick(View view) {
// 数据库版本的更新,由原来的1变为2
        MySqlite dbHelper = new MySqlite(context,"stu_db1",null,1);
        SQLiteDatabase db =dbHelper.getWritableDatabase();
    }
}
