package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q37 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final ou4 d;
    public final Set e;

    public q37(String str, CharSequence charSequence, String str2, ou4 ou4Var, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = ou4Var;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q37)) {
            return false;
        }
        q37 q37Var = (q37) obj;
        return cqk.d(this.a, q37Var.a) && cqk.d(this.b, q37Var.b) && cqk.d(this.c, q37Var.c) && this.d.equals(q37Var.d) && this.e.equals(q37Var.e);
    }

    public final int hashCode() {
        int iF = mw7.f(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + zo5.c(this.d.a, (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + ((Object) this.b) + ", emoji=" + ((Object) this.c) + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}
