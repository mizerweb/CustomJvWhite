package androidx.camera.core.internal.compat.quirk;

import defpackage.cli;
import defpackage.cmi;
import defpackage.emi;
import defpackage.igd;
import defpackage.o2e;
import defpackage.z58;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements o2e {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                cli cliVar = (cli) it.next();
                if (cliVar instanceof igd) {
                    z = true;
                } else if (cliVar instanceof z58) {
                    z3 = true;
                } else if (cliVar.i.f(cmi.g1)) {
                    z2 = cliVar.i.L() == emi.d;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
