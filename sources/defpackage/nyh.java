package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nyh {
    public static final String c;
    public static final String d;
    public final hyh a;
    public final c98 b;

    static {
        String str = vqi.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public nyh(hyh hyhVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= hyhVar.a)) {
            ore.i();
            throw null;
        }
        this.a = hyhVar;
        this.b = c98.n(list);
    }

    public final int a() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nyh.class == obj.getClass()) {
            nyh nyhVar = (nyh) obj;
            if (this.a.equals(nyhVar.a)) {
                c98 c98Var = nyhVar.b;
                c98 c98Var2 = this.b;
                c98Var2.getClass();
                if (j8f.a(c98Var2, c98Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
