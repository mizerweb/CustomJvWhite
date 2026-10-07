package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m1e {
    public static final m1e c = new m1e(Collections.EMPTY_LIST, mh0.c);
    public final List a;
    public final mh0 b;

    public m1e(List list, mh0 mh0Var) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = mh0Var;
    }

    public static m1e a(pi0 pi0Var, mh0 mh0Var) {
        qyj.k(pi0Var, "quality cannot be null");
        qyj.k(mh0Var, "fallbackStrategy cannot be null");
        qyj.h("Invalid quality: " + pi0Var, pi0.l.contains(pi0Var));
        return new m1e(Collections.singletonList(pi0Var), mh0Var);
    }

    public static m1e b(List list, mh0 mh0Var) {
        qyj.k(list, "qualities cannot be null");
        qyj.k(mh0Var, "fallbackStrategy cannot be null");
        qyj.h("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pi0 pi0Var = (pi0) it.next();
            qyj.h("qualities contain invalid quality: " + pi0Var, pi0.l.contains(pi0Var));
        }
        return new m1e(list, mh0Var);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
