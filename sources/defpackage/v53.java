package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes4.dex */
public final class v53 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ l63 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v53(int i, l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = i;
        this.g = l63Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        l63 l63Var = this.g;
        switch (i) {
            case 0:
                return new v53(l63Var, lq4Var);
            default:
                return new v53(this.f, l63Var, lq4Var);
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
                return ((v53) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                ((v53) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        float fB;
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
                mjg mjgVar = this.g.x1;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, wr4.b));
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                int i2 = this.f;
                if (i2 == 0 || !(i2 == 4 || i2 == 1)) {
                    if (i2 != 0) {
                        int i3 = sic.d;
                        fB = dfl.b(i2);
                    } else {
                        fB = 0.0f;
                    }
                    String str = this.g.p;
                    int i4 = this.f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Media viewer. New orientation: " + iic.p(i4) + ", angle: " + fB, null);
                        }
                    }
                    mjg mjgVar2 = this.g.v1;
                    nic nicVar = new nic(this.f, fB);
                    mjgVar2.getClass();
                    mjgVar2.j(null, nicVar);
                } else {
                    gm0.n(this.g.p, "Media viewer. Ignore reversed orientation");
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v53(l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = l63Var;
    }
}
