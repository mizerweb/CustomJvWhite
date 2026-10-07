package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hqi extends oqi {
    public final tnh a;
    public final ynh b;
    public final Integer c;

    public hqi(tnh tnhVar, ynh ynhVar, Integer num) {
        this.a = tnhVar;
        this.b = ynhVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqi)) {
            return false;
        }
        hqi hqiVar = (hqi) obj;
        return this.a.equals(hqiVar.a) && this.b.equals(hqiVar.b) && cqk.d(this.c, hqiVar.c);
    }

    public final int hashCode() {
        int iH = bc1.h(Integer.hashCode(this.a.c) * 31, 31, this.b);
        Integer num = this.c;
        return iH + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowLinkSnackbar(text=" + this.a + ", description=" + this.b + ", icon=" + this.c + ")";
    }
}
