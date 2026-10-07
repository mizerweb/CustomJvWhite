package defpackage;

import android.app.Application;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import one.me.messages.list.ui.MessagesListWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class msa implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ msa(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af7
    public final Object invoke() {
        nx2 nx2Var;
        ax2 ax2Var;
        pda pdaVar;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        MessagesListWidget messagesListWidget = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((g5d) ((gjf) messagesListWidget.k.getValue())).a.E5.a(e5d.S6[344]).i();
                bool.getClass();
                return bool;
            case 1:
                zv8[] zv8VarArr = MessagesListWidget.T1;
                return new xsa(messagesListWidget);
            case 2:
                return (hs2) ((g5d) ((gjf) messagesListWidget.k.getValue())).a.D5.a(e5d.S6[343]).i();
            case 3:
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                return new ssa(messagesListWidget);
            case 4:
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                return new tw6(messagesListWidget.s1().d, messagesListWidget.s1().c, new eg8(Boolean.TRUE), new eg8(messagesListWidget.x1().M6.a(e5d.S6[405]).i()), messagesListWidget.H, messagesListWidget.F1(), new msa(messagesListWidget, 14));
            case 5:
                zv8[] zv8VarArr4 = MessagesListWidget.T1;
                return new hva(messagesListWidget.D1(), messagesListWidget.F1().c, messagesListWidget.F1().g0().u, messagesListWidget.H, messagesListWidget.E1());
            case 6:
                zv8[] zv8VarArr5 = MessagesListWidget.T1;
                xb9 xb9Var = (xb9) messagesListWidget.t1();
                if (((Boolean) xb9Var.X0.m(xb9Var, xb9.g1[41])).booleanValue() || !((f5d) ((wo6) messagesListWidget.m.getValue())).n()) {
                    return null;
                }
                return new h1i();
            case 7:
                ((i8d) messagesListWidget.d.getAccessor().c(297)).getClass();
                return new h8d();
            case 8:
                return vd7.o(messagesListWidget.u, new ifh(new msa(messagesListWidget, 16)), messagesListWidget);
            case 9:
                zv8[] zv8VarArr6 = MessagesListWidget.T1;
                return Boolean.valueOf(messagesListWidget.F1().c0().h());
            case 10:
                zv8[] zv8VarArr7 = MessagesListWidget.T1;
                return Boolean.valueOf(messagesListWidget.F1().c0().h());
            case 11:
                zv8[] zv8VarArr8 = MessagesListWidget.T1;
                jsa jsaVarF1 = messagesListWidget.F1();
                rt2 rt2Var = (rt2) jsaVarF1.w2.a.getValue();
                if (rt2Var == null || !rt2Var.h0()) {
                    rt2 rt2Var2 = (rt2) jsaVarF1.w2.a.getValue();
                    if (rt2Var2 != null && (nx2Var = rt2Var2.b) != null && (ax2Var = nx2Var.p) != null) {
                        i2 = ax2Var.c;
                    }
                } else {
                    i2 = n6e.a;
                }
                return Integer.valueOf(i2);
            case 12:
                zv8[] zv8VarArr9 = MessagesListWidget.T1;
                jsa jsaVarF2 = messagesListWidget.F1();
                return Boolean.valueOf(jsaVarF2.r.d.getBoolean("app.messages.enable.double.tap.reactions", true) && jsaVarF2.d.h());
            case 13:
                zv8[] zv8VarArr10 = MessagesListWidget.T1;
                return pq3.j.k(messagesListWidget.getContext()).b;
            case 14:
                zv8[] zv8VarArr11 = MessagesListWidget.T1;
                return messagesListWidget.getViewLifecycleScope();
            case 15:
                zv8[] zv8VarArr12 = MessagesListWidget.T1;
                boolean z2 = (((opa) messagesListWidget.F1().y2.getValue()).b || ((opa) messagesListWidget.F1().y2.getValue()).c) ? false : true;
                Boolean boolValueOf = messagesListWidget.getView() != null ? Boolean.valueOf(messagesListWidget.D1().M0()) : null;
                boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
                String str = messagesListWidget.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbB = zo5.B("isEnoughMessagesRendered: hasNotNext=", !((opa) messagesListWidget.F1().y2.getValue()).b, ", hasNotPrev=", !((opa) messagesListWidget.F1().y2.getValue()).c, ", isViewPortFilled=");
                        sbB.append(zBooleanValue);
                        a4cVar.c(je9Var, str, sbB.toString(), null);
                    }
                }
                if (!z2 && !zBooleanValue) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                zv8[] zv8VarArr13 = MessagesListWidget.T1;
                return messagesListWidget.getRouter();
            case 17:
                return new wx6((Application) messagesListWidget.d.getAccessor().c(70), new lsa(messagesListWidget, 3));
            case 18:
                g8c g8cVar = messagesListWidget.G;
                if (g8cVar != null) {
                    g8cVar.a();
                }
                h8c h8cVar = new h8c(messagesListWidget);
                h8cVar.m(new tnh(R.string.error_no_browser));
                h8cVar.a(new tnh(R.string.error_no_browser_desc));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.c(new o8c(0, 0, messagesListWidget.r1(), 11));
                messagesListWidget.G = h8cVar.p();
                return sbi.a;
            case 19:
                zv8[] zv8VarArr14 = MessagesListWidget.T1;
                jsa jsaVarF3 = messagesListWidget.F1();
                if (((Boolean) jsaVarF3.I2.getValue()).booleanValue()) {
                    i2 = 1;
                } else {
                    rt2 rt2Var3 = (rt2) jsaVarF3.w2.a.getValue();
                    if (rt2Var3 != null) {
                        if (jsaVarF3.d.i() || jsaVarF3.c0().h()) {
                            i2 = 1;
                        } else {
                            cea ceaVarY = jsaVarF3.Y();
                            ceaVarY.getClass();
                            if (!rt2Var3.r0() || !rt2Var3.b.g() || ceaVarY.r()) {
                                i2 = 1;
                            }
                        }
                    }
                }
                return Boolean.valueOf(i2 ^ 1);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr15 = MessagesListWidget.T1;
                return new xpa(messagesListWidget.D1(), new msa(messagesListWidget, 15), messagesListWidget.d.getAccessor().d(20));
            case 21:
                qp4 qp4Var = messagesListWidget.o;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                return sbi.a;
            case 22:
                qp4 qp4Var2 = messagesListWidget.o;
                if (qp4Var2 != null) {
                    qp4Var2.C();
                }
                return sbi.a;
            case 23:
                zv8[] zv8VarArr16 = MessagesListWidget.T1;
                messagesListWidget.q.B(messagesListWidget, MessagesListWidget.T1[5], null);
                tda tdaVar = messagesListWidget.p;
                if (tdaVar != null && (pdaVar = tdaVar.h) != null) {
                    ViewParent parent = tdaVar.b().getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        gp2 gp2Var = new gp2();
                        gp2Var.c = 150L;
                        gp2Var.d = new DecelerateInterpolator(1.2f);
                        gp2Var.b(tdaVar.b());
                        x2i.a(gp2Var, viewGroup);
                    }
                    pdaVar.animate().cancel();
                    pdaVar.setVisibility(8);
                    tdaVar.c().setVisibility(0);
                    tdaVar.c().setScaleX(0.75f);
                    tdaVar.c().setScaleY(0.75f);
                    tdaVar.c().setAlpha(0.0f);
                    LinearLayout linearLayoutC = tdaVar.c();
                    bdc.a(linearLayoutC, new rda(0, linearLayoutC, tdaVar));
                }
                return sbi.a;
            case 24:
                zv8[] zv8VarArr17 = MessagesListWidget.T1;
                return new zsa(messagesListWidget);
            case 25:
                zv8[] zv8VarArr18 = MessagesListWidget.T1;
                return new jed((xed) messagesListWidget.C1().B().j.getValue());
            case 26:
                zv8[] zv8VarArr19 = MessagesListWidget.T1;
                return new jed((xed) messagesListWidget.F1().U2.getValue(), new osa(messagesListWidget, 1));
            case 27:
                zv8[] zv8VarArr20 = MessagesListWidget.T1;
                return new jed((xed) messagesListWidget.F1().V2.getValue(), new f4a(22));
            default:
                zv8[] zv8VarArr21 = MessagesListWidget.T1;
                return new jed((xed) messagesListWidget.F1().W2.getValue(), new osa(messagesListWidget, 2));
        }
    }
}
