package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class lbj {
    public final gu4 a;
    public final wd4 b;
    public volatile boolean c;
    public volatile sgg d;

    public lbj(gu4 gu4Var, wd4 wd4Var) {
        this.a = gu4Var;
        this.b = wd4Var;
    }

    public final void finalize() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.d;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.d = null;
    }
}
