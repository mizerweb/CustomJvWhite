package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o5b {
    public final boolean a;
    public final Set b;
    public final boolean c;

    public /* synthetic */ o5b(LinkedHashSet linkedHashSet, boolean z, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? c76.a : linkedHashSet, (i & 4) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5b)) {
            return false;
        }
        o5b o5bVar = (o5b) obj;
        return this.a == o5bVar.a && cqk.d(this.b, o5bVar.b) && this.c == o5bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.o(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(isEnabled=");
        sb.append(this.a);
        sb.append(", selectedIds=");
        sb.append(this.b);
        sb.append(", animateTransition=");
        return qt4.r(sb, this.c, ")");
    }

    public o5b(boolean z, Set set, boolean z2) {
        this.a = z;
        this.b = set;
        this.c = z2;
    }
}
