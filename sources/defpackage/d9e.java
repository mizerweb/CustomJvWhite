package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d9e extends kjh {
    public final /* synthetic */ e9e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9e(e9e e9eVar, String str) {
        super(str, true);
        this.e = e9eVar;
    }

    @Override // defpackage.kjh
    public final long a() {
        e9e e9eVar = this.e;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        c9e c9eVar = null;
        int i2 = 0;
        for (c9e c9eVar2 : e9eVar.d) {
            synchronized (c9eVar2) {
                if (e9eVar.b(c9eVar2, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - c9eVar2.q;
                    if (j2 > j) {
                        c9eVar = c9eVar2;
                        j = j2;
                    }
                }
            }
        }
        long j3 = e9eVar.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        synchronized (c9eVar) {
            if (!c9eVar.p.isEmpty()) {
                return 0L;
            }
            if (c9eVar.q + j != jNanoTime) {
                return 0L;
            }
            c9eVar.j = true;
            e9eVar.d.remove(c9eVar);
            uqi.e(c9eVar.d);
            if (e9eVar.d.isEmpty()) {
                e9eVar.b.a();
            }
            return 0L;
        }
    }
}
