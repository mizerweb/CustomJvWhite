package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class evl {
    public final String a;
    public final bvl b;
    public final String c;
    public final zul d;

    public /* synthetic */ evl(xde xdeVar) {
        this.a = (String) xdeVar.b;
        this.b = (bvl) xdeVar.c;
        this.c = (String) xdeVar.d;
        this.d = (zul) xdeVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof evl)) {
            return false;
        }
        evl evlVar = (evl) obj;
        return f55.h(this.a, evlVar.a) && f55.h(null, null) && f55.h(this.b, evlVar.b) && f55.h(null, null) && f55.h(this.c, evlVar.c) && f55.h(this.d, evlVar.d) && f55.h(null, null) && f55.h(null, null) && f55.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, null, this.c, this.d, null, null, null});
    }
}
