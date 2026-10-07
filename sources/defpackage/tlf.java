package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class tlf extends mjf {
    public final long b;
    public final long c;

    public tlf(uw uwVar) {
        this.b = uwVar.b;
        this.c = uwVar.c;
    }

    @Override // defpackage.mjf
    public final void B() {
        String name = tlf.class.getName();
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        long j2 = this.c;
        gm0.m(name, "process, chatId = %d, botId = %d, suspend = %b", lValueOf, Long.valueOf(j2), Boolean.TRUE);
        if (i().N(j) == null) {
            return;
        }
        qw2 qw2VarI = i();
        qw2VarI.getClass();
        qw2VarI.v(j, false, new hw2(true, 0));
        qw2 qw2VarI2 = i();
        qw2VarI2.getClass();
        gm0.m("qw2", "clearDraft, chatId = %d", Long.valueOf(j));
        rt2 rt2VarN = qw2VarI2.N(j);
        if (rt2VarN == null) {
            gm0.W("qw2", "clearDraft: chat is null", new Object[0]);
        } else {
            long j3 = rt2VarN.b.f0;
            gm0.m("qw2", "Change draft: %d, draft = %s draftUpdateTime = %d", Long.valueOf(j), null, Long.valueOf(j3));
            qw2VarI2.v(j, false, new gw2(qw2VarI2, j3, 0));
            qw2VarI2.o.c(new wo3(Collections.singletonList(Long.valueOf(j)), true));
        }
        pvb pvbVarB = b();
        long j4 = this.b;
        long jT = !pvbVarB.j(j4) ? 0L : pvb.t(pvbVarB, new qch(pvbVarB.u().a.g(), j4, true, this.c));
        w().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j)), true, false, (mg5) null, (cid) null, (Set) null, 124));
        w().c(new so4(jT, Collections.singletonList(Long.valueOf(j2))));
    }
}
