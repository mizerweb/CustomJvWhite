package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ra8 implements nnf {
    public final x02 a;
    public final ny8 b;
    public final ny8 c;
    public final AtomicReference d = new AtomicReference(null);

    public ra8(x02 x02Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = x02Var;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        String str;
        ny8 ny8Var = this.b;
        boolean zIsConnected = ((onf) ny8Var.getValue()).isConnected();
        if (Boolean.valueOf(zIsConnected).equals((Boolean) this.d.getAndSet(Boolean.valueOf(zIsConnected)))) {
            return;
        }
        int i2 = ((onf) ny8Var.getValue()).isConnected() ? 2 : 1;
        x02 x02Var = this.a;
        if (x02Var.C()) {
            sa2 sa2Var = (sa2) this.c.getValue();
            boolean z = ((dz4) x02Var.z().getValue()).i;
            sa2Var.getClass();
            int iD = qt4.D(i2);
            if (iD == 0) {
                str = "transport_error_max";
            } else {
                if (iD != 1) {
                    ore.o();
                    return;
                }
                str = "transport_reconnected_max";
            }
            sa2.c(sa2Var, str, null, null, null, null, null, z, null, 370);
        }
    }
}
