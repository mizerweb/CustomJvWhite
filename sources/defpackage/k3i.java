package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k3i {
    public final e0i a;
    public final iji b;
    public final long c;
    public final int d;
    public final long e;
    public final Long f;
    public final Long g;

    public k3i(e0i e0iVar, iji ijiVar, long j, int i, long j2, Long l, Long l2) {
        this.a = e0iVar;
        this.b = ijiVar;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = l;
        this.g = l2;
    }

    public static Long a(e0i e0iVar, float f) {
        c0i c0iVar = e0iVar instanceof c0i ? (c0i) e0iVar : null;
        if (c0iVar != null) {
            float f2 = c0iVar.a;
            if (f2 >= f) {
                return Long.valueOf((long) (c0iVar.b / (f2 / 100.0f)));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3i)) {
            return false;
        }
        k3i k3iVar = (k3i) obj;
        return cqk.d(this.a, k3iVar.a) && cqk.d(this.b, k3iVar.b) && this.c == k3iVar.c && this.d == k3iVar.d && this.e == k3iVar.e && cqk.d(this.f, k3iVar.f) && cqk.d(this.g, k3iVar.g);
    }

    public final int hashCode() {
        e0i e0iVar = this.a;
        int iHashCode = (e0iVar == null ? 0 : e0iVar.hashCode()) * 31;
        iji ijiVar = this.b;
        int iG = qt4.g(zo5.c(this.d, qt4.g((iHashCode + (ijiVar == null ? 0 : ijiVar.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        Long l = this.f;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransloadStateUpdate(transcodeState=");
        sb.append(this.a);
        sb.append(", uploadState=");
        sb.append(this.b);
        sb.append(", lastReportedFileSize=");
        c0a.w(sb, this.c, ", progress=", this.d);
        qt4.z(this.e, ", lastBytesSent=", ", estimatedSizeAt75Progress=", sb);
        sb.append(this.f);
        sb.append(", estimatedSizeAt95Progress=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
