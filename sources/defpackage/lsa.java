package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lsa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ lsa(MessagesListWidget messagesListWidget, w5f w5fVar) {
        this.a = 5;
        this.b = messagesListWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MessagesListWidget.T1;
                fva fvaVarG0 = messagesListWidget.F1().g0();
                fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new c37(fvaVarG0, null, 8)));
                return sbi.a;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                messagesListWidget.F1().m0(jLongValue);
                return sbi.a;
            case 2:
                FrameLayout frameLayout = (FrameLayout) obj;
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                k96 k96Var = new k96(frameLayout.getContext());
                k96Var.setId(R.id.messages_list_recycler_view);
                k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                MessagesLayoutManager messagesLayoutManager = new MessagesLayoutManager(k96Var.getContext());
                messagesListWidget.K1 = messagesLayoutManager;
                k96Var.setLayoutManager(messagesLayoutManager);
                k96Var.setAdapter(messagesListWidget.H);
                k96Var.setHasFixedSize(true);
                k96Var.setItemAnimator(null);
                k96Var.setThreshold(20);
                k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
                k96Var.setPager(new rj5(20, messagesListWidget));
                k96Var.k(messagesListWidget.x1);
                k96Var.k(messagesListWidget.y1);
                k96Var.k(messagesListWidget.z1);
                k96Var.k(messagesListWidget.A1);
                k96Var.k((ab0) messagesListWidget.J1.getValue());
                if (((Boolean) messagesListWidget.x1().R6.a(e5d.S6[413]).i()).booleanValue()) {
                    k96Var.k(messagesListWidget.B1);
                }
                if (!messagesListWidget.u1().b) {
                    k96Var.k((afe) messagesListWidget.C1.getValue());
                }
                k96Var.i(new yw8(1, messagesListWidget));
                xp9 xp9Var = new xp9(new lsa(messagesListWidget, 6));
                messagesListWidget.Z = xp9Var;
                zci zciVar = new zci(messagesListWidget.H, k96Var);
                k96Var.h(zciVar, -1);
                messagesListWidget.Y = zciVar;
                zpg zpgVar = new zpg(k96Var, messagesListWidget.H, xp9Var);
                k96Var.h(zpgVar, -1);
                messagesListWidget.n1 = zpgVar;
                k96Var.h(new ph1(3), -1);
                seh sehVar = new seh(messagesListWidget.d.getAccessor().d(927), new WeakReference(k96Var), messagesListWidget.requireActivity(), new msa(messagesListWidget, 19), new lsa(messagesListWidget, 7));
                messagesListWidget.E = sehVar;
                gta gtaVar = new gta(messagesListWidget, sehVar);
                gtaVar.i(k96Var);
                messagesListWidget.F = gtaVar;
                n1g.N(new d3(messagesListWidget, null, 25), k96Var);
                frameLayout.addView(k96Var);
                View scrollView = new ScrollView(frameLayout.getContext());
                scrollView.setId(R.id.messages_list_empty_state_container);
                scrollView.setVerticalScrollBarEnabled(false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                scrollView.setLayoutParams(layoutParams);
                frameLayout.addView(scrollView);
                View e6eVar = new e6e(frameLayout.getContext());
                e6eVar.setId(R.id.messages_list_reactions_effect_view);
                e6eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(e6eVar);
                w5f w5fVar = new w5f(frameLayout.getContext());
                w5fVar.setId(R.id.messages_list_scroll_btn);
                w5fVar.setOnClickListener(new lsa(messagesListWidget, w5fVar));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                layoutParams2.gravity = 8388693;
                frameLayout.addView(w5fVar, layoutParams2);
                return sbi.a;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                zv8[] zv8VarArr4 = MessagesListWidget.T1;
                jsa jsaVarF1 = messagesListWidget.F1();
                if (jLongValue2 > 0) {
                    jsaVarF1.m0(jLongValue2);
                } else if (jLongValue2 < 0) {
                    yab.i0(jsaVarF1.b, null, 0, new nra(jsaVarF1, jLongValue2, null, 0), 3);
                } else {
                    jsaVarF1.getClass();
                }
                return sbi.a;
            case 4:
                kti ktiVar = (kti) obj;
                zv8[] zv8VarArr5 = MessagesListWidget.T1;
                if (ktiVar instanceof iti) {
                    jsa jsaVarF2 = messagesListWidget.F1();
                    iti itiVar = (iti) ktiVar;
                    t50 t50Var = itiVar.c;
                    long j = itiVar.a;
                    zv8[] zv8VarArr6 = jsa.Z2;
                    jsaVarF2.s0(t50Var, j, null);
                } else {
                    if (!(ktiVar instanceof jti)) {
                        ore.o();
                        return null;
                    }
                    jsa jsaVarF3 = messagesListWidget.F1();
                    jti jtiVar = (jti) ktiVar;
                    pna pnaVar = new pna(jtiVar.a, jtiVar.b);
                    ks9 ks9Var = jsaVarF3.l2;
                    zv8 zv8Var = jsa.Z2[2];
                    ((zu4) ks9Var.b).a(Collections.singletonList(pnaVar), new vx9(jsaVarF3, 9, pnaVar));
                }
                return sbi.a;
            case 5:
                r5f r5fVar = (r5f) obj;
                zv8[] zv8VarArr7 = MessagesListWidget.T1;
                sbi sbiVar = sbi.a;
                if (messagesListWidget.getView() == null) {
                    String name = w5f.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "scrollToBottomButton onClickListener: type is " + r5fVar + ", view is null!", null);
                        }
                    }
                } else {
                    int iOrdinal = r5fVar.ordinal();
                    if (iOrdinal == 0) {
                        MessageModel messageModelQ = messagesListWidget.H.Q(messagesListWidget.D1().getLinearLayoutManager().Z0());
                        if (messageModelQ != null) {
                            fva fvaVarG1 = messagesListWidget.F1().g0();
                            fvaVarG1.g(yab.h0(fvaVarG1.c, fvaVarG1.b, 2, new af8(fvaVarG1, messageModelQ, (lq4) null, 29)));
                        }
                    } else if (iOrdinal == 1) {
                        fva fvaVarG2 = messagesListWidget.F1().g0();
                        fvaVarG2.g(yab.h0(fvaVarG2.c, fvaVarG2.b, 2, new af8(fvaVarG2, null, 28)));
                    } else {
                        if (iOrdinal != 2) {
                            ore.o();
                            return null;
                        }
                        fva fvaVarG3 = messagesListWidget.F1().g0();
                        fvaVarG3.g(yab.h0(fvaVarG3.c, fvaVarG3.b, 2, new ur8(fvaVarG3, null, 10)));
                    }
                }
                return sbiVar;
            case 6:
                MessageModel messageModelQ2 = messagesListWidget.H.Q(((Integer) obj).intValue());
                CharSequence charSequence = messageModelQ2 != null ? messageModelQ2.f : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            case 7:
                long jLongValue3 = ((Long) obj).longValue();
                zv8[] zv8VarArr8 = MessagesListWidget.T1;
                messagesListWidget.H1();
                String str = messagesListWidget.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, nbh.s(jLongValue3, "swipeToReply callback: setRepliedMessage(", ")"), null);
                    }
                }
                a8j.x(messagesListWidget.E1().j, new mqa(jLongValue3));
                return sbi.a;
            case 8:
                zv8[] zv8VarArr9 = MessagesListWidget.T1;
                messagesListWidget.E(((rp4) obj).a, null);
                qp4 qp4Var = messagesListWidget.o;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                return sbi.a;
            default:
                long jLongValue4 = ((Long) obj).longValue();
                qp4 qp4Var2 = messagesListWidget.o;
                if (qp4Var2 != null) {
                    qp4Var2.dismiss();
                }
                wpa wpaVar = wpa.b;
                wpaVar.e(wpaVar.k(jLongValue4));
                return sbi.a;
        }
    }

    public /* synthetic */ lsa(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }
}
