package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w94 extends kih {
    public final String c;
    public final lni d;

    public w94(String str, lni lniVar) {
        this.c = str;
        this.d = lniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w94)) {
            return false;
        }
        w94 w94Var = (w94) obj;
        return this.c.equals(w94Var.c) && cqk.d(this.d, w94Var.d);
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        lni lniVar = this.d;
        return iHashCode + (lniVar == null ? 0 : lniVar.hashCode());
    }

    public final lni i() {
        return this.d;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(hash=" + this.c + ", userSettings=" + this.d + ")";
    }
}
