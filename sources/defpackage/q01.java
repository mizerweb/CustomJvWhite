package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q01 extends kih {
    public final List c;
    public final pj4 d;
    public final dig e;

    public q01(List list, pj4 pj4Var, dig digVar) {
        this.c = list;
        this.d = pj4Var;
        this.e = digVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01)) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return cqk.d(this.c, q01Var.c) && cqk.d(this.d, q01Var.d) && cqk.d(this.e, q01Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        pj4 pj4Var = this.d;
        int iHashCode2 = (iHashCode + (pj4Var == null ? 0 : pj4Var.hashCode())) * 31;
        dig digVar = this.e;
        return iHashCode2 + (digVar != null ? digVar.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.d + ", startMessage=" + this.e + ")";
    }
}
