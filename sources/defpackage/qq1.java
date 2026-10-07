package defpackage;

import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qq1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallLinkInfoScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq1(lq4 lq4Var, CallLinkInfoScreen callLinkInfoScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callLinkInfoScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallLinkInfoScreen callLinkInfoScreen = this.g;
        switch (i) {
            case 0:
                qq1 qq1Var = new qq1(lq4Var, callLinkInfoScreen, 0);
                qq1Var.f = obj;
                return qq1Var;
            default:
                qq1 qq1Var2 = new qq1(lq4Var, callLinkInfoScreen, 1);
                qq1Var2.f = obj;
                return qq1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((qq1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((qq1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallLinkInfoScreen callLinkInfoScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    pk1.b.e((i65) rbbVar);
                } else if (rbbVar instanceof wn1) {
                    ldf ldfVar = CallLinkInfoScreen.t;
                    callLinkInfoScreen.r1().f(2, 1, null);
                    pk1 pk1Var = pk1.b;
                    String string = callLinkInfoScreen.getContext().getString(R.string.call_history_link_send_title);
                    String string2 = ((wn1) rbbVar).b.toString();
                    String name = CallLinkInfoScreen.class.getName();
                    pk1Var.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", string2);
                    intent.setType(HTTP.PLAIN_TEXT_TYPE);
                    o65.c(pk1Var.b(), ":chats/share", n1g.i(new ylc("oneme:share:data", intent), new ylc("oneme:share:title", string), new ylc("tag", name)), null, 4);
                } else if (rbbVar instanceof xn1) {
                    ldf ldfVar2 = CallLinkInfoScreen.t;
                    callLinkInfoScreen.r1().f(3, 1, null);
                    String str = sj8.a;
                    sj8.j(callLinkInfoScreen.getContext(), ((xn1) rbbVar).b, null);
                } else if (rbbVar instanceof vn1) {
                    ldf ldfVar3 = CallLinkInfoScreen.t;
                    callLinkInfoScreen.r1().f(1, 1, null);
                    it3.a(callLinkInfoScreen.getContext(), ((vn1) rbbVar).b.toString());
                    if (it3.b()) {
                        tnh tnhVar = new tnh(R.string.call_history_link_coped);
                        h8c h8cVar = new h8c(callLinkInfoScreen);
                        h8cVar.m(tnhVar);
                        h8cVar.h(new w8c(R.drawable.icon_copy));
                        h8cVar.p();
                    }
                } else if (rbbVar instanceof yn1) {
                    tnh tnhVar2 = ((yn1) rbbVar).b;
                    ldf ldfVar4 = CallLinkInfoScreen.t;
                    h8c h8cVar2 = new h8c(callLinkInfoScreen);
                    h8cVar2.m(tnhVar2);
                    h8cVar2.h(x8c.a);
                    h8cVar2.p();
                } else if (rbbVar instanceof zn1) {
                    callLinkInfoScreen.getRouter().C(callLinkInfoScreen);
                    pk1.b.k(((zn1) rbbVar).b);
                }
                break;
            default:
                ch3.d0(obj);
                lq1 lq1Var = (lq1) obj2;
                ldf ldfVar5 = CallLinkInfoScreen.t;
                j8e j8eVar = callLinkInfoScreen.k;
                zv8[] zv8VarArr = CallLinkInfoScreen.u;
                TextView textView = (TextView) j8eVar.m(callLinkInfoScreen, zv8VarArr[3]);
                ynh ynhVar = lq1Var.e;
                gq1 gq1Var = lq1Var.g;
                kq1 kq1Var = lq1Var.d;
                tj0 tj0Var = lq1Var.a;
                dcc dccVar = lq1Var.j;
                textView.setText(ynhVar.b(callLinkInfoScreen.getContext()));
                callLinkInfoScreen.q.H(lq1Var.f);
                rcc rccVarS1 = callLinkInfoScreen.s1();
                CharSequence charSequenceB = lq1Var.e.b(callLinkInfoScreen.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                rccVarS1.setTitle(charSequenceB);
                if (!cqk.d(callLinkInfoScreen.s1().getRightActions(), dccVar)) {
                    callLinkInfoScreen.s1().setRightActions(dccVar);
                }
                kwb kwbVar = (kwb) callLinkInfoScreen.n.m(callLinkInfoScreen, zv8VarArr[6]);
                ghb ghbVar = kwb.r1;
                kwbVar.t(tj0Var, true);
                kwbVar.setAvatarUrl(null);
                if (tj0Var == null) {
                    kwbVar.setCustomPlaceholder((rk0) callLinkInfoScreen.e.getValue());
                    kwbVar.setOverlay(null);
                } else {
                    kwbVar.setCustomPlaceholder(null);
                    kwbVar.setOverlay(new yvb((qk0) callLinkInfoScreen.f.getValue()));
                }
                TextView textView2 = (TextView) callLinkInfoScreen.l.m(callLinkInfoScreen, zv8VarArr[4]);
                boolean z = kq1Var instanceof jq1;
                m8j m8jVar = callLinkInfoScreen.p;
                if (z) {
                    if (m8jVar != null) {
                        ArrayList arrayList = l8j.a;
                        textView2.removeTextChangedListener(m8jVar);
                        textView2.removeOnAttachStateChangeListener(m8jVar);
                        urb urbVar = textView2 instanceof urb ? (urb) textView2 : null;
                        if (urbVar != null) {
                            urbVar.setObserverSpanListener(null);
                        }
                    }
                    textView2.setMaxLines(1);
                    textView2.setOnLongClickListener(new cw0(1, callLinkInfoScreen));
                } else {
                    if (m8jVar == null) {
                        callLinkInfoScreen.p = l8j.a(textView2);
                    }
                    textView2.setMaxLines(Integer.MAX_VALUE);
                    textView2.setOnLongClickListener(new nq1());
                }
                qe7.H(textView2, 300L, new ee(lq1Var, 6, callLinkInfoScreen));
                if (!textView2.isLaidOut() || textView2.isLayoutRequested()) {
                    textView2.addOnLayoutChangeListener(new rq1(textView2, callLinkInfoScreen, lq1Var, 0));
                } else {
                    textView2.setText(CallLinkInfoScreen.o1(callLinkInfoScreen, kq1Var.getText().b(textView2.getContext()), textView2, textView2.getRootView().getWidth()));
                }
                cyb cybVarQ1 = callLinkInfoScreen.q1();
                cybVarQ1.setVisibility(gq1Var == null ? 8 : 0);
                if (gq1Var != null) {
                    cybVarQ1.setAppearance(gq1Var.a());
                    CharSequence charSequenceB2 = gq1Var.getTitle().b(cybVarQ1.getContext());
                    cybVarQ1.setText(charSequenceB2 != null ? charSequenceB2 : "");
                    qe7.H(cybVarQ1, 300L, new ee(callLinkInfoScreen, 7, gq1Var));
                }
                break;
        }
        return sbiVar;
    }
}
