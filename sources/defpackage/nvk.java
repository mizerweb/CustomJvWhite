package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class nvk extends qvk {
    Object[] a = new Object[4];
    int b = 0;
    boolean c;

    public nvk(int i) {
    }

    private final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length >= i) {
            if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.a = Arrays.copyOf(objArr, i2);
        this.c = false;
    }

    @Override // defpackage.qvk
    public /* bridge */ /* synthetic */ qvk a(Object obj) {
        throw null;
    }

    public final nvk b(Object obj) {
        obj.getClass();
        d(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final qvk c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size() + this.b);
            if (collection instanceof tvk) {
                this.b = ((tvk) collection).a(this.a, this.b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
