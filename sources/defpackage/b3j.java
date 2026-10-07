package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b3j {
    public final z2j a;
    public volatile long b = -1;

    public b3j(z2j z2jVar) {
        this.a = z2jVar;
    }

    @l7h
    public final void onEvent(t3b t3bVar) {
        Object next;
        e70 e70Var;
        if (t3bVar.a != this.b) {
            return;
        }
        this.a.o().f(this);
        rt2 rt2VarK = this.a.p().K(this.a.g);
        z2j z2jVar = this.a;
        if (rt2VarK == null) {
            z2jVar.o().c(new yq0(this.a.a, new yhh("attachment.token.expired", "chat deleted", null)));
            return;
        }
        sfa sfaVarF = z2jVar.r().f(rt2VarK.a, this.a.h);
        if (sfaVarF == null || sfaVarF.j == wja.DELETED) {
            this.a.o().c(new yq0(this.a.a, new yhh("attachment.token.expired", "message deleted", null)));
            return;
        }
        if (sfaVarF.n == null) {
            this.a.o().c(new yq0(this.a.a, new yhh("attachment.token.expired", "attaches not found", null)));
        }
        long j = this.a.f;
        c46 c46Var = sfaVarF.n;
        if (c46Var == null) {
            e70Var = null;
        } else {
            Iterator it = ((List) c46Var.a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e70) next).d.a != j);
            e70Var = (e70) next;
        }
        if (e70Var == null) {
            this.a.o().c(new yq0(this.a.a, new yhh("attachment.token.expired", "video deleted", null)));
            return;
        }
        d70 d70Var = e70Var.d;
        z2j z2jVar2 = this.a;
        z2j z2jVar3 = new z2j(z2jVar2.a, z2jVar2.f, z2jVar2.g, z2jVar2.h, sfaVarF.a, z2jVar2.j, z2jVar2.k, z2jVar2.l, d70Var.o, true, z2jVar2.o);
        bq bqVar = this.a.e;
        ((dme) (bqVar != null ? bqVar : null).S.getValue()).h(z2jVar3, z2jVar3, false);
    }

    @l7h
    public final void onEvent(s3b s3bVar) {
        if (s3bVar.a != this.b) {
            return;
        }
        this.a.o().f(this);
        this.a.o().c(new yq0(this.a.a, s3bVar.b));
    }
}
