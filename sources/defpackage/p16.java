package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p16 implements q16 {
    public final vnh a;

    public p16(vnh vnhVar) {
        this.a = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p16) && this.a.equals(((p16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(textSource=" + this.a + ")";
    }
}
