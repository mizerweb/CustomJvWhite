package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yt7 extends im9 {
    public final xt7 c;

    public yt7(aw8 aw8Var, aw8 aw8Var2) {
        super(aw8Var, aw8Var2);
        this.c = new xt7(aw8Var.d(), aw8Var2.d());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.c;
    }

    @Override // defpackage.k0
    public final Object e() {
        return new HashMap();
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((HashMap) obj).size() * 2;
    }

    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((Map) obj).size();
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new HashMap((Map) null);
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return (HashMap) obj;
    }
}
