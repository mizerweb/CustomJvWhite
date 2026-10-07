package defpackage;

import ru.rustore.sdk.metrics.MetricsException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xn5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr0 b;

    public /* synthetic */ xn5(kr0 kr0Var, int i) {
        this.a = i;
        this.b = kr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws MetricsException.SaveMetricsEventError {
        int i = this.a;
        kr0 kr0Var = this.b;
        switch (i) {
            case 0:
                kr0Var.invoke();
                break;
            default:
                kr0Var.invoke();
                break;
        }
    }
}
