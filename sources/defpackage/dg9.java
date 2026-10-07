package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dg9 extends Error {
    public final String a;

    public dg9(String str, Throwable th) {
        this(zo5.p(str, " | ", th != null ? th.getMessage() : null), false);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public dg9(String str) {
        this(c0a.o("SmsAttemptExceed (Phone: ", str, ")"), false);
    }

    public dg9(String str, boolean z) {
        super(str, null);
        this.a = str;
    }
}
