package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class pfd {
    public final String a = pfd.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public pfd(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x017f A[Catch: all -> 0x01f7, TRY_ENTER, TryCatch #4 {all -> 0x01f7, blocks: (B:55:0x01e9, B:51:0x017f, B:58:0x01fc), top: B:108:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d9 -> B:108:0x01e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.wui r51, defpackage.kp4 r52, defpackage.nq4 r53) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfd.a(wui, kp4, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0270, code lost:
    
        if (c(r0, r8) == r9) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.gka r50, defpackage.xui r51, defpackage.nq4 r52) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfd.b(gka, xui, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, sbi] */
    public final Object c(wui wuiVar, nq4 nq4Var) {
        ofd ofdVar;
        if (nq4Var instanceof ofd) {
            ofdVar = (ofd) nq4Var;
            int i = ofdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofdVar.g = i - Integer.MIN_VALUE;
            } else {
                ofdVar = new ofd(this, nq4Var);
            }
        } else {
            ofdVar = new ofd(this, nq4Var);
        }
        Object obj = ofdVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ofdVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                ovi oviVar = (ovi) this.c.getValue();
                ofdVar.d = wuiVar;
                ofdVar.g = 1;
                if (oviVar.b(wuiVar, ofdVar) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wuiVar = ofdVar.d;
                ch3.d0(obj);
            }
            this = sbi.a;
            return this;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "putConversionInRepository: failed, videoConversion=" + wuiVar, th);
                }
            }
            throw th;
        }
    }
}
