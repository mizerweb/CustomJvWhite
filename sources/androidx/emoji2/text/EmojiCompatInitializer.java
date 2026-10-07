package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ax0;
import defpackage.e77;
import defpackage.g19;
import defpackage.gg8;
import defpackage.i19;
import defpackage.l46;
import defpackage.m46;
import defpackage.u50;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class EmojiCompatInitializer implements gg8 {
    @Override // defpackage.gg8
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.gg8
    public final Object b(Context context) {
        Object objC;
        e77 e77Var = new e77(new ax0(context, 2));
        e77Var.b = 1;
        if (l46.k == null) {
            synchronized (l46.j) {
                try {
                    if (l46.k == null) {
                        l46.k = new l46(e77Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        u50 u50VarG = u50.g(context);
        u50VarG.getClass();
        synchronized (u50.e) {
            try {
                objC = ((HashMap) u50VarG.a).get(ProcessLifecycleInitializer.class);
                if (objC == null) {
                    objC = u50VarG.c(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i19 i19VarF = ((g19) objC).f();
        i19VarF.a(new m46(this, i19VarF));
        return Boolean.TRUE;
    }
}
