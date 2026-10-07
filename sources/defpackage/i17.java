package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i17 extends r1 {
    public final /* synthetic */ j17 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i17(j17 j17Var, int i) {
        super(i, 0);
        this.d = j17Var;
    }

    @Override // defpackage.r1
    public final Object a(int i) {
        return this.d.a[i].iterator();
    }
}
