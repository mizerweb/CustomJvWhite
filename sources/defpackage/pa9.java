package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class pa9 extends ya9 implements rrh {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, np0.o, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public pa9(Executor executor, qg7 qg7Var, ContentResolver contentResolver) {
        super(executor, qg7Var);
        this.c = contentResolver;
    }

    @Override // defpackage.rrh
    public final boolean a(bne bneVar) {
        Rect rect = f;
        return oc9.Q(rect.width(), rect.height(), bneVar);
    }

    @Override // defpackage.ya9
    public final p76 d(v78 v78Var) {
        bne bneVar;
        Cursor cursorQuery;
        p76 p76VarF;
        int iC;
        Uri uri = v78Var.b;
        Uri uri2 = rki.a;
        String string = uri.toString();
        if ((!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) || (bneVar = v78Var.h) == null || (cursorQuery = this.c.query(uri, d, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (p76VarF = f(bneVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string2 = cursorQuery.getString(columnIndex);
                if (string2 != null) {
                    try {
                        iC = h21.c(new ExifInterface(string2).getAttributeInt("Orientation", 1));
                    } catch (IOException e2) {
                        if (pj6.a.h(6)) {
                            pj6.a.e(pa9.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string2), e2);
                        }
                        iC = 0;
                    }
                    p76VarF.c = iC;
                } else {
                    iC = 0;
                    p76VarF.c = iC;
                }
            }
            cursorQuery.close();
            return p76VarF;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // defpackage.ya9
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final p76 f(bne bneVar, long j) {
        int i;
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (oc9.Q(rect.width(), rect.height(), bneVar)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = oc9.Q(rect2.width(), rect2.height(), bneVar) ? 1 : 0;
        }
        if (i == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
