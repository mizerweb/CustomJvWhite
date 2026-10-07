package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2f extends wed {
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;

    public c2f(gu4 gu4Var, int i) {
        super(gu4Var, "", (i & 4) != 0 ? 0 : 300, (i & 8) != 0 ? 1 : 2);
        this.j = new ConcurrentHashMap(1);
        this.k = new ConcurrentHashMap(1);
    }

    @Override // defpackage.wed
    public void p(Object obj) {
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.e;
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var2)) {
            a4cVar.c(je9Var2, str, c0a.n(obj, "onCancel for "), null);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.j.computeIfPresent(obj, new mw1(11, new wf0(21)));
        if (concurrentHashMap != null) {
            boolean zRemove = this.j.remove(obj, concurrentHashMap);
            String str2 = this.g;
            if (zRemove) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onCancel: for scheduledValues.remove(" + obj + ", values)", null);
                }
            } else {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str2, "onCancel: scheduledValues.remove(" + obj + ", values) fail!", null);
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.k.get(obj);
        if (concurrentHashMap2 != null) {
            boolean zRemove2 = this.k.remove(obj, concurrentHashMap2);
            String str3 = this.g;
            if (zRemove2) {
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str3, "onCancel: for scheduledOwners.remove(" + obj + ", it)", null);
                    return;
                }
                return;
            }
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, str3, "onCancel: scheduledOwners.remove(" + obj + ", it) fail!", null);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append("(values={");
        for (Map.Entry entry : this.j.entrySet()) {
            sb.append(entry.getKey());
            sb.append(':');
            sb.append(((ConcurrentHashMap) entry.getValue()).size());
            sb.append(',');
        }
        sb.append("}owners={");
        for (Map.Entry entry2 : this.k.entrySet()) {
            sb.append(entry2.getKey());
            sb.append(':');
            sb.append(((ConcurrentHashMap) entry2.getValue()).size());
            sb.append(',');
        }
        sb.append("})");
        return sb.toString();
    }

    public abstract boolean u(Object obj);

    public final a2f v(Long l, String str, Object obj) {
        boolean zU = u(obj);
        String str2 = this.g;
        if (zU) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, c0a.n(obj, "schedule: dropValue "), null);
                }
            }
            return null;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.e;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "schedule: owner=" + str + ", value=" + obj + ", scheduledValues=[" + this.j.keySet() + "]", null);
            }
        }
        this.k.compute(l, new mw1(12, new uv2(obj, 10, str)));
        this.j.compute(l, new mw1(13, new z1f(obj, this, str, l)));
        return new a2f(this, str, l, obj);
    }

    public abstract long w(Long l);
}
