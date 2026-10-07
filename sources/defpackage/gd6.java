package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gd6 {
    public static final fd6 a = new fd6("No further exceptions");

    public static NullPointerException a(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static RuntimeException b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
