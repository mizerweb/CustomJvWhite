package defpackage;

import android.os.Bundle;
import java.util.List;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nsa implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ nsa(MessagesListWidget messagesListWidget, Bundle bundle) {
        this.a = 1;
        this.b = messagesListWidget;
        this.c = bundle;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MessagesListWidget messagesListWidget = this.b;
        Bundle bundle = this.c;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MessagesListWidget.T1;
                long j = bundle.getLong("ARG_CHAT_ID");
                q24 q24Var = (q24) bundle.getParcelable("ARG_COMMENTS_ID");
                t73 t73VarB = sol.b(messagesListWidget.w1());
                h hVar = messagesListWidget.d;
                ksa ksaVar = (ksa) hVar.getAccessor().c(877);
                t3f t3fVarW1 = messagesListWidget.w1();
                long j2 = bundle.getLong("ARG_LOAD_MARK");
                long j3 = bundle.getLong("ARG_LOAD_MESSAGE_ID");
                List stringArrayList = bundle.getStringArrayList("ARG_HIGHLIGHTS");
                if (stringArrayList == null) {
                    stringArrayList = r66.a;
                }
                ita itaVar = new ita(j, t3fVarW1, j2, j3, stringArrayList, bundle.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle.getBoolean("ARG_SKIP_UNREAD_DECOR"), bundle.getString("ARG_PUSH_LINK"), q24Var, bundle.getBoolean("ARG_IS_PREVIEW"));
                bn9 bn9Var = new bn9(hVar.getAccessor().d(527), hVar.getAccessor().d(144), new eg8((qfa) hVar.getAccessor().c(221)), hVar.getAccessor().d(662), j);
                xu1 xu1Var = (xu1) messagesListWidget.A.getValue();
                c8e c8eVarC1 = messagesListWidget.C1();
                c7k c7kVar = messagesListWidget.w;
                ifh ifhVarD = t73VarB.a() ? hVar.getAccessor().d(228) : hVar.getAccessor().d(136);
                int iK = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                ksaVar.getClass();
                return new jsa(itaVar, t73VarB, xu1Var, bn9Var, c7kVar, c8eVarC1, ifhVarD, iK, ksaVar.a, ksaVar.b, ksaVar.c, ksaVar.d, ksaVar.e, ksaVar.f, ksaVar.g, ksaVar.h, ksaVar.i, ksaVar.j, ksaVar.k, ksaVar.l, ksaVar.m, ksaVar.n, ksaVar.o, ksaVar.p, ksaVar.q, ksaVar.r, ksaVar.s, ksaVar.t, ksaVar.u, ksaVar.v, ksaVar.w, ksaVar.x, ksaVar.y, ksaVar.z, ksaVar.A, ksaVar.B, ksaVar.C, ksaVar.D, ksaVar.E, ksaVar.F, ksaVar.G, ksaVar.H, ksaVar.I, ksaVar.J, ksaVar.K, ksaVar.L, ksaVar.M, ksaVar.N, ksaVar.O, ksaVar.P, ksaVar.Q, ksaVar.R, ksaVar.S, ksaVar.T, ksaVar.U, ksaVar.V, ksaVar.W, ksaVar.X, ksaVar.Y, ksaVar.Z, ksaVar.a0, ksaVar.b0, ksaVar.c0, ksaVar.d0, ksaVar.e0, ksaVar.f0, ksaVar.g0, ksaVar.h0, ksaVar.i0, ksaVar.j0, ksaVar.k0, ksaVar.l0, ksaVar.m0, ksaVar.n0, ksaVar.o0, ksaVar.p0, ksaVar.q0, ksaVar.r0, ksaVar.s0, ksaVar.t0, ksaVar.u0, ksaVar.v0, ksaVar.w0, ksaVar.x0, ksaVar.y0, ksaVar.z0, ksaVar.A0);
            case 1:
                h hVar2 = messagesListWidget.d;
                iec iecVar = (iec) ((e5d) hVar2.getAccessor().d(26).getValue()).l().i();
                iecVar.getClass();
                if (!(iecVar instanceof gec)) {
                    return null;
                }
                gec gecVar = (gec) iecVar;
                long j4 = bundle.getLong("ARG_CHAT_ID");
                return new qqa(hVar2.getAccessor().d(190), hVar2.getAccessor().d(199), gecVar.e, gecVar.f, gecVar.g, gecVar.h, gecVar.i, messagesListWidget.getLifecycleScope(), messagesListWidget.H, j4, gecVar.c, gecVar.d);
            case 2:
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                long j5 = bundle.getLong("ARG_CHAT_ID");
                MessagesListWidget messagesListWidget2 = this.b;
                h hVar3 = messagesListWidget2.d;
                return new pti(hVar3.getAccessor().d(191), hVar3.getAccessor().d(190), (u4a) hVar3.getAccessor().c(917), hVar3.getAccessor().d(201), hVar3.getAccessor().d(206), hVar3.getAccessor().d(694), hVar3.getAccessor().d(26), hVar3.getAccessor().d(85), hVar3.getAccessor().d(887), hVar3.getAccessor().d(928), j5, messagesListWidget2.H, new lsa(messagesListWidget2, 4), new fz7(1, messagesListWidget2, MessagesListWidget.class, "onMessageLongClick", "onMessageLongClick(J)V", 0, 9), (xhh) hVar3.getAccessor().d(23).getValue(), messagesListWidget2.getLifecycleScope(), ((qqa) messagesListWidget2.H1.getValue()) != null ? (h3j) hVar3.getAccessor().d(199).getValue() : null);
            case 3:
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                long j6 = bundle.getLong("ARG_CHAT_ID");
                h hVar4 = messagesListWidget.d;
                return new ab0(hVar4.getAccessor().d(130), hVar4.getAccessor().d(54), (u4a) hVar4.getAccessor().c(917), j6, messagesListWidget.H);
            default:
                zv8[] zv8VarArr4 = MessagesListWidget.T1;
                long j7 = bundle.getLong("ARG_CHAT_ID");
                if (j7 == 0 && bundle.containsKey("ARG_COMMENTS_ID") && bundle.containsKey("ARG_COMMENTED_POST_CHAT_ID")) {
                    j7 = bundle.getLong("ARG_COMMENTED_POST_CHAT_ID");
                }
                long j8 = j7;
                q24 q24Var2 = (q24) bundle.getParcelable("ARG_COMMENTS_ID");
                d8e d8eVar = (d8e) messagesListWidget.d.getAccessor().c(901);
                return new c8e(j8, q24Var2, d8eVar.a, d8eVar.b, d8eVar.c, d8eVar.d);
        }
    }

    public /* synthetic */ nsa(Bundle bundle, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.c = bundle;
        this.b = messagesListWidget;
    }
}
