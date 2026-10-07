package androidx.camera.core.internal.compat.quirk;

import defpackage.o2e;
import defpackage.s2e;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface SurfaceProcessingQuirk extends o2e {
    static boolean a(s2e s2eVar) {
        Iterator it = s2eVar.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    default boolean d() {
        return true;
    }
}
