package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ua9 implements rrh {
    public final Executor a;
    public final qg7 b;
    public final ContentResolver c;

    public ua9(Executor executor, qg7 qg7Var, ContentResolver contentResolver) {
        this.a = executor;
        this.b = qg7Var;
        this.c = contentResolver;
    }

    @Override // defpackage.rrh
    public final boolean a(bne bneVar) {
        return oc9.Q(np0.o, np0.o, bneVar);
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        pjd pjdVar = es0Var.c;
        v78 v78Var = es0Var.a;
        es0Var.h("local", "exif");
        ta9 ta9Var = new ta9(this, lq0Var, pjdVar, es0Var, v78Var);
        es0Var.a(new o55(2, ta9Var));
        this.a.execute(ta9Var);
    }
}
