package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class gjj {
    public static final fjj Companion = new fjj();
    public static final ny8[] d = {null, rx8.P(2, new o0j(13)), null};
    public final String a;
    public final lnb b;
    public final boolean c;

    public /* synthetic */ gjj(int i, String str, lnb lnbVar, boolean z) {
        if (7 != (i & 7)) {
            shl.b(i, 7, ejj.a.d());
            throw null;
        }
        this.a = str;
        this.b = lnbVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjj)) {
            return false;
        }
        gjj gjjVar = (gjj) obj;
        return cqk.d(this.a, gjjVar.a) && this.b == gjjVar.b && this.c == gjjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppHapticFeedbackNotification(requestId=");
        sb.append(this.a);
        sb.append(", notificationType=");
        sb.append(this.b);
        sb.append(", disableVibrationFallback=");
        return qt4.r(sb, this.c, ")");
    }
}
