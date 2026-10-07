package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 {
    public static final cb0 e = new cb0(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cb0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = vqi.O(i3) ? vqi.v(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return this.a == cb0Var.a && this.b == cb0Var.b && this.c == cb0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return qt4.p(sb, this.c, ']');
    }

    public cb0(b87 b87Var) {
        this(b87Var.G, b87Var.F, b87Var.H);
    }
}
