package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j98 extends AbstractMap {
    public final gri[] a;

    public j98(gri[] griVarArr) {
        this.a = griVarArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new gw(this.a);
    }
}
