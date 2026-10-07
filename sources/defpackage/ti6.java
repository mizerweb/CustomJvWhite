package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ti6 extends kih {
    public final Long c;
    public final String d;

    public ti6(String str, Long l) {
        this.c = l;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti6)) {
            return false;
        }
        ti6 ti6Var = (ti6) obj;
        return cqk.d(this.c, ti6Var.c) && cqk.d(this.d, ti6Var.d);
    }

    public final int hashCode() {
        Long l = this.c;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(botId=" + this.c + ", startParam=" + this.d + ")";
    }
}
