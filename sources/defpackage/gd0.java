package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gd0 extends kih {
    public final String c;

    public gd0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd0) && this.c.equals(((gd0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("Response(trackId='", this.c, "')");
    }
}
