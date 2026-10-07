package defpackage;

import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gpl {
    public static final Uri b(Cursor cursor, int i) {
        Object poeVar;
        try {
            poeVar = cursor.getString(i);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String str = (String) poeVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            if (rx8.x(str)) {
                return l21.m(sb8.L(str));
            }
            return null;
        } catch (Throwable th2) {
            gm0.V("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            return null;
        }
    }

    public abstract void a(Rect rect, Rect rect2);
}
