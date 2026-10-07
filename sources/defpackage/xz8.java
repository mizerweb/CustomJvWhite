package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.tamtam.services.ServiceTaskProcessException;

/* JADX INFO: loaded from: classes.dex */
public final class xz8 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public xz8(View view, View view2, FitFontImageSpan fitFontImageSpan, ow6 ow6Var) {
        this.a = 1;
        this.b = view2;
        this.c = fitFontImageSpan;
        this.d = ow6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ny8 ny8Var = (ny8) obj3;
                mjf mjfVar = (mjf) obj2;
                gm0.m("yz8", "set beans for task = %s", mjfVar);
                mjfVar.a = (njf) ((ny8) obj).getValue();
                try {
                    gm0.m("yz8", "start processing task = %s", mjfVar);
                    mjfVar.B();
                    gm0.m("yz8", "finished processing task = %s", mjfVar);
                } catch (Exception e) {
                    boolean z = mjfVar instanceof btc;
                    gm0.V("yz8", "fail to process task=" + mjfVar, new ServiceTaskProcessException(z ? ((btc) mjfVar).getType().toString() : mjfVar.toString(), e));
                    mjfVar.A();
                    if (z) {
                        btc btcVar = (btc) mjfVar;
                        ch3.G(((okh) ny8Var.getValue()).c().b().a, false, true, new aa2(btcVar.getId(), 27));
                        tjh tjhVarJ = ((okh) ny8Var.getValue()).j(btcVar.getId(), btcVar.getType());
                        int iL = btcVar.e() ? btcVar.l() : 10;
                        if (tjhVarJ == null || tjhVarJ.c < iL) {
                            return;
                        }
                        try {
                            btcVar.d();
                            break;
                        } catch (Throwable th) {
                            gm0.V("yz8", "TaskRunnable: failed to execute onMaxFailCount method for task " + btcVar.getId() + " type " + btcVar.getType(), th);
                        }
                        ((okh) ny8Var.getValue()).d(btcVar.getId());
                        gm0.n("yz8", "remove task because it cause too many exceptions: ".concat(xz8.class.getName()));
                        return;
                    }
                    return;
                }
                break;
            case 1:
                FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj3;
                View view = (View) obj2;
                if (view instanceof TextView) {
                    soh.b((TextView) view, fitFontImageSpan);
                } else if (view instanceof trb) {
                    l8j.b((trb) view, fitFontImageSpan);
                }
                ((ow6) obj).a();
                break;
            case 2:
                ek2 ek2Var = (ek2) obj2;
                try {
                    yab.A0(ek2Var.e.I(khb.f), new l83((rre) obj3, ek2Var, (o05) obj, (lq4) null, 13));
                } catch (Throwable th2) {
                    ek2Var.n(th2);
                    return;
                }
                break;
            default:
                rjh rjhVar = (rjh) obj3;
                kk2 kk2Var = (kk2) obj2;
                if (kk2Var != null && kk2Var.a()) {
                    rjhVar.a();
                } else {
                    try {
                        rjhVar.c(((Callable) obj).call());
                    } catch (CancellationException unused) {
                        rjhVar.a();
                    } catch (Exception e2) {
                        rjhVar.b(e2);
                        return;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((mjf) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xz8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
