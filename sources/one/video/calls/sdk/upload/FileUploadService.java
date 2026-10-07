package one.video.calls.sdk.upload;

import android.content.Intent;
import defpackage.au6;
import defpackage.c7k;
import defpackage.ewe;
import defpackage.i3f;
import defpackage.it6;
import defpackage.iwl;
import defpackage.jye;
import defpackage.ko5;
import defpackage.ls4;
import defpackage.lz0;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.ore;
import defpackage.p64;
import defpackage.q8g;
import defpackage.tre;
import defpackage.wze;
import defpackage.xva;
import java.io.File;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class FileUploadService extends jye {
    public static final au6 a = new au6();

    @Override // defpackage.fp8
    public final void onHandleWork(Intent intent) {
        intent.getClass();
        Object objD = n1g.D(intent, "eventKey", it6.class);
        if (objD == null) {
            ore.p("Required value was null.");
            return;
        }
        it6 it6Var = (it6) objD;
        File file = new File(it6Var.a);
        c7k c7kVar = nl9.c;
        int i = 14;
        q8g q8gVarJ = new p64(4, new ls4(it6Var.b, file, new xva(i, c7kVar != null ? (CidLogger) c7kVar.b : nl9.b))).j(i3f.b());
        wze wzeVar = new wze(file, 13, it6Var);
        ewe eweVar = new ewe(file, it6Var, false, i);
        lz0 lz0Var = new lz0(1);
        q8gVarJ.h(lz0Var);
        try {
            if (lz0Var.getCount() != 0) {
                try {
                    lz0Var.await();
                } catch (InterruptedException e) {
                    lz0Var.d = true;
                    ko5 ko5Var = lz0Var.c;
                    if (ko5Var != null) {
                        ko5Var.dispose();
                    }
                    eweVar.accept(e);
                    return;
                }
            }
            Throwable th = lz0Var.b;
            if (th != null) {
                eweVar.accept(th);
                return;
            }
            Object obj = lz0Var.a;
            if (obj != null) {
                wzeVar.accept(obj);
            }
        } catch (Throwable th2) {
            iwl.a(th2);
            tre.s0(th2);
        }
    }
}
