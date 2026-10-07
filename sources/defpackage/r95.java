package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class r95 implements m35 {
    public final lec a;

    public r95(lec lecVar) {
        this.a = lecVar;
    }

    @Override // defpackage.m35
    public final SQLiteDatabase getReadableDatabase() {
        return this.a.getReadableDatabase();
    }

    @Override // defpackage.m35
    public final SQLiteDatabase getWritableDatabase() {
        return this.a.getWritableDatabase();
    }
}
