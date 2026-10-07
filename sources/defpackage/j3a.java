package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j3a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4d b;
    public final /* synthetic */ int c;

    public /* synthetic */ j3a(j4d j4dVar, int i, int i2) {
        this.a = i2;
        this.b = j4dVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        j4d j4dVar = this.b;
        switch (i) {
            case 0:
                if (j4dVar.c(25) || j4dVar.c(33)) {
                    if (!j4dVar.c(33)) {
                        j4dVar.n0(i2);
                    } else {
                        j4dVar.o0(i2, 1);
                    }
                }
                break;
            default:
                if (j4dVar.c(26) || j4dVar.c(34)) {
                    if (i2 == -100) {
                        if (!j4dVar.c(34)) {
                            j4dVar.m0(true);
                        } else {
                            j4dVar.l0(1, true);
                        }
                    } else if (i2 == -1) {
                        if (!j4dVar.c(34)) {
                            j4dVar.O();
                        } else {
                            j4dVar.P(1);
                        }
                    } else if (i2 == 1) {
                        if (!j4dVar.c(34)) {
                            j4dVar.c0();
                        } else {
                            j4dVar.d0(1);
                        }
                    } else if (i2 == 100) {
                        if (!j4dVar.c(34)) {
                            j4dVar.m0(false);
                        } else {
                            j4dVar.l0(1, false);
                        }
                    } else if (i2 != 101) {
                        qt4.y(i2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                    } else if (!j4dVar.c(34)) {
                        j4dVar.f0();
                        j4dVar.m0(true);
                    } else {
                        j4dVar.f0();
                        j4dVar.l0(1, true);
                    }
                }
                break;
        }
    }
}
