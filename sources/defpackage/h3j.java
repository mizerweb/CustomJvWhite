package defpackage;

import android.content.Context;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class h3j {
    public final Context a;
    public final dfd b;
    public final q36 c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final i64 e = new i64();
    public final LruCache f = new LruCache(1000);

    public h3j(Context context, dfd dfdVar, q36 q36Var) {
        this.a = context;
        this.b = dfdVar;
        this.c = q36Var;
        dfdVar.g.add(new g3j(this));
    }

    public static ym5 c(rui ruiVar) {
        ArrayList arrayListB = new vog(ruiVar).b();
        m4j m4jVar = arrayListB != null ? (m4j) ww3.t1(arrayListB) : null;
        if (m4jVar instanceof ym5) {
            return (ym5) m4jVar;
        }
        return null;
    }

    public final dfd a() {
        return this.b;
    }

    public final void b() {
        if (this.d.getAndSet(true)) {
            return;
        }
        if (this.b.d) {
            this.e.Q(Boolean.TRUE);
            return;
        }
        this.b.c.obtainMessage(0, new kf8(this.a, this.c, new pni(3, this))).sendToTarget();
    }
}
