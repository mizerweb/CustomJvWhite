package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class maa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ qaa g;
    public final /* synthetic */ rt2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ maa(qaa qaaVar, rt2 rt2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = qaaVar;
        this.h = rt2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rt2 rt2Var = this.h;
        qaa qaaVar = this.g;
        switch (i) {
            case 0:
                return new maa(qaaVar, rt2Var, lq4Var, 0);
            case 1:
                return new maa(qaaVar, rt2Var, lq4Var, 1);
            case 2:
                return new maa(qaaVar, rt2Var, lq4Var, 2);
            default:
                return new maa(qaaVar, rt2Var, lq4Var, 3);
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
            case 2:
                break;
        }
        return ((maa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        int i = this.e;
        sbi sbiVar = sbi.a;
        rt2 rt2Var = this.h;
        qaa qaaVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        objB = ((roe) obj).a;
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                gm7 gm7Var = (gm7) qaaVar.n.getValue();
                long jA = rt2Var.A();
                this.f = 1;
                objB = gm7.b(gm7Var, jA, 0L, this, 30);
                if (objB == hu4Var) {
                    return hu4Var;
                }
                Object obj2 = objB;
                if (!(obj2 instanceof poe)) {
                    return obj2;
                }
                return null;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                wl7 wl7Var = (wl7) qaaVar.o.getValue();
                long jA2 = rt2Var.A();
                long j = qaaVar.e;
                Integer num = new Integer(((Number) qaaVar.C.getValue()).intValue());
                this.f = 1;
                Object objA = wl7Var.a(jA2, j, num, this);
                return objA == hu4Var ? hu4Var : objA;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return qaa.B(qaaVar, rt2Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return qaa.C(qaaVar, rt2Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
