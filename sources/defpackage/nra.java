package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nra extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ jsa g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nra(jsa jsaVar, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = jsaVar;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new nra(this.g, this.h, lq4Var, 0);
            case 1:
                return new nra(this.g, this.h, lq4Var, 1);
            default:
                return new nra(this.g, this.h, lq4Var, 2);
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
        return ((nra) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 6;
        long j = this.h;
        jsa jsaVar = this.g;
        hu4 hu4Var = hu4.a;
        Integer num = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    xn3 xn3Var = jsaVar.l;
                    this.f = 1;
                    obj = xn3Var.i(j, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                rt2 rt2Var = (rt2) obj;
                if (rt2Var == null) {
                    a8j.x(jsaVar.E2, new n3g(new pnh(R.string.chat_or_channel_not_found, R.string.channel), b2 == true ? 1 : 0, b == true ? 1 : 0, i2));
                    return sbiVar;
                }
                ic6 ic6Var = jsaVar.G2;
                wpa wpaVar = wpa.b;
                long j2 = rt2Var.a;
                wpaVar.getClass();
                bc1.q(":profile?id=" + j2 + "&type=local_chat", ic6Var);
                return sbiVar;
            case 1:
                ic6 ic6Var2 = jsaVar.G2;
                ic6 ic6Var3 = jsaVar.E2;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    hk7 hk7Var = (hk7) jsaVar.u1.getValue();
                    this.f = 1;
                    obj = hk7.a(hk7Var, j, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                vg4 vg4Var = (vg4) obj;
                if (j == ((s7f) jsaVar.q).t()) {
                    a8j.x(ic6Var3, new n3g(new tnh(R.string.self_profile_click), num, b5 == true ? 1 : 0, i2));
                    return sbiVar;
                }
                if (vg4Var != null && jcd.d(jsaVar.e0(), vg4Var, null, 2)) {
                    a8j.x(ic6Var2, wpa.b.k(j));
                    return sbiVar;
                }
                if (vg4Var == null || !vg4Var.B() || vg4Var.I()) {
                    a8j.x(ic6Var3, new n3g(new tnh(R.string.messages_list_contact_removed), b4 == true ? 1 : 0, b3 == true ? 1 : 0, i2));
                    return sbiVar;
                }
                a8j.x(ic6Var2, wpa.b.k(j));
                return sbiVar;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr = jsa.Z2;
                j44 j44VarA0 = jsaVar.a0();
                this.f = 1;
                Object objF = j44VarA0.f(j, this);
                return objF == hu4Var ? hu4Var : objF;
        }
    }
}
