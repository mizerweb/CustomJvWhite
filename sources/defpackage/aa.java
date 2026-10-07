package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aa(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((RecyclerView) obj2).getRecycledViewPool().getRecycledView(i2);
            case 1:
                l56 l56Var = (l56) obj2;
                return yab.i0((gu4) l56Var.f.getValue(), null, 0, new px3(i2, l56Var, null), 3);
            case 2:
                return Widget.viewBinding$lambda$0((Widget) obj2, i2, (View) obj);
            default:
                return WorkersQueueDao_Impl.getItemsForRunning$lambda$0((WorkersQueueDao_Impl) obj2, i2, (qxe) obj);
        }
    }
}
