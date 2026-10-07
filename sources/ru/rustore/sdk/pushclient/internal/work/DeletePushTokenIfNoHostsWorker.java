package ru.rustore.sdk.pushclient.internal.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ao5;
import defpackage.ch3;
import defpackage.gg5;
import defpackage.hd5;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.jh5;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.qy3;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rustore/sdk/pushclient/internal/work/DeletePushTokenIfNoHostsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client_release"}, k = 1, mv = {1, 7, 1})
public final class DeletePushTokenIfNoHostsWorker extends CoroutineWorker {
    public final ifh g;
    public final ifh h;

    public DeletePushTokenIfNoHostsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = new ifh(gg5.d);
        this.h = new ifh(gg5.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object d(lq4 lq4Var) {
        jh5 jh5Var;
        if (lq4Var instanceof jh5) {
            jh5Var = (jh5) lq4Var;
            int i = jh5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jh5Var.f = i - Integer.MIN_VALUE;
            } else {
                jh5Var = new jh5(this, (nq4) lq4Var);
            }
        } else {
            jh5Var = new jh5(this, (nq4) lq4Var);
        }
        Object objK0 = jh5Var.d;
        int i2 = jh5Var.f;
        lq4 lq4Var2 = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            hd5 hd5Var = ao5.b;
            qy3 qy3Var = new qy3(this, lq4Var2, 9);
            jh5Var.f = 1;
            objK0 = yab.K0(hd5Var, qy3Var, jh5Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return objK0;
    }
}
