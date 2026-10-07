package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x1g implements vpa {
    public final List a;
    public final ynh b;
    public final ynh c;
    public final List d;
    public final lc4 e;
    public final boolean f;

    public x1g(List list, ynh ynhVar, pnh pnhVar, List list2, lc4 lc4Var, int i) {
        lc4Var = (i & 16) != 0 ? null : lc4Var;
        boolean z = (i & 32) != 0;
        this.a = list;
        this.b = ynhVar;
        this.c = pnhVar;
        this.d = list2;
        this.e = lc4Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1g)) {
            return false;
        }
        x1g x1gVar = (x1g) obj;
        return cqk.d(this.a, x1gVar.a) && this.b.equals(x1gVar.b) && cqk.d(this.c, x1gVar.c) && cqk.d(this.d, x1gVar.d) && cqk.d(this.e, x1gVar.e) && this.f == x1gVar.f;
    }

    public final int hashCode() {
        int iH = bc1.h(this.a.hashCode() * 31, 31, this.b);
        ynh ynhVar = this.c;
        int iC = qv1.c((iH + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.d);
        lc4 lc4Var = this.e;
        return Boolean.hashCode(this.f) + ((iC + (lc4Var != null ? lc4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(messageIds=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ", checkBoxRow=" + this.e + ", memorizeKeybord=" + this.f + ")";
    }
}
