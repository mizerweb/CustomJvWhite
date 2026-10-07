package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uod extends vod {
    public final ynh a;
    public final Integer b;

    public uod(ynh ynhVar, Integer num) {
        this.a = ynhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uod)) {
            return false;
        }
        uod uodVar = (uod) obj;
        return this.a.equals(uodVar.a) && this.b.equals(uodVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
