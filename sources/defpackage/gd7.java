package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd7 implements vf7 {
    public final /* synthetic */ fbh a;

    public /* synthetic */ gd7(fbh fbhVar) {
        this.a = fbhVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.y(new nd7(sQLiteQuery, 0));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
