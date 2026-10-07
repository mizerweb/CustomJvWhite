package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qti implements qf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (z5h.G0(str, "ru", true)) {
                    i = -1;
                } else if (z5h.G0(str2, "ru", true)) {
                    i = 1;
                } else if (z5h.G0(str, "en", true)) {
                    i = -1;
                } else if (z5h.G0(str2, "en", true)) {
                    i = 1;
                }
                return Integer.valueOf(i);
            default:
                return Boolean.valueOf(((vfi) obj2).e <= ((vfi) obj).e);
        }
    }
}
