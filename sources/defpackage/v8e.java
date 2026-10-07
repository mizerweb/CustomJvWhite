package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v8e implements Runnable {
    public final m72 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ y8e c;

    public v8e(y8e y8eVar, m72 m72Var) {
        this.c = y8eVar;
        this.a = m72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qsb qsbVar;
        String strConcat = "OkHttp ".concat(this.c.b.a.h());
        y8e y8eVar = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            y8eVar.f.i();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.A(y8eVar, y8eVar.h());
                        qsbVar = y8eVar.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            i2d i2dVar = i2d.a;
                            i2d i2dVar2 = i2d.a;
                            String strConcat2 = "Callback failure for ".concat(y8e.a(y8eVar));
                            i2dVar2.getClass();
                            i2d.i(4, strConcat2, e);
                        } else {
                            this.a.r(y8eVar, e);
                        }
                        qsbVar = y8eVar.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        y8eVar.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            gm0.b(iOException, th);
                            this.a.r(y8eVar, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                qsbVar.a.s(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                y8eVar.a.a.s(this);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
