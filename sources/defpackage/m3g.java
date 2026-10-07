package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m3g extends ck4 {
    public final tnh a;
    public final int b;
    public final ynh c;

    public m3g(tnh tnhVar, int i, tnh tnhVar2) {
        this.a = tnhVar;
        this.b = i;
        this.c = tnhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3g)) {
            return false;
        }
        m3g m3gVar = (m3g) obj;
        return cqk.d(this.a, m3gVar.a) && this.b == m3gVar.b && cqk.d(this.c, m3gVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31);
        ynh ynhVar = this.c;
        return iC + (ynhVar == null ? 0 : ynhVar.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }

    public /* synthetic */ m3g(tnh tnhVar) {
        this(tnhVar, R.drawable.icon_check_round_fill, null);
    }
}
