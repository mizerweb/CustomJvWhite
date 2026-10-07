package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v5a extends gnh implements rz9 {
    public static final /* synthetic */ zv8[] w;
    public final mjg s;
    public final mjg t;
    public final zb u;
    public boolean v;

    static {
        z8b z8bVar = new z8b(v5a.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public v5a(Context context) {
        super(context);
        mjg mjgVarA = p90.a(null);
        this.s = mjgVarA;
        this.t = mjgVarA;
        this.u = new zb(this, 20);
    }

    @Override // defpackage.gnh
    public final void K(xac xacVar) {
        int i = xacVar.b.g;
        if (M()) {
            getDate$message_list().setTextColor$message_list(i);
            getDate$message_list().setDateViewStatusColor(i);
        }
    }

    @Override // defpackage.gnh
    public final void L(kbc kbcVar) {
        if (M()) {
            return;
        }
        getDate$message_list().setTextColor$message_list(-1);
        getDate$message_list().setDateViewStatusColor(-1);
        getDate$message_list().setBackgroundColor(kbcVar.t().a);
    }

    public final boolean M() {
        iq9 model = getModel();
        return model != null && model.d();
    }

    public void g(eag eagVar) {
        setModel(eagVar);
    }

    public iq9 getModel() {
        zv8 zv8Var = w[0];
        return (iq9) this.u.b;
    }

    public final gjg getModelFlow() {
        return this.t;
    }

    @Override // defpackage.rz9
    public final boolean i() {
        return this.v;
    }

    @Override // defpackage.gnh, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int iT;
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int i5 = (int) ((fea) getBackground()).s;
        if (n7j.o(getSenderNameViewStub$message_list().b)) {
            int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            getSenderNameViewStub$message_list().c(iK2, iK3);
            iK = getSenderNameViewStub$message_list().a() + iK3;
        } else {
            iK = 0;
        }
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().T(((getMeasuredWidth() - iK2) - getSenderAliasDelegate().L()) - i5, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, (getSenderNameViewStub$message_list().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            int iK4 = iK + gm0.K(iK == 0 ? yl5.d().getDisplayMetrics().density * 8.0f : yl5.d().getDisplayMetrics().density * 4.0f);
            getMessageLinkDelegate().T(iK2, iK4);
            iK = iK4 + getMessageLinkDelegate().K();
        }
        if (M()) {
            int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 1.0f) + (iK == 0 ? 0 : zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iK));
            int iB = zo5.b(6.0f, yl5.d().getDisplayMetrics().density, t(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), iK5) + iK5);
            qyj.M(getMessageTextView$message_list(), iK2, iB, 0, 12);
            iT = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getMessageTextView$message_list().getMeasuredHeight() + iB);
        } else {
            int iB2 = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iK);
            qyj.M(getMessageTextView$message_list(), iK2, iB2, 0, 12);
            int iE = c0a.e(1.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), getMessageTextView$message_list().getMeasuredHeight() + iB2);
            iT = iE + t(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), iE);
        }
        qyj.M(getDate$message_list(), ((getMeasuredWidth() - getDate$message_list().getMeasuredWidth()) - gm0.K(M() ? 10.0f * yl5.d().getDisplayMetrics().density : yl5.d().getDisplayMetrics().density * 4.0f)) - i5, ((M() ? getMeasuredHeight() - ((n7j.o((ny8) getCommentsEntryDelegate().b) && M()) ? getCommentsEntryDelegate().K() : 0) : iT) - getDate$message_list().getMeasuredHeight()) - getStatusBottomMargin$message_list(), 0, 12);
        if (n7j.o((ny8) getReactionsDelegate().b) && M()) {
            getReactionsDelegate().T(iK2, iT);
        } else if (n7j.o((ny8) getReactionsDelegate().b)) {
            iT = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, iT);
            getReactionsDelegate().T(getReactionsDelegate().g ? (getMeasuredWidth() - i5) - getReactionsDelegate().L() : 0, iT);
        }
        if (n7j.o((ny8) getCommentsEntryDelegate().b)) {
            if (M()) {
                getCommentsEntryDelegate().T(0, getMeasuredHeight() - getCommentsEntryDelegate().K());
            } else {
                getCommentsEntryDelegate().T(0, iT);
            }
        }
        if (n7j.o((ny8) getShareMessageDelegate().b)) {
            getShareMessageDelegate().T(getMeasuredWidth() - getShareMessageDelegate().L(), (getMeasuredHeight() - getShareMessageDelegate().K()) - gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        }
    }

    @Override // defpackage.gnh, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int iK;
        int iF;
        int iF2 = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list().j();
        if (getDependOnOutsideView()) {
            iMax = View.MeasureSpec.getSize(i);
        } else {
            iMax = Math.max(zo5.b(10.0f, yl5.d().getDisplayMetrics().density, getSuggestedMinimumWidth()), Math.max(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, getMessageTextView$message_list().getMeasuredWidth()), this.v ? iF2 : 0));
        }
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, getSenderAliasDelegate().L());
        }
        if (n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderNameViewStub$message_list().d(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + getSenderNameViewStub$message_list().b() + getSenderAliasDelegate().Z());
            iK = getSenderNameViewStub$message_list().a() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        } else {
            iK = 0;
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + getMessageLinkDelegate().L());
            iK += getMessageLinkDelegate().K() + gm0.K(iK == 0 ? yl5.d().getDisplayMetrics().density * 8.0f : yl5.d().getDisplayMetrics().density * 4.0f);
        }
        int iK2 = iK + ((iK == 0 || !M()) ? 0 : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        getDate$message_list().measure(i, i2);
        if (n7j.o((ny8) getReactionsDelegate().b) && M()) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, E(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, getReactionsDelegate().L()), iF2));
            iK2 = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, getReactionsDelegate().K(), iK2);
        } else if (n7j.o((ny8) getReactionsDelegate().b)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, E(getReactionsDelegate().L(), iF2));
            int iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getReactionsDelegate().K() + gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            iK2 += iB;
            ((fea) getBackground()).r = iB;
        } else {
            ((fea) getBackground()).r = 0.0f;
        }
        int iMax2 = Math.max(iMax, E(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, getMessageTextView$message_list().getMeasuredWidth()), iF2));
        int iE = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, getMessageTextView$message_list().getMeasuredHeight() + gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), iK2);
        if (M()) {
            int iL = n7j.o((ny8) getReactionsDelegate().b) ? getReactionsDelegate().L() : getMessageTextView$message_list().e(iF2);
            int measuredWidth = getDate$message_list().getMeasuredWidth() + gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            boolean z = !n7j.o((ny8) getReactionsDelegate().b) && getMessageTextView$message_list().i();
            zv8 zv8Var = gnh.r[0];
            if (((Boolean) this.g.b).booleanValue() || z || iF2 - iL < measuredWidth) {
                iE = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, iE);
            } else if ((iMax2 - (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2)) - iL < measuredWidth) {
                iMax2 += measuredWidth - ((iMax2 - (gm0.K(10.0f * yl5.d().getDisplayMetrics().density) * 2)) - iL);
            }
        }
        if (iMax2 > r5a.f(1.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i))) {
            iF = r5a.f(1.0f, yl5.d().getDisplayMetrics().density, 2, iMax2);
        } else {
            iF = r5a.f(1.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        }
        long jI = I(iMax2, iF, i, i2);
        int iMax3 = Math.max(iMax2, (gm0.K(yl5.d().getDisplayMetrics().density * 1.0f) * 2) + ((int) (jI >> 32)));
        int iK3 = (gm0.K(1.0f * yl5.d().getDisplayMetrics().density) * 2) + ((int) (4294967295L & jI)) + iE;
        if (n7j.o((ny8) getCommentsEntryDelegate().b)) {
            getCommentsEntryDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            iMax3 = Math.max(iMax3, getCommentsEntryDelegate().L());
            getCommentsEntryDelegate().U(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), i2);
            iK3 += getCommentsEntryDelegate().K();
        }
        if (n7j.o((ny8) getShareMessageDelegate().b)) {
            getShareMessageDelegate().U(View.MeasureSpec.makeMeasureSpec(iF2, Integer.MIN_VALUE), i2);
            int iL2 = getShareMessageDelegate().L();
            iMax3 += iL2;
            ((fea) getBackground()).s = iL2;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iMax3, iK3);
    }

    @Override // defpackage.rz9
    public void setLimitByContentWidthEnabled(boolean z) {
        this.v = z;
    }

    public void setModel(iq9 iq9Var) {
        this.u.B(this, w[0], iq9Var);
    }
}
