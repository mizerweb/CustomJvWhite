package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e8d implements g8d {
    public final ynh a;
    public final ynh b;

    public e8d(ynh ynhVar, ynh ynhVar2) {
        this.a = ynhVar;
        this.b = ynhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8d)) {
            return false;
        }
        e8d e8dVar = (e8d) obj;
        return this.a.equals(e8dVar.a) && cqk.d(this.b, e8dVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        return Integer.hashCode(R.drawable.icon_warning) + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSnackbar(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", icon=");
        return zo5.t(sb, R.drawable.icon_warning, ")");
    }
}
