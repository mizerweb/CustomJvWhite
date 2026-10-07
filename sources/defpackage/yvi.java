package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yvi {
    public final int a;
    public final int b;
    public final int c;

    public yvi(td0 td0Var) {
        this.a = td0Var.b;
        this.b = td0Var.c;
        this.c = td0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yvi.class != obj.getClass()) {
            return false;
        }
        yvi yviVar = (yvi) obj;
        return this.a == yviVar.a && this.b == yviVar.b && this.c == yviVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), qt4.b(this.c));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "CONTAIN";
        } else {
            str = "COVER";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
