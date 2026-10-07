package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class e47 extends xde {
    @Override // defpackage.xde
    public final Set A() {
        Set<xyc> setR = r();
        LinkedHashSet linkedHashSet = new LinkedHashSet(setR.size());
        for (xyc xycVar : setR) {
            if (xycVar.c == 6) {
                linkedHashSet.add(Long.valueOf(xycVar.a));
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.xde
    public final xyc M(long j) {
        if (i37.f.values().contains(Long.valueOf(j))) {
            return new xyc(6, 6, j);
        }
        return null;
    }
}
