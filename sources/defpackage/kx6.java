package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kx6 implements ohf {
    public final ohf a;
    public final cf7 b;
    public final cf7 c;

    public kx6(ohf ohfVar, cf7 cf7Var, cf7 cf7Var2) {
        this.a = ohfVar;
        this.b = cf7Var;
        this.c = cf7Var2;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new pu6(this);
    }
}
