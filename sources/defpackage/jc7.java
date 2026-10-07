package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jc7 {
    public static final jc7 d = new jc7(null, 7);
    public final rui a;
    public final int b;
    public final int c;

    public /* synthetic */ jc7(rui ruiVar, int i) {
        this((i & 1) != 0 ? null : ruiVar, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc7)) {
            return false;
        }
        jc7 jc7Var = (jc7) obj;
        return cqk.d(this.a, jc7Var.a) && this.b == jc7Var.b && this.c == jc7Var.c;
    }

    public final int hashCode() {
        rui ruiVar = this.a;
        return Integer.hashCode(this.c) + zo5.c(this.b, (ruiVar == null ? 0 : ruiVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return zo5.t(sb, this.c, ")");
    }

    public jc7(rui ruiVar, int i, int i2) {
        this.a = ruiVar;
        this.b = i;
        this.c = i2;
    }
}
