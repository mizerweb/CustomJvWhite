package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ug2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg2 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ ug2(yg2 yg2Var, List list, int i, int i2) {
        this.a = i2;
        this.b = yg2Var;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yg2 yg2Var = this.b;
                List list = this.c;
                int i = this.d;
                if (yg2Var.l.get() && yg2Var.k.equals(list)) {
                    tvj.a("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    x70 x70Var = yg2Var.h;
                    if (x70Var != null) {
                        x70Var.f();
                    }
                    yg2Var.d(i - 1, list);
                    break;
                }
                break;
            default:
                yg2 yg2Var2 = this.b;
                yg2Var2.a.execute(new ug2(yg2Var2, this.c, this.d, 0));
                break;
        }
    }
}
