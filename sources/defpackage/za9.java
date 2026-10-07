package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class za9 extends Throwable {
    public final /* synthetic */ int a = 2;

    public /* synthetic */ za9() {
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

    public /* synthetic */ za9(String str, Throwable th) {
        super(str, th);
    }

    public za9(String str) {
        super(str);
    }
}
