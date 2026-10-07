package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class f63 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;
    public final /* synthetic */ long j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f63(l63 l63Var, long j, String str, long j2, long j3, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = l63Var;
        this.g = j;
        this.i = str;
        this.h = j2;
        this.j = j3;
        this.k = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new f63((l63) obj2, this.g, this.i, this.h, this.j, this.k, lq4Var);
            default:
                return new f63((m0f) obj2, this.g, this.h, this.i, this.j, this.k, lq4Var);
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
        }
        return ((f63) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        final long j;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    m0f m0fVar = (m0f) ((l63) this.l).w.getValue();
                    long j2 = this.g;
                    String str = this.i;
                    long j3 = this.h;
                    long j4 = this.j;
                    boolean z = this.k;
                    this.f = 1;
                    if (m0fVar.a(j2, str, j3, j4, z, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            default:
                je9 je9Var = je9.d;
                sbi sbiVar = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    String str2 = ((m0f) this.l).a;
                    long j5 = this.h;
                    String str3 = this.i;
                    long j6 = this.j;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, qt4.k(j6, " in msg:", qt4.t(j5, "Save new position:", " for video:", str3)), null);
                    }
                    long j7 = this.g;
                    if (j7 != 0) {
                        long j8 = this.h;
                        if (j8 >= j7) {
                            String str4 = ((m0f) this.l).a;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str4, c0a.m(j7, ". Reset initPos.", qt4.s(j8, "Can't save this startTime:", " because it's more or equals with duration:")), null);
                            }
                            j = 0;
                        } else {
                            j = j8;
                        }
                        rui ruiVarA = ((tui) ((m0f) this.l).c.getValue()).a(this.i);
                        if (ruiVarA != null) {
                            gm0.n(((m0f) this.l).a, "Save new position. VideoContent in cache exist");
                            ((tui) ((m0f) this.l).c.getValue()).b(this.i, ruiVarA.f(j));
                        }
                        sua suaVar = (sua) ((m0f) this.l).b.getValue();
                        long j9 = this.j;
                        String str5 = this.i;
                        final long j10 = this.g;
                        final boolean z2 = this.k;
                        cf7 cf7Var = new cf7() { // from class: l0f
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj2) {
                                j60 j60VarB;
                                e70 e70Var;
                                c60 c60Var = (c60) obj2;
                                boolean z3 = (c60Var == null || c60Var.a != y60.j || (j60VarB = c60Var.b()) == null || (e70Var = j60VarB.d) == null || !e70Var.h()) ? false : true;
                                if ((c60Var.d != null || z3) && !z2) {
                                    long j11 = j10;
                                    if (j11 != 0) {
                                        long j12 = j;
                                        long j13 = j11 - j12 > CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS ? j12 : 0L;
                                        if (z3) {
                                            z60 z60VarA = c60Var.b().d.d.a();
                                            z60VarA.l = j13;
                                            z60VarA.b = (int) j11;
                                            z60VarA.g = false;
                                            d70 d70Var = new d70(z60VarA);
                                            c60 c60VarJ = c60Var.b().d.j();
                                            c60VarJ.d = d70Var;
                                            e70 e70VarA = c60VarJ.a();
                                            i60 i60VarA = c60Var.b().a();
                                            i60VarA.d = e70VarA;
                                            c60Var.r = new j60(i60VarA);
                                        } else {
                                            z60 z60VarA2 = c60Var.c().a();
                                            z60VarA2.l = j13;
                                            z60VarA2.b = (int) j11;
                                            z60VarA2.g = false;
                                            c60Var.d = new d70(z60VarA2);
                                        }
                                    }
                                }
                                return sbi.a;
                            }
                        };
                        this.f = 1;
                        suaVar.s(j9, str5, cf7Var);
                        if (sbiVar == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f63(m0f m0fVar, long j, long j2, String str, long j3, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = m0fVar;
        this.g = j;
        this.h = j2;
        this.i = str;
        this.j = j3;
        this.k = z;
    }
}
