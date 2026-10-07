package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ak5 implements aw8 {
    public static bk5 e() {
        return bk5.d;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        bk5.e.a(u76Var, ((bk5) obj).a);
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        boolean zD;
        gt8 gt8Var = r55Var instanceof gt8 ? (gt8) r55Var : null;
        if (gt8Var == null) {
            return new bk5((Map) bk5.e.c(r55Var));
        }
        Object objF = gt8Var.f();
        if (!(objF instanceof cu8)) {
            if ((objF instanceof pu8) && cqk.d(((pu8) objF).a(), "all")) {
                ma6 ma6Var = xj5.y;
                int iP0 = wm9.P0(yw3.W0(ma6Var, 10));
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                Iterator it = ma6Var.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((xj5) it.next()).a, Boolean.TRUE);
                }
                return new bk5(linkedHashMap);
            }
            return bk5.d;
        }
        Map map = (Map) objF;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wm9.P0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            jt8 jt8Var = (jt8) entry.getValue();
            pu8 pu8Var = jt8Var instanceof pu8 ? (pu8) jt8Var : null;
            if (pu8Var != null) {
                hg8 hg8Var = kt8.a;
                String strA = pu8Var.a();
                String[] strArr = m5h.a;
                zD = cqk.d(strA.equalsIgnoreCase("true") ? Boolean.TRUE : strA.equalsIgnoreCase("false") ? Boolean.FALSE : null, Boolean.TRUE);
            } else {
                zD = false;
            }
            linkedHashMap2.put(key, Boolean.valueOf(zD));
        }
        return new bk5(linkedHashMap2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return bk5.f;
    }

    public final aw8 serializer() {
        return bk5.b;
    }
}
