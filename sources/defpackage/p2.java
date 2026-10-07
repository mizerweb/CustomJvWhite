package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class p2 extends k2 implements SortedSet {
    public final /* synthetic */ e7b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(e7b e7bVar, SortedMap sortedMap) {
        super(e7bVar, sortedMap);
        this.d = e7bVar;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new p2(this.d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new p2(this.d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new p2(this.d, a().tailMap(obj));
    }
}
