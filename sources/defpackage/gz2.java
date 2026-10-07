package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gz2 extends zq0 {
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final mg5 g;
    public final List h;

    public gz2(long j, long j2, long j3, long j4, int i, mg5 mg5Var, List list) {
        super(j);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i;
        this.g = mg5Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz2)) {
            return false;
        }
        gz2 gz2Var = (gz2) obj;
        return this.b == gz2Var.b && this.c == gz2Var.c && this.d == gz2Var.d && this.e == gz2Var.e && this.f == gz2Var.f && this.g == gz2Var.g && cqk.d(this.h, gz2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + zo5.c(this.f, qt4.g(qt4.g(qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31)) * 31);
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "ChatHistoryEvent(requestId=", ", chatId=");
        sbS.append(this.c);
        qt4.z(this.d, ", startTime=", ", endTime=", sbS);
        c0a.w(sbS, this.e, ", count=", this.f);
        sbS.append(", itemType=");
        sbS.append(this.g);
        sbS.append(", messageIds=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }
}
