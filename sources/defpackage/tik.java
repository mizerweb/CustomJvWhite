package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.a;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class tik extends SQLiteOpenHelper {
    public final ldf a;

    public tik(Context context, ldf ldfVar) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.a = ldfVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws JSONException, IOException {
        if (i == 1 && i2 == 2 && sQLiteDatabase != null) {
            this.a.getClass();
            ArrayList<vjk> arrayList = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("uuid");
                int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(xr8.d(cursorRawQuery.getString(columnIndexOrThrow), z5h.F0(cursorRawQuery.getBlob(columnIndexOrThrow2))));
                }
                cursorRawQuery.close();
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                for (vjk vjkVar : arrayList) {
                    Map map = vjkVar.c;
                    String str = vjkVar.b;
                    String str2 = vjkVar.a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SdkMetricStatEvent.NAME_KEY, str);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    jSONObject.put("data", jSONObject2);
                    String strG1 = a.g1(jSONObject.toString(0).getBytes(pt2.a));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(SdkMetricStatEvent.NAME_KEY, str);
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry entry2 : map.entrySet()) {
                        jSONObject4.put((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    jSONObject3.put("data", jSONObject4);
                    jSONObject3.put("time", jCurrentTimeMillis);
                    String strW = nbh.w("\n                WHEN metrics_event = x'", strG1, "' THEN x'", a.g1(jSONObject3.toString(0).getBytes(pt2.a)), "'\n            ");
                    arrayList2.add(str2);
                    sb.append(strW);
                }
                sb.append("\n                END\n                WHERE uuid IN (" + ww3.z1(arrayList2, null, null, null, rl0.b, 31) + ")\n            ");
                sQLiteDatabase.execSQL(s5h.x0(sb.toString()));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(cursorRawQuery, th);
                    throw th2;
                }
            }
        }
    }
}
