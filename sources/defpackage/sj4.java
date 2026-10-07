package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class sj4 implements vnd {
    public final long a;
    public final String b;
    public final ynh c;
    public final String d;
    public final boolean e;
    public final CharSequence f;
    public final zmd g;

    public sj4(long j, String str, ynh ynhVar, String str2, boolean z, CharSequence charSequence, zmd zmdVar) {
        this.a = j;
        this.b = str;
        this.c = ynhVar;
        this.d = str2;
        this.e = z;
        this.f = charSequence;
        this.g = zmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4)) {
            return false;
        }
        sj4 sj4Var = (sj4) obj;
        return this.a == sj4Var.a && this.b.equals(sj4Var.b) && cqk.d(this.c, sj4Var.c) && cqk.d(this.d, sj4Var.d) && this.e == sj4Var.e && this.f.equals(sj4Var.f) && this.g == sj4Var.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a == k79Var.getItemId();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + zo5.c(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, (this.g.hashCode() + mw7.f(nbh.n(zo5.d(bc1.h(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        String strD = gll.d(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
        StringBuilder sbT = qt4.t(this.a, "ContactInfoItem(id=", ", fullName=", this.b);
        sbT.append(", subtitle=");
        sbT.append(this.c);
        sbT.append(", url=");
        sbT.append(this.d);
        sbT.append(", isOnline=");
        sbT.append(this.e);
        sbT.append(", abbreviation=");
        sbT.append((Object) this.f);
        sbT.append(", type=");
        sbT.append(this.g);
        sbT.append(", itemViewType=");
        sbT.append(strD);
        sbT.append(", newPermissions=true)");
        return sbT.toString();
    }
}
