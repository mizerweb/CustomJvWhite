package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class d26 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ p26 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d26(p26 p26Var, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = p26Var;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        p26 p26Var = this.g;
        switch (i) {
            case 0:
                return new d26(p26Var, lq4Var, 0);
            case 1:
                return new d26(p26Var, lq4Var, 1);
            default:
                return new d26(p26Var, this.f, lq4Var);
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
                return ((d26) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 1:
                return ((d26) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                ((d26) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (rx8.t(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                mjg mjgVar = this.g.M1;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, wr4.b));
                return sbi.a;
            case 1:
                je9 je9Var = je9.d;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    kb9 kb9VarJ = this.g.J();
                    jb9 jb9Var = kb9VarJ != null ? kb9VarJ.l : null;
                    int i3 = jb9Var == null ? -1 : h26.$EnumSwitchMapping$0[jb9Var.ordinal()];
                    if (i3 == -1) {
                        String str = this.g.j;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "onCropActionClick: no media to crop", null);
                        }
                    } else if (i3 == 1) {
                        mjg mjgVar2 = this.g.r1;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, k16.a));
                    } else if (i3 == 2) {
                        xt4 xt4VarB = ((n0c) this.g.H()).b();
                        gv7 gv7Var = new gv7(this.g, kb9VarJ, null, 4);
                        this.f = 1;
                        if (yab.K0(xt4VarB, gv7Var, this) == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        if (i3 != 3 && i3 != 4) {
                            ore.o();
                            return null;
                        }
                        String str2 = this.g.j;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "onCropActionClick: media type " + kb9VarJ.l + " not supported", null);
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                Object value4 = this.g.r1.getValue();
                m16 m16Var = value4 instanceof m16 ? (m16) value4 : null;
                p26 p26Var = this.g;
                if (m16Var == null) {
                    String str3 = p26Var.j;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var2 = je9.d;
                        if (a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str3, "onPlayerUpdate: current state: " + p26Var.r1.getValue() + " is not Video", null);
                        }
                    }
                } else {
                    mjg mjgVar3 = p26Var.r1;
                    int i4 = this.f;
                    do {
                        value3 = mjgVar3.getValue();
                    } while (!mjgVar3.h(value3, new m16(p26.W(i4), m16Var.b)));
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d26(p26 p26Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = p26Var;
    }
}
