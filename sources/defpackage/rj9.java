package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rj9 {
    public final List a;
    public final int b;

    public rj9(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj9)) {
            return false;
        }
        rj9 rj9Var = (rj9) obj;
        return cqk.d(this.a, rj9Var.a) && this.b == rj9Var.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MIUIContextMenuViewState(items=");
        sb.append(this.a);
        sb.append(", menuState=");
        int i = this.b;
        if (i == 1) {
            str = "HIDDEN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SHOWED";
        } else {
            str = "SELECTION";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
