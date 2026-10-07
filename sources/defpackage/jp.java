package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jp {
    public final int a;
    public final v2a b;
    public final eo c;
    public final String d;

    public jp(v2a v2aVar, eo eoVar, String str) {
        this.b = v2aVar;
        this.c = eoVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{v2aVar, eoVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return f55.h(this.b, jpVar.b) && f55.h(this.c, jpVar.c) && f55.h(this.d, jpVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
