package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class qj6 implements af9 {
    public static final qj6 b;
    public int a;

    static {
        qj6 qj6Var = new qj6();
        qj6Var.a = 5;
        b = qj6Var;
    }

    public static void b(int i, String str, String str2, Throwable th) {
        String strConcat = "unknown:".concat(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        sb.append(th == null ? "" : Log.getStackTraceString(th));
        Log.println(i, strConcat, sb.toString());
    }

    @Override // defpackage.af9
    public final void a(String str, String str2) {
        Log.println(6, "unknown:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void d(String str, String str2) {
        Log.println(3, "unknown:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void e(String str, String str2) {
        Log.println(6, "unknown:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void g(Exception exc, String str) {
        b(6, str, "unhandled exception", exc);
    }

    @Override // defpackage.af9
    public final boolean h(int i) {
        return this.a <= i;
    }

    @Override // defpackage.af9
    public final void i(int i) {
        this.a = i;
    }

    @Override // defpackage.af9
    public final void v(String str, String str2) {
        Log.println(2, "unknown:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void w(String str, String str2) {
        Log.println(5, "unknown:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void d(IOException iOException) {
        b(3, "HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", iOException);
    }

    @Override // defpackage.af9
    public final void e(String str, String str2, Throwable th) {
        b(6, str, str2, th);
    }

    @Override // defpackage.af9
    public final void w(String str, String str2, Throwable th) {
        b(5, str, str2, th);
    }
}
