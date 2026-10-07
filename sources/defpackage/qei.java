package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qei {
    public final long a;
    public final String b;
    public final List c;
    public final wja d;
    public final long e;

    public qei(long j, String str, List list, wja wjaVar, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = wjaVar;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qei)) {
            return false;
        }
        qei qeiVar = (qei) obj;
        return this.a == qeiVar.a && cqk.d(this.b, qeiVar.b) && cqk.d(this.c, qeiVar.c) && this.d == qeiVar.d && this.e == qeiVar.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return Long.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "UpdateCommentTextEntity(id=", ", text=", this.b);
        sbT.append(", elements=");
        sbT.append(this.c);
        sbT.append(", status=");
        sbT.append(this.d);
        return zo5.k(this.e, ", updateTime=", ")", sbT);
    }
}
