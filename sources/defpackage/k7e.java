package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k7e {
    public final List a;
    public final int b;
    public final boolean c;

    public k7e(List list, int i, boolean z) {
        this.a = list;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7e)) {
            return false;
        }
        k7e k7eVar = (k7e) obj;
        return this.a.equals(k7eVar.a) && this.b == k7eVar.b && this.c == k7eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsState(items=");
        sb.append(this.a);
        sb.append(", tabsAmount=");
        sb.append(this.b);
        sb.append(", hasReactions=");
        return qt4.r(sb, this.c, ")");
    }
}
