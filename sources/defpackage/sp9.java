package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sp9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sp9(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                str = "ensureVideoInLimitedColorRange: ";
                str2 = ", needsAudioReEncoding: ";
                break;
            default:
                str = "Upload result: ";
                str2 = ", cancelled: ";
                break;
        }
        return zo5.q(str, str2, this.b, this.c);
    }
}
