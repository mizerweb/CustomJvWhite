package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class aka {
    public final rt2 a;
    public final fda b;
    public final ifh c;
    public final ifh d = new ifh(new ww8(26, this));
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public aka(rt2 rt2Var, fda fdaVar, ifh ifhVar) {
        this.a = rt2Var;
        this.b = fdaVar;
        this.c = ifhVar;
    }

    public final fda a() {
        return this.b;
    }

    public final Layout b() {
        return (Layout) this.c.getValue();
    }

    public final void c(Layout layout) {
        new ifh(new xlf(4, layout));
        new ifh(new ww8(this, layout));
        for (dka dkaVar : this.e) {
            dkaVar.getClass();
            if (Looper.getMainLooper().isCurrentThread()) {
                dkaVar.setLayout(this);
            } else {
                Handler handler = dkaVar.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new og7(dkaVar, 12, this));
                } else {
                    dkaVar.post(new ng7(dkaVar, 13, this));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka akaVar = (aka) obj;
        if (b() != akaVar.b()) {
            return false;
        }
        rt2 rt2Var = this.a;
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        rt2 rt2Var2 = akaVar.a;
        return cqk.d(lValueOf, rt2Var2 != null ? Long.valueOf(rt2Var2.a) : null) && this.b.a.a == akaVar.b.a.a;
    }

    public final int hashCode() {
        rt2 rt2Var = this.a;
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        return b().hashCode() + qt4.g((lValueOf != null ? lValueOf.hashCode() : 0) * 31, 31, this.b.a.a);
    }
}
