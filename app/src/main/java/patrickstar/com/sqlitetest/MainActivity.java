package patrickstar.com.sqlitetest;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

import patrickstar.com.sqlitetest.Sqlite.CreateListener;
import patrickstar.com.sqlitetest.Sqlite.DeleteListener;
import patrickstar.com.sqlitetest.Sqlite.InsertListener;
import patrickstar.com.sqlitetest.Sqlite.ModifyListener;
import patrickstar.com.sqlitetest.Sqlite.QueryListener;
import patrickstar.com.sqlitetest.Sqlite.UpdateListener;

/**
 *
 *1、 如图当我们第一次点击create database的时候会弹出Toast消息，，再次点击的时候就不会出现了说明没有运行oncreate 数据库已经创建完成了。。。。
 *2、切换到DDMS，显示File Explorer窗口，找到/data/data/然后找到自己用的程序包的文件夹，打开databases，就看到sqlite数据库文件了，然后到处就可以了。步骤上面标注好了，1,2,3。
 * 这样就把sqlite数据库文件以文件的方式导出来了，然后使用sqlite界面管理工具如sqlite administrator、sqlite man或者firefox插件sqlite manager等打开就可以了
 * 3、不需要安装
 * 4、数据类型：
 * null  空值  ，varchar（）长度不可以超过4000，char长度不可以超过254，integer 整形，REAL 所有浮动的数值，
 * Text 文本，BLOB是数据块，以输入的数据格式进行存储，如何输入就如何存储，不改格式，date，time
 */
public class MainActivity extends Activity {
    private MySqlite dbHelper;
    private Button ButtonUpdate;
    private Button ButtonInsert;
    private Button ButtonDelete;
    private Button ButtonModify;
    private Button ButtonQuery;
    private Button ButtonCreate;
    private SQLiteDatabase sqldb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建数据库和创建表的语句
      /*  dbHelper = new MySqlite(this,"BookStore.db",null,1);
        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建或打开现有的数据库
               dbHelper.getWritableDatabase();//会自动创建表
            }
        });*/

        ButtonUpdate=(Button)findViewById(R.id.buttonupdate);
        ButtonInsert=(Button)findViewById(R.id.buttoninsert);
        ButtonModify=(Button)findViewById(R.id.buttonmodify);
        ButtonDelete=(Button)findViewById(R.id.buttondelete);
        ButtonQuery=(Button)findViewById(R.id.buttonquery);
        ButtonCreate=(Button)findViewById(R.id.create_database);

        setListener();

    }

    //为按钮注册监听的方法
    private void setListener()
    {
        ButtonUpdate.setOnClickListener(new UpdateListener(MainActivity.this));
        ButtonCreate.setOnClickListener(new CreateListener(MainActivity.this));

        ButtonInsert.setOnClickListener(new InsertListener(MainActivity.this));
        ButtonModify.setOnClickListener(new ModifyListener(MainActivity.this));
        ButtonQuery.setOnClickListener(new QueryListener(MainActivity.this));
        ButtonDelete.setOnClickListener(new DeleteListener(MainActivity.this));
    }

}
