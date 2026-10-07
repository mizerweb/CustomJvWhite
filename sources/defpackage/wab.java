package defpackage;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class wab {
    public final Context a;
    public volatile int b = 1;
    public final Object c = new Object();

    public wab(Context context) {
        this.a = context;
    }

    public final boolean a(vab vabVar) {
        if (this.b != 2) {
            try {
                System.loadLibrary(vabVar.a);
                return true;
            } catch (UnsatisfiedLinkError unused) {
                if (!b(vabVar)) {
                    return false;
                }
            }
        } else if (!b(vabVar)) {
            try {
                System.loadLibrary(vabVar.a);
                return true;
            } catch (UnsatisfiedLinkError unused2) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(vab vabVar) {
        if (this.b != 1) {
            gm0.Y(wab.class.getName(), "Early return in tryInitSoLoader cuz of soLoaderStatus != SoLoaderState.UNINITIALIZED");
        } else {
            synchronized (this.c) {
                if (this.b == 1) {
                    try {
                        try {
                            SoLoader.f(this.a, 0);
                            this.b = 2;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable unused) {
                        this.b = 3;
                    }
                }
            }
        }
        if (this.b != 2) {
            return false;
        }
        try {
            String str = vabVar.a;
            if (SoLoader.k) {
                SoLoader.l(0, str);
            } else {
                yab.m0(str);
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
