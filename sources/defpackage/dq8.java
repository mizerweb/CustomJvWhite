package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dq8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ JoinChatWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dq8(JoinChatWidget joinChatWidget, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = joinChatWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        JoinChatWidget joinChatWidget = this.g;
        switch (i) {
            case 0:
                dq8 dq8Var = new dq8(joinChatWidget, lq4Var, 0);
                dq8Var.f = obj;
                return dq8Var;
            default:
                dq8 dq8Var2 = new dq8(joinChatWidget, lq4Var, 1);
                dq8Var2.f = obj;
                return dq8Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((dq8) create((vp8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((dq8) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Integer numH;
        Integer numH2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        JoinChatWidget joinChatWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vp8 vp8Var = (vp8) obj2;
                ch3.d0(obj);
                if (!(vp8Var instanceof vp8)) {
                    if (vp8Var == null) {
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                joinChatWidget.r = vp8Var;
                LinearLayout linearLayout = joinChatWidget.s;
                if (linearLayout == null) {
                    return sbiVar;
                }
                joinChatWidget.E1(linearLayout, vp8Var);
                return sbiVar;
            default:
                rbb rbbVar = (rbb) obj2;
                ch3.d0(obj);
                if (rbbVar instanceof mq8) {
                    zv8[] zv8VarArr = JoinChatWidget.t;
                    if (joinChatWidget.requireActivity() instanceof fte) {
                        joinChatWidget.getRouter().D();
                        lq8 lq8Var = lq8.b;
                        long jLongValue = ((Number) ((mq8) rbbVar).a).longValue();
                        o65 o65VarB = lq8Var.b();
                        n65 n65Var = new n65();
                        n65Var.a = ":chats";
                        n65Var.d(Long.valueOf(jLongValue), "id");
                        n65Var.d("local", "type");
                        o65.e(o65VarB, n65Var.a(), null, null, 4);
                    } else {
                        int i2 = MainActivity.o1;
                        xvc.v(joinChatWidget.requireActivity(), zm3.j(zm3.b, ((Number) ((mq8) rbbVar).a).longValue(), "local", null, null, null, null, null, null, 4092), null, null, null, 28);
                    }
                    joinChatWidget.v1(false);
                } else if (rbbVar instanceof ioe) {
                    joinChatWidget.v1(true);
                    h8c h8cVar = new h8c(joinChatWidget);
                    h8cVar.m(new tnh(R.string.snackbar_join_chat_restricted_error_title));
                    h8cVar.h(new w8c(R.drawable.icon_privacy_fill));
                    h8cVar.j(new e9c(new tnh(R.string.snackbar_text_button_why)));
                    h8cVar.e(new oo6(13, joinChatWidget));
                    View view = joinChatWidget.getView();
                    h8cVar.c(new o8c(0, 0, (view == null || (numH2 = n7j.h(view)) == null) ? 0 : numH2.intValue(), 11));
                    h8cVar.p();
                } else if (rbbVar instanceof sq8) {
                    joinChatWidget.v1(true);
                    h8c h8cVar2 = new h8c(joinChatWidget);
                    h8cVar2.m(new tnh(R.string.snackbar_join_request_submitted_title));
                    h8cVar2.a(new tnh(R.string.snackbar_join_request_submitted_caption));
                    h8cVar2.h(new w8c(R.drawable.done_fill_round_animated));
                    View view2 = joinChatWidget.getView();
                    h8cVar2.c(new o8c(0, 0, (view2 == null || (numH = n7j.h(view2)) == null) ? 0 : numH.intValue(), 11));
                    h8cVar2.p();
                }
                return sbiVar;
        }
    }
}
