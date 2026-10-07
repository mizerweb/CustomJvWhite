package defpackage;

import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ float f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(xte xteVar, float f, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = xteVar;
        this.f = f;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                zzc zzcVar = new zzc((PinBarsWidget) obj2, lq4Var);
                zzcVar.f = ((Number) obj).floatValue();
                return zzcVar;
            default:
                return new zzc((xte) obj2, this.f, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((zzc) create(Float.valueOf(((Number) obj).floatValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((zzc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                float f = this.f;
                ch3.d0(obj);
                nza nzaVar = ((PinBarsWidget) obj2).j;
                if (nzaVar != null) {
                    nzaVar.setProgress(f);
                }
                break;
            default:
                ch3.d0(obj);
                iu9 iu9Var = ((xte) obj2).g;
                if (iu9Var != null) {
                    iu9Var.setPlaybackSpeed(this.f);
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(PinBarsWidget pinBarsWidget, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = pinBarsWidget;
    }
}
