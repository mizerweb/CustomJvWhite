package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h29 extends i29 {
    public final long a;
    public final Long b;
    public final Long c;
    public final gm4 d;
    public final ir7 e;
    public final oui f;
    public final Long g;
    public final String h;

    public h29(long j, Long l, Long l2, gm4 gm4Var, ir7 ir7Var, oui ouiVar, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = gm4Var;
        this.e = ir7Var;
        this.f = ouiVar;
        this.g = l3;
        this.h = str;
    }

    @Override // defpackage.i29
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h29)) {
            return false;
        }
        h29 h29Var = (h29) obj;
        return this.a == h29Var.a && cqk.d(this.b, h29Var.b) && this.c.equals(h29Var.c) && cqk.d(this.d, h29Var.d) && cqk.d(this.e, h29Var.e) && cqk.d(this.f, h29Var.f) && cqk.d(this.g, h29Var.g) && cqk.d(this.h, h29Var.h);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        gm4 gm4Var = this.d;
        int iHashCode3 = (iHashCode2 + (gm4Var == null ? 0 : gm4Var.hashCode())) * 31;
        ir7 ir7Var = this.e;
        int iHashCode4 = (iHashCode3 + (ir7Var == null ? 0 : ir7Var.hashCode())) * 31;
        oui ouiVar = this.f;
        int iHashCode5 = (iHashCode4 + (ouiVar == null ? 0 : ouiVar.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.h;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
