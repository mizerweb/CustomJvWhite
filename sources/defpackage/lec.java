package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class lec extends SQLiteOpenHelper implements m35 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lec(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2) {
        super(context, str, cursorFactory, i);
        this.a = i2;
    }

    private final void b(SQLiteDatabase sQLiteDatabase) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void y(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.a) {
            case 0:
                Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", SdkMetricStatEvent.NAME_KEY}, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (!"sqlite_sequence".equals(string2)) {
                            String str = "DROP " + string + " IF EXISTS " + string2;
                            try {
                                sQLiteDatabase.execSQL(str);
                            } catch (SQLException e) {
                                lvb.l0("OVSADatabaseProvider", "Error executing " + str, e);
                            }
                        }
                        break;
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                cursorQuery.close();
                return;
            default:
                Cursor cursorQuery2 = sQLiteDatabase.query("sqlite_master", new String[]{"type", SdkMetricStatEvent.NAME_KEY}, null, null, null, null, null);
                while (cursorQuery2.moveToNext()) {
                    try {
                        String string3 = cursorQuery2.getString(0);
                        String string4 = cursorQuery2.getString(1);
                        if (!"sqlite_sequence".equals(string4)) {
                            String str2 = "DROP " + string3 + " IF EXISTS " + string4;
                            try {
                                sQLiteDatabase.execSQL(str2);
                            } catch (SQLException e2) {
                                lvb.l0("SADatabaseProvider", "Error executing " + str2, e2);
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        if (cursorQuery2 == null) {
                            throw th3;
                        }
                        try {
                            cursorQuery2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                cursorQuery2.close();
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }
}
