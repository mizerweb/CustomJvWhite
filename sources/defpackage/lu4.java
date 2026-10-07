package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lu4 extends Error {
    public lu4() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public lu4(String str, Throwable th) {
        super(str, th);
    }
}
