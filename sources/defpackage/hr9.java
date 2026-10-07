package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hr9 implements rr9 {
    public final CharSequence a;
    public final ArrayList b;
    public final boolean c;

    public hr9(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr9)) {
            return false;
        }
        hr9 hr9Var = (hr9) obj;
        return cqk.d(this.a, hr9Var.a) && this.b.equals(hr9Var.b) && this.c == hr9Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + x05.b(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append((Object) this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return qt4.r(sb, this.c, ")");
    }
}
