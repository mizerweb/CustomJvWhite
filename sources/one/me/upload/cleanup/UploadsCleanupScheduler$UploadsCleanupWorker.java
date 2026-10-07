package one.me.upload.cleanup;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.gki;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.je9;
import defpackage.kki;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.rs6;
import defpackage.xfg;
import defpackage.xt4;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"one/me/upload/cleanup/UploadsCleanupScheduler$UploadsCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lkki;", "uploadsDao", "Lrs6;", "fileSystem", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lkki;Lrs6;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadsCleanupScheduler$UploadsCleanupWorker extends SdkCoroutineWorker {
    public final kki g;
    public final rs6 h;

    public UploadsCleanupScheduler$UploadsCleanupWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, kki kkiVar, rs6 rs6Var) {
        super(context, workerParameters, xt4Var);
        this.g = kkiVar;
        this.h = rs6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object d(lq4 lq4Var) {
        gki gkiVar;
        if (lq4Var instanceof gki) {
            gkiVar = (gki) lq4Var;
            int i = gkiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkiVar.f = i - Integer.MIN_VALUE;
            } else {
                gkiVar = new gki(this, (nq4) lq4Var);
            }
        } else {
            gkiVar = new gki(this, (nq4) lq4Var);
        }
        Object objK = gkiVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = gkiVar.f;
        if (i2 == 0) {
            ch3.d0(objK);
            a4c a4cVar = gm0.f;
            lq4 lq4Var2 = null;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "UploadsCleanupScheduler", "Work started", null);
                }
            }
            xfg xfgVar = new xfg(this, System.currentTimeMillis() - 604800000, lq4Var2, 5);
            gkiVar.f = 1;
            objK = cqk.k(xfgVar, gkiVar);
            if (objK == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK);
        }
        return objK;
    }
}
