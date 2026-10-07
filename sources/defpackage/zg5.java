package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zg5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh5 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ rj5 d;

    public /* synthetic */ zg5(bh5 bh5Var, Runnable runnable, rj5 rj5Var, int i) {
        this.a = i;
        this.b = bh5Var;
        this.c = runnable;
        this.d = rj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final rj5 rj5Var = this.d;
        final Runnable runnable = this.c;
        bh5 bh5Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                bh5Var.a.execute(new Runnable() { // from class: xg5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        rj5 rj5Var2 = rj5Var;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((dh5) rj5Var2.b).r(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((dh5) rj5Var2.b).r(e2);
                                    return;
                                }
                            default:
                                dh5 dh5Var = (dh5) rj5Var2.b;
                                try {
                                    runnable2.run();
                                    dh5Var.q(null);
                                    return;
                                } catch (Exception e3) {
                                    dh5Var.r(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                bh5Var.a.execute(new Runnable() { // from class: xg5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        rj5 rj5Var2 = rj5Var;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((dh5) rj5Var2.b).r(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((dh5) rj5Var2.b).r(e2);
                                    return;
                                }
                            default:
                                dh5 dh5Var = (dh5) rj5Var2.b;
                                try {
                                    runnable2.run();
                                    dh5Var.q(null);
                                    return;
                                } catch (Exception e3) {
                                    dh5Var.r(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                bh5Var.a.execute(new Runnable() { // from class: xg5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        rj5 rj5Var2 = rj5Var;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((dh5) rj5Var2.b).r(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((dh5) rj5Var2.b).r(e2);
                                    return;
                                }
                            default:
                                dh5 dh5Var = (dh5) rj5Var2.b;
                                try {
                                    runnable2.run();
                                    dh5Var.q(null);
                                    return;
                                } catch (Exception e3) {
                                    dh5Var.r(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
