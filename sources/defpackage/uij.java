package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uij extends wij {
    public final String c;
    public final lnb d;
    public final boolean e;

    public uij(String str, lnb lnbVar, boolean z) {
        this.c = str;
        this.d = lnbVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uij)) {
            return false;
        }
        uij uijVar = (uij) obj;
        return cqk.d(this.c, uijVar.c) && this.d == uijVar.d && this.e == uijVar.e;
    }

    @Override // defpackage.wij
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notification(queryId=");
        sb.append(this.c);
        sb.append(", notificationType=");
        sb.append(this.d);
        sb.append(", disableVibrationFallback=");
        return qt4.r(sb, this.e, ")");
    }
}
