package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class st3 implements Closeable {
    public static final int d = 1;
    private final AtomicBoolean a = new AtomicBoolean();
    private final String b;
    private final fs3.a c;

    /* JADX INFO: loaded from: classes.dex */
    public static class a {
        private final fs3 a;

        public a(fs3 fs3Var) {
            this.a = fs3Var;
        }

        public st3 a(Object obj, int i, Runnable runnable) {
            return new st3(obj, i, this.a, runnable, f6m.f());
        }
    }

    public st3(Object obj, final int i, fs3 fs3Var, final Runnable runnable, final s5m s5mVar) {
        this.b = obj.toString();
        this.c = fs3Var.b(obj, new Runnable() { // from class: n1l
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.b(i, s5mVar, runnable);
            }
        });
    }

    public final void b(int i, s5m s5mVar, Runnable runnable) throws Throwable {
        gtl gtlVar;
        if (!this.a.get()) {
            String str = this.b;
            Locale locale = Locale.ENGLISH;
            Log.e("MlKitCloseGuard", str + " has not been closed");
            yfj yfjVar = new yfj();
            o3j o3jVar = new o3j();
            gtl[] gtlVarArrValues = gtl.values();
            int length = gtlVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    gtlVar = gtl.UNKNOWN;
                    break;
                }
                gtlVar = gtlVarArrValues[i2];
                if (gtlVar.a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            o3jVar.a = gtlVar;
            yfjVar.f = new ltl(o3jVar);
            s5mVar.a(new wze(yfjVar), bul.HANDLE_LEAKED);
        }
        runnable.run();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(true);
        this.c.a();
    }
}
