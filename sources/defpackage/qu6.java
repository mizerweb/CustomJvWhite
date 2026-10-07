package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qu6 implements ohf {
    public final ohf a;
    public final boolean b;
    public final cf7 c;

    public qu6(ohf ohfVar, boolean z, cf7 cf7Var) {
        this.a = ohfVar;
        this.b = z;
        this.c = cf7Var;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new pu6(this);
    }
}
