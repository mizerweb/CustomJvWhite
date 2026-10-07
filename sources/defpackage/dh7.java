package defpackage;

import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class dh7 extends gh7 {
    public static final dh7 c = new dh7("\n              _size > 0\n              AND\n              (\n                media_type = 1\n                OR\n                media_type = 3\n              )\n            ");
    public static final Uri d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;

    static {
        Uri contentUri;
        if (Build.VERSION.SDK_INT >= 29) {
            contentUri = MediaStore.Files.getContentUri("external");
            if (contentUri == null) {
                ore.p("no content uri for MediaStore.Files");
                return;
            }
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        d = contentUri;
        e = "_id";
        f = "bucket_id";
        g = "bucket_display_name";
        h = "_data";
        i = "date_modified";
        j = "mime_type";
        k = "orientation";
        l = "duration";
        m = "media_type";
        n = "unknown";
    }

    @Override // defpackage.gh7
    public final String a() {
        return g;
    }

    @Override // defpackage.gh7
    public final String b() {
        return f;
    }

    @Override // defpackage.gh7
    public final String c() {
        return h;
    }

    @Override // defpackage.gh7
    public final String d() {
        return i;
    }

    @Override // defpackage.gh7
    public final String e() {
        return l;
    }

    @Override // defpackage.gh7
    public final String f() {
        return e;
    }

    @Override // defpackage.gh7
    public final String g() {
        return m;
    }

    @Override // defpackage.gh7
    public final String h() {
        return j;
    }

    @Override // defpackage.gh7
    public final String i() {
        return k;
    }

    @Override // defpackage.gh7
    public final Uri j() {
        return d;
    }

    @Override // defpackage.gh7
    public final String k() {
        return n;
    }
}
