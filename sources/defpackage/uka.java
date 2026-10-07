package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uka extends s7g implements ff3 {
    public final int u;
    public final int v;
    public final int w;
    public vka x;

    public uka(View view) {
        super(view);
        this.u = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.v = gm0.K(2.0f * yl5.d().getDisplayMetrics().density) / 2;
        this.w = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        n1g.N(new ud9(this, view, (lq4) null), view);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        H((MessageModel) k79Var, r66.a);
    }

    public abstract void H(MessageModel messageModel, List list);

    public final void I(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof hea;
        hea heaVar = z ? (hea) marginLayoutParams : null;
        boolean z2 = heaVar != null ? heaVar.a : true;
        int i3 = messageModel.F;
        int i4 = 2080374784 & i3;
        int i5 = 134217728 & i3;
        int i6 = this.u;
        if (i5 != 0) {
            marginLayoutParams.topMargin = i6;
            marginLayoutParams.bottomMargin = i6;
        } else {
            int i7 = 268435456 & i3;
            int i8 = this.v;
            if (i7 != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i8;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i8;
                marginLayoutParams.bottomMargin = i8;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i8;
                marginLayoutParams.bottomMargin = i6;
            } else if (i3 == 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if (vka.e(i3)) {
                int i9 = this.w;
                marginLayoutParams.topMargin = i9;
                marginLayoutParams.bottomMargin = i9;
            }
        }
        if (i3 != 0 && !vka.e(i3) && z) {
            ((hea) marginLayoutParams).a = z21.b(i4);
        }
        if (i == marginLayoutParams.topMargin && i2 == marginLayoutParams.bottomMargin && (!z || z2 == ((hea) marginLayoutParams).a)) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
