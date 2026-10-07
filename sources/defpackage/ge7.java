package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge7 implements qf7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public /* synthetic */ ge7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        je7 je7Var = (je7) obj2;
        long j = this.a;
        long j2 = this.b;
        return je7Var != null ? je7.a(je7Var, 0, Long.valueOf(j), Long.valueOf(j2), 3) : new je7(0, false, Long.valueOf(j), Long.valueOf(j2), 3);
    }
}
