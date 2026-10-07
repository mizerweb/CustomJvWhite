package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kn3 implements fdd {
    public final /* synthetic */ int a;

    public /* synthetic */ kn3(int i) {
        this.a = i;
    }

    @Override // defpackage.fdd
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((rt2) obj).h0();
            case 1:
                return "join".equalsIgnoreCase((String) obj);
            case 2:
                return "u".equalsIgnoreCase((String) obj);
            case 3:
                y60 y60Var = ((e70) obj).a;
                return y60Var == y60.c || y60Var == y60.d;
            case 4:
                return ((Long) obj).longValue() != 0;
            default:
                return ((rtc) obj).r() != 0;
        }
    }

    public /* synthetic */ kn3(w69 w69Var, int i) {
        this.a = i;
    }
}
