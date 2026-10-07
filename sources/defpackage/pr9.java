package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pr9 implements rr9 {
    public final CharSequence a;
    public final ArrayList b;
    public final boolean c;
    public final g4b d;
    public final Long e;

    public pr9(CharSequence charSequence, ArrayList arrayList, boolean z, g4b g4bVar, Long l) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
        this.d = g4bVar;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr9)) {
            return false;
        }
        pr9 pr9Var = (pr9) obj;
        return cqk.d(this.a, pr9Var.a) && this.b.equals(pr9Var.b) && this.c == pr9Var.c && this.d.equals(pr9Var.d) && cqk.d(this.e, pr9Var.e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (this.d.hashCode() + nbh.n(x05.b(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31), 31, this.c)) * 31;
        Long l = this.e;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SendMedia(caption=" + ((Object) this.a) + ", media=" + this.b + ", sendAsFile=" + this.c + ", sliceData=" + this.d + ", fireTime=" + this.e + ")";
    }
}
