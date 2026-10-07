package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rqd extends erd {
    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        if (equals(oqd.a)) {
            return k79Var instanceof oqd;
        }
        if (this instanceof pqd) {
            return k79Var instanceof pqd;
        }
        if (this instanceof qqd) {
            return (k79Var instanceof qqd) && ((qqd) this).a.a == ((qqd) k79Var).a.a;
        }
        ore.o();
        return false;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        if (equals(oqd.a)) {
            return k79Var instanceof oqd;
        }
        if (this instanceof pqd) {
            return k79Var instanceof pqd;
        }
        if (!(this instanceof qqd)) {
            ore.o();
            return false;
        }
        if (k79Var instanceof qqd) {
            if (((qqd) this).a.equals(((qqd) k79Var).a)) {
                return true;
            }
        }
        return false;
    }
}
