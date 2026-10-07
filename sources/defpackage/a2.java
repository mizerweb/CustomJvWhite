package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends b2 implements RandomAccess {
    public final b2 a;
    public final int b;
    public final int c;

    public a2(b2 b2Var, int i, int i2) {
        this.a = b2Var;
        this.b = i;
        e9i.w(i, i2, b2Var.getSize());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.b2, java.util.List
    public final List subList(int i, int i2) {
        e9i.w(i, i2, this.c);
        int i3 = this.b;
        return new a2(this.a, i + i3, i3 + i2);
    }
}
