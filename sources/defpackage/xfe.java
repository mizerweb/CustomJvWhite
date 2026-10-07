package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xfe extends sw3 {
    public final rv8 b;
    public final yv c;

    public xfe(rv8 rv8Var, aw8 aw8Var) {
        super(aw8Var);
        this.b = rv8Var;
        this.c = new yv(aw8Var.d(), 0);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.c;
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
    public final Iterator g(Object obj) {
        return new y1(1, (Object[]) obj);
    }

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((qr3) this.b).d(), arrayList.size()));
    }

    @Override // defpackage.sw3
    public final void m(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
