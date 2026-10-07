package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ncj {
    public static final String h;
    public String a;
    public long b;
    public long c;
    public Thread d;
    public StackTraceElement[] e;
    public boolean f;
    public boolean g;

    static {
        Package r0 = ncj.class.getPackage();
        String name = r0 != null ? r0.getName() : null;
        if (name == null) {
            name = "";
        }
        h = name;
    }

    public final mcj a() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        Thread thread = this.d;
        StackTraceElement[] stackTraceElementArr = this.e;
        return new mcj(str, j, j2, thread, (!this.g || stackTraceElementArr == null) ? r66.a : yhf.w0(yhf.m0(yhf.l0(a.K0(stackTraceElementArr), 2), new u8h(28))), this.f);
    }
}
