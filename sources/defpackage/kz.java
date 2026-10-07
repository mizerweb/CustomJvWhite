package defpackage;

import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class kz extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                kz kzVar = new kz((b00) obj2, lq4Var, 0);
                kzVar.f = ((Boolean) obj).booleanValue();
                return kzVar;
            case 1:
                kz kzVar2 = new kz((MainActivity) obj2, lq4Var, 1);
                kzVar2.f = ((Boolean) obj).booleanValue();
                return kzVar2;
            default:
                kz kzVar3 = new kz((a4c) obj2, lq4Var, 2);
                kzVar3.f = ((Boolean) obj).booleanValue();
                return kzVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((kz) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((kz) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((kz) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lq4 lq4Var = null;
        switch (this.e) {
            case 0:
                boolean z = this.f;
                ch3.d0(obj);
                b00 b00Var = (b00) this.g;
                p3c p3cVar = b00Var.O;
                zv8[] zv8VarArr = b00.R;
                int i = 0;
                vo8 vo8Var = (vo8) p3cVar.m(b00Var, zv8VarArr[0]);
                int i2 = 1;
                boolean z2 = vo8Var != null && vo8Var.isActive();
                String str = (String) ((b00) this.g).A.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.q("check subscription state, hasSubs:", ", curIsActive:", z, z2), null);
                    }
                }
                if (z && !z2) {
                    b00 b00Var2 = (b00) this.g;
                    wo8 wo8VarA = vd7.a();
                    int i3 = 0;
                    int i4 = 3;
                    fk2 fk2VarP = e9i.p(new fz6(new fz6(b00Var2.E.d(), new qob(b00Var2, lq4Var, 5)), new bp(2, b00Var2, b00.class, "handleEvent", "handleEvent(Lru/ok/tamtam/chats/ChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i3, 1), i4));
                    dq4 dq4Var = b00Var2.l;
                    e9i.j0(fk2VarP, cqk.D(dq4Var, wo8VarA));
                    ij4 ij4Var = b00Var2.F;
                    tz tzVar = new tz(0, new wz(new q8e(ij4Var.c), i));
                    ghb ghbVar = ew5.b;
                    j3 j3VarN = tre.N(tzVar, qe7.O(1, lw5.SECONDS), new dz(i));
                    int i5 = 2;
                    e9i.j0(e9i.p(e9i.T(new fz6(new j3(j3VarN, i5, b00Var2), new bp(i5, b00Var2, b00.class, "handleEvent", "handleEvent(Lru/ok/tamtam/chats/ChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i3, 2), i4), ((n0c) b00Var2.C).a())), cqk.D(dq4Var, wo8VarA));
                    e9i.j0(e9i.p(new fz6(tre.N(new tz(1, new wz(new q8e(ij4Var.c), i2)), qe7.O(1000, lw5.MILLISECONDS), new dz(i2)), new bp(2, b00Var2, b00.class, "handleContactsUpdateEvent", "handleContactsUpdateEvent(Lru/ok/tamtam/contacts/ContactEvent$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i3, 3), i4)), cqk.D(dq4Var, wo8VarA));
                    b00Var2.O.B(b00Var2, zv8VarArr[0], wo8VarA);
                } else if (!z && z2) {
                    b00 b00Var3 = (b00) this.g;
                    b00Var3.O.B(b00Var3, zv8VarArr[0], null);
                }
                break;
            case 1:
                boolean z3 = this.f;
                ch3.d0(obj);
                nhb.m.g(((MainActivity) this.g).getApplicationContext(), z3);
                break;
            default:
                boolean z4 = this.f;
                ch3.d0(obj);
                String str2 = ((a4c) this.g).b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.s("allowSensitive=", z4), null);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
