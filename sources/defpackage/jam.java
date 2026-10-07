package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jam extends h5m {
    public final transient tdm c;
    public final transient Object[] d;
    public final transient int e = 1;

    public jam(tdm tdmVar, Object[] objArr) {
        this.c = tdmVar;
        this.d = objArr;
    }

    @Override // defpackage.apl
    public final int a(Object[] objArr) {
        xyl d9mVar = this.b;
        if (d9mVar == null) {
            d9mVar = new d9m(this);
            this.b = d9mVar;
        }
        return d9mVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xyl d9mVar = this.b;
        if (d9mVar == null) {
            d9mVar = new d9m(this);
            this.b = d9mVar;
        }
        return d9mVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
