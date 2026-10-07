package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ij extends tu3 {
    public ixj c;
    public final /* synthetic */ jj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(jj jjVar) {
        super(1);
        this.d = jjVar;
    }

    @Override // defpackage.tu3
    public final void e(swj swjVar) {
        jj jjVar = this.d;
        if (!jjVar.g && jjVar.k == swjVar.a.c()) {
            jjVar.k = -1;
            jjVar.j();
            ixj ixjVar = jjVar.e;
            if (ixjVar != null) {
                jjVar.c(ixjVar);
            }
        }
    }

    @Override // defpackage.tu3
    public final void f(swj swjVar) {
        rwj rwjVar = swjVar.a;
        jj jjVar = this.d;
        if (jjVar.g || jjVar.k != -1 || (rwjVar.c() & jjVar.j) == 0) {
            return;
        }
        jjVar.k = rwjVar.c();
        this.c = jjVar.e;
        jjVar.k();
    }

    @Override // defpackage.tu3
    public final ixj g(ixj ixjVar, List list) {
        Object next;
        jj jjVar = this.d;
        if (!jjVar.g) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((swj) next).a.c() != jjVar.k);
            if (((swj) next) != null) {
                return jjVar.i(jj.g(jjVar, ixjVar));
            }
        }
        return ixjVar;
    }

    @Override // defpackage.tu3
    public final wze h(swj swjVar, wze wzeVar) {
        ixj ixjVar;
        jj jjVar = this.d;
        if (!jjVar.g && (ixjVar = this.c) != null && jjVar.k == swjVar.a.c()) {
            ixj ixjVarG = jj.g(jjVar, ixjVar);
            jjVar.h(ixjVarG, wzeVar);
            jjVar.i(ixjVarG);
        }
        return wzeVar;
    }
}
