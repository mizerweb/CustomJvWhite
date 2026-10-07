package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tmd implements vmd {
    public final ynh a;
    public final ynh b;
    public final List c;

    public tmd(ynh ynhVar, vnh vnhVar, List list) {
        this.a = ynhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmd)) {
            return false;
        }
        tmd tmdVar = (tmd) obj;
        return cqk.d(this.a, tmdVar.a) && cqk.d(this.b, tmdVar.b) && cqk.d(this.c, tmdVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        return this.c.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return qv1.n(")", sb, this.c);
    }
}
