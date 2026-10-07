package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hi4 {
    public final e70 a;
    public final String b;
    public final List c;

    public hi4(e70 e70Var, String str, ArrayList arrayList) {
        this.a = e70Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        e70 e70Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hi4) {
            hi4 hi4Var = (hi4) obj;
            if (Objects.equals(this.b, hi4Var.b) && this.a == (e70Var = hi4Var.a) && Objects.equals(this.c, e70Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartMessage{media='");
        sb.append(this.a);
        sb.append("'text='");
        sb.append(this.b);
        sb.append("'elements='");
        return qv1.n("'}", sb, this.c);
    }
}
