package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class uke implements pve {
    public final long a;
    public final long b;

    public uke(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.pve
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uke.class == obj.getClass()) {
            uke ukeVar = (uke) obj;
            if (this.a == ukeVar.a && this.b == ukeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.a);
        sb.append(", sendBitrate=");
        return zo5.u(sb, this.b, '}');
    }
}
