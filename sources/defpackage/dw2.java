package defpackage;

import java.util.Collections;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw2 implements tg4, t65 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dw2(long j, kmd kmdVar, boolean z, ha9 ha9Var) {
        this.a = j;
        this.c = kmdVar;
        this.b = z;
        this.d = ha9Var;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        qw2 qw2Var = (qw2) this.c;
        qw2Var.h0((sfa) this.d, this.b, (tw2) obj);
        qw2Var.o.c(new wo3(Collections.singletonList(Long.valueOf(this.a)), true));
    }

    @Override // defpackage.t65
    public Object t() {
        return new ProfileScreen(this.a, (kmd) this.c, this.b, (ha9) this.d);
    }

    public /* synthetic */ dw2(qw2 qw2Var, sfa sfaVar, boolean z, long j) {
        this.c = qw2Var;
        this.d = sfaVar;
        this.b = z;
        this.a = j;
    }
}
