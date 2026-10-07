package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o5a {
    public final n4j a;
    public final xb0 b;
    public final int c;

    public o5a(n4j n4jVar, xb0 xb0Var, int i) {
        this.a = n4jVar;
        this.b = xb0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a)) {
            return false;
        }
        o5a o5aVar = (o5a) obj;
        return cqk.d(this.a, o5aVar.a) && this.b.equals(o5aVar.b) && this.c == o5aVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return qt4.p(sb, this.c, '}');
    }
}
