package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kc implements nc {
    public final q24 a;
    public final List b;

    public kc(q24 q24Var, List list) {
        this.a = q24Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return cqk.d(this.a, kcVar.a) && cqk.d(this.b, kcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkDeleted(commentsId=" + this.a + ", commentIds=" + this.b + ")";
    }
}
