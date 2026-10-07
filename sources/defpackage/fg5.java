package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class fg5 implements kli {
    public final Provider a;
    public final omi b;
    public volatile uli c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public fg5(Provider provider, omi omiVar) {
        this.a = provider;
        this.b = omiVar;
    }

    public static final uli m(fg5 fg5Var) {
        if (fg5Var.d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        uli uliVar = fg5Var.c;
        if (uliVar != null) {
            return uliVar;
        }
        uli uliVar2 = (uli) fg5Var.a.get();
        if (fg5Var.d.get()) {
            uliVar2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        fg5Var.c = uliVar2;
        return uliVar2;
    }

    @Override // defpackage.kli
    public final xf5 a(List list, List list2, List list3, jd9 jd9Var, oe oeVar, long j) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.a(list, list2, list3, jd9Var, oeVar, j) : yab.h(this.b.f, null, 0, new i53(this, null, list, list2, list3, jd9Var, oeVar, j), 3);
    }

    @Override // defpackage.kli
    public final Object b(mdh mdhVar) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.b(mdhVar) : yab.K0(ch3.m(this.b.e), new eg5(this, null, 0), mdhVar);
    }

    @Override // defpackage.kli
    public final List c(ArrayList arrayList, int i, int i2, int i3) {
        int size = arrayList.size();
        uli uliVar = this.c;
        if (uliVar != null) {
            return uliVar.c(arrayList, i, i2, i3);
        }
        dq4 dq4Var = this.b.f;
        ya yaVar = new ya(this, null, arrayList, i, i2, i3);
        lq4 lq4Var = null;
        yf5 yf5VarH = yab.h(dq4Var, null, 0, yaVar, 3);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(yab.h(this.b.f, null, 0, new w93(yf5VarH, i4, lq4Var, 4), 3));
        }
        return arrayList2;
    }

    @Override // defpackage.kli
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        yab.i0(this.b.f, null, 0, new jhc((lq4) null, this), 3);
    }

    @Override // defpackage.kli
    public final xf5 d(LinkedHashSet linkedHashSet, boolean z) {
        uli uliVar = this.c;
        if (uliVar != null) {
            return uliVar.d(linkedHashSet, z);
        }
        return yab.h(this.b.f, null, 0, new qi4(this, (lq4) null, z, linkedHashSet, 5), 3);
    }

    @Override // defpackage.kli
    public final xf5 e() {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.e() : yab.h(this.b.f, null, 0, new eg5(this, null, 1), 3);
    }

    @Override // defpackage.kli
    public final xf5 f() {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.f() : yab.h(this.b.f, null, 0, new eg5(this, null, 2), 3);
    }

    @Override // defpackage.kli
    public final xf5 g(List list, List list2, List list3) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.g(list, list2, list3) : yab.h(this.b.f, null, 0, new vk4(this, (lq4) null, list, list2, list3, 10), 3);
    }

    @Override // defpackage.kli
    public final xf5 h(jc2 jc2Var, Map map) {
        uli uliVar = this.c;
        if (uliVar != null) {
            return uliVar.h(jc2Var, map);
        }
        return yab.h(this.b.f, null, 0, new jd3(this, (lq4) null, jc2Var, map, 22), 3);
    }

    @Override // defpackage.kli
    public final xf5 i(int i) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.i(i) : yab.h(this.b.f, null, 0, new w93(this, (lq4) null, i), 3);
    }

    @Override // defpackage.kli
    public final xf5 j(List list) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.j(list) : yab.h(this.b.f, null, 0, new qc5(this, (lq4) null, list), 3);
    }

    @Override // defpackage.kli
    public final xf5 k(Map map, jli jliVar, s94 s94Var) {
        uli uliVar = this.c;
        return uliVar != null ? uliVar.k(map, jliVar, s94Var) : yab.h(this.b.f, null, 0, new vk4(this, (lq4) null, map, jliVar, s94Var, 9), 3);
    }

    @Override // defpackage.kli
    public final xf5 l(Map map, s94 s94Var) {
        uli uliVar = this.c;
        if (uliVar != null) {
            return uliVar.l(map, s94Var);
        }
        return yab.h(this.b.f, null, 0, new jd3(this, (lq4) null, map, s94Var, 21), 3);
    }
}
