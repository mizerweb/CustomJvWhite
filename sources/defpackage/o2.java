package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class o2 extends j2 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ e7b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(e7b e7bVar, SortedMap sortedMap) {
        super(e7bVar, sortedMap);
        this.f = e7bVar;
    }

    public SortedSet b() {
        return new p2(this.f, d());
    }

    @Override // defpackage.j2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new o2(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new o2(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new o2(this.f, d().tailMap(obj));
    }
}
