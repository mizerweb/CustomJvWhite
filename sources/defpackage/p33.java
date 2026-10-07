package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p33 extends mk0 {
    public final x7a b;
    public final ynh c;
    public final ynh d;
    public final List e;

    public p33(x7a x7aVar, ynh ynhVar, ynh ynhVar2, List list) {
        super(3);
        this.b = x7aVar;
        this.c = ynhVar;
        this.d = ynhVar2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p33)) {
            return false;
        }
        p33 p33Var = (p33) obj;
        return cqk.d(this.b, p33Var.b) && cqk.d(this.c, p33Var.c) && cqk.d(this.d, p33Var.d) && cqk.d(this.e, p33Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bc1.h(bc1.h(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
