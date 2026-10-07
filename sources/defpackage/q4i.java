package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q4i implements ohf {
    public final Object a;
    public final cf7 b;
    public final int c = 1;
    public final cf7 d;

    public q4i(Object obj, cf7 cf7Var, cf7 cf7Var2) {
        this.a = obj;
        this.b = cf7Var;
        this.d = cf7Var2;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new at6(this);
    }
}
