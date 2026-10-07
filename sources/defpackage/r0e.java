package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import one.me.qrscanner.QrScannerWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrScannerWidget b;

    public /* synthetic */ r0e(QrScannerWidget qrScannerWidget, int i) {
        this.a = i;
        this.b = qrScannerWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        QrScannerWidget qrScannerWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = QrScannerWidget.w;
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = qrScannerWidget.r1().animate().setStartDelay(200L).alpha(1.0f).setInterpolator((PathInterpolator) qrScannerWidget.v.getValue()).setDuration(670L).withStartAction(new r0e(qrScannerWidget, i2)).withEndAction(new r0e(qrScannerWidget, 2));
                qrScannerWidget.t = viewPropertyAnimatorWithEndAction;
                if (viewPropertyAnimatorWithEndAction != null) {
                    viewPropertyAnimatorWithEndAction.start();
                }
                break;
            case 1:
                zv8[] zv8VarArr2 = QrScannerWidget.w;
                d0e d0eVarR1 = qrScannerWidget.r1();
                ValueAnimator valueAnimator = d0eVarR1.c;
                if (!valueAnimator.isRunning()) {
                    valueAnimator.start();
                }
                d0eVarR1.a.setColor(d0eVarR1.k);
                d0eVarR1.l = false;
                d0eVarR1.e = null;
                d0eVarR1.invalidate();
                break;
            default:
                qrScannerWidget.u = true;
                break;
        }
    }
}
