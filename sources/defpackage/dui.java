package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dui extends kih {
    public final String c;

    public dui(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dui) && cqk.d(this.c, ((dui) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("Response(error=", this.c, ")");
    }
}
