package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z56 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z56(int i, WorkersQueueDao_Impl workersQueueDao_Impl) {
        this.a = 2;
        this.b = i;
        this.c = workersQueueDao_Impl;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                d66 d66Var = (d66) obj2;
                ((Integer) obj).getClass();
                int i3 = 0;
                for (Object obj3 : ((b66) d66Var.m.a.getValue()).b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    k79 k79Var = (k79) obj3;
                    if ((k79Var instanceof bo2) && ((bo2) k79Var).a == i2) {
                        mjg mjgVar = d66Var.i;
                        c66 c66Var = new c66(i2, i3, 0, 4);
                        mjgVar.getClass();
                        mjgVar.j(null, c66Var);
                    }
                    i3 = i4;
                }
                return sbi.a;
            case 1:
                return Widget.childSlotRouter$lambda$0((Widget) obj2, i2, (zp3) obj);
            default:
                return WorkersQueueDao_Impl.select$lambda$0("SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?", i2, (WorkersQueueDao_Impl) obj2, (qxe) obj);
        }
    }

    public /* synthetic */ z56(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
