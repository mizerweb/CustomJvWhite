package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class r6m {
    public final Context a;

    public r6m(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA += a(file2);
            }
        }
        return jA;
    }
}
