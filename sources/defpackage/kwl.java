package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kwl {
    public static final String a(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        return sb.toString();
    }

    public static final void b(Throwable th) {
        throw new IllegalStateException("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th);
    }
}
