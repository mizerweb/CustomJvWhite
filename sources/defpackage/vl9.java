package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vl9 extends x2 {
    public final /* synthetic */ int a;
    public final ul9 b;

    public /* synthetic */ vl9(ul9 ul9Var, int i) {
        this.a = i;
        this.b = ul9Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        ul9 ul9Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ul9Var.getClass();
                int iF = ul9Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                return cqk.d(ul9Var.b[iF], entry.getValue());
            default:
                return ul9Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                ul9 ul9Var = this.b;
                ul9Var.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iF = ul9Var.f(entry.getKey());
                        if (!(iF < 0 ? false : cqk.d(ul9Var.b[iF], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.x2
    public final int getSize() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        ul9 ul9Var = this.b;
        switch (i) {
            case 0:
                ul9Var.getClass();
                return new ql9(ul9Var, 0);
            default:
                ul9Var.getClass();
                return new ql9(ul9Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        ul9 ul9Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ul9Var.c();
                    int iF = ul9Var.f(entry.getKey());
                    if (iF >= 0 && cqk.d(ul9Var.b[iF], entry.getValue())) {
                        ul9Var.i(iF);
                        return true;
                    }
                }
                return false;
            default:
                ul9Var.c();
                int iF2 = ul9Var.f(obj);
                if (iF2 < 0) {
                    return false;
                }
                ul9Var.i(iF2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        ul9 ul9Var = this.b;
        switch (i) {
            case 0:
                ul9Var.c();
                break;
            default:
                ul9Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        ul9 ul9Var = this.b;
        switch (i) {
            case 0:
                ul9Var.c();
                break;
            default:
                ul9Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
