package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r44 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ u44 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ u44 f;

    public r44(u44 u44Var, int i) {
        this.e = i;
        this.f = u44Var;
        this.d = u44Var;
        this.a = u44Var.e;
        this.b = u44Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object t44Var;
        u44 u44Var = this.d;
        if (u44Var.e != this.a) {
            c.c();
            return null;
        }
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.e;
        u44 u44Var2 = this.f;
        switch (i2) {
            case 0:
                t44Var = u44Var2.j()[i];
                break;
            case 1:
                t44Var = new t44(u44Var2, i);
                break;
            default:
                t44Var = u44Var2.k()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= u44Var.f) {
            i3 = -1;
        }
        this.b = i3;
        return t44Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u44 u44Var = this.d;
        if (u44Var.e != this.a) {
            c.c();
            return;
        }
        lvb.Z("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        u44Var.remove(u44Var.j()[this.c]);
        this.b--;
        this.c = -1;
    }
}
