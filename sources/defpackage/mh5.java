package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mh5 implements ohf {
    public final CharSequence a;
    public final int b;
    public final qf7 c;

    public mh5(CharSequence charSequence, int i, qf7 qf7Var) {
        this.a = charSequence;
        this.b = i;
        this.c = qf7Var;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new lh5(this);
    }
}
