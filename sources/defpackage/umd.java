package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class umd implements vmd {
    public final ynh a;
    public final Integer b;
    public final boolean c;

    public /* synthetic */ umd(ynh ynhVar, Integer num, boolean z, int i) {
        this(ynhVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umd)) {
            return false;
        }
        umd umdVar = (umd) obj;
        return cqk.d(this.a, umdVar.a) && cqk.d(this.b, umdVar.b) && this.c == umdVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSnackbar(title=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", checkContainerParams=");
        return qt4.r(sb, this.c, ")");
    }

    public umd(ynh ynhVar, Integer num, boolean z) {
        this.a = ynhVar;
        this.b = num;
        this.c = z;
    }
}
