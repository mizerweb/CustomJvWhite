package defpackage;

import android.graphics.Rect;
import android.util.Range;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface nf2 {
    default fh2 B() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new re2() { // from class: mf2
            @Override // defpackage.re2
            public final List a(List list) {
                String strG = this.b.g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    nf2 nf2Var = (nf2) it.next();
                    qyj.i(nf2Var instanceof nf2);
                    if (nf2Var.g().equals(strG)) {
                        return Collections.singletonList(nf2Var);
                    }
                }
                ore.k(c0a.o("Unable to find camera with id ", strG, " from list of available cameras."));
                return null;
            }
        });
        linkedHashSet.add(new b09(j()));
        return new fh2(linkedHashSet);
    }

    String C();

    int D(int i);

    p86 F();

    List G();

    b99 H();

    Set L();

    b99 b();

    Set c();

    int d();

    boolean e();

    String g();

    Rect h();

    default void i(ljf ljfVar) {
        a2m.a = ljfVar;
    }

    int j();

    Object k();

    boolean m();

    void o(Executor executor, ygd ygdVar);

    s2e p();

    List q(int i);

    Set r();

    void s(zc2 zc2Var);

    boolean t();

    b99 u();

    default nf2 v() {
        return this;
    }

    List w(Range range);

    boolean x();

    msh z();
}
