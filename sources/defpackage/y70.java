package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y70 implements qf7 {
    public final /* synthetic */ int a;

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int i = this.a;
        int iAbs = Math.abs(iIntValue - i) - Math.abs(iIntValue2 - i);
        return Integer.valueOf(iAbs == 0 ? Integer.signum(iIntValue - iIntValue2) : Integer.signum(iAbs));
    }
}
