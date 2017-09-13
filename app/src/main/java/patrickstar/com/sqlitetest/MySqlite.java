package patrickstar.com.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by ios16 on 17/9/11.
 */

public class MySqlite extends SQLiteOpenHelper {
/*    //建表语句
    public static final String CREATE_BOOK= "create table Book(" +
            //primary key 将id列设为主键    autoincrement表示id列是自增长的
            "id integer primary key autoincrement," +
            "author text," +
            "price real," +
            "name text)";
    private Context mContext;

    //构造方法：第一个参数Context，第二个参数数据库名，第三个参数cursor允许我们在查询数据的时候返回一个自定义的光标位置，一般传入的都是null，第四个参数表示目前库的版本号（用于对库进行升级）
    public  MySqlite(Context context, String name, SQLiteDatabase.CursorFactory factory , int version){
        super(context,name ,factory,version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //1、创建数据库的语句  创建数据库stu
        //SQLiteDatabase.openOrCreateDatabase("/data/data/databases/stu.db",null);


        //2、调用SQLiteDatabase中的execSQL（）执行建表语句。   执行增删改语句
        db.execSQL(CREATE_BOOK);
        //创建成功
        Toast.makeText(mContext, "Create succeeded", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            //这个方法是如果数据库已经创建了，就执行这个方法，而不执行OnCreate方法


    }*/
private static final String TAG = "TestSQLite";
    public static final int VERSION = 1;

    //必须要有构造函数
    public MySqlite(Context context, String name, SQLiteDatabase.CursorFactory factory,
                       int version) {
        super(context, name, factory, version);
    }

    // 当第一次创建数据库的时候，调用该方法
    public void onCreate(SQLiteDatabase db) {
       /* String sql = "create table stu_table(id int,sname varchar(20),sage int,ssex varchar(10))";
//输出创建数据库的日志信息
//execSQL函数用于执行SQL语句
        db.execSQL(sql);*/
    }

    //当更新数据库的时候执行该方法
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "create table stu_table(id int,sname varchar(20),sage int,ssex varchar(10))";
//输出创建数据库的日志信息
//execSQL函数用于执行SQL语句
        db.execSQL(sql);
//输出更新数据库的日志信息
    }

}
