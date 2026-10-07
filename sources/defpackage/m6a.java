package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m6a {
    public final long a;
    public final long b;
    public final long c;
    public final w5a d;
    public final n6a e;

    public m6a(long j, long j2, long j3, w5a w5aVar, n6a n6aVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = w5aVar;
        this.e = n6aVar;
        String str = w5aVar.c;
        if (str != null) {
            Uri.fromFile(new File(str));
        } else {
            ore.p("Required value was null.");
            throw null;
        }
    }

    public final long a() {
        return this.c;
    }
}
