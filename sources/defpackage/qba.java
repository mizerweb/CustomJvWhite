package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qba {
    OnCloseToDalvikHeapLimit(0.5d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackgroundLowSeverity(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemModerateMemory(0.5d),
    OnAppBackgrounded(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnJavaMemoryRed(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnJavaMemoryYellow(0.5d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryRed(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryYellow(0.5d);

    public final double a;

    qba(double d) {
        this.a = d;
    }

    public final double a() {
        return this.a;
    }
}
