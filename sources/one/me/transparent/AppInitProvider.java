package one.me.transparent;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import defpackage.ao5;
import defpackage.lq4;
import defpackage.qn6;
import defpackage.qt;
import defpackage.rk9;
import defpackage.yab;
import defpackage.yn7;

/* JADX INFO: loaded from: classes.dex */
public final class AppInitProvider extends ContentProvider {
    public final String a = AppInitProvider.class.getName();
    public final qt b = new qt(0, this);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ao5 ao5Var = ao5.a;
        yab.i0(yn7.a, rk9.a, 0, new qn6(this, (lq4) null, 2), 2);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
