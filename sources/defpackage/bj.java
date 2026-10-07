package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class bj implements v71 {
    public final ek a;
    public final int b;

    public bj(ek ekVar, int i) {
        this.a = ekVar;
        this.b = i;
    }

    @Override // defpackage.v71
    public final String a() {
        return null;
    }

    @Override // defpackage.v71
    public final boolean b(Uri uri) {
        return this.a.b(uri);
    }

    @Override // defpackage.v71
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.b == bjVar.b && this.a.equals(bjVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.x(this.a, "imageCacheKey");
        dc9VarC.u(this.b, "frameIndex");
        return dc9VarC.toString();
    }
}
