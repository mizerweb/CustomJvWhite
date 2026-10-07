package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
@mif(with = jcb.class)
public final class kcb {
    public static final jcb b = new jcb();
    public static final f8b c;
    public static final kcb d;
    public static final hif e;
    public final f8b a;

    static {
        f8b f8bVar = jj8.a;
        f8b f8bVar2 = new f8b(2);
        f8bVar2.h(17);
        f8bVar2.h(18);
        c = f8bVar2;
        d = new kcb(f8bVar2);
        fif[] fifVarArr = new fif[0];
        if (r5h.X0("NetStatConfig")) {
            ore.p("Blank serial names are prohibited");
            return;
        }
        tr3 tr3Var = new tr3("NetStatConfig");
        tr3.a(tr3Var, "loggableOpcodes", kj8.a);
        e = new hif("NetStatConfig", c6h.f, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
    }

    public kcb(f8b f8bVar) {
        this.a = f8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcb) && cqk.d(this.a, ((kcb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetStatConfig(loggableOpcodes=" + this.a + ")";
    }
}
