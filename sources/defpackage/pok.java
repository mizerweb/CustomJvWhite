package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pok extends dok {
    public final transient ynk c;
    public final transient Object[] d;
    public final transient int e;

    public pok(ynk ynkVar, Object[] objArr, int i) {
        this.c = ynkVar;
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.wmk
    public final int a(Object[] objArr) {
        jnk nokVar = this.b;
        if (nokVar == null) {
            nokVar = new nok(this);
            this.b = nokVar;
        }
        return nokVar.a(objArr);
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
        jnk nokVar = this.b;
        if (nokVar == null) {
            nokVar = new nok(this);
            this.b = nokVar;
        }
        return nokVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
