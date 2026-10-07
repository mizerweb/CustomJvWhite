package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jjj {
    public static final ijj Companion = new ijj();
    public static final ny8[] c = {null, rx8.P(2, new o0j(14))};
    public final String a;
    public final ojj b;

    public /* synthetic */ jjj(int i, String str, ojj ojjVar) {
        if (3 != (i & 3)) {
            shl.b(i, 3, hjj.a.d());
            throw null;
        }
        this.a = str;
        this.b = ojjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjj)) {
            return false;
        }
        jjj jjjVar = (jjj) obj;
        return cqk.d(this.a, jjjVar.a) && this.b == jjjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppHapticFeedbackResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public jjj(String str, ojj ojjVar) {
        this.a = str;
        this.b = ojjVar;
    }
}
