package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class fw extends tw3 {
    public final dw b;

    public fw(aw8 aw8Var) {
        super(aw8Var);
        this.b = new dw(aw8Var.d());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.b;
    }

    @Override // defpackage.k0
    public final Object e() {
        return new ArrayList();
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new ArrayList((Collection) null);
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return (ArrayList) obj;
    }

    @Override // defpackage.sw3
    public final void m(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
