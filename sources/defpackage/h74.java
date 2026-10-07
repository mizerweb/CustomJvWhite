package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface h74 {
    default Object a(Class cls) {
        return i(x0e.a(cls));
    }

    xwd d(x0e x0eVar);

    xwd g(x0e x0eVar);

    default Object i(x0e x0eVar) {
        xwd xwdVarG = g(x0eVar);
        if (xwdVarG == null) {
            return null;
        }
        return xwdVarG.get();
    }

    default Set k(x0e x0eVar) {
        return (Set) d(x0eVar).get();
    }

    default xwd n(Class cls) {
        return g(x0e.a(cls));
    }
}
