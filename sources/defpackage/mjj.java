package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class mjj {
    public static final ljj Companion = new ljj();
    public final String a;
    public final boolean b;

    public /* synthetic */ mjj(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            shl.b(i, 3, kjj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjj)) {
            return false;
        }
        mjj mjjVar = (mjj) obj;
        return cqk.d(this.a, mjjVar.a) && this.b == mjjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppHapticFeedbackSelectionChange(requestId=" + this.a + ", disableVibrationFallback=" + this.b + ")";
    }
}
