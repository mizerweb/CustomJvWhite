package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u53 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ l63 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u53(l63 l63Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = l63Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new u53(this.g, this.h, lq4Var, 0);
            case 1:
                return new u53(this.g, this.h, lq4Var, 1);
            default:
                return new u53(this.g, this.h, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((u53) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objR;
        Object objA2;
        rui ruiVar;
        int i = this.e;
        long j = this.h;
        hu4 hu4Var = hu4.a;
        l63 l63Var = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ic6 ic6Var = l63Var.Y;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        objA = obj;
                    } else {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        objR = obj;
                    }
                    ic6 ic6Var2 = l63Var.Z;
                    z43 z43Var = z43.b;
                    long j2 = ((rt2) objR).a;
                    z43Var.getClass();
                    bc1.q(":chats?id=" + j2 + "&type=local", ic6Var2);
                    return sbiVar;
                }
                ch3.d0(obj);
                hk7 hk7Var = (hk7) l63Var.A.getValue();
                this.f = 1;
                objA = hk7.a(hk7Var, j, this);
                if (objA == hu4Var) {
                    return hu4Var;
                }
                vg4 vg4Var = (vg4) objA;
                zv8[] zv8VarArr = l63.O1;
                if (j == ((s7f) ((et3) l63Var.B.getValue())).t()) {
                    a8j.x(ic6Var, new zb6(new tnh(R.string.self_profile_click), null, null));
                } else if (vg4Var == null || !vg4Var.B() || vg4Var.I()) {
                    a8j.x(ic6Var, new zb6(new tnh(R.string.messages_list_contact_removed), null, null));
                } else {
                    xn3 xn3VarK = l63Var.K();
                    this.f = 2;
                    objR = xn3VarK.r(j, this);
                    if (objR == hu4Var) {
                        return hu4Var;
                    }
                    ic6 ic6Var3 = l63Var.Z;
                    z43 z43Var2 = z43.b;
                    long j3 = ((rt2) objR).a;
                    z43Var2.getClass();
                    bc1.q(":chats?id=" + j3 + "&type=local", ic6Var3);
                }
                return sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    hk7 hk7Var2 = (hk7) l63Var.A.getValue();
                    this.f = 1;
                    objA2 = hk7.a(hk7Var2, j, this);
                    if (objA2 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA2 = obj;
                }
                vg4 vg4Var2 = (vg4) objA2;
                zv8[] zv8VarArr2 = l63.O1;
                ny8 ny8Var = l63Var.B;
                ic6 ic6Var4 = l63Var.Y;
                if (j == ((s7f) ((et3) ny8Var.getValue())).t()) {
                    a8j.x(ic6Var4, new zb6(new tnh(R.string.self_profile_click), null, null));
                } else if (vg4Var2 == null || !vg4Var2.B() || vg4Var2.I()) {
                    a8j.x(ic6Var4, new zb6(new tnh(R.string.messages_list_contact_removed), null, null));
                } else {
                    ic6 ic6Var5 = l63Var.Z;
                    z43.b.getClass();
                    bc1.q(":profile?id=" + j + "&type=contact", ic6Var5);
                }
                return sbiVar;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr3 = l63.O1;
                    qy9 qy9VarL = l63Var.L();
                    py9 py9Var = qy9VarL instanceof py9 ? (py9) qy9VarL : null;
                    if (py9Var != null && (ruiVar = ((o53) l63Var.t1.getValue()).b) != null) {
                        m0f m0fVar = (m0f) l63Var.w.getValue();
                        long j4 = py9Var.a;
                        String str = py9Var.e;
                        long duration = ruiVar.getDuration();
                        boolean zH = ruiVar.h();
                        this.f = 1;
                        if (m0fVar.a(j4, str, this.h, duration, zH, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
