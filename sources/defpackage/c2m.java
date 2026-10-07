package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c2m {
    public static ed7 a() {
        return new ed7(9);
    }

    public static final int b(ArrayList arrayList, cf7 cf7Var) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iU = ((cmi) cf7Var.invoke((cli) it.next())).u();
            if (iU != 0) {
                if (i2 != iU && i2 != 0) {
                    tvj.g("UseCaseUtil", nbh.u("Unexpected configurations: Overwriting current previewStabilizationMode(", i2, ") with useCasePreviewStabilization(", iU, ")!"));
                }
                i2 = iU;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iR = ((cmi) cf7Var.invoke((cli) it2.next())).r();
            if (iR != 0) {
                if (i != iR && i != 0) {
                    tvj.g("UseCaseUtil", nbh.u("Unexpected configurations: Overwriting current videoStabilizationMode(", i, ") with useCaseVideoStabilization(", iR, ")!"));
                }
                i = iR;
            }
        }
        if (i2 == 1 || i == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        return i == 2 ? 3 : 1;
    }

    public static final boolean c(cli cliVar) {
        if (cliVar.i.f(cmi.g1)) {
            return cliVar.i.L() == emi.d;
        }
        tvj.c("UseCaseUtil", cliVar + " UseCase does not have capture type.");
        return false;
    }
}
