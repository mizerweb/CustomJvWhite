package defpackage;

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bw implements Iterator, uv8 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public bw(ka6 ka6Var) {
        this.a = 2;
        this.c = ka6Var;
        this.b = ka6Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((float[]) obj).length;
            case 1:
                return this.b < ((Menu) obj).size();
            case 2:
                return this.b > 0;
            case 3:
                return this.b < ((SparseArray) obj).size();
            case 4:
                return this.b < ((byte[]) obj).length;
            case 5:
                return this.b < ((int[]) obj).length;
            case 6:
                return this.b < ((long[]) obj).length;
            default:
                return this.b < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return Float.valueOf(((float[]) obj)[i2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    ore.f(e.getMessage());
                    return null;
                }
            case 1:
                int i3 = this.b;
                this.b = i3 + 1;
                MenuItem item = ((Menu) obj).getItem(i3);
                if (item != null) {
                    return item;
                }
                ore.i();
                return null;
            case 2:
                ka6 ka6Var = (ka6) obj;
                int i4 = ka6Var.c;
                int i5 = this.b;
                this.b = i5 - 1;
                return ka6Var.e[i4 - i5];
            case 3:
                int i6 = this.b;
                this.b = i6 + 1;
                return ((SparseArray) obj).valueAt(i6);
            case 4:
                int i7 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i7 < bArr.length) {
                    this.b = i7 + 1;
                    return new s9i(bArr[i7]);
                }
                ore.f(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.b;
                int[] iArr = (int[]) obj;
                if (i8 < iArr.length) {
                    this.b = i8 + 1;
                    return new x9i(iArr[i8]);
                }
                ore.f(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.b;
                long[] jArr = (long[]) obj;
                if (i9 < jArr.length) {
                    this.b = i9 + 1;
                    return new cai(jArr[i9]);
                }
                ore.f(String.valueOf(i9));
                return null;
            default:
                int i10 = this.b;
                short[] sArr = (short[]) obj;
                if (i10 < sArr.length) {
                    this.b = i10 + 1;
                    return new iai(sArr[i10]);
                }
                ore.f(String.valueOf(i10));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        sbi sbiVar;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                Menu menu = (Menu) this.c;
                int i = this.b - 1;
                this.b = i;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    sbiVar = sbi.a;
                } else {
                    sbiVar = null;
                }
                if (sbiVar != null) {
                    return;
                }
                ore.i();
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ bw(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
