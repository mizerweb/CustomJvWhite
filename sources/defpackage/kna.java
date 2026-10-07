package defpackage;

import android.graphics.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class kna implements lna {
    public final int a;
    public final Point b;
    public final int c;
    public final e7d d;
    public final long e;

    public kna(int i, Point point, int i2, e7d e7dVar, long j) {
        this.a = i;
        this.b = point;
        this.c = i2;
        this.d = e7dVar;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kna)) {
            return false;
        }
        kna knaVar = (kna) obj;
        return this.a == knaVar.a && cqk.d(this.b, knaVar.b) && this.c == knaVar.c && cqk.d(this.d, knaVar.d) && this.e == knaVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + zo5.c(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31)) * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowRateTooltip(answerId=");
        sb.append(this.a);
        sb.append(", point=");
        sb.append(this.b);
        sb.append(", rate=");
        sb.append(this.c);
        sb.append(", model=");
        sb.append(this.d);
        sb.append(", messageId=");
        return c0a.m(this.e, ")", sb);
    }
}
