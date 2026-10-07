package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class fia {
    public final long a;
    public final long b;
    public final Layout c;
    public final cia d;
    public final wha e;
    public final boolean f;
    public final Long g;

    public fia(long j, long j2, Layout layout, cia ciaVar, wha whaVar, boolean z, Long l) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = ciaVar;
        this.e = whaVar;
        this.f = z;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fia)) {
            return false;
        }
        fia fiaVar = (fia) obj;
        return this.a == fiaVar.a && this.b == fiaVar.b && cqk.d(this.c, fiaVar.c) && cqk.d(this.d, fiaVar.d) && cqk.d(this.e, fiaVar.e) && this.f == fiaVar.f && cqk.d(this.g, fiaVar.g);
    }

    public final int hashCode() {
        int iG = qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
        Layout layout = this.c;
        int iHashCode = (iG + (layout == null ? 0 : layout.hashCode())) * 31;
        cia ciaVar = this.d;
        int iHashCode2 = (iHashCode + (ciaVar == null ? 0 : ciaVar.hashCode())) * 31;
        wha whaVar = this.e;
        int iN = nbh.n((iHashCode2 + (whaVar == null ? 0 : whaVar.hashCode())) * 31, 31, this.f);
        Long l = this.g;
        return iN + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "MessageLink(messageId=", ", messageLinkId=");
        sbS.append(this.b);
        sbS.append(", senderLayout=");
        sbS.append(this.c);
        sbS.append(", replyModel=");
        sbS.append(this.d);
        sbS.append(", forwardModel=");
        sbS.append(this.e);
        sbS.append(", isFloating=");
        sbS.append(this.f);
        sbS.append(", accentSourceId=");
        sbS.append(this.g);
        sbS.append(")");
        return sbS.toString();
    }
}
