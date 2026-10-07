package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kih extends sq0 {
    public static final jih b = new jih();

    public kih(fka fkaVar) {
        try {
            long jNanoTime = System.nanoTime();
            if (fkaVar.l()) {
                int iP0 = fkaVar.P0();
                for (int i = 0; i < iP0; i++) {
                    b(fkaVar, fkaVar.S0());
                }
            }
            this.a = Math.abs(System.nanoTime() - jNanoTime) / 1000000;
        } catch (Exception e) {
            gm0.r("kih", "failed to parse unpacker response: ", e);
            qr7.o(e);
            throw null;
        }
    }

    public void b(fka fkaVar, String str) {
    }

    public kih() {
    }
}
