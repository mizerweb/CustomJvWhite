package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class w0l {
    static final w0l b = new w0l(new a("Failure occurred while trying to finish a future."));
    final Throwable a;

    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public w0l(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
