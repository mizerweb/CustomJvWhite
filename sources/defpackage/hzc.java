package defpackage;

import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class hzc implements jzc {
    public final List a;

    public hzc(i65... i65VarArr) {
        this.a = a.n1(i65VarArr);
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzc) && cqk.d(this.a, ((hzc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("Link(links=", ")", this.a);
    }
}
