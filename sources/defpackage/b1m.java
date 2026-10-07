package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class b1m implements yrl {
    private boolean a;
    private final Context b;
    private final unk c;
    private final dbm d;
    private eok e;

    public b1m(Context context, pp0 pp0Var, dbm dbmVar) {
        unk unkVar = new unk();
        this.c = unkVar;
        this.b = context;
        unkVar.a = pp0Var.a();
        this.d = dbmVar;
    }

    @Override // defpackage.yrl
    public final List a(vg8 vg8Var) throws MlKitException {
        x7m[] x7mVarArrN0;
        if (this.e == null) {
            b();
        }
        eok eokVar = this.e;
        if (eokVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        ook ookVar = new ook(vg8Var.o(), vg8Var.k(), 0, 0L, h44.c(vg8Var.n()));
        try {
            int iJ = vg8Var.j();
            if (iJ == -1) {
                x7mVarArrN0 = eokVar.n0(new dqb(vg8Var.g()), ookVar);
            } else if (iJ == 17) {
                x7mVarArrN0 = eokVar.m0(new dqb(vg8Var.h()), ookVar);
            } else if (iJ == 35) {
                Image.Plane[] planeArrM = vg8Var.m();
                yab.s(planeArrM);
                ookVar.a = planeArrM[0].getRowStride();
                x7mVarArrN0 = eokVar.m0(new dqb(planeArrM[0].getBuffer()), ookVar);
            } else {
                if (iJ != 842094169) {
                    throw new MlKitException("Unsupported image format: " + vg8Var.j(), 3);
                }
                x7mVarArrN0 = eokVar.m0(new dqb(c68.g().e(vg8Var, false)), ookVar);
            }
            ArrayList arrayList = new ArrayList();
            for (x7m x7mVar : x7mVarArrN0) {
                arrayList.add(new np0(new tyl(x7mVar), vg8Var.i()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
        }
    }

    @Override // defpackage.yrl
    public final boolean b() throws MlKitException {
        if (this.e != null) {
            return false;
        }
        try {
            eok eokVarS = kok.G(rx5.c(this.b, rx5.b, zgc.b).b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).S(new dqb(this.b), this.c);
            this.e = eokVarS;
            if (eokVarS == null && !this.a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                zgc.c(this.b, zgc.z);
                this.a = true;
                jqk.e(this.d, n3m.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            jqk.e(this.d, n3m.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    @Override // defpackage.yrl
    public final void zzb() {
        eok eokVar = this.e;
        if (eokVar != null) {
            try {
                eokVar.l0();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.e = null;
        }
    }
}
