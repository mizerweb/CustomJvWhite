package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class mpj {
    public static final lpj Companion = new lpj();
    public final String a;
    public final boolean b;

    public /* synthetic */ mpj(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            shl.b(i, 3, kpj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpj)) {
            return false;
        }
        mpj mpjVar = (mpj) obj;
        return cqk.d(this.a, mpjVar.a) && this.b == mpjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorRequest(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }
}
