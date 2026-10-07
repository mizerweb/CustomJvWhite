package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class oqf {
    public static final nqf Companion = new nqf();
    public static final ny8[] f = {null, rx8.P(2, new tyd(26)), null, null, null};
    public final int a;
    public final List b;
    public final String c;
    public final String d;
    public final mqf e;

    public /* synthetic */ oqf(int i, int i2, List list, String str, String str2, mqf mqfVar) {
        if (2 != (i & 2)) {
            shl.b(i, 2, kqf.a.d());
            throw null;
        }
        this.a = (i & 1) == 0 ? 0 : i2;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = mqf.LEFT;
        } else {
            this.e = mqfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf)) {
            return false;
        }
        oqf oqfVar = (oqf) obj;
        return this.a == oqfVar.a && cqk.d(this.b, oqfVar.b) && cqk.d(this.c, oqfVar.c) && cqk.d(this.d, oqfVar.d) && this.e == oqfVar.e;
    }

    public final int hashCode() {
        int iC = qv1.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsBannerSection(id=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", logo=");
        nbh.G(sb, this.c, ", title=", this.d, ", align=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
