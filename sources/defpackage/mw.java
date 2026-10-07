package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class mw extends h6g implements Map {
    public gw d;
    public iw e;
    public kw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(h6g h6gVar) {
        super(0);
        int i = h6gVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(h6gVar.f(i2), h6gVar.i(i2));
            }
        } else if (i > 0) {
            a.P0(0, 0, i, h6gVar.a, this.a);
            a.Q0(0, 0, i << 1, h6gVar.b, this.b);
            this.c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        gw gwVar = this.d;
        if (gwVar != null) {
            return gwVar;
        }
        gw gwVar2 = new gw(this);
        this.d = gwVar2;
        return gwVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        iw iwVar = this.e;
        if (iwVar != null) {
            return iwVar;
        }
        iw iwVar2 = new iw(this);
        this.e = iwVar2;
        return iwVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        kw kwVar = this.f;
        if (kwVar != null) {
            return kwVar;
        }
        kw kwVar2 = new kw(this);
        this.f = kwVar2;
        return kwVar2;
    }
}
