package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class hzk extends rwk {
    private final transient owk c;
    private final transient Object[] d;
    private final transient int e = 1;

    public hzk(owk owkVar, Object[] objArr, int i, int i2) {
        this.c = owkVar;
        this.d = objArr;
    }

    @Override // defpackage.tvk
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    @Override // defpackage.tvk, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // defpackage.rwk, defpackage.tvk
    /* JADX INFO: renamed from: d */
    public final f0l iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.rwk
    public final iwk i() {
        return new ezk(this);
    }

    @Override // defpackage.rwk, defpackage.tvk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
