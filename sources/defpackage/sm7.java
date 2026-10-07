package defpackage;

import com.vk.push.core.base.AidlException;
import one.me.mediaeditor.GifViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class sm7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ GifViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm7(lq4 lq4Var, GifViewerWidget gifViewerWidget, int i) {
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
                sm7 sm7Var = new sm7(lq4Var, gifViewerWidget, 0);
                sm7Var.f = obj;
                return sm7Var;
            default:
                sm7 sm7Var2 = new sm7(lq4Var, gifViewerWidget, 1);
                sm7Var2.f = obj;
                return sm7Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((sm7) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((sm7) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        b68 b68VarP1;
        rui ruiVar;
        uj6 uj6Var;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                cc6 cc6Var = (cc6) obj2;
                GifViewerWidget gifViewerWidget = this.g;
                zv8[] zv8VarArr = GifViewerWidget.l;
                if (cc6Var instanceof nb6) {
                    if (((nb6) cc6Var).a.b == gifViewerWidget.u1() && (b68VarP1 = gifViewerWidget.p1()) != null) {
                        if (gifViewerWidget.q1().getFailure()) {
                            gifViewerWidget.x1().S(gifViewerWidget.u1());
                            gifViewerWidget.q1().k(b68VarP1, gifViewerWidget.q1().getFailure());
                        } else {
                            gifViewerWidget.x1().T(gifViewerWidget.u1());
                        }
                    }
                } else if (cc6Var instanceof pb6) {
                    if (((pb6) cc6Var).a.b == gifViewerWidget.u1()) {
                        gifViewerWidget.j = null;
                        e3j e3jVarV1 = gifViewerWidget.v1();
                        if (e3jVarV1 != null) {
                            e3jVarV1.o0(false);
                            e3jVarV1.pause();
                            e3jVarV1.H(null);
                            e3jVarV1.stop();
                        }
                        gifViewerWidget.w1().b();
                    }
                } else if (cc6Var instanceof rb6) {
                    hb9 hb9Var = ((rb6) cc6Var).a;
                    if (hb9Var.b != gifViewerWidget.u1()) {
                        gifViewerWidget.q1().k(t2m.c(hb9Var, null), true);
                    }
                }
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                xw9 xw9Var = (xw9) obj3;
                GifViewerWidget gifViewerWidget2 = this.g;
                String str = gifViewerWidget2.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        boolean z = xw9Var.b != null;
                        a4cVar.c(je9Var, str, s5h.y0("Media editor. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + xw9Var.a + ",\n                        |curAttachId:" + gifViewerWidget2.u1() + "\n                        |"), null);
                    }
                }
                hb9 hb9Var2 = xw9Var.a;
                if (hb9Var2 != null && hb9Var2.b == gifViewerWidget2.u1() && (ruiVar = xw9Var.b) != null) {
                    gifViewerWidget2.j = ruiVar;
                    e3j e3jVarV2 = gifViewerWidget2.v1();
                    if (e3jVarV2 != null) {
                        e3jVarV2.b(0.0f);
                        e3jVarV2.o0(true);
                        e3j.w(e3jVarV2, xw9Var.b, true, d3j.ATTACH_VIEWER, 0.0f, AidlException.SDK_IS_NOT_INITIALIZED);
                        if (((Boolean) ((e5d) gifViewerWidget2.d.getValue()).x().i()).booleanValue()) {
                            gifViewerWidget2.w1().setAlpha(0.0f);
                            e3jVarV2.q0(new um7(gifViewerWidget2, e3jVarV2, 0));
                        }
                    }
                    if (!((Boolean) ((e5d) gifViewerWidget2.d.getValue()).x().i()).booleanValue() && (uj6Var = gifViewerWidget2.i) != null) {
                        uj6Var.g();
                    }
                    gifViewerWidget2.w1().a(gifViewerWidget2.k);
                }
                break;
        }
        return sbi.a;
    }
}
