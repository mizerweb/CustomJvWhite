package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qj7 implements Iterator, uv8 {
    public Object a;
    public int b = -2;
    public final /* synthetic */ rj7 c;

    public qj7(rj7 rj7Var) {
        this.c = rj7Var;
    }

    public final void a() {
        int i = this.b;
        rj7 rj7Var = this.c;
        Object objInvoke = i == -2 ? ((af7) rj7Var.b).invoke() : ((cf7) rj7Var.c).invoke(this.a);
        this.a = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            qr7.d();
            return null;
        }
        Object obj = this.a;
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
