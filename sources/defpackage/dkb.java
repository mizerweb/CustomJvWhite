package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dkb extends kih {
    public final long c;
    public final long d;
    public final int e;
    public final gda f;
    public final long[] g;
    public final Long h;

    public dkb(long j, long j2, int i, gda gdaVar, long[] jArr, Long l) {
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = gdaVar;
        this.g = jArr;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb)) {
            return false;
        }
        dkb dkbVar = (dkb) obj;
        return this.c == dkbVar.c && this.d == dkbVar.d && cqk.d(this.h, dkbVar.h) && this.e == dkbVar.e && cqk.d(this.f, dkbVar.f) && Arrays.equals(this.g, dkbVar.g);
    }

    public final int hashCode() {
        int iG = qt4.g(Long.hashCode(this.c) * 31, 31, this.d);
        Long l = this.h;
        int iF = c0a.f(this.e, (iG + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31, 31);
        gda gdaVar = this.f;
        return Arrays.hashCode(this.g) + ((iF + (gdaVar != null ? gdaVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str;
        String string = Arrays.toString(this.g);
        StringBuilder sbS = qt4.s(this.c, "Response(chatId=", ", userId=");
        sbS.append(this.d);
        sbS.append(", updateType=");
        int i = this.e;
        if (i == 1) {
            str = "CREATED";
        } else if (i == 2) {
            str = "EDITED";
        } else if (i == 3) {
            str = "DELETED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "UNKNOWN";
        } else {
            str = "FIRE_SUCCESS";
        }
        sbS.append(str);
        sbS.append(", message=");
        sbS.append(this.f);
        sbS.append(", messageIds=");
        sbS.append(string);
        sbS.append(", lastDelayedUpdateTime=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }
}
