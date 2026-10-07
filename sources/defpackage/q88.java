package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q88 extends r88 {
    public Object[] a;
    public int b;
    public boolean c;

    public q88(int i) {
        oc9.p(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        g(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Object... objArr) {
        int length = objArr.length;
        ch3.e(objArr, length);
        g(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public void e(Object... objArr) {
        d(objArr);
    }

    public final void f(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(collection.size());
            if (collection instanceof s88) {
                this.b = ((s88) collection).b(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        int iB = r88.b(objArr.length, this.b + i);
        if (iB > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iB);
            this.c = false;
        }
    }
}
