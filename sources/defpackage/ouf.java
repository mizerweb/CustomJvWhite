package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ouf extends mk0 {
    public final ynh b;
    public final Integer c;

    public ouf(ynh ynhVar, Integer num) {
        super(18);
        this.b = ynhVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouf)) {
            return false;
        }
        ouf oufVar = (ouf) obj;
        return this.b.equals(oufVar.b) && this.c.equals(oufVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}
