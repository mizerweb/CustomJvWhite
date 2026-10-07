package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class meg {
    public final List a;
    public final ll9 b;
    public final qgc c;
    public final boolean d;

    public meg(List list, ll9 ll9Var, qgc qgcVar, boolean z) {
        this.a = list;
        this.b = ll9Var;
        this.c = qgcVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meg)) {
            return false;
        }
        meg megVar = (meg) obj;
        return cqk.d(this.a, megVar.a) && cqk.d(this.b, megVar.b) && cqk.d(this.c, megVar.c) && this.d == megVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ll9 ll9Var = this.b;
        int iHashCode2 = (iHashCode + (ll9Var == null ? 0 : ll9Var.hashCode())) * 31;
        qgc qgcVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (qgcVar != null ? qgcVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ", isP2GCallAnimationDepended=" + this.d + ")";
    }
}
