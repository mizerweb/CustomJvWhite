package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wke implements pve {
    public final long a;
    public final long b;

    public wke(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.pve
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wke.class == obj.getClass()) {
            wke wkeVar = (wke) obj;
            if (this.a == wkeVar.a && this.b == wkeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.a);
        sb.append(", framesDecoded=");
        return zo5.u(sb, this.b, '}');
    }
}
