package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e69 extends im9 {
    public final xt7 c;

    public e69(aw8 aw8Var, aw8 aw8Var2) {
        super(aw8Var, aw8Var2);
        this.c = new xt7("kotlin.collections.LinkedHashMap", aw8Var.d(), aw8Var2.d());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.c;
    }

    @Override // defpackage.k0
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
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
        return new LinkedHashMap((Map) null);
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return (LinkedHashMap) obj;
    }
}
