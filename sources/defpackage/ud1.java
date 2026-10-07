package defpackage;

import android.content.Context;
import android.os.Trace;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ud1 extends FrameLayout {
    public final ghd a;
    public boolean b;
    public boolean c;
    public final ny8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(Context context) {
        super(context, null, 0);
        final int i = 0;
        ghd ghdVar = new ghd(context);
        this.a = ghdVar;
        this.d = rx8.P(3, new af7(this) { // from class: td1
            public final /* synthetic */ ud1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ud1 ud1Var = this.b;
                switch (i2) {
                    case 0:
                        return new sd1(v7j.a(ud1Var));
                    default:
                        ud1Var.a(ud1Var.b, ud1Var.c);
                        return sbi.a;
                }
            }
        });
        addView(ghdVar, -1, -1);
        sd1 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        iid iidVar = iid.b;
        bp2 bp2VarB = rkl.b(context);
        bp2VarB.b(new qe(cameraPreviewController, 21, bp2VarB), np4.o(context));
        final int i2 = 1;
        getCameraPreviewController().c = new af7(this) { // from class: td1
            public final /* synthetic */ ud1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ud1 ud1Var = this.b;
                switch (i3) {
                    case 0:
                        return new sd1(v7j.a(ud1Var));
                    default:
                        ud1Var.a(ud1Var.b, ud1Var.c);
                        return sbi.a;
                }
            }
        };
    }

    private final sd1 getCameraPreviewController() {
        return (sd1) this.d.getValue();
    }

    public final void a(boolean z, boolean z2) {
        if (!z) {
            iid iidVar = getCameraPreviewController().b;
            if (iidVar != null) {
                iidVar.a.y();
                return;
            }
            return;
        }
        sd1 cameraPreviewController = getCameraPreviewController();
        iid iidVar2 = cameraPreviewController.b;
        if (iidVar2 == null) {
            return;
        }
        if (iidVar2 != null) {
            iidVar2.a.y();
        }
        int i = !z2 ? 1 : 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        qyj.l("The specified lens facing is invalid.", i != -1);
        linkedHashSet.add(new b09(i));
        fh2 fh2Var = new fh2(linkedHashSet);
        igd igdVarB = new r48(2).b();
        igdVarB.K(this.a.getSurfaceProvider());
        g19 g19Var = cameraPreviewController.a;
        tw5 tw5Var = iidVar2.a;
        cli[] cliVarArr = (cli[]) Arrays.copyOf(new cli[]{igdVarB}, 1);
        cqk.f("CX:bindToLifecycle");
        try {
            if (tw5.c(tw5Var) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            tw5.d(tw5Var, 1);
            tw5.f(tw5Var, g19Var, fh2Var, new ec1(a.Y0(cliVarArr)));
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
