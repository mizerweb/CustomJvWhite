package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class yy8 extends r3 implements zy8, RandomAccess {
    public final ArrayList b;

    static {
        new yy8(10).a = false;
    }

    public yy8(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof zy8) {
            collection = ((zy8) collection).e();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.zy8
    public final List e() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof c71)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, wj8.a);
            if (rqi.a.d(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        c71 c71Var = (c71) obj;
        String str2 = c71Var.size() == 0 ? "" : new String(c71Var.b, c71Var.b(), c71Var.size(), wj8.a);
        int iB = c71Var.b();
        if (rqi.a.d(iB, c71Var.b, c71Var.size() + iB) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.zy8
    public final void h(c71 c71Var) {
        a();
        this.b.add(c71Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.vj8
    public final vj8 k(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            ore.a();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new yy8(arrayList2);
    }

    @Override // defpackage.zy8
    public final zy8 p() {
        return this.a ? new rci(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof c71)) {
            return new String((byte[]) objRemove, wj8.a);
        }
        c71 c71Var = (c71) objRemove;
        return c71Var.size() == 0 ? "" : new String(c71Var.b, c71Var.b(), c71Var.size(), wj8.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof c71)) {
            return new String((byte[]) obj2, wj8.a);
        }
        c71 c71Var = (c71) obj2;
        return c71Var.size() == 0 ? "" : new String(c71Var.b, c71Var.b(), c71Var.size(), wj8.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.zy8
    public final Object t(int i) {
        return this.b.get(i);
    }

    public yy8(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.r3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
