package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xib extends kih {
    public final long c;
    public final long d;
    public final wib e;
    public final List f;
    public final long[] g;

    public xib(long j, long j2, wib wibVar, List list, long[] jArr) {
        this.c = j;
        this.d = j2;
        this.e = wibVar;
        this.f = list;
        this.g = jArr;
    }

    public final wib h() {
        return this.e;
    }

    public final List i() {
        return this.f;
    }

    public final long k() {
        return this.c;
    }

    public final long[] m() {
        return this.g;
    }

    public final long n() {
        return this.d;
    }

    @Override // defpackage.sq0
    public final String toString() {
        int size = this.f.size();
        int length = this.g.length;
        StringBuilder sbS = qt4.s(this.c, "Response(callHistorySync=", ",prevCallHistorySync=");
        sbS.append(this.d);
        sbS.append(",action=");
        sbS.append(this.e);
        zo5.C(size, length, ",callHistoryItemsSize=", ",historyIdsSize=", sbS);
        sbS.append(")");
        return sbS.toString();
    }
}
