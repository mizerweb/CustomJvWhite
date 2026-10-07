package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class x9g implements h65 {
    public final w9g a;

    public x9g() {
        w9g w9gVar = new w9g(2);
        e(w9gVar);
        this.a = w9gVar;
    }

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (((LinkedHashSet) this.a.b).contains(m65Var)) {
            return new u65(str, m65Var, bundle, 0, c(), false, d(bundle), 40);
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return this.a;
    }

    public f2 c() {
        return r65.c;
    }

    public abstract t65 d(Bundle bundle);

    public abstract void e(w9g w9gVar);
}
