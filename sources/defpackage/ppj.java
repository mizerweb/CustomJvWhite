package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class ppj {
    public static final opj Companion = new opj();
    public final String a;
    public final boolean b;

    public /* synthetic */ ppj(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            shl.b(i, 3, npj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppj)) {
            return false;
        }
        ppj ppjVar = (ppj) obj;
        return cqk.d(this.a, ppjVar.a) && this.b == ppjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorResponse(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }

    public ppj(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
