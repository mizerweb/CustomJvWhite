package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j17 extends k17 {
    public final /* synthetic */ Iterable[] a;

    public j17(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i17 i17Var = new i17(this, this.a.length);
        xn8 xn8Var = new xn8();
        xn8Var.b = wn8.e;
        xn8Var.c = i17Var;
        return xn8Var;
    }
}
