package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ddb implements aw8 {
    public static void e() {
        ddb ddbVar = edb.d;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        edb.f.a(u76Var, ((edb) obj).a);
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        List<String> list = (List) edb.f.c(r55Var);
        if (list.isEmpty()) {
            return edb.e;
        }
        pw pwVar = new pw(0);
        mw mwVar = new mw(0);
        for (String str : list) {
            int iU0 = r5h.U0(str, ':', 0, 6);
            if (iU0 == -1) {
                String string = r5h.y1(str).toString();
                if (string.length() != 0) {
                    pwVar.add(string);
                    mwVar.remove(string);
                }
            } else {
                String string2 = r5h.y1(str.substring(0, iU0)).toString();
                String string3 = r5h.y1(str.substring(iU0 + 1)).toString();
                if (string2.length() != 0 && string3.length() != 0 && !pwVar.contains(string2)) {
                    Object pwVar2 = mwVar.get(string2);
                    if (pwVar2 == null) {
                        pwVar2 = new pw(0);
                        mwVar.put(string2, pwVar2);
                    }
                    ((Set) pwVar2).add(string3);
                }
            }
        }
        return (pwVar.isEmpty() && mwVar.isEmpty()) ? edb.e : new edb(list, mwVar, pwVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return edb.g;
    }

    public final aw8 serializer() {
        return edb.d;
    }
}
