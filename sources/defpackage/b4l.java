package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class b4l {
    private final vqk a = new vqk();
    private final String b;
    private volatile Logger c;

    public b4l(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
