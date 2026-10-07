package defpackage;

import android.util.Log;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class pg2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ qg2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg2(qg2 qg2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = qg2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        qg2 qg2Var = this.g;
        switch (i) {
            case 0:
                return new pg2(qg2Var, lq4Var, 0);
            default:
                return new pg2(qg2Var, lq4Var, 1);
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
        return ((pg2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        qg2 qg2Var = this.g;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    vo8 vo8Var = qg2Var.a;
                    this.f = 1;
                    if (vd7.e(vo8Var, this) == hu4Var) {
                        return hu4Var;
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
                pg2 pg2Var = new pg2(qg2Var, lq4Var, 0);
                this.f = 1;
                Object objL0 = lvb.L0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, pg2Var, this);
                return objL0 == hu4Var ? hu4Var : objL0;
        }
    }
}
