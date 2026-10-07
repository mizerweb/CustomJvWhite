package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dr6 {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = dr6.class.getName();

    public dr6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    public static final void a(dr6 dr6Var, File file, String str) {
        b79 b79Var;
        String absolutePath;
        String absolutePath2;
        String absolutePath3 = file.getAbsolutePath();
        c79 c79VarW = yab.w();
        Context context = dr6Var.a;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null && (absolutePath2 = externalFilesDir.getAbsolutePath()) != null) {
            c79VarW.add(absolutePath2);
        }
        c79VarW.add(context.getFilesDir().getAbsolutePath());
        c79VarW.add(context.getCacheDir().getAbsolutePath());
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null && (absolutePath = externalCacheDir.getAbsolutePath()) != null) {
            c79VarW.add(absolutePath);
        }
        c79 c79VarJ = yab.j(c79VarW);
        if (c79VarJ == null || !c79VarJ.isEmpty()) {
            ListIterator listIterator = c79VarJ.listIterator(0);
            do {
                b79Var = (b79) listIterator;
                if (b79Var.hasNext()) {
                }
            } while (!z5h.K0(absolutePath3, (String) b79Var.next(), false));
            je9 je9Var = je9.f;
            ContentValues contentValues = new ContentValues();
            String name = file.getName();
            int iZ0 = r5h.Z0(".", name, 6);
            if (iZ0 != -1) {
                name = name.substring(0, iZ0);
            }
            contentValues.put("title", name);
            contentValues.put("_display_name", file.getName());
            contentValues.put("mime_type", str);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = dr6Var.a.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                String str2 = dr6Var.f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("MediaStore insert returned null for ", file.getName()), null);
                    return;
                }
                return;
            }
            try {
                OutputStream outputStreamOpenOutputStream = dr6Var.a.getContentResolver().openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    String str3 = dr6Var.f;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str3, "openOutputStream returned null for " + uriInsert, null);
                    }
                    dr6Var.a.getContentResolver().delete(uriInsert, null, null);
                    return;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        egl.a(fileInputStream, outputStreamOpenOutputStream);
                        fileInputStream.close();
                        outputStreamOpenOutputStream.close();
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        try {
                            dr6Var.a.getContentResolver().update(uriInsert, contentValues, null, null);
                            return;
                        } catch (Throwable th) {
                            gm0.V(dr6Var.f, "Failed to clear IS_PENDING", th);
                            dr6Var.a.getContentResolver().delete(uriInsert, null, null);
                            return;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            rx8.n(fileInputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        rx8.n(outputStreamOpenOutputStream, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                gm0.V(dr6Var.f, "copyToMediaStore fail!", th6);
                dr6Var.a.getContentResolver().delete(uriInsert, null, null);
                return;
            }
        }
        MediaScannerConnection.scanFile(dr6Var.a, new String[]{file.getAbsolutePath()}, new String[]{str}, null);
    }

    public final void b(File file) {
        try {
            long jG = ((g5d) ((gjf) this.d.getValue())).g();
            long length = file.length();
            if (length < 0) {
                length = 0;
            }
            yab.i0((ite) this.e.getValue(), ((n0c) ((xhh) this.c.getValue())).b(), 0, new wo0(file, jG < length / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, this, (lq4) null), 2);
        } catch (Throwable th) {
            gm0.V(this.f, "notifyWithForegroundCheckAndSize fail!", new cr6(th));
        }
    }
}
