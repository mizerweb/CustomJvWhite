package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ji1 extends RuntimeException {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji1() {
        super("DateTime does not include year/month/day.");
        this.a = 3;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 1:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji1(String str, int i) {
        super(str);
        this.a = i;
    }
}
