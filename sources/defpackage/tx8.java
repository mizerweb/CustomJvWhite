package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class tx8 {
    public static final tx8 f = new tx8(null, null, false, false, 4);
    public final fu1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public tx8(fu1 fu1Var, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i) {
        this.a = fu1Var;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx8)) {
            return false;
        }
        tx8 tx8Var = (tx8) obj;
        return cqk.d(this.a, tx8Var.a) && cqk.d(this.b, tx8Var.b) && this.c == tx8Var.c && this.d == tx8Var.d && this.e == tx8Var.e;
    }

    public final int hashCode() {
        fu1 fu1Var = this.a;
        int iHashCode = (fu1Var == null ? 0 : fu1Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return qt4.D(this.e) + nbh.n(nbh.n((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelSpeakerState(participantId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", isPinned=");
        qt4.B(", isTalking=", ", action=", sb, this.c, this.d);
        sb.append(v0h.q(this.e));
        sb.append(")");
        return sb.toString();
    }
}
