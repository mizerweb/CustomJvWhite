package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class bl8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public bl8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public final void a(Collection collection) {
        je9 je9Var = je9.d;
        if (collection.isEmpty()) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "bl8", zo5.h(collection.size(), "invalidateChats, contactsIds.size = "), null);
        }
        b bVar = (b) this.c.getValue();
        nv4 nv4Var = new nv4(19, this);
        m8b m8bVarX = rx8.X(bVar.g(collection, nv4Var, bVar.g), bVar.g(collection, nv4Var, bVar.h));
        m8b m8bVar = new m8b();
        qw2 qw2Var = (qw2) this.a.getValue();
        qw2Var.getClass();
        for (rt2 rt2Var : qw2Var.i.values()) {
            Set setKeySet = rt2Var.b.e.keySet();
            if (setKeySet == null || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (collection.contains((Long) it.next())) {
                        rt2 rt2VarO = ((qw2) this.a.getValue()).o(rt2Var);
                        fda fdaVar = rt2VarO.c;
                        if (fdaVar != null && m8bVarX.d(fdaVar.a.a)) {
                            ((qw2) this.a.getValue()).g0(rt2VarO.a, rt2VarO.c.a, true, null);
                            m8bVar.a(rt2VarO.b.a);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        if (m8bVar.j()) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "bl8", c0a.o("Contacts in following chats were invalidated: [", m8b.k(m8bVar, 31), "]"), null);
            }
            ((h5c) this.d.getValue()).h(m8bVar);
        }
    }
}
