package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mge extends LinkedHashMap {
    public final /* synthetic */ qf4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mge(qf4 qf4Var, int i) {
        super(i, 0.75f, true);
        this.a = qf4Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
