package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pud extends qud {
    public final Integer a;
    public final ynh b;
    public final ynh c;

    public /* synthetic */ pud(int i, ynh ynhVar, Integer num) {
        this((tnh) null, ynhVar, (i & 1) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pud)) {
            return false;
        }
        pud pudVar = (pud) obj;
        return cqk.d(this.a, pudVar.a) && cqk.d(this.b, pudVar.b) && cqk.d(this.c, pudVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iH = bc1.h((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        ynh ynhVar = this.c;
        return iH + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ", description=" + this.c + ")";
    }

    public pud(tnh tnhVar, ynh ynhVar, Integer num) {
        this.a = num;
        this.b = ynhVar;
        this.c = tnhVar;
    }
}
