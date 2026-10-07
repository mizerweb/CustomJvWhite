package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lq1 {
    public static final List k = xw3.P0(yp1.a, aq1.a, bq1.a);
    public static final lq1 l = new lq1(null, null, null, new iq1(new xnh("")), new tnh(R.string.call_history_info_title), r66.a, null, true, null, ybc.a);
    public final tj0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final kq1 d;
    public final ynh e;
    public final List f;
    public final gq1 g;
    public final boolean h;
    public final Long i;
    public final dcc j;

    public lq1(tj0 tj0Var, CharSequence charSequence, CharSequence charSequence2, kq1 kq1Var, ynh ynhVar, List list, gq1 gq1Var, boolean z, Long l2, dcc dccVar) {
        this.a = tj0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = kq1Var;
        this.e = ynhVar;
        this.f = list;
        this.g = gq1Var;
        this.h = z;
        this.i = l2;
        this.j = dccVar;
    }

    public static lq1 a(lq1 lq1Var, tj0 tj0Var, String str, CharSequence charSequence, kq1 kq1Var, ynh ynhVar, List list, gq1 gq1Var, boolean z, Long l2, dcc dccVar, int i) {
        lq1Var.getClass();
        if ((i & 2) != 0) {
            tj0Var = lq1Var.a;
        }
        tj0 tj0Var2 = tj0Var;
        CharSequence charSequence2 = str;
        if ((i & 4) != 0) {
            charSequence2 = lq1Var.b;
        }
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = (i & 8) != 0 ? lq1Var.c : charSequence;
        kq1 kq1Var2 = (i & 16) != 0 ? lq1Var.d : kq1Var;
        gq1 gq1Var2 = (i & np0.m) != 0 ? lq1Var.g : gq1Var;
        boolean z2 = (i & np0.n) != 0 ? lq1Var.h : z;
        Long l3 = (i & np0.o) != 0 ? lq1Var.i : l2;
        dcc dccVar2 = (i & 1024) != 0 ? lq1Var.j : dccVar;
        lq1Var.getClass();
        return new lq1(tj0Var2, charSequence3, charSequence4, kq1Var2, ynhVar, list, gq1Var2, z2, l3, dccVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq1)) {
            return false;
        }
        lq1 lq1Var = (lq1) obj;
        return cqk.d(this.a, lq1Var.a) && cqk.d(this.b, lq1Var.b) && cqk.d(this.c, lq1Var.c) && this.d.equals(lq1Var.d) && this.e.equals(lq1Var.e) && this.f.equals(lq1Var.f) && cqk.d(this.g, lq1Var.g) && this.h == lq1Var.h && cqk.d(this.i, lq1Var.i) && this.j.equals(lq1Var.j);
    }

    public final int hashCode() {
        tj0 tj0Var = this.a;
        int iHashCode = (tj0Var == null ? 0 : tj0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int iC = qv1.c(bc1.h((this.d.hashCode() + ((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        gq1 gq1Var = this.g;
        int iN = nbh.n((iC + (gq1Var == null ? 0 : gq1Var.hashCode())) * 31, 31, this.h);
        Long l2 = this.i;
        return this.j.hashCode() + ((iN + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CallLinkInfo(icon=null, avatarAbbreviationModel=" + this.a + ", callLink=" + ((Object) this.b) + ", callName=" + ((Object) this.c) + ", linkInfo=" + this.d + ", title=" + this.e + ", action=" + this.f + ", button=" + this.g + ", isNew=" + this.h + ", serverChatId=" + this.i + ", actionRightToolbar=" + this.j + ")";
    }
}
