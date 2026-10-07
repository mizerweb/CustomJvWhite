package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.tamtam.folders.usecases.NotFoundFolderException;

/* JADX INFO: loaded from: classes3.dex */
public final class sfi extends cr0 {
    public final ny8 e;
    public final String f;

    public sfi(ny8 ny8Var, ny8 ny8Var2, ed6 ed6Var) {
        super(ny8Var, ny8Var2, ed6Var);
        this.e = ny8Var;
        this.f = sfi.class.getName();
    }

    public final Object h(String str, String str2, m8b m8bVar, m8b m8bVar2, Set set, Set set2, t20 t20Var) {
        sbi sbiVar = sbi.a;
        String str3 = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, c0a.o("Updating chats 'relative' for folder(", str, ")"), null);
            }
        }
        r17 r17Var = (r17) ((sy4) this.e.getValue()).j(str).getValue();
        if (r17Var == null) {
            npk.a((ed6) this.a, new NotFoundFolderException(str));
        }
        if (r17Var == null) {
            gm0.Y(sfi.class.getName(), "Early return in execute cuz of it == null");
            return sbiVar;
        }
        Set setY = (set.isEmpty() && set2.isEmpty()) ? null : lof.Y(lof.Z(r17Var.d, set), set2);
        m8b m8bVarJ0 = rx8.j0(r17Var.e);
        m8bVarJ0.b(m8bVar);
        m8bVarJ0.o(m8bVar2);
        Object objG = g(cr0.e(r17Var, str2, m8bVarJ0, new LinkedHashSet(lof.Y(r17Var.j, rx8.l0(m8bVar2))), setY), t20Var);
        return objG == hu4.a ? objG : sbiVar;
    }
}
