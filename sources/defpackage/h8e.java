package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h8e implements cf7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public h8e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean z;
        btc btcVar = (btc) obj;
        if (btcVar instanceof k13) {
            k13 k13Var = (k13) btcVar;
            if (k13Var.a == this.a || k13Var.f != this.b) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
