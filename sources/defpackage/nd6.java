package defpackage;

import androidx.work.WorkRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class nd6 implements rj6 {
    public final /* synthetic */ int a;

    public /* synthetic */ nd6(int i) {
        this.a = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return new xm8(2, Executors.newSingleThreadExecutor());
            default:
                lu8 lu8Var = new lu8();
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    ore.n("Null flags");
                    return null;
                }
                map.put(vhd.a, new ti0(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 86400000L, set));
                if (set == null) {
                    ore.n("Null flags");
                    return null;
                }
                map.put(vhd.c, new ti0(1000L, 86400000L, set));
                if (set == null) {
                    ore.n("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(b3f.b)));
                if (setUnmodifiableSet == null) {
                    ore.n("Null flags");
                    return null;
                }
                map.put(vhd.b, new ti0(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= vhd.values().length) {
                    new HashMap();
                    return new si0(lu8Var, map);
                }
                ore.k("Not all priorities have been configured");
                return null;
        }
    }
}
