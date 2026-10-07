package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class cl1 extends g6g {
    public final xva f;
    public final ExecutorService g;
    public boolean h;

    public cl1(xva xvaVar, ExecutorService executorService) {
        super(executorService);
        this.f = xvaVar;
        this.g = executorService;
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        al1 al1Var = (al1) lfeVar;
        yw7 yw7Var = (yw7) this.d.f.get(i);
        boolean zIsEmpty = list.isEmpty();
        boolean z = this.h;
        if (zIsEmpty) {
            al1Var.H(yw7Var, z);
            return;
        }
        View view = al1Var.a;
        List list2 = list;
        pu6 pu6Var = new pu6(yhf.m0(yhf.q0(new sw(1, list2), new xk1(0)), i9.r));
        while (pu6Var.hasNext()) {
            xw7 xw7Var = (xw7) pu6Var.next();
            if (xw7Var instanceof vw7) {
                ((ph4) view).setTitle(((vw7) xw7Var).a);
            } else if (xw7Var instanceof rw7) {
                rw7 rw7Var = (rw7) xw7Var;
                long j = rw7Var.a;
                if (rw7Var.d) {
                    ph4 ph4Var = (ph4) view;
                    ph4Var.B(j, null, null);
                    ph4Var.setAvatarOverlay(new yvb((qk0) al1Var.v.getValue()));
                } else {
                    ph4 ph4Var2 = (ph4) view;
                    ph4Var2.setAvatarOverlay(null);
                    CharSequence charSequence = rw7Var.b;
                    String str = rw7Var.c;
                    if (str == null) {
                        str = "";
                    }
                    ph4Var2.B(j, charSequence, str);
                }
            } else if (xw7Var instanceof ww7) {
                ((ph4) view).setTime(((ww7) xw7Var).a);
            } else if (xw7Var instanceof uw7) {
                ((ph4) view).z(((uw7) xw7Var).a);
            } else if (xw7Var instanceof tw7) {
                ((ph4) view).setDescription(((tw7) xw7Var).a);
            } else {
                if (!(xw7Var instanceof sw7)) {
                    ore.o();
                    return;
                }
                ph4 ph4Var3 = (ph4) view;
                int i2 = ((sw7) xw7Var).a;
                ph4Var3.x(i2 == 1 && !z);
                ph4Var3.y(i2 == 2 && !z);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof bl1) {
                arrayList.add(obj);
            }
        }
        bl1 bl1Var = (bl1) ww3.D1(arrayList);
        if (bl1Var != null) {
            al1Var.I(yw7Var, bl1Var.a);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new al1(new ph4(viewGroup.getContext()), this.f);
    }
}
