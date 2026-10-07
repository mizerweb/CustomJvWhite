package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: loaded from: classes2.dex */
public final class bh2 implements gpe {
    public final /* synthetic */ int b;
    public final gpe c;

    public bh2(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new ath(j, new ah2(j));
                break;
            default:
                this.c = new bh2(j, 1);
                break;
        }
    }

    @Override // defpackage.gpe
    public final long a() {
        switch (this.b) {
            case 0:
                return ((ath) ((bh2) this.c).c).b;
            default:
                return ((ath) this.c).b;
        }
    }

    @Override // defpackage.gpe
    public final fpe b(zg2 zg2Var) {
        int i = this.b;
        gpe gpeVar = this.c;
        switch (i) {
            case 0:
                if (((ath) ((bh2) gpeVar).c).b(zg2Var).b) {
                    return fpe.e;
                }
                Throwable th = (Throwable) zg2Var.c;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    tvj.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th).a > 0) {
                        return fpe.f;
                    }
                }
                return fpe.d;
            default:
                return ((ath) gpeVar).b(zg2Var);
        }
    }
}
