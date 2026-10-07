package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class yd7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd7(int i, lq4 lq4Var, Context context) {
        super(2, lq4Var);
        this.e = i;
        this.g = context;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Context context = this.g;
        switch (i) {
            case 0:
                yd7 yd7Var = new yd7(0, lq4Var, context);
                yd7Var.f = ((Boolean) obj).booleanValue();
                return yd7Var;
            case 1:
                yd7 yd7Var2 = new yd7(1, lq4Var, context);
                yd7Var2.f = ((Boolean) obj).booleanValue();
                return yd7Var2;
            default:
                yd7 yd7Var3 = new yd7(2, lq4Var, context);
                yd7Var3.f = ((Boolean) obj).booleanValue();
                return yd7Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((yd7) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((yd7) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((yd7) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                boolean z = this.f;
                ch3.d0(obj);
                cy5.f.g(this.g, z);
                break;
            case 1:
                ch3.d0(obj);
                elc.a(this.g, RescheduleReceiver.class, this.f);
                break;
            default:
                boolean z2 = this.f;
                ch3.d0(obj);
                xvc.o.g(this.g, z2);
                xvc.p = z2;
                break;
        }
        return sbi.a;
    }
}
