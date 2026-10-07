package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f5f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5f b;

    public /* synthetic */ f5f(g5f g5fVar, int i) {
        this.a = i;
        this.b = g5fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g5f g5fVar = this.b;
        switch (i) {
            case 0:
                if (g5fVar.g) {
                    bc7 bc7Var = g5fVar.d;
                    if (bc7Var != null) {
                        bc7Var.d.b(new ac7(bc7Var, 0));
                    }
                    ic7 ic7Var = g5fVar.e;
                    if (ic7Var != null) {
                        ic7Var.a.b(new hc7(ic7Var, 1));
                    }
                    if (g5fVar.f != null) {
                        g5fVar.f.c(false);
                    }
                }
                bc7 bc7Var2 = g5fVar.d;
                if (bc7Var2 != null) {
                    bc7Var2.g = null;
                    bc7Var2.d.a(new ac7(bc7Var2, 1));
                }
                ic7 ic7Var2 = g5fVar.e;
                if (ic7Var2 != null) {
                    ic7Var2.a.b(new hc7(ic7Var2, 1));
                    ic7Var2.a.a(new hc7(ic7Var2, 2));
                }
                if (g5fVar.f != null) {
                    g5fVar.f.c(false);
                }
                bc7 bc7Var3 = g5fVar.d;
                if (bc7Var3 != null) {
                    qq4 qq4Var = bc7Var3.d;
                    qq4Var.getClass();
                    try {
                        qq4Var.c.await();
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                g5fVar.d = null;
                g5fVar.e = null;
                g5fVar.f = null;
                g5fVar.c = true;
                break;
            case 1:
                bc7 bc7Var4 = g5fVar.d;
                if (bc7Var4 != null) {
                    bc7Var4.d.b(new ac7(bc7Var4, 0));
                }
                ic7 ic7Var3 = g5fVar.e;
                if (ic7Var3 != null) {
                    ic7Var3.a.b(new hc7(ic7Var3, 1));
                }
                if (g5fVar.f != null) {
                    g5fVar.f.c(false);
                }
                break;
            default:
                double d = 1.0E9d / g5fVar.d.h.b.b;
                double d2 = 1.0E9d / g5fVar.e.h.b.b;
                double d3 = 1.0E9d / g5fVar.e.i.b.b;
                double d4 = 1.0E9d / g5fVar.f.f.b.b;
                g5fVar.a.log("SSStat", "capturer: " + d + " , encoder: " + d2 + " | " + d3 + " , sender: " + d4);
                g5fVar.b.a.postDelayed(g5fVar.h, 1000L);
                break;
        }
    }
}
