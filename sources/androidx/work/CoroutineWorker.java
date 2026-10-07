package androidx.work;

import android.content.Context;
import defpackage.cqk;
import defpackage.ju4;
import defpackage.ku4;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.m89;
import defpackage.qyj;
import defpackage.u72;
import defpackage.vd7;
import defpackage.vt4;
import defpackage.wo8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lm89;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ju4", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends m89 {
    public final WorkerParameters e;
    public final ju4 f;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = ju4.c;
    }

    @Override // defpackage.m89
    public final u72 a() {
        wo8 wo8VarA = vd7.a();
        ju4 ju4Var = this.f;
        ju4Var.getClass();
        return qyj.J(lvb.x0(ju4Var, wo8VarA), new ku4(this, null, 0));
    }

    @Override // defpackage.m89
    public final void b() {
    }

    @Override // defpackage.m89
    public final u72 c() {
        ju4 ju4Var = ju4.c;
        vt4 vt4Var = this.f;
        if (cqk.d(vt4Var, ju4Var)) {
            vt4Var = this.e.e;
        }
        wo8 wo8VarA = vd7.a();
        vt4Var.getClass();
        return qyj.J(lvb.x0(vt4Var, wo8VarA), new ku4(this, null, 1));
    }

    public abstract Object d(lq4 lq4Var);
}
