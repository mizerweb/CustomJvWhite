package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class xi0 {
    public static final xi0 d = new xi0(0, 2, null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final kf4 f = new kf4(new xi0(0, 1, null));
    public final int a;
    public final int b;
    public final dj0 c;

    public xi0(int i, int i2, dj0 dj0Var) {
        this.a = i;
        if (i2 == 0) {
            ore.n("Null streamState");
            throw null;
        }
        this.b = i2;
        this.c = dj0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        if (this.a != xi0Var.a || !qt4.e(this.b, xi0Var.b)) {
            return false;
        }
        dj0 dj0Var = xi0Var.c;
        dj0 dj0Var2 = this.c;
        if (dj0Var2 == null) {
            return dj0Var == null;
        }
        return dj0Var2.equals(dj0Var);
    }

    public final int hashCode() {
        int iD = (((this.a ^ 1000003) * 1000003) ^ qt4.D(this.b)) * 1000003;
        dj0 dj0Var = this.c;
        return (dj0Var == null ? 0 : dj0Var.hashCode()) ^ iD;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "INACTIVE";
        } else {
            str = "ACTIVE";
        }
        sb.append(str);
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
