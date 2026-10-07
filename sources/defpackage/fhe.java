package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class fhe extends g98 {
    public static final fhe i = new fhe();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;
    public final transient fhe h;

    public fhe(Object[] objArr, int i2) {
        this.e = objArr;
        this.g = i2;
        this.f = 0;
        int iJ = i2 >= 2 ? u98.j(i2) : 0;
        Object objJ = lhe.j(objArr, i2, iJ, 0);
        if (objJ instanceof Object[]) {
            throw ((f98) ((Object[]) objJ)[2]).a();
        }
        this.d = objJ;
        Object objJ2 = lhe.j(objArr, i2, iJ, 1);
        if (objJ2 instanceof Object[]) {
            throw ((f98) ((Object[]) objJ2)[2]).a();
        }
        this.h = new fhe(objJ2, objArr, i2, this);
    }

    @Override // defpackage.g98
    public final u98 b() {
        return new ihe(this, this.e, this.f, this.g);
    }

    @Override // defpackage.g98
    public final u98 c() {
        return new jhe(this, new khe(this.e, this.f, this.g));
    }

    @Override // defpackage.g98
    public final s88 d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.g98
    public final boolean f() {
        return false;
    }

    @Override // defpackage.g98, java.util.Map
    public final Object get(Object obj) {
        Object objK = lhe.k(this.d, this.e, this.g, this.f, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // defpackage.g98
    /* JADX INFO: renamed from: h */
    public final s88 values() {
        return this.h.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.g98, java.util.Map
    public final Collection values() {
        return this.h.keySet();
    }

    public fhe(Object obj, Object[] objArr, int i2, fhe fheVar) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.g = i2;
        this.h = fheVar;
    }

    public fhe() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.g = 0;
        this.h = this;
    }
}
