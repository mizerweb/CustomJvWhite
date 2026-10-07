package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p2k {
    public static final xr8 d = new xr8();
    public static final p2k e = new p2k(r66.a, false, false);
    public final boolean a;
    public final boolean b;
    public final List c;

    public p2k(List list, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2k)) {
            return false;
        }
        p2k p2kVar = (p2k) obj;
        return this.a == p2kVar.a && this.b == p2kVar.b && cqk.d(this.c, p2kVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        return this.c.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
    }

    public final String toString() {
        return "ExternalMasterHostAnalyticsConfig(isEnabled=" + this.a + ", isForce=" + this.b + ", packageNames=" + this.c + ')';
    }
}
