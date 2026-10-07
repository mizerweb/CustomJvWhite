package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class pv extends rcg implements hee {
    public final int a;
    public mm5 b;

    public pv(Context context, int i) {
        this.a = i;
        this.b = new mm5(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // defpackage.hee
    public final rcg a(Context context) {
        this.b = new mm5(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    @Override // defpackage.rcg
    public final String b() {
        throw null;
    }

    @Override // defpackage.rcg
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.c(str, i, threadPolicy);
    }

    @Override // defpackage.rcg
    public final void d(int i) {
        this.b.getClass();
    }

    @Override // defpackage.rcg
    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}
