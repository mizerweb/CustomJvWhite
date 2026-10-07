package ru.ok.tamtam.android.messages.comments;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ch3;
import defpackage.f5d;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.k89;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.ose;
import defpackage.s9a;
import defpackage.sbi;
import defpackage.uoa;
import defpackage.vea;
import defpackage.wo6;
import defpackage.xt4;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/ok/tamtam/android/messages/comments/MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Luoa;", "messagesDatabase", "Lwo6;", "featurePrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Luoa;Lwo6;)V", "a", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker extends SdkCoroutineWorker {
    public final uoa g;
    public final wo6 h;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/android/messages/comments/MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(String str, Throwable th) {
            super("41004", str, th);
        }
    }

    public MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, uoa uoaVar, wo6 wo6Var) {
        super(context, workerParameters, xt4Var);
        this.g = uoaVar;
        this.h = wo6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object d(lq4 lq4Var) {
        vea veaVar;
        if (lq4Var instanceof vea) {
            veaVar = (vea) lq4Var;
            int i = veaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                veaVar.f = i - Integer.MIN_VALUE;
            } else {
                veaVar = new vea(this, (nq4) lq4Var);
            }
        } else {
            veaVar = new vea(this, (nq4) lq4Var);
        }
        Object obj = veaVar.d;
        int i2 = veaVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (!((f5d) this.h).q()) {
                    return new k89();
                }
                uoa uoaVar = this.g;
                veaVar.f = 1;
                Object obj2 = sbi.a;
                Object objI = ch3.I(veaVar, ((ose) uoaVar).g().a, false, true, new s9a(5));
                hu4 hu4Var = hu4.a;
                if (objI != hu4Var) {
                    objI = obj2;
                }
                if (objI == hu4Var) {
                    obj2 = objI;
                }
                if (obj2 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a aVar = new a("message comments clean up failed", th);
            gm0.V("MessageCommentsCleanupScheduler", aVar.getMessage(), aVar);
        }
        return new k89();
    }
}
