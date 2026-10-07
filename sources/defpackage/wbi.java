package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wbi {
    public final int a;
    public final ynh b;

    public wbi(int i, ynh ynhVar) {
        this.a = i;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbi)) {
            return false;
        }
        wbi wbiVar = (wbi) obj;
        return this.a == wbiVar.a && this.b.equals(wbiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ButtonData(buttonId=" + this.a + ", title=" + this.b + ")";
    }
}
