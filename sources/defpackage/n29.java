package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n29 extends kih {
    public final st2 c;
    public final gm4 d;
    public final gda e;
    public final String f;
    public final ir7 g;
    public final oui h;
    public final fmg i;
    public final gda j;

    public n29(st2 st2Var, gm4 gm4Var, gda gdaVar, String str, ir7 ir7Var, oui ouiVar, fmg fmgVar, gda gdaVar2) {
        this.c = st2Var;
        this.d = gm4Var;
        this.e = gdaVar;
        this.f = str;
        this.g = ir7Var;
        this.h = ouiVar;
        this.i = fmgVar;
        this.j = gdaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n29)) {
            return false;
        }
        n29 n29Var = (n29) obj;
        return cqk.d(this.c, n29Var.c) && cqk.d(this.d, n29Var.d) && cqk.d(this.e, n29Var.e) && cqk.d(this.f, n29Var.f) && cqk.d(this.g, n29Var.g) && cqk.d(this.h, n29Var.h) && cqk.d(this.i, n29Var.i) && cqk.d(this.j, n29Var.j);
    }

    public final int hashCode() {
        st2 st2Var = this.c;
        int iHashCode = (st2Var == null ? 0 : st2Var.hashCode()) * 31;
        gm4 gm4Var = this.d;
        int iHashCode2 = (iHashCode + (gm4Var == null ? 0 : gm4Var.hashCode())) * 31;
        gda gdaVar = this.e;
        int iHashCode3 = (iHashCode2 + (gdaVar == null ? 0 : gdaVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ir7 ir7Var = this.g;
        int iHashCode5 = (iHashCode4 + (ir7Var == null ? 0 : ir7Var.hashCode())) * 31;
        oui ouiVar = this.h;
        int iHashCode6 = (iHashCode5 + (ouiVar == null ? 0 : ouiVar.hashCode())) * 31;
        fmg fmgVar = this.i;
        int iHashCode7 = (iHashCode6 + (fmgVar == null ? 0 : fmgVar.hashCode())) * 31;
        gda gdaVar2 = this.j;
        return iHashCode7 + (gdaVar2 != null ? gdaVar2.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chat=" + this.c + ", contactSearchResult=" + this.d + ", message=" + this.e + ", startPayload=" + this.f + ", groupChatInfo=" + this.g + ", videoConference=" + this.h + ", stickerSet=" + this.i + ", post=" + this.j + ")";
    }
}
