package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d2m {
    private final z1m a;
    private final Integer b;
    private final Integer c = null;
    private final Boolean d = null;

    public /* synthetic */ d2m(x1m x1mVar, b2m b2mVar) {
        this.a = x1mVar.a;
        this.b = x1mVar.b;
    }

    public final z1m a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2m)) {
            return false;
        }
        d2m d2mVar = (d2m) obj;
        return f55.h(this.a, d2mVar.a) && f55.h(this.b, d2mVar.b) && f55.h(null, null) && f55.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
