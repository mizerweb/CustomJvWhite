package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class fge extends mdh implements qf7 {
    public final /* synthetic */ AtomicBoolean A;
    public usb e;
    public gge f;
    public q78 g;
    public qg7 h;
    public mkc i;
    public wfe j;
    public AtomicBoolean k;
    public gge l;
    public qg7 m;
    public q78 n;
    public AtomicBoolean o;
    public wfe p;
    public qg7 q;
    public Uri r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ usb u;
    public final /* synthetic */ gge v;
    public final /* synthetic */ q78 w;
    public final /* synthetic */ qg7 x;
    public final /* synthetic */ mkc y;
    public final /* synthetic */ wfe z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fge(usb usbVar, gge ggeVar, q78 q78Var, qg7 qg7Var, mkc mkcVar, wfe wfeVar, AtomicBoolean atomicBoolean, lq4 lq4Var) {
        super(2, lq4Var);
        this.u = usbVar;
        this.v = ggeVar;
        this.w = q78Var;
        this.x = qg7Var;
        this.y = mkcVar;
        this.z = wfeVar;
        this.A = atomicBoolean;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        fge fgeVar = new fge(this.u, this.v, this.w, this.x, this.y, this.z, this.A, lq4Var);
        fgeVar.t = obj;
        return fgeVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((fge) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0117 A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x011d A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0129 A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0149 A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0165 A[Catch: all -> 0x0109, CancellationException -> 0x010e, TryCatch #5 {CancellationException -> 0x010e, blocks: (B:28:0x00e6, B:30:0x00ee, B:36:0x0117, B:38:0x011d, B:39:0x0129, B:41:0x0149, B:47:0x015d, B:44:0x0150, B:46:0x0156, B:48:0x0165, B:51:0x0174, B:53:0x017a), top: B:88:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ee, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01cd, please report this as an issue */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        qg7 qg7Var;
        wfe wfeVar;
        AtomicBoolean atomicBoolean;
        gge ggeVar;
        q78 q78Var;
        q78 q78Var2;
        qg7 qg7Var2;
        gge ggeVar2;
        qg7 qg7Var3;
        wfe wfeVar2;
        AtomicBoolean atomicBoolean2;
        Uri uri;
        Object objB;
        usb usbVar;
        q78 q78Var3;
        qg7 qg7Var4;
        mkc mkcVar;
        wfe wfeVar3;
        AtomicBoolean atomicBoolean3;
        gge ggeVar3;
        String str;
        a4c a4cVar;
        je9 je9Var;
        oof oofVar;
        Uri uri2;
        oof oofVar2;
        usb usbVar2;
        String str2;
        a4c a4cVar2;
        String str3;
        a4c a4cVar3;
        je9 je9Var2 = je9.d;
        gu4 gu4Var = (gu4) this.t;
        hu4 hu4Var = hu4.a;
        int i = this.s;
        if (i == 0) {
            th = null;
            ch3.d0(obj);
            usb usbVar3 = this.u;
            gge ggeVar4 = this.v;
            q78 q78Var4 = this.w;
            qg7 qg7Var5 = this.x;
            mkc mkcVar2 = this.y;
            wfe wfeVar4 = this.z;
            AtomicBoolean atomicBoolean4 = this.A;
            try {
                try {
                    Uri uri3 = usbVar3.b.a.b;
                    try {
                        dge dgeVar = (dge) ggeVar4.n.getValue();
                        long j = q78Var4.a;
                        long j2 = q78Var4.b;
                        long j3 = q78Var4.c;
                        this.t = gu4Var;
                        this.e = usbVar3;
                        this.f = ggeVar4;
                        this.g = q78Var4;
                        this.h = qg7Var5;
                        this.i = mkcVar2;
                        this.j = wfeVar4;
                        this.k = atomicBoolean4;
                        this.l = ggeVar4;
                        this.m = qg7Var5;
                        this.n = q78Var4;
                        this.o = atomicBoolean4;
                        this.p = wfeVar4;
                        this.q = qg7Var5;
                        this.r = uri3;
                        ggeVar = ggeVar4;
                        try {
                            this.s = 1;
                            uri = uri3;
                            qg7Var = qg7Var5;
                            q78Var = q78Var4;
                            wfeVar = wfeVar4;
                            atomicBoolean = atomicBoolean4;
                            try {
                                objB = dgeVar.b(j, j2, uri, j3, false, this);
                                if (objB == hu4Var) {
                                    return hu4Var;
                                }
                                usbVar = usbVar3;
                                q78Var3 = q78Var;
                                qg7Var4 = qg7Var;
                                qg7Var2 = qg7Var4;
                                mkcVar = mkcVar2;
                                wfeVar3 = wfeVar;
                                atomicBoolean2 = atomicBoolean;
                                atomicBoolean3 = atomicBoolean2;
                                ggeVar3 = ggeVar;
                                ggeVar2 = ggeVar3;
                                uri2 = (Uri) objB;
                                if (cqk.d(uri2, Uri.EMPTY)) {
                                    cqk.m(gu4Var);
                                    qg7Var4.onFailure(new IllegalStateException("Fail to refresh url photoId=" + q78Var3.c));
                                } else if (cqk.d(uri2, uri)) {
                                    cqk.m(gu4Var);
                                    ggeVar3.x0().v(usbVar, mkcVar);
                                } else {
                                    cqk.m(gu4Var);
                                    ylc ylcVarW0 = gge.w0(ggeVar3, usbVar, uri2);
                                    oofVar2 = (oof) ylcVarW0.a;
                                    usbVar2 = (usb) ylcVarW0.b;
                                    oofVar2.a(new m28(atomicBoolean3, 1, gu4Var));
                                    wfeVar3.a = oofVar2;
                                    if (atomicBoolean3.get()) {
                                        str3 = ggeVar3.p;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 != null) {
                                            a4cVar3.c(je9Var2, str3, "Canceled after refresh.", th);
                                        }
                                        oofVar2.e();
                                        qg7Var4.a();
                                    } else {
                                        ggeVar3.x0().v(usbVar2, mkcVar);
                                        str2 = ggeVar3.p;
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            a4cVar2.c(je9Var2, str2, "Fetch refreshed url photoId=" + q78Var3.c + ".", null);
                                        }
                                    }
                                }
                            } catch (CancellationException e) {
                                e = e;
                                qg7Var3 = qg7Var;
                                wfeVar2 = wfeVar;
                                atomicBoolean2 = atomicBoolean;
                                atomicBoolean2.set(true);
                                oofVar = (oof) wfeVar2.a;
                                if (oofVar != null) {
                                    oofVar.e();
                                }
                                qg7Var3.a();
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                q78Var2 = q78Var;
                                qg7Var2 = qg7Var;
                                ggeVar2 = ggeVar;
                                str = ggeVar2.p;
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9Var = je9.f;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, str, "Fail to refresh url, because " + th + " for photoId=" + q78Var2.c, null);
                                    }
                                }
                                qg7Var2.onFailure(th);
                                return sbi.a;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            q78Var = q78Var4;
                            qg7Var = qg7Var5;
                            q78Var2 = q78Var;
                            qg7Var2 = qg7Var;
                            ggeVar2 = ggeVar;
                            str = ggeVar2.p;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "Fail to refresh url, because " + th + " for photoId=" + q78Var2.c, null);
                                }
                            }
                            qg7Var2.onFailure(th);
                            return sbi.a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ggeVar = ggeVar4;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    qg7Var = qg7Var5;
                    wfeVar = wfeVar4;
                    atomicBoolean = atomicBoolean4;
                }
            } catch (Throwable th5) {
                th = th5;
                ggeVar = ggeVar4;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Uri uri4 = this.r;
            qg7Var3 = this.q;
            wfeVar2 = this.p;
            atomicBoolean2 = this.o;
            q78Var2 = this.n;
            qg7Var2 = this.m;
            ggeVar2 = this.l;
            atomicBoolean3 = this.k;
            wfeVar3 = this.j;
            th = null;
            mkcVar = this.i;
            qg7 qg7Var6 = this.h;
            q78 q78Var5 = this.g;
            gge ggeVar5 = this.f;
            usbVar = this.e;
            try {
                ch3.d0(obj);
                wfeVar = wfeVar2;
                q78Var = q78Var2;
                uri = uri4;
                qg7Var4 = qg7Var6;
                qg7Var = qg7Var3;
                q78Var3 = q78Var5;
                ggeVar3 = ggeVar5;
                objB = obj;
                try {
                    try {
                        uri2 = (Uri) objB;
                        try {
                            if (cqk.d(uri2, Uri.EMPTY)) {
                                cqk.m(gu4Var);
                                qg7Var4.onFailure(new IllegalStateException("Fail to refresh url photoId=" + q78Var3.c));
                            } else if (cqk.d(uri2, uri)) {
                                cqk.m(gu4Var);
                                ggeVar3.x0().v(usbVar, mkcVar);
                            } else {
                                cqk.m(gu4Var);
                                ylc ylcVarW1 = gge.w0(ggeVar3, usbVar, uri2);
                                oofVar2 = (oof) ylcVarW1.a;
                                usbVar2 = (usb) ylcVarW1.b;
                                oofVar2.a(new m28(atomicBoolean3, 1, gu4Var));
                                wfeVar3.a = oofVar2;
                                if (atomicBoolean3.get()) {
                                    str3 = ggeVar3.p;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                        a4cVar3.c(je9Var2, str3, "Canceled after refresh.", th);
                                    }
                                    oofVar2.e();
                                    qg7Var4.a();
                                } else {
                                    ggeVar3.x0().v(usbVar2, mkcVar);
                                    str2 = ggeVar3.p;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, str2, "Fetch refreshed url photoId=" + q78Var3.c + ".", null);
                                    }
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            atomicBoolean2 = atomicBoolean2;
                            qg7Var3 = qg7Var;
                            wfeVar2 = wfeVar;
                            atomicBoolean2.set(true);
                            oofVar = (oof) wfeVar2.a;
                            if (oofVar != null) {
                                oofVar.e();
                            }
                            qg7Var3.a();
                            throw e;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        q78Var2 = q78Var;
                        str = ggeVar2.p;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Fail to refresh url, because " + th + " for photoId=" + q78Var2.c, null);
                            }
                        }
                        qg7Var2.onFailure(th);
                    }
                } catch (CancellationException e4) {
                    e = e4;
                }
            } catch (CancellationException e5) {
                e = e5;
                atomicBoolean2.set(true);
                oofVar = (oof) wfeVar2.a;
                if (oofVar != null) {
                    oofVar.e();
                }
                qg7Var3.a();
                throw e;
            } catch (Throwable th7) {
                th = th7;
                str = ggeVar2.p;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Fail to refresh url, because " + th + " for photoId=" + q78Var2.c, null);
                    }
                }
                qg7Var2.onFailure(th);
                return sbi.a;
            }
        }
        return sbi.a;
    }
}
