package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qd9 implements Iterable, uv8 {
    public final int a;
    public final zv b = new zv();
    public int c;

    public qd9(int i) {
        this.a = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        be9[] be9VarArr;
        synchronized (this.b) {
            be9VarArr = (be9[]) this.b.toArray(new be9[0]);
        }
        return new y1(1, be9VarArr);
    }
}
