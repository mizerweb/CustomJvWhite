package defpackage;

import android.graphics.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class e3g implements vpa {
    public final long a;
    public final int b;
    public final Point c;
    public final xnh d;
    public final String e;

    public e3g(long j, int i, Point point, xnh xnhVar) {
        this.a = j;
        this.b = i;
        this.c = point;
        this.d = xnhVar;
        this.e = j + ":" + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3g)) {
            return false;
        }
        e3g e3gVar = (e3g) obj;
        return this.a == e3gVar.a && this.b == e3gVar.b && cqk.d(this.c, e3gVar.c) && this.d.equals(e3gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b, Long.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "ShowPollRateTooltip(pollId=", ", answerId=");
        sbQ.append(", point=");
        sbQ.append(this.c);
        sbQ.append(", rateText=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
