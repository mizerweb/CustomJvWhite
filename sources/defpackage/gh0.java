package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gh0 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public gh0(int i, int i2, int i3, int i4, int i5, String str) {
        this.a = i;
        if (str == null) {
            ore.n("Null mediaType");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gh0) {
            gh0 gh0Var = (gh0) obj;
            if (this.a == gh0Var.a && this.b.equals(gh0Var.b) && this.c == gh0Var.c && this.d == gh0Var.d && this.e == gh0Var.e && this.f == gh0Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return zo5.t(sb, this.f, "}");
    }
}
