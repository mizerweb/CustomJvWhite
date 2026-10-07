package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class poc {
    public static final String b;
    public final Context a;

    static {
        String str = File.separator;
        b = nbh.v(str, "copy", str, "media");
    }

    public poc(Context context) {
        this.a = context;
    }

    public final String a() {
        String strO = zo5.o(this.a.getCacheDir().getPath(), b);
        try {
            File file = new File(strO);
            if (file.exists()) {
                return strO;
            }
            file.mkdirs();
            return strO;
        } catch (IOException e) {
            gm0.X("PathHelper", e, qv1.l("Failed to create dir=", strO, " due to: ", e.getMessage()), new Object[0]);
            return strO;
        }
    }
}
