package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w6c implements Closeable {
    public final Context a;
    public final String b;
    public final Object[] c;
    public final ifh d;
    public final ifh e;
    public final a1c f;
    public final ifh g;
    public final eh9 h;
    public final i1c i;
    public final ny8 j;
    public final String k;

    public w6c(Context context, eh9 eh9Var, i1c i1cVar, ny8 ny8Var, ny8 ny8Var2, wmi wmiVar, ha9 ha9Var, ifh ifhVar, ifh ifhVar2, ifh ifhVar3, a1c a1cVar, ny8 ny8Var3) {
        String strA = ha9Var.a("cache", "db");
        Object[] objArr = {new vo3(i1cVar), new dwa(ny8Var), new shc(ny8Var2)};
        this.a = context;
        this.b = strA;
        this.c = objArr;
        this.d = ifhVar;
        this.e = ifhVar2;
        this.f = a1cVar;
        this.g = new ifh(new sre(this, 0));
        this.h = eh9Var;
        this.i = i1cVar;
        this.j = ny8Var3;
        this.k = w6c.class.getName();
        new fh9(wmiVar, eh9Var, new v6c(this, null)).a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.g.d()) {
            c46 c46Var = ((rre) this.g.getValue()).g;
            synchronized (c46Var) {
                if (((AtomicBoolean) c46Var.c).compareAndSet(false, true)) {
                    while (((AtomicInteger) c46Var.b).get() != 0) {
                    }
                    ((fl9) c46Var.a).invoke();
                }
            }
        }
    }
}
