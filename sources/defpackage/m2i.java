package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m2i implements ohf {
    public final ohf a;
    public final cf7 b;

    public m2i(ohf ohfVar, cf7 cf7Var) {
        this.a = ohfVar;
        this.b = cf7Var;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new l2i(this);
    }
}
