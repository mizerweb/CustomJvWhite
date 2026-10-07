package one.me.stories.core.workers;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.ch3;
import defpackage.d25;
import defpackage.g5d;
import defpackage.gjf;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.ize;
import defpackage.je9;
import defpackage.jjf;
import defpackage.lq4;
import defpackage.ls5;
import defpackage.mze;
import defpackage.n0c;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.nze;
import defpackage.or6;
import defpackage.ore;
import defpackage.os5;
import defpackage.oyj;
import defpackage.oze;
import defpackage.poe;
import defpackage.pze;
import defpackage.q18;
import defpackage.q77;
import defpackage.qrc;
import defpackage.qv1;
import defpackage.qze;
import defpackage.r77;
import defpackage.roe;
import defpackage.sbi;
import defpackage.ubb;
import defpackage.vze;
import defpackage.w4;
import defpackage.xhh;
import defpackage.xt4;
import defpackage.yab;
import defpackage.ylc;
import defpackage.zo5;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.ok.tamtam.upload.workers.ForegroundWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/stories/core/workers/SaveStoryToGalleryWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lxhh;", "dispatchers", "Lrs6;", "fileSystem", "Lq18;", "downloader", "Lor6;", "fileLoadingNotifications", "Lvze;", "saveToGalleryFromUrlUseCase", "Lk0f;", "saveToGalleryVideoUseCase", "Los5;", "downloadPerfRegistrar", "Lgjf;", "serverPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lgjf;)V", "stories-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SaveStoryToGalleryWorker extends ForegroundWorker {
    public final gjf m;
    public final String n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public volatile File v;
    public volatile String w;
    public volatile String x;
    public final AtomicBoolean y;
    public final ifh z;

    public SaveStoryToGalleryWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, gjf gjfVar) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = gjfVar;
        this.n = SaveStoryToGalleryWorker.class.getName();
        this.o = ny8Var;
        this.p = ny8Var2;
        this.q = ny8Var3;
        this.r = ny8Var4;
        this.s = ny8Var5;
        this.t = ny8Var6;
        this.u = ny8Var7;
        this.x = "";
        this.y = new AtomicBoolean(false);
        this.z = new ifh(new ize(0, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object o(SaveStoryToGalleryWorker saveStoryToGalleryWorker, long j, nq4 nq4Var) {
        pze pzeVar;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof pze) {
            pzeVar = (pze) nq4Var;
            int i = pzeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzeVar.f = i - Integer.MIN_VALUE;
            } else {
                pzeVar = new pze(saveStoryToGalleryWorker, nq4Var);
            }
        } else {
            pzeVar = new pze(saveStoryToGalleryWorker, nq4Var);
        }
        Object obj = pzeVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = pzeVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (j > 0 && saveStoryToGalleryWorker.y.compareAndSet(false, true)) {
                    boolean z = j > ((long) ((g5d) saveStoryToGalleryWorker.m).g()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    int iB = saveStoryToGalleryWorker.b.b.b("local_account_id", -1);
                    ylc[] ylcVarArr = {new ylc("showSaving", Boolean.valueOf(z))};
                    w4 w4Var = new w4(6, false);
                    ((LinkedHashMap) w4Var.a).put("local_account_id", Integer.valueOf(iB));
                    ylc ylcVar = ylcVarArr[0];
                    w4Var.n(ylcVar.b, (String) ylcVar.a);
                    d25 d25VarE = w4Var.e();
                    pzeVar.f = 1;
                    if (saveStoryToGalleryWorker.h(d25VarE, pzeVar) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = saveStoryToGalleryWorker.n;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("reportShowSavingIfNeed failed: ", thA.getLocalizedMessage()), thA);
                }
            }
        }
        return sbiVar;
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* JADX INFO: renamed from: e */
    public final xt4 getI() {
        return ((n0c) p()).d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        mze mzeVar;
        File file;
        int i2 = i;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (lq4Var instanceof mze) {
            mzeVar = (mze) lq4Var;
            int i3 = mzeVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mzeVar.h = i3 - Integer.MIN_VALUE;
            } else {
                mzeVar = new mze(this, (nq4) lq4Var);
            }
        } else {
            mzeVar = new mze(this, (nq4) lq4Var);
        }
        Object obj = mzeVar.f;
        hu4 hu4Var = hu4.a;
        int i4 = mzeVar.h;
        lq4 lq4Var2 = null;
        if (i4 == 0) {
            ch3.d0(obj);
            String str = this.n;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i2, "onStopWork: reason="), null);
            }
            File file2 = this.v;
            String str2 = this.w;
            if (file2 != null && str2 != null) {
                q18 q18Var = (q18) this.q.getValue();
                mzeVar.e = file2;
                mzeVar.d = i2;
                mzeVar.h = 1;
                if (q18Var.c(file2, str2, mzeVar) != hu4Var) {
                    file = file2;
                }
            }
            String str3 = this.n;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "onStopWork: no download in flight, nothing to cancel", null);
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = mzeVar.d;
        file = mzeVar.e;
        ch3.d0(obj);
        qrc.o(q(), ls5.USER_CANCELLED, this.x, null, null, 28);
        xt4 xt4VarB = ((n0c) p()).b();
        nze nzeVar = new nze(file, lq4Var2, 0);
        mzeVar.e = null;
        mzeVar.d = i2;
        mzeVar.h = 2;
        return yab.K0(xt4VarB, nzeVar, mzeVar) == hu4Var ? hu4Var : sbiVar;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        Context context = this.a;
        PendingIntent pendingIntentA = oyj.d(context).a(this.b.a);
        ny8 ny8Var = this.r;
        or6 or6Var = (or6) ny8Var.getValue();
        ((or6) ny8Var.getValue()).getClass();
        return new q77(((Number) this.z.getValue()).intValue(), or6Var.c(context.getString(R.string.tt_notification_file_downloading_title), 0L, null, -1, pendingIntentA), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r11 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r11 == r2) goto L34;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.SaveStoryToGalleryWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String l() {
        return zo5.j(this.b.b.c("storyId", 0L), "worker:save-story-to-gallery:s=");
    }

    public final xhh p() {
        return (xhh) this.o.getValue();
    }

    public final os5 q() {
        return (os5) this.u.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(nq4 nq4Var) {
        oze ozeVar;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof oze) {
            ozeVar = (oze) nq4Var;
            int i = ozeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozeVar.f = i - Integer.MIN_VALUE;
            } else {
                ozeVar = new oze(this, nq4Var);
            }
        } else {
            ozeVar = new oze(this, nq4Var);
        }
        Object obj = ozeVar.d;
        Object obj2 = hu4.a;
        int i2 = ozeVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (m(-1)) {
                    ozeVar.f = 1;
                    if (n(ozeVar) == obj2) {
                        return obj2;
                    }
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            poeVar = sbiVar;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.n;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("prepareNotificationIfNeed failed: ", thA.getLocalizedMessage()), thA);
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, nq4 nq4Var) {
        qze qzeVar;
        if (nq4Var instanceof qze) {
            qzeVar = (qze) nq4Var;
            int i = qzeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzeVar.f = i - Integer.MIN_VALUE;
            } else {
                qzeVar = new qze(this, nq4Var);
            }
        } else {
            qzeVar = new qze(this, nq4Var);
        }
        Object poeVar = qzeVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = qzeVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                vze vzeVar = (vze) this.s.getValue();
                qzeVar.f = 1;
                poeVar = vzeVar.b(str, false, qzeVar);
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str2 = this.n;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("savePhoto: save to gallery failed: ", thA.getMessage()), null);
                }
            }
        }
        return poeVar instanceof poe ? Boolean.FALSE : poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f A[Catch: all -> 0x0173, PHI: r0 r1 r2 r5 r15
  0x016f: PHI (r0v43 java.lang.Object) = (r0v28 java.lang.Object), (r0v1 java.lang.Object) binds: [B:58:0x016c, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r1v13 one.me.stories.core.workers.SaveStoryToGalleryWorker) = 
  (r1v3 one.me.stories.core.workers.SaveStoryToGalleryWorker)
  (r1v0 one.me.stories.core.workers.SaveStoryToGalleryWorker)
 binds: [B:58:0x016c, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r2v17 long) = (r2v11 long), (r2v20 long) binds: [B:58:0x016c, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r5v7 java.io.File) = (r5v3 java.io.File), (r5v12 java.io.File) binds: [B:58:0x016c, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r15v6 ??) = (r15v11 ??), (r15v10 ??) binds: [B:58:0x016c, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:60:0x016f, B:57:0x0155), top: B:84:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if (defpackage.yab.K0(r0, r1, r8) == r9) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r10v6, types: [a4c] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.net.Uri, java.io.File, java.lang.String, java.lang.Throwable, lq4] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.io.File, java.lang.String, java.lang.Throwable, lq4] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [a4c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(long r26, defpackage.nq4 r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.SaveStoryToGalleryWorker.t(long, nq4, java.lang.String):java.lang.Object");
    }
}
