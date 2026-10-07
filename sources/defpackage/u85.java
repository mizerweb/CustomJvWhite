package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes4.dex */
public final class u85 extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ y85 i;
    public final /* synthetic */ Conversation j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ ugc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u85(boolean z, boolean z2, int i, y85 y85Var, Conversation conversation, boolean z3, int i2, ugc ugcVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = y85Var;
        this.j = conversation;
        this.k = z3;
        this.l = i2;
        this.m = ugcVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        u85 u85Var = new u85(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
        u85Var.e = obj;
        return u85Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        u85 u85Var = (u85) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        u85Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gu4 gu4Var = (gu4) this.e;
        ch3.d0(obj);
        boolean z = this.f;
        Conversation conversation = this.j;
        y85 y85Var = this.i;
        if (z) {
            yab.i0(gu4Var, null, 0, new wd9(this.h, y85Var, conversation, (lq4) null), 3);
        }
        if (this.g) {
            yab.i0(gu4Var, null, 0, new t85(this.k, this.l, y85Var, this.m, conversation, null), 3);
        }
        return sbi.a;
    }
}
