package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ggh extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ hgh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggh(Object obj, lq4 lq4Var, hgh hghVar) {
        super(2, lq4Var);
        this.g = obj;
        this.h = hghVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hgh hghVar = this.h;
        switch (i) {
            case 0:
                ggh gghVar = new ggh(hghVar, lq4Var);
                gghVar.g = obj;
                return gghVar;
            default:
                return new ggh(this.g, lq4Var, hghVar);
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
        return ((ggh) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hgh hghVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                String str = hghVar.b;
                gu4 gu4Var = (gu4) this.g;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        ggh gghVar = new ggh(gu4Var, null, hghVar);
                        this.g = null;
                        this.f = 1;
                        obj = lvb.J0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, gghVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    break;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                if (!(obj instanceof poe)) {
                    gm0.x(str, "deleted push token", null);
                }
                Throwable thA = roe.a(obj);
                if (thA != null) {
                    if (thA instanceof TimeoutCancellationException) {
                        gm0.V(str, "failed to delete push token, because timeout", thA);
                    } else {
                        gm0.V(str, "failed to delete push token", new bgh("failed to delete push token", thA));
                    }
                }
                return new roe(obj);
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (hghVar.e(this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggh(hgh hghVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = hghVar;
    }
}
