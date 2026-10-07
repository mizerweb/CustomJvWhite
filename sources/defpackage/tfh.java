package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tfh {
    public final String a;
    public final int b;
    public final int c;

    public tfh(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfh)) {
            return false;
        }
        tfh tfhVar = (tfh) obj;
        return cqk.d(this.a, tfhVar.a) && this.b == tfhVar.b && this.c == tfhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return qt4.p(sb, this.c, ')');
    }
}
