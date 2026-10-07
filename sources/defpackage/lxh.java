package defpackage;

import android.util.Log;
import ru.ok.tracer.lite.TracerLite;

/* JADX INFO: loaded from: classes3.dex */
public final class lxh extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TracerLite b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxh(TracerLite tracerLite, int i) {
        super(0);
        this.a = i;
        this.b = tracerLite;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        TracerLite tracerLite = this.b;
        switch (i) {
            case 0:
                String libraryPackageName = tracerLite.getLibraryPackageName();
                pxh manifest = tracerLite.getManifest();
                String strB = manifest != null ? manifest.b() : "NA";
                pxh manifest2 = tracerLite.getManifest();
                return new dxh(libraryPackageName, strB, manifest2 != null ? manifest2.a() : null, tracerLite.getManifest() != null ? "release" : null);
            default:
                try {
                    return p90.L(tracerLite.getLibraryPackageName());
                } catch (Exception unused) {
                    Log.e("Tracer", "Could not find manifest for library " + tracerLite.getLibraryPackageName());
                    return null;
                }
        }
    }
}
