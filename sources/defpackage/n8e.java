package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface n8e extends t94 {
    @Override // defpackage.t94
    default Object b(bh0 bh0Var, Object obj) {
        return getConfig().b(bh0Var, obj);
    }

    @Override // defpackage.t94
    default Set c() {
        return getConfig().c();
    }

    @Override // defpackage.t94
    default Set d(bh0 bh0Var) {
        return getConfig().d(bh0Var);
    }

    @Override // defpackage.t94
    default boolean f(bh0 bh0Var) {
        return getConfig().f(bh0Var);
    }

    @Override // defpackage.t94
    default s94 g(bh0 bh0Var) {
        return getConfig().g(bh0Var);
    }

    t94 getConfig();

    @Override // defpackage.t94
    default Object i(bh0 bh0Var) {
        return getConfig().i(bh0Var);
    }

    @Override // defpackage.t94
    default void j(hu huVar) {
        getConfig().j(huVar);
    }

    @Override // defpackage.t94
    default Object k(bh0 bh0Var, s94 s94Var) {
        return getConfig().k(bh0Var, s94Var);
    }
}
