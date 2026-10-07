package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lme extends eh2 {
    public final iaj a;
    public final List b;
    public final yp7 c;
    public final gb2 d;

    public lme(iaj iajVar, List list, yp7 yp7Var, gb2 gb2Var) {
        this.a = iajVar;
        this.b = list;
        this.c = yp7Var;
        this.d = gb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lme) {
            lme lmeVar = (lme) obj;
            return this.a == lmeVar.a && this.b.equals(lmeVar.b) && this.c == lmeVar.c && this.d == lmeVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + nbh.n((this.c.hashCode() + qv1.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
