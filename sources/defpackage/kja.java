package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kja {
    public final List a;
    public final int b;
    public final z5e c;

    public kja(List list, int i, z5e z5eVar) {
        this.a = list;
        this.b = i;
        this.c = z5eVar;
    }

    public static final kja a(String str) {
        return new kja(Collections.singletonList(new jja(new z5e(a6e.EMOJI, new s5e(str)), 1)), 1, null);
    }

    public final List b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final z5e d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kja)) {
            return false;
        }
        kja kjaVar = (kja) obj;
        return cqk.d(this.a, kjaVar.a) && this.b == kjaVar.b && cqk.d(this.c, kjaVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, this.a.hashCode() * 31, 31);
        z5e z5eVar = this.c;
        return iC + (z5eVar == null ? 0 : z5eVar.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
