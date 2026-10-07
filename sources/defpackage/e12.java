package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e12 {
    public final du1 a;
    public final dnf b;
    public final xmf c;

    public e12(du1 du1Var, dnf dnfVar, xmf xmfVar) {
        dnfVar.getClass();
        this.a = du1Var;
        this.b = dnfVar;
        this.c = xmfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e12)) {
            return false;
        }
        e12 e12Var = (e12) obj;
        return this.a.equals(e12Var.a) && cqk.d(this.b, e12Var.b) && cqk.d(this.c, e12Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        xmf xmfVar = this.c;
        return iHashCode + (xmfVar == null ? 0 : xmfVar.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
