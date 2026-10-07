package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class yfh extends rcg {
    @Override // defpackage.rcg
    public final String b() {
        throw null;
    }

    @Override // defpackage.rcg
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            Log.e("SoLoader", "Error loading library: " + str, e);
            return 0;
        }
    }

    @Override // defpackage.rcg
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + kfh.getClassLoaderLdLoadLibrary() + "]";
    }
}
