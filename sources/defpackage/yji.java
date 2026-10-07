package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yji implements hfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ uxe b;

    public /* synthetic */ yji(uxe uxeVar, int i) {
        this.a = i;
        this.b = uxeVar;
    }

    @Override // defpackage.hfh
    public final Object a() {
        int i = this.a;
        uxe uxeVar = this.b;
        switch (i) {
            case 0:
                uxeVar.getClass();
                int i2 = dt3.e;
                ljf ljfVar = new ljf(9);
                ljfVar.c = null;
                ljfVar.d = new ArrayList();
                ljfVar.e = null;
                ljfVar.b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseL = uxeVar.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    dt3 dt3Var = (dt3) uxe.W(sQLiteDatabaseL.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new oo(uxeVar, map, ljfVar, 26));
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return dt3Var;
                } finally {
                    sQLiteDatabaseL.endTransaction();
                }
            default:
                long jI = uxeVar.b.i() - uxeVar.d.d;
                SQLiteDatabase sQLiteDatabaseL2 = uxeVar.l();
                sQLiteDatabaseL2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jI)};
                    Cursor cursorRawQuery = sQLiteDatabaseL2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            uxeVar.I(cursorRawQuery.getInt(0), he9.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseL2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseL2.setTransactionSuccessful();
                    sQLiteDatabaseL2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseL2.endTransaction();
                    throw th2;
                }
        }
    }
}
