package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e7b extends c2 {
    public transient d7b g;

    @Override // defpackage.c2, defpackage.v2
    public final Map d() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new l2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new o2(this, (SortedMap) map) : new j2(this, map);
    }

    @Override // defpackage.c2, defpackage.v2
    public final Set f() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new m2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new p2(this, (SortedMap) map) : new k2(this, map);
    }

    @Override // defpackage.c2
    public final Collection h() {
        return (List) this.g.get();
    }
}
