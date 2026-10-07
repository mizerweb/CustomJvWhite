package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nhe extends u98 {
    public static final Object[] i;
    public static final nhe j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new nhe(0, 0, 0, objArr, objArr);
    }

    public nhe(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i2) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.s88
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iU = n1g.U(obj);
                while (true) {
                    int i2 = iU & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iU = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s88
    public final int d() {
        return this.h;
    }

    @Override // defpackage.s88
    public final int f() {
        return 0;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return false;
    }

    @Override // defpackage.u98, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.u98
    public final c98 n() {
        return c98.j(this.d, this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
