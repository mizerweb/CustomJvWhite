package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l1k extends p5k {
    public final /* synthetic */ int a;
    public byte[] b;
    public Object c;

    public /* synthetic */ l1k(int i) {
        this.a = i;
    }

    @Override // defpackage.p5k
    public final jfk b() {
        switch (this.a) {
            case 0:
                return jfk.certificate_request;
            case 1:
                return jfk.encrypted_extensions;
            default:
                return jfk.finished;
        }
    }

    @Override // defpackage.p5k
    public final byte[] d() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return (byte[]) this.c;
        }
    }
}
