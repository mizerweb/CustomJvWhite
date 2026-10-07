package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xgc {
    public static final xgc b = new xgc(null);
    public final Object a;

    public xgc(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        qr7.d();
        return null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xgc)) {
            return false;
        }
        xgc xgcVar = (xgc) obj;
        return xgcVar == this || Objects.equals(this.a, xgcVar.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
