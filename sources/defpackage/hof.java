package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hof extends kof {
    public final /* synthetic */ int b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hof(Set set, Set set2, int i) {
        super(1);
        this.b = i;
        this.c = set;
        this.d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.b;
        Set set = this.d;
        Set set2 = this.c;
        switch (i) {
            case 0:
                return set2.contains(obj) && set.contains(obj);
            default:
                return set2.contains(obj) && !((jag) set).d.equals(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.b) {
            case 0:
                return this.c.containsAll(collection) && this.d.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.b;
        Set set = this.c;
        Set set2 = this.d;
        switch (i) {
            case 0:
                return Collections.disjoint(set2, set);
            default:
                return ((jag) set2).containsAll(set);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return new un8(this);
            default:
                return new un8(this, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.b;
        Set set = this.d;
        Set set2 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (set.contains(it.next())) {
                        i2++;
                    }
                }
                break;
            default:
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!((jag) set).d.equals(it2.next())) {
                        i2++;
                    }
                }
                break;
        }
        return i2;
    }
}
