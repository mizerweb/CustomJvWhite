package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class owl implements yrl {
    private static final iwk h = iwk.j(zgc.c, zgc.o);
    private boolean a;
    private boolean b;
    private boolean c;
    private final Context d;
    private final pp0 e;
    private final dbm f;
    private hdm g;

    public owl(Context context, pp0 pp0Var, dbm dbmVar) {
        this.d = context;
        this.e = pp0Var;
        this.f = dbmVar;
    }

    public static boolean c(Context context) {
        return rx5.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // defpackage.yrl
    public final List a(vg8 vg8Var) throws MlKitException {
        if (this.g == null) {
            b();
        }
        hdm hdmVar = this.g;
        yab.s(hdmVar);
        if (!this.a) {
            try {
                hdmVar.m0();
                this.a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int iO = vg8Var.o();
        if (vg8Var.j() == 35) {
            Image.Plane[] planeArrM = vg8Var.m();
            yab.s(planeArrM);
            iO = planeArrM[0].getRowStride();
        }
        try {
            List listL0 = hdmVar.l0(z78.b().a(vg8Var), new qdm(vg8Var.j(), iO, vg8Var.k(), h44.c(vg8Var.n()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                arrayList.add(new np0(new lul((xcm) it.next()), vg8Var.i()));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    @Override // defpackage.yrl
    public final boolean b() throws MlKitException {
        if (this.g != null) {
            return this.b;
        }
        if (c(this.d)) {
            this.b = true;
            try {
                this.g = d(rx5.c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule$LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.b = false;
            if (!zgc.a(this.d, h)) {
                if (!this.c) {
                    zgc.d(this.d, iwk.j(zgc.z, zgc.G));
                    this.c = true;
                }
                jqk.e(this.f, n3m.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = d(rx5.b, zgc.c, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule$LoadingException e3) {
                jqk.e(this.f, n3m.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        jqk.e(this.f, n3m.NO_ERROR);
        return this.b;
    }

    public final hdm d(qx5 qx5Var, String str, String str2) throws RemoteException, DynamiteModule$LoadingException {
        kdm kdmVarG = jdm.G(rx5.c(this.d, qx5Var, str).b(str2));
        pp0 pp0Var = this.e;
        dqb dqbVar = new dqb(this.d);
        int iA = pp0Var.a();
        boolean z = true;
        if (!pp0Var.d() && this.e.b() == null) {
            z = false;
        }
        return kdmVarG.U(dqbVar, new zcm(iA, z));
    }

    @Override // defpackage.yrl
    public final void zzb() {
        hdm hdmVar = this.g;
        if (hdmVar != null) {
            try {
                hdmVar.n0();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.g = null;
            this.a = false;
        }
    }
}
