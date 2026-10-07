package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i8a {
    public final List a;
    public final List b;

    public i8a(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8a)) {
            return false;
        }
        i8a i8aVar = (i8a) obj;
        return cqk.d(this.a, i8aVar.a) && cqk.d(this.b, i8aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemberListActionsWrapper(topActions=" + this.a + ", bottomActions=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i8a() {
        r66 r66Var = r66.a;
        this(r66Var, r66Var);
    }
}
