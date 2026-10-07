package defpackage;

import android.opengl.Matrix;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class jj0 {
    public Object j;
    public Object b = tab.j();
    public Object a = tab.j();
    public Object e = tab.j();
    public Object f = tab.j();
    public Object c = tab.j();
    public Object d = tab.j();
    public Object g = tab.j();
    public Object h = tab.j();
    public Object i = tab.j();

    public kj0 a() {
        String strConcat = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (((msh) this.h) == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (((Size) this.i) == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" colorFormat");
        }
        if (((lj0) this.j) == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" captureFrameRate");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (((Integer) this.f) == null) {
            strConcat = strConcat.concat(" IFrameInterval");
        }
        if (((Integer) this.g) == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new kj0((String) this.a, ((Integer) this.b).intValue(), (msh) this.h, (Size) this.i, ((Integer) this.c).intValue(), (lj0) this.j, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue(), ((Integer) this.g).intValue());
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0230 A[EDGE_INSN: B:135:0x0230->B:134:0x022b BREAK  A[LOOP:0: B:129:0x0215->B:142:?]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (defpackage.cqk.d(r5, r3) == false) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ao1 b(defpackage.ao1 r32) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj0.b(ao1):ao1");
    }

    public LinkedHashSet c(List list) throws InitializationException {
        String strA;
        ifh ifhVar = (ifh) this.g;
        r05 r05Var = (r05) ifhVar.getValue();
        fh2 fh2Var = (fh2) this.b;
        List<String> listT1 = ww3.T1(list);
        h6f h6fVar = (h6f) this.c;
        try {
            ArrayList arrayList = new ArrayList();
            me2 me2VarA = r05Var.a();
            if (fh2Var != null) {
                try {
                    strA = qjl.a(me2VarA, fh2Var.b());
                } catch (IllegalStateException e) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listT1) {
                    if (!cqk.d(str, strA)) {
                        r05 r05Var2 = r05Var.b;
                        ef2.a(str);
                        arrayList2.add(((pf2) new t05(r05Var2, new qd2(str, false), h6fVar).y.get()).j());
                    }
                }
                Iterator it = fh2Var.a(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((nf2) it.next()).g());
                }
                listT1 = arrayList;
            }
            me2 me2VarA2 = ((r05) ifhVar.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listT1) {
                if (cqk.d(str2, "0") || cqk.d(str2, "1")) {
                    arrayList3.add(str2);
                } else if (iil.b(str2, me2VarA2)) {
                    arrayList3.add(str2);
                } else if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new InitializationException(e2);
        }
    }

    public Set d() {
        synchronized (this.i) {
            if (((AtomicBoolean) this.j).get()) {
                return c76.a;
            }
            return new LinkedHashSet((Set) this.h);
        }
    }

    public pf2 e(String str) throws CameraUpdateException {
        if (((AtomicBoolean) this.j).get()) {
            throw new CameraUpdateException("CameraFactory has been shut down.");
        }
        r05 r05Var = ((r05) ((ifh) this.g).getValue()).b;
        ef2.a(str);
        return (pf2) new t05(r05Var, new qd2(str, false), (h6f) this.c).y.get();
    }

    public float[] f(lag lagVar, ikc ikcVar) {
        float[] fArr = (float[]) this.b;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = (float[]) this.a;
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = (float[]) this.e;
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = (float[]) this.c;
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = (float[]) this.d;
        Matrix.setIdentityM(fArr5, 0);
        Matrix.setIdentityM((float[]) this.f, 0);
        float[] fArr6 = (float[]) this.g;
        Matrix.setIdentityM(fArr6, 0);
        float[] fArr7 = (float[]) this.h;
        Matrix.setIdentityM(fArr7, 0);
        float[] fArr8 = (float[]) this.i;
        Matrix.setIdentityM(fArr8, 0);
        Pair pairC = ikcVar.c();
        Matrix.translateM(fArr2, 0, ((Float) pairC.first).floatValue(), ((Float) pairC.second).floatValue(), 0.0f);
        ((lag) this.j).getClass();
        int i = lagVar.a;
        lag lagVar2 = (lag) this.j;
        float f = i / lagVar2.a;
        float f2 = lagVar.b;
        Matrix.scaleM(fArr, 0, f, f2 / lagVar2.b, 1.0f);
        Pair pairA = ikcVar.a();
        Matrix.scaleM(fArr4, 0, ((Float) pairA.first).floatValue(), ((Float) pairA.second).floatValue(), 1.0f);
        Matrix.invertM(fArr5, 0, fArr4, 0);
        Pair pairD = ikcVar.d();
        Matrix.translateM(fArr3, 0, ((Float) pairD.first).floatValue() * (-1.0f), ((Float) pairD.second).floatValue() * (-1.0f), 0.0f);
        Matrix.rotateM((float[]) this.f, 0, ikcVar.b(), 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr6, 0, f2 / i, 1.0f, 1.0f);
        Matrix.invertM(fArr7, 0, fArr6, 0);
        float[] fArr9 = (float[]) this.i;
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) this.a, 0);
        float[] fArr10 = (float[]) this.i;
        Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) this.b, 0);
        float[] fArr11 = (float[]) this.i;
        Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) this.c, 0);
        float[] fArr12 = (float[]) this.i;
        Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) this.e, 0);
        float[] fArr13 = (float[]) this.i;
        Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) this.d, 0);
        float[] fArr14 = (float[]) this.i;
        Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) this.g, 0);
        float[] fArr15 = (float[]) this.i;
        Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) this.f, 0);
        float[] fArr16 = (float[]) this.i;
        Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) this.h, 0);
        float[] fArr17 = (float[]) this.i;
        Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) this.c, 0);
        return fArr8;
    }

    public void g(List list) throws InitializationException {
        if (((AtomicBoolean) this.j).get()) {
            return;
        }
        LinkedHashSet linkedHashSetC = c(list);
        synchronized (this.i) {
            try {
                if (((AtomicBoolean) this.j).get()) {
                    return;
                }
                if (cqk.d((Set) this.h, linkedHashSetC)) {
                    return;
                }
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + ((Set) this.h) + " -> " + linkedHashSetC);
                }
                this.h = linkedHashSetC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        ((fi9) this.b).a = null;
        ((fi9) this.c).a = null;
        ((fi9) this.d).a = null;
        ((fi9) this.e).a = null;
        ((uw) this.g).c();
        ((uw) this.h).c();
        ((uw) this.i).c();
    }
}
