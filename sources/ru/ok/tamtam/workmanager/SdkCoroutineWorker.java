package ru.ok.tamtam.workmanager;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import defpackage.cqk;
import defpackage.d25;
import defpackage.f55;
import defpackage.f89;
import defpackage.gzj;
import defpackage.hu4;
import defpackage.i8f;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.m89;
import defpackage.pze;
import defpackage.qyj;
import defpackage.sbi;
import defpackage.t7f;
import defpackage.u72;
import defpackage.ur8;
import defpackage.vd7;
import defpackage.w93;
import defpackage.wo8;
import defpackage.xt4;
import defpackage.yab;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Lm89;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lxt4;", "workCoroutineDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SdkCoroutineWorker extends m89 {
    public final wo8 e;
    public final xt4 f;

    public SdkCoroutineWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var) {
        super(context, workerParameters);
        this.e = vd7.a();
        this.f = xt4Var;
    }

    @Override // defpackage.m89
    public final u72 a() {
        xt4 f = getF();
        wo8 wo8VarA = vd7.a();
        f.getClass();
        return qyj.J(lvb.x0(f, wo8VarA), new ur8(this, null, 29));
    }

    @Override // defpackage.m89
    public final void b() {
        int i = i();
        xt4 f = getF();
        wo8 wo8VarA = vd7.a();
        f.getClass();
        yab.i0(cqk.a(lvb.x0(f, wo8VarA)), null, 0, new w93(this, i, (lq4) null, 10), 3);
    }

    @Override // defpackage.m89
    public final u72 c() {
        xt4 f = getF();
        f.getClass();
        return qyj.J(lvb.x0(f, this.e), new t7f(this, null, 0));
    }

    public abstract Object d(lq4 lq4Var);

    /* JADX INFO: renamed from: e, reason: from getter */
    public xt4 getF() {
        return this.f;
    }

    public Object f(lq4 lq4Var) {
        throw new IllegalStateException("Not implemented");
    }

    public Object g(int i, lq4 lq4Var) {
        return sbi.a;
    }

    public final Object h(d25 d25Var, pze pzeVar) throws Throwable {
        WorkerParameters workerParameters = this.b;
        gzj gzjVar = workerParameters.f;
        Object objE = cqk.e(f55.m(new f89(gzjVar.b.a, "updateProgress", new i8f(gzjVar, workerParameters.a, d25Var, 14))), pzeVar);
        return objE == hu4.a ? objE : sbi.a;
    }

    public final int i() {
        AtomicInteger atomicInteger = this.c;
        if (atomicInteger.get() == -256) {
            return -256;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return atomicInteger.get();
        }
        return -512;
    }
}
