package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class dhc implements t94 {
    public static final ps0 b;
    public static final dhc c;
    public final TreeMap a;

    static {
        ps0 ps0Var = new ps0(21);
        b = ps0Var;
        c = new dhc(new TreeMap(ps0Var));
    }

    public dhc(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static dhc a(t94 t94Var) {
        if (dhc.class.equals(t94Var.getClass())) {
            return (dhc) t94Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (bh0 bh0Var : t94Var.c()) {
            Set<s94> setD = t94Var.d(bh0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (s94 s94Var : setD) {
                arrayMap.put(s94Var, t94Var.k(bh0Var, s94Var));
            }
            treeMap.put(bh0Var, arrayMap);
        }
        return new dhc(treeMap);
    }

    @Override // defpackage.t94
    public final Object b(bh0 bh0Var, Object obj) {
        Map map = (Map) this.a.get(bh0Var);
        return map == null ? obj : map.get((s94) Collections.min(map.keySet()));
    }

    @Override // defpackage.t94
    public final Set c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.t94
    public final Set d(bh0 bh0Var) {
        Map map = (Map) this.a.get(bh0Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.t94
    public final boolean f(bh0 bh0Var) {
        return this.a.containsKey(bh0Var);
    }

    @Override // defpackage.t94
    public final s94 g(bh0 bh0Var) {
        Map map = (Map) this.a.get(bh0Var);
        if (map != null) {
            return (s94) Collections.min(map.keySet());
        }
        qr7.y(bh0Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.t94
    public final Object i(bh0 bh0Var) {
        Map map = (Map) this.a.get(bh0Var);
        if (map != null) {
            return map.get((s94) Collections.min(map.keySet()));
        }
        qr7.y(bh0Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.t94
    public final void j(hu huVar) {
        for (Map.Entry entry : this.a.tailMap(new bh0("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((bh0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            bh0 bh0Var = (bh0) entry.getKey();
            uik uikVar = (uik) huVar.b;
            t94 t94Var = (t94) huVar.c;
            ((w8b) uikVar.b).l(bh0Var, t94Var.g(bh0Var), t94Var.i(bh0Var));
        }
    }

    @Override // defpackage.t94
    public final Object k(bh0 bh0Var, s94 s94Var) {
        Map map = (Map) this.a.get(bh0Var);
        if (map == null) {
            qr7.y(bh0Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(s94Var)) {
            return map.get(s94Var);
        }
        c.v("Option does not exist: ", bh0Var, " with priority=", s94Var);
        return null;
    }
}
