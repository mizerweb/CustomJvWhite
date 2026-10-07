package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fd0 extends kih {
    public final String c;
    public final String d;

    public fd0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj;
        return this.c.equals(fd0Var.c) && this.d.equals(fd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.w("Response(trackId='", this.c, "',email='", ch3.y(this.d), "')");
    }
}
