package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qe8 implements se8 {
    public final String a;
    public final tnh b;
    public final tnh c;

    public qe8(String str, tnh tnhVar, tnh tnhVar2) {
        this.a = str;
        this.b = tnhVar;
        this.c = tnhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe8)) {
            return false;
        }
        qe8 qe8Var = (qe8) obj;
        return cqk.d(this.a, qe8Var.a) && this.b.equals(qe8Var.b) && this.c.equals(qe8Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_download_round_fill) + zo5.c(this.c.c, zo5.c(this.b.c, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Download(url=" + this.a + ", snackTitle=" + this.b + ", snackText=" + this.c + ", snackIcon=" + R.drawable.icon_download_round_fill + ")";
    }
}
