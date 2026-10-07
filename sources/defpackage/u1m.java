package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u1m {
    public static dqf a() {
        return w08.z;
    }

    public static final File b(Uri uri) {
        if (!cqk.d(uri.getScheme(), "file")) {
            c.o(zo5.l(uri, "Uri lacks 'file' scheme: "));
            return null;
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        c.o(zo5.l(uri, "Uri path is null: "));
        return null;
    }
}
