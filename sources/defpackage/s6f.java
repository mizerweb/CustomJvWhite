package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s6f {
    public static final s6f b;
    public final u98 a;

    static {
        pgg pggVar = new pgg();
        pggVar.a = u98.l(new Object[]{1, 5}, 2);
        b = new s6f(pggVar);
    }

    public s6f(pgg pggVar) {
        this.a = (u98) pggVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s6f) && this.a.equals(((s6f) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
