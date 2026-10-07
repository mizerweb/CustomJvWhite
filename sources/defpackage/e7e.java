package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e7e implements cf7 {
    public final /* synthetic */ h7e a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ e7e(h7e h7eVar, int i, int i2) {
        this.a = h7eVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        h7e h7eVar = this.a;
        int i = h7eVar.k;
        sbi sbiVar = sbi.a;
        if (i != 2) {
            return sbiVar;
        }
        h7eVar.update(this.b, this.c - iIntValue, -1, iIntValue);
        return sbiVar;
    }
}
