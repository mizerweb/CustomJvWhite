package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n3g implements vpa {
    public final ynh a;
    public final Integer b;
    public final ynh c;

    public /* synthetic */ n3g(ynh ynhVar, Integer num, ynh ynhVar2, int i) {
        this(ynhVar, (i & 4) != 0 ? null : ynhVar2, (i & 2) != 0 ? Integer.valueOf(R.drawable.icon_warning) : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3g)) {
            return false;
        }
        n3g n3gVar = (n3g) obj;
        return cqk.d(this.a, n3gVar.a) && cqk.d(this.b, n3gVar.b) && cqk.d(this.c, n3gVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.c;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }

    public n3g(ynh ynhVar, ynh ynhVar2, Integer num) {
        this.a = ynhVar;
        this.b = num;
        this.c = ynhVar2;
    }
}
