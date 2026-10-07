package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class vhe {
    public static final uhe Companion = new uhe();
    public static final ny8[] j = {null, null, null, null, rx8.P(2, new tyd(16)), null, rx8.P(2, new tyd(17)), null, null};
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final Map e;
    public final String f;
    public final Map g;
    public final Long h;
    public final Long i;

    public /* synthetic */ vhe(int i, String str, String str2, long j2, Long l, Map map, String str3, Map map2, Long l2, Long l3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, the.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = map2;
        }
        if ((i & np0.m) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & np0.n) == 0) {
            this.i = null;
        } else {
            this.i = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhe)) {
            return false;
        }
        vhe vheVar = (vhe) obj;
        return cqk.d(this.a, vheVar.a) && cqk.d(this.b, vheVar.b) && this.c == vheVar.c && cqk.d(this.d, vheVar.d) && cqk.d(this.e, vheVar.e) && cqk.d(this.f, vheVar.f) && cqk.d(this.g, vheVar.g) && cqk.d(this.h, vheVar.h) && cqk.d(this.i, vheVar.i);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.e;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map map2 = this.g;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        return iHashCode5 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("ReleaseCdConfig(title=", this.a, ", primaryButton=", this.b, ", channelId=");
        sbQ.append(this.c);
        sbQ.append(", secondaryChannelId=");
        sbQ.append(this.d);
        sbQ.append(", primaryButtons=");
        sbQ.append(this.e);
        sbQ.append(", description=");
        sbQ.append(this.f);
        sbQ.append(", descriptions=");
        sbQ.append(this.g);
        sbQ.append(", hChannelId=");
        sbQ.append(this.h);
        sbQ.append(", hSecondaryChannelId=");
        sbQ.append(this.i);
        sbQ.append(")");
        return sbQ.toString();
    }
}
