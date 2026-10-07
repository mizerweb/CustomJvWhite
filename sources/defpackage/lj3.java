package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lj3 extends Throwable {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ lj3(String str) {
        super(str);
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

    public /* synthetic */ lj3(String str, Throwable th) {
        super(str, th);
    }
}
