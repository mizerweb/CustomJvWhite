package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ww7 extends xw7 {
    public final String a;

    public ww7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww7) && this.a.equals(((ww7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Time(time=", this.a, ")");
    }
}
