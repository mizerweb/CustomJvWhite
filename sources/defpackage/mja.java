package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mja {
    public final List a;
    public final kja b;
    public final gja c;
    public final long d;

    public mja(List list, kja kjaVar, gja gjaVar, long j) {
        this.a = list;
        this.b = kjaVar;
        this.c = gjaVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mja)) {
            return false;
        }
        mja mjaVar = (mja) obj;
        return this.a.equals(mjaVar.a) && cqk.d(this.b, mjaVar.b) && cqk.d(this.c, mjaVar.c) && this.d == mjaVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kja kjaVar = this.b;
        int iHashCode2 = (iHashCode + (kjaVar == null ? 0 : kjaVar.hashCode())) * 31;
        gja gjaVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (gjaVar != null ? gjaVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
