package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public interface pf2 extends nc2, bli {
    @Override // defpackage.nc2
    default nf2 a() {
        return j();
    }

    gqb b();

    be2 d();

    default pd2 e() {
        return td2.a;
    }

    default void f(pd2 pd2Var) {
    }

    default void g(boolean z) {
    }

    void h(Collection collection);

    nf2 j();

    default boolean k() {
        return a().j() == 0;
    }

    default boolean m() {
        return false;
    }

    void n(ArrayList arrayList);

    default void o() {
    }

    default boolean p() {
        return true;
    }

    default void q(boolean z) {
    }

    e89 release();
}
