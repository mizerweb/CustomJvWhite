package defpackage;

import com.vk.push.core.base.AidlException;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class tm7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ GifViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm7(lq4 lq4Var, GifViewerWidget gifViewerWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gifViewerWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        GifViewerWidget gifViewerWidget = this.g;
        switch (i) {
            case 0:
                tm7 tm7Var = new tm7(lq4Var, gifViewerWidget, 0);
                tm7Var.f = obj;
                return tm7Var;
            default:
                tm7 tm7Var2 = new tm7(lq4Var, gifViewerWidget, 1);
                tm7Var2.f = obj;
                return tm7Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((tm7) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((tm7) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rui ruiVar;
        uj6 uj6Var;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                bc6 bc6Var = (bc6) obj2;
                GifViewerWidget gifViewerWidget = this.g;
                zv8[] zv8VarArr = GifViewerWidget.m;
                if (bc6Var instanceof ob6) {
                    qy9 qy9Var = ((ob6) bc6Var).a;
                    if (cqk.d(qy9Var.B(), gifViewerWidget.u1()) && qy9Var.l() == gifViewerWidget.v1()) {
                        qy9 qy9VarM = gifViewerWidget.y1().M(gifViewerWidget.v1(), gifViewerWidget.u1());
                        ky9 ky9Var = qy9VarM instanceof ky9 ? (ky9) qy9VarM : null;
                        if (ky9Var != null) {
                            if (gifViewerWidget.q1().getFailure()) {
                                gifViewerWidget.y1().S(gifViewerWidget.v1(), gifViewerWidget.u1());
                                gifViewerWidget.q1().k(t2m.b(ky9Var.d), gifViewerWidget.q1().getFailure());
                            } else {
                                gifViewerWidget.y1().T(gifViewerWidget.v1(), gifViewerWidget.u1());
                            }
                        }
                    }
                } else if (bc6Var instanceof qb6) {
                    qy9 qy9Var2 = ((qb6) bc6Var).a;
                    if (cqk.d(qy9Var2.B(), gifViewerWidget.u1()) && qy9Var2.l() == gifViewerWidget.v1()) {
                        gifViewerWidget.k = null;
                        e3j e3jVarW1 = gifViewerWidget.w1();
                        if (e3jVarW1 != null) {
                            e3jVarW1.pause();
                            e3jVarW1.H(null);
                            e3jVarW1.stop();
                        }
                        gifViewerWidget.x1().b();
                    }
                } else if (bc6Var instanceof sb6) {
                    ky9 ky9Var2 = ((sb6) bc6Var).a;
                    if (ky9Var2.f.equals(gifViewerWidget.u1()) && ky9Var2.a == gifViewerWidget.v1()) {
                        gifViewerWidget.q1().k(t2m.b(ky9Var2.d), true);
                    }
                }
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                o53 o53Var = (o53) obj3;
                GifViewerWidget gifViewerWidget2 = this.g;
                String str = gifViewerWidget2.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        boolean z = o53Var.b != null;
                        qy9 qy9Var3 = o53Var.a;
                        long jV1 = gifViewerWidget2.v1();
                        String strU1 = gifViewerWidget2.u1();
                        StringBuilder sb = new StringBuilder("Media viewer. Video page state changed, \n                        |hasContent:");
                        sb.append(z);
                        sb.append(", \n                        |item:");
                        sb.append(qy9Var3);
                        sb.append(", curMsgId:");
                        qv1.s(jV1, ", \n                        |curAttachId:", strU1, sb);
                        sb.append("\n                        |");
                        a4cVar.c(je9Var, str, s5h.y0(sb.toString()), null);
                    }
                }
                qy9 qy9Var4 = o53Var.a;
                if (qy9Var4 != null && qy9Var4.l() == gifViewerWidget2.v1() && cqk.d(o53Var.a.B(), gifViewerWidget2.u1()) && (ruiVar = o53Var.b) != null) {
                    gifViewerWidget2.k = ruiVar;
                    e3j e3jVarW2 = gifViewerWidget2.w1();
                    if (e3jVarW2 != null) {
                        e3jVarW2.b(0.0f);
                        e3jVarW2.o0(true);
                        e3j.w(e3jVarW2, o53Var.b, true, d3j.ATTACH_VIEWER, 0.0f, AidlException.SDK_IS_NOT_INITIALIZED);
                        if (((Boolean) ((e5d) gifViewerWidget2.d.getValue()).x().i()).booleanValue()) {
                            gifViewerWidget2.x1().setAlpha(0.0f);
                            e3jVarW2.q0(new um7(gifViewerWidget2, e3jVarW2, 1));
                        }
                    }
                    if (!((Boolean) ((e5d) gifViewerWidget2.d.getValue()).x().i()).booleanValue() && (uj6Var = gifViewerWidget2.j) != null) {
                        uj6Var.g();
                    }
                    gifViewerWidget2.x1().a(gifViewerWidget2.l);
                }
                break;
        }
        return sbi.a;
    }
}
