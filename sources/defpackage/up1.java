package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class up1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallJoinLinkPreviewWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up1(lq4 lq4Var, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.g;
        switch (i) {
            case 0:
                up1 up1Var = new up1(lq4Var, callJoinLinkPreviewWidget, 0);
                up1Var.f = obj;
                return up1Var;
            default:
                up1 up1Var2 = new up1(lq4Var, callJoinLinkPreviewWidget, 1);
                up1Var2.f = obj;
                return up1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((up1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((up1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof un1) {
                    zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                    ((xu1) callJoinLinkPreviewWidget.e.getValue()).k(((un1) rbbVar).b, true, false, true, new wp1(rbbVar, 0));
                }
                break;
            default:
                ch3.d0(obj);
                lp1 lp1Var = (lp1) obj2;
                j8e j8eVar = callJoinLinkPreviewWidget.g;
                zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                s52 s52Var = (s52) j8eVar.m(callJoinLinkPreviewWidget, zv8VarArr2[0]);
                s52Var.setAvatar(lp1Var.a);
                yp9 yp9Var = lp1Var.c;
                yp9 yp9Var2 = yp9.b;
                s52Var.setButtonAction(e61.a(e61.e, yp9Var == yp9Var2 ? 2 : 4, 11));
                s52Var.F(yp9Var == yp9Var2, lp1Var.d);
                s52Var.I(null, null);
                ((TextView) callJoinLinkPreviewWidget.i.m(callJoinLinkPreviewWidget, zv8VarArr2[2])).setText(lp1Var.e.b(callJoinLinkPreviewWidget.getContext()));
                CallJoinLinkPreviewWidget.r1((wue) callJoinLinkPreviewWidget.k.m(callJoinLinkPreviewWidget, zv8VarArr2[4]), (Drawable) callJoinLinkPreviewWidget.p.getValue(), (Drawable) callJoinLinkPreviewWidget.o.getValue(), lp1Var.b, new tnh(R.string.call_microphone_enabled_accessibility), new tnh(R.string.call_microphone_disabled_accessibility));
                CallJoinLinkPreviewWidget.r1((wue) callJoinLinkPreviewWidget.l.m(callJoinLinkPreviewWidget, zv8VarArr2[5]), (Drawable) callJoinLinkPreviewWidget.r.getValue(), (Drawable) callJoinLinkPreviewWidget.q.getValue(), lp1Var.c, new tnh(R.string.call_video_enabled_accessibility), new tnh(R.string.call_video_disabled_accessibility));
                q9c q9cVar = (q9c) callJoinLinkPreviewWidget.n.m(callJoinLinkPreviewWidget, zv8VarArr2[7]);
                q9cVar.setAvatars(lp1Var.f);
                q9cVar.setTitle(lp1Var.g);
                break;
        }
        return sbiVar;
    }
}
