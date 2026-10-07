package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ihe extends u98 {
    public final transient g98 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    public ihe(g98 g98Var, Object[] objArr, int i, int i2) {
        this.d = g98Var;
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i) {
        return a().b(objArr, i);
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return true;
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.u98
    public final c98 n() {
        return new hhe(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
