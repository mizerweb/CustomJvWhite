package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class ogj {
    public static final ngj Companion = new ngj();
    public final String a;
    public final boolean b;

    public /* synthetic */ ogj(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            shl.b(i, 3, mgj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogj)) {
            return false;
        }
        ogj ogjVar = (ogj) obj;
        return cqk.d(this.a, ogjVar.a) && this.b == ogjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppChangeScreenBrightness(requestId=" + this.a + ", maxBrightness=" + this.b + ")";
    }

    public ogj(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
