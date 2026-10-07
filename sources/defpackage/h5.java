package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public final r3f a;

    public h5(r3f r3fVar) {
        this.a = r3fVar;
    }

    public ArrayList a(int i) {
        return this.a.b(i);
    }

    public ifh b(int i) {
        return new ifh(new p3f(i, this.a));
    }

    public Object c(int i) {
        return this.a.c(i, true);
    }

    public ifh d(int i) {
        return new ifh(new q3f(this.a, i, true));
    }

    public o3f e(int i) {
        return new wwd() { // from class: o3f
            public final /* synthetic */ int b;
            public final /* synthetic */ boolean c;

            public /* synthetic */ o3f() {
                i = i;
                z = z;
            }

            @Override // defpackage.wwd
            public final Object get() {
                return r3fVar.c(i, z);
            }
        };
    }

    public Object f() {
        return this.a.c(331, false);
    }

    public ifh g() {
        return new ifh(new q3f(this.a, 331, false));
    }
}
