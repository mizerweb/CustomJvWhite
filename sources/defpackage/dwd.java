package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dwd extends fwd implements yv8 {
    public dwd(Class cls, String str, String str2, int i) {
        super(l72.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.l72
    public final qv8 computeReflected() {
        zfe.a.getClass();
        return this;
    }

    @Override // defpackage.yv8
    public final void f() {
        ((yv8) getReflected()).f();
    }

    public Object get(Object obj) {
        f();
        throw null;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
