package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xpb {
    public final Object a;
    public int b;
    public final /* synthetic */ ypb c;

    public xpb(ypb ypbVar, int i) {
        this.c = ypbVar;
        this.a = ypbVar.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        ypb ypbVar = this.c;
        if (i == -1 || i >= ypbVar.c || !ndl.c(obj, ypbVar.a[i])) {
            this.b = ypbVar.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return ypbVar.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xpb) {
            xpb xpbVar = (xpb) obj;
            if (a() == xpbVar.a() && ndl.c(this.a, xpbVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iA = a();
        return iA == 1 ? strValueOf : qt4.j(iA, strValueOf, " x ");
    }
}
