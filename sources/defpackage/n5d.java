package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class n5d {
    public final int a;
    public final u8b b;
    public final LinkedHashSet c;

    public n5d(int i, u8b u8bVar, LinkedHashSet linkedHashSet) {
        this.a = i;
        this.b = u8bVar;
        this.c = linkedHashSet;
    }

    public final u8b a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final LinkedHashSet c() {
        return this.c;
    }

    public final Integer d() {
        u8b u8bVar = this.b;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        int i2 = -1;
        Integer numValueOf = null;
        for (int i3 = 0; i3 < i; i3++) {
            m5d m5dVar = (m5d) objArr[i3];
            int i4 = m5dVar.b;
            if (i4 > i2) {
                numValueOf = Integer.valueOf(m5dVar.a);
                i2 = i4;
            } else if (i4 == i2) {
                numValueOf = null;
            }
        }
        return numValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d)) {
            return false;
        }
        n5d n5dVar = (n5d) obj;
        return this.a == n5dVar.a && this.b.equals(n5dVar.b) && cqk.d(this.c, n5dVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        LinkedHashSet linkedHashSet = this.c;
        return iHashCode + (linkedHashSet == null ? 0 : linkedHashSet.hashCode());
    }

    public final String toString() {
        return "State(total=" + this.a + ", result=" + this.b + ", voterPreviewIds=" + this.c + ")";
    }
}
