package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import one.me.members.list.MembersListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class z9a extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MembersListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9a(lq4 lq4Var, MembersListWidget membersListWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = membersListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MembersListWidget membersListWidget = this.g;
        switch (i) {
            case 0:
                z9a z9aVar = new z9a(lq4Var, membersListWidget, 0);
                z9aVar.f = obj;
                return z9aVar;
            case 1:
                z9a z9aVar2 = new z9a(lq4Var, membersListWidget, 1);
                z9aVar2.f = obj;
                return z9aVar2;
            case 2:
                z9a z9aVar3 = new z9a(lq4Var, membersListWidget, 2);
                z9aVar3.f = obj;
                return z9aVar3;
            default:
                z9a z9aVar4 = new z9a(lq4Var, membersListWidget, 3);
                z9aVar4.f = obj;
                return z9aVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((z9a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((z9a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((z9a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((z9a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        lq4 lq4Var = null;
        final int i2 = 1;
        switch (this.e) {
            case 0:
                MembersListWidget membersListWidget = this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                f9a f9aVar = (f9a) obj2;
                if (f9aVar instanceof d9a) {
                    zv8[] zv8VarArr = MembersListWidget.t;
                    v9a v9aVarR1 = membersListWidget.r1();
                    Collection collection = ((d9a) f9aVar).a;
                    sgg sggVar = v9aVarR1.l;
                    if (sggVar == null || !sggVar.isActive()) {
                        v9aVarR1.l = a8j.t(v9aVarR1, ((n0c) ((xhh) v9aVarR1.h.getValue())).a(), new qz9(v9aVarR1, collection, lq4Var, i), 2);
                    }
                } else {
                    if (!(f9aVar instanceof e9a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr2 = MembersListWidget.t;
                    v9a v9aVarR2 = membersListWidget.r1();
                    v9aVarR2.g.a(new u8a(v9aVarR2.c, v9aVarR2.d, v9aVarR2.k));
                    v9aVarR2.k = c76.a;
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                MembersListWidget membersListWidget2 = this.g;
                zv8[] zv8VarArr3 = MembersListWidget.t;
                ((baa) membersListWidget2.r1().i.getValue()).e((String) obj3);
                return sbi.a;
            case 2:
                List listSingletonList = r66.a;
                Object obj4 = this.f;
                ch3.d0(obj);
                p9a p9aVar = (p9a) obj4;
                boolean z = p9aVar.d;
                zsj zsjVar = this.g.k;
                if (z) {
                    zsjVar.H(listSingletonList);
                    this.g.l.H(listSingletonList);
                    qh1 qh1Var = this.g.n;
                    if (p9aVar.a.isEmpty()) {
                        listSingletonList = Collections.singletonList(y66.a);
                    }
                    qh1Var.H(listSingletonList);
                } else {
                    zsjVar.H(p9aVar.b);
                    this.g.n.H(listSingletonList);
                    this.g.l.H(p9aVar.c);
                }
                MembersListWidget membersListWidget3 = this.g;
                zv8[] zv8VarArr4 = MembersListWidget.t;
                membersListWidget3.p1().setOverScrollMode(this.g.e == null ? 1 : 2);
                String name = MembersListWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Got new members on UI, count:" + p9aVar.a.size() + ", search:" + p9aVar.d, null);
                    }
                }
                this.g.j.H(p9aVar.a);
                if (this.g.getView() != null) {
                    this.g.p1().setRefreshingNext(p9aVar.e);
                }
                return sbi.a;
            default:
                Object obj5 = this.f;
                ch3.d0(obj);
                MembersListWidget membersListWidget4 = this.g;
                zv8[] zv8VarArr5 = MembersListWidget.t;
                boolean zC = membersListWidget4.q1().C();
                tp3 tp3Var = membersListWidget4.r;
                if (!zC) {
                    if (tp3Var != null) {
                        membersListWidget4.p1().o0(tp3Var);
                    }
                    membersListWidget4.r = null;
                    b65 b65Var = membersListWidget4.s;
                    if (b65Var != null) {
                        membersListWidget4.p1().q0(b65Var);
                    }
                    membersListWidget4.s = null;
                } else if (tp3Var == null) {
                    final lh9 lh9Var = new lh9(7, membersListWidget4);
                    final int i3 = 0;
                    tp3 tp3Var2 = new tp3(new x9a(membersListWidget4, i2), new w14(lh9Var, 29, membersListWidget4), new cf7() { // from class: y9a
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj6) {
                            int i4 = i3;
                            lh9 lh9Var2 = lh9Var;
                            Integer num = (Integer) obj6;
                            num.getClass();
                            switch (i4) {
                                case 0:
                                    zv8[] zv8VarArr6 = MembersListWidget.t;
                                    return Boolean.valueOf(((l8a) lh9Var2.invoke(num)) != null);
                                default:
                                    zv8[] zv8VarArr7 = MembersListWidget.t;
                                    l8a l8aVar = (l8a) lh9Var2.invoke(num);
                                    return Boolean.valueOf(l8aVar != null ? l8aVar.k : false);
                            }
                        }
                    }, new cf7() { // from class: y9a
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj6) {
                            int i4 = i2;
                            lh9 lh9Var2 = lh9Var;
                            Integer num = (Integer) obj6;
                            num.getClass();
                            switch (i4) {
                                case 0:
                                    zv8[] zv8VarArr6 = MembersListWidget.t;
                                    return Boolean.valueOf(((l8a) lh9Var2.invoke(num)) != null);
                                default:
                                    zv8[] zv8VarArr7 = MembersListWidget.t;
                                    l8a l8aVar = (l8a) lh9Var2.invoke(num);
                                    return Boolean.valueOf(l8aVar != null ? l8aVar.k : false);
                            }
                        }
                    });
                    membersListWidget4.p1().h(tp3Var2, -1);
                    membersListWidget4.r = tp3Var2;
                    b65 b65Var2 = new b65(membersListWidget4.p1());
                    membersListWidget4.p1().j(b65Var2);
                    membersListWidget4.s = b65Var2;
                }
                membersListWidget4.p1().X();
                return sbi.a;
        }
    }
}
