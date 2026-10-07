package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.concurrent.CountDownLatch;
import one.me.sdk.media.transformer.MediaTransformException;

/* JADX INFO: loaded from: classes3.dex */
public final class q6a implements e2i {
    public final n6a a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ r6a d;
    public final /* synthetic */ Object e;

    public q6a(n6a n6aVar, r6a r6aVar, Object obj, int i) {
        this.c = i;
        this.d = r6aVar;
        this.e = obj;
        this.a = n6aVar;
    }

    @Override // defpackage.e2i
    public final void a(nh6 nh6Var) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onCompleted", null);
            }
        }
        n6a n6aVar = this.a;
        n6aVar.f.set(nh6Var);
        n6aVar.g.set(null);
        c();
    }

    @Override // defpackage.e2i
    public final void b(k84 k84Var, nh6 nh6Var, ExportException exportException) {
        boolean zK;
        lh6 lh6Var;
        Throwable cause;
        String message;
        String strConcat = "error=".concat(exportException.e());
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onError, ".concat(strConcat), exportException);
            }
        }
        n6a n6aVar = this.a;
        MediaTransformException mediaTransformException = new MediaTransformException("Media transform failed, ".concat(strConcat), exportException);
        prk prkVar = this.a.a.d;
        je9 je9Var2 = je9.d;
        int i = exportException.a;
        int i2 = 0;
        if (i == 4001 || i == 4003) {
            lh6 lh6Var2 = exportException.b;
            if (lh6Var2 == null || !lh6Var2.b || ((String) lh6Var2.e) == null) {
                String str2 = this.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "applyCbrToVbrFallback, skip: codecInfo=" + lh6Var2 + " is not a named video codec", null);
                }
            } else {
                if (prkVar instanceof qx9) {
                    zK = false;
                } else {
                    if (!(prkVar instanceof tx9)) {
                        ore.o();
                        return;
                    }
                    zK = ((tx9) prkVar).k();
                }
                if (zK) {
                    i2 = 1;
                } else {
                    String str3 = this.b;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str3, "applyCbrToVbrFallback, skip: CBR was not requested by config", null);
                    }
                }
            }
        } else {
            String str4 = this.b;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str4, c0a.k(i, "applyCbrToVbrFallback, skip: errorCode=", " is not encoder init/format unsupported"), null);
            }
        }
        if (k84Var.g != 1) {
            String str5 = this.b;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, str5, c0a.k(k84Var.g, "applyHdrCodecToGlFallback, skip: composition hdrMode=", " was not MediaCodec tone-mapping"), null);
            }
        } else if (exportException.a == 3003 && (lh6Var = exportException.b) != null && lh6Var.c && lh6Var.b && (cause = exportException.getCause()) != null && (message = cause.getMessage()) != null && r5h.L0(message, "tone-map", true)) {
            if (prkVar instanceof tx9) {
                tx9 tx9Var = (tx9) prkVar;
                if (tx9Var.o() && !tx9Var.n()) {
                    i2 |= 2;
                }
            } else if (!(prkVar instanceof qx9)) {
                ore.o();
                return;
            }
            String str6 = this.b;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                a4cVar6.c(je9Var2, str6, "applyHdrCodecToGlFallback, skip: codec tone-mapping was not requested by config", null);
            }
        } else {
            String str7 = this.b;
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null && a4cVar7.b(je9Var2)) {
                a4cVar7.c(je9Var2, str7, c0a.o("applyHdrCodecToGlFallback, skip: error=", exportException.e(), " is not an HDR tone-mapping failure"), null);
            }
        }
        y5a y5aVar = new y5a(i2);
        String str8 = this.b;
        a4c a4cVar8 = gm0.f;
        if (a4cVar8 != null && a4cVar8.b(je9Var2)) {
            a4cVar8.c(je9Var2, str8, "extractFallbackOptions, result=" + y5aVar, null);
        }
        n6aVar.f.set(nh6Var);
        n6aVar.g.set(mediaTransformException);
        n6aVar.h.set(y5aVar);
        c();
    }

    public final void c() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "executeWithDetachableLooper.done, quit loop ...", null);
                    }
                }
                ((ii5) this.e).b.quitSafely();
                break;
            default:
                String str2 = (String) this.d.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "executeWithMainLooper.done", null);
                    }
                }
                ((CountDownLatch) this.e).countDown();
                break;
        }
    }
}
