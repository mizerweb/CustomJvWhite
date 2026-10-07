package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class z8b extends a9b implements yv8, zv8 {
    public z8b(Class cls, String str, String str2) {
        super(l72.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.l72
    public final qv8 computeReflected() {
        zfe.a.getClass();
        return this;
    }

    @Override // defpackage.yv8
    public final void f() {
        ((z8b) getReflected()).f();
    }

    @Override // defpackage.yv8
    public Object get(Object obj) {
        f();
        throw null;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
