package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class w7l {
    private final n3m a;
    private final Boolean c;
    private final fam e;
    private final iwk f;
    private final iwk g;
    private final Boolean b = null;
    private final d2m d = null;

    public /* synthetic */ w7l(q7l q7lVar, t7l t7lVar) {
        this.a = q7lVar.a;
        this.c = q7lVar.b;
        this.e = q7lVar.c;
        this.f = q7lVar.d;
        this.g = q7lVar.e;
    }

    public final iwk a() {
        return this.f;
    }

    public final iwk b() {
        return this.g;
    }

    public final n3m c() {
        return this.a;
    }

    public final fam d() {
        return this.e;
    }

    public final Boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w7l)) {
            return false;
        }
        w7l w7lVar = (w7l) obj;
        return f55.h(this.a, w7lVar.a) && f55.h(null, null) && f55.h(this.c, w7lVar.c) && f55.h(null, null) && f55.h(this.e, w7lVar.e) && f55.h(this.f, w7lVar.f) && f55.h(this.g, w7lVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.c, null, this.e, this.f, this.g});
    }
}
