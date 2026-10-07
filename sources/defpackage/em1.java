package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class em1 implements gm1 {
    public static final em1 l = new em1(new qe1(null, null, null, null, null, false, null, null, null, 479), false, null, "", dm1.DECLINE, dm1.AUDIO_ACCEPT, null, null, false, null, null);
    public final qe1 a;
    public final boolean b;
    public final CharSequence c;
    public final CharSequence d;
    public final dm1 e;
    public final dm1 f;
    public final dm1 g;
    public final ynh h;
    public final boolean i;
    public final Boolean j;
    public final CharSequence k;

    public em1(qe1 qe1Var, boolean z, CharSequence charSequence, CharSequence charSequence2, dm1 dm1Var, dm1 dm1Var2, dm1 dm1Var3, ynh ynhVar, boolean z2, Boolean bool, CharSequence charSequence3) {
        this.a = qe1Var;
        this.b = z;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = dm1Var;
        this.f = dm1Var2;
        this.g = dm1Var3;
        this.h = ynhVar;
        this.i = z2;
        this.j = bool;
        this.k = charSequence3;
    }

    public static em1 a(em1 em1Var, qe1 qe1Var, boolean z, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, dm1 dm1Var, boolean z2, Boolean bool, CharSequence charSequence2, int i) {
        return new em1((i & 1) != 0 ? em1Var.a : qe1Var, (i & 2) != 0 ? em1Var.b : z, (i & 4) != 0 ? em1Var.c : spannableStringBuilder, (i & 8) != 0 ? em1Var.d : charSequence, em1Var.e, (i & 32) != 0 ? em1Var.f : dm1Var, em1Var.g, em1Var.h, (i & np0.n) != 0 ? em1Var.i : z2, (i & np0.o) != 0 ? em1Var.j : bool, (i & 1024) != 0 ? em1Var.k : charSequence2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em1)) {
            return false;
        }
        em1 em1Var = (em1) obj;
        return this.a.equals(em1Var.a) && this.b == em1Var.b && cqk.d(this.c, em1Var.c) && this.d.equals(em1Var.d) && this.e == em1Var.e && this.f == em1Var.f && this.g == em1Var.g && cqk.d(this.h, em1Var.h) && this.i == em1Var.i && cqk.d(this.j, em1Var.j) && cqk.d(this.k, em1Var.k);
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + mw7.f((iN + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d)) * 31)) * 31;
        dm1 dm1Var = this.g;
        int iHashCode2 = (iHashCode + (dm1Var == null ? 0 : dm1Var.hashCode())) * 31;
        ynh ynhVar = this.h;
        int iN2 = nbh.n((iHashCode2 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.i);
        Boolean bool = this.j;
        int iHashCode3 = (iN2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CharSequence charSequence2 = this.k;
        return iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", canShowVideoPreview=" + this.b + ", enableCameraButtonText=" + ((Object) this.c) + ", callTypeDescription=" + ((Object) this.d) + ", negativeActionButton=" + this.e + ", firstActionButton=" + this.f + ", secondActionButton=" + this.g + ", notContactWarning=" + this.h + ", isContact=" + this.i + ", isOfficial=" + this.j + ", organization=" + ((Object) this.k) + ")";
    }
}
