package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Range;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* JADX INFO: loaded from: classes2.dex */
public final class ec1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public ec1(List list, b9j b9jVar, List list2) {
        Object next;
        String strConcat;
        String str;
        String str2;
        boolean zF;
        this.a = 3;
        Range range = yi0.h;
        this.a = 3;
        this.c = b9jVar;
        this.d = list2;
        this.e = range;
        this.f = c76.a;
        this.g = r66.a;
        List listK1 = ww3.k1(list);
        this.h = listK1;
        this.i = new qk5(6);
        this.j = zjl.d();
        if (!range.equals(yi0.h)) {
            Iterator it = listK1.iterator();
            while (it.hasNext()) {
                if (((cli) it.next()).g.f(cmi.b1)) {
                    ore.p("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list3 = (List) this.g;
        Set set = (Set) this.f;
        if (!set.isEmpty() || !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(((kr7) it2.next()).a());
            }
            for (xo6 xo6Var : ww3.k1(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : set) {
                    if (((kr7) obj).a() == xo6Var) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() > 1) {
                    ore.e(arrayList2, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            if (ww3.k1(list3).size() != list3.size()) {
                qr7.f(41, list3, "Duplicate values in preferredFeatures(");
                throw null;
            }
            LinkedHashSet linkedHashSetW1 = ww3.w1(set, list3);
            if (!linkedHashSetW1.isEmpty()) {
                ore.e(linkedHashSetW1, "requiredFeatures and preferredFeatures have duplicate values: ");
                throw null;
            }
            for (cli cliVar : (List) this.h) {
                boolean z = cliVar instanceof igd;
                qmi qmiVar = qmi.g;
                if ((z ? qmi.b : cliVar instanceof z58 ? qmi.c : cliVar instanceof u48 ? qmi.d : c2m.c(cliVar) ? qmi.e : cliVar instanceof q4h ? qmi.f : qmiVar) == qmiVar) {
                    throw new IllegalArgumentException((cliVar + " is not supported with feature group").toString());
                }
                String str3 = cliVar instanceof igd ? "Preview" : cliVar instanceof z58 ? "ImageCapture" : cliVar instanceof u48 ? "ImageAnalysis" : c2m.c(cliVar) ? "VideoCapture" : "UseCase";
                Iterator it3 = xo6.c.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    int iOrdinal = ((xo6) next).ordinal();
                    if (iOrdinal == 0) {
                        zF = cliVar.g.f(n68.u0);
                    } else if (iOrdinal == 1) {
                        zF = cliVar.g.f(cmi.b1);
                    } else if (iOrdinal == 2) {
                        zF = cliVar.g.f(cmi.h1) || cliVar.g.f(cmi.i1);
                    } else if (iOrdinal == 3) {
                        zF = cliVar.g.f(a68.f);
                    } else {
                        if (iOrdinal != 4) {
                            ore.o();
                            throw null;
                        }
                        zF = cqk.d(cliVar.g.b(cmi.j1, Boolean.TRUE), Boolean.FALSE);
                    }
                } while (!zF);
                xo6 xo6Var2 = (xo6) next;
                if (xo6Var2 != null) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append(xo6Var2.name());
                    sb.append(" value is set to ");
                    sb.append(str3);
                    sb.append(" despite using feature groups. Do not use APIs like ");
                    int iOrdinal2 = xo6Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        strConcat = str3.concat(".Builder.setDynamicRange");
                    } else if (iOrdinal2 == 1) {
                        strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                    } else if (iOrdinal2 == 2) {
                        strConcat = c2m.c(cliVar) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                    } else if (iOrdinal2 == 3) {
                        strConcat = str3.concat(".Builder.setOutputFormat");
                    } else {
                        if (iOrdinal2 != 4) {
                            ore.o();
                            throw null;
                        }
                        strConcat = "Recorder.Builder.setQualitySelector";
                    }
                    sb.append(strConcat);
                    sb.append(" while using feature groups. If, for example, ");
                    int iOrdinal3 = xo6Var2.ordinal();
                    if (iOrdinal3 == 0) {
                        str = "HDR";
                    } else if (iOrdinal3 == 1) {
                        str = "60 FPS";
                    } else if (iOrdinal3 == 2) {
                        str = "stabilization";
                    } else if (iOrdinal3 == 3) {
                        str = "JPEG_R output format";
                    } else {
                        if (iOrdinal3 != 4) {
                            ore.o();
                            throw null;
                        }
                        str = "UHD recording quality";
                    }
                    sb.append(str);
                    sb.append(" is required, instead set ");
                    int iOrdinal4 = xo6Var2.ordinal();
                    if (iOrdinal4 == 0) {
                        str2 = "GroupableFeature.HDR_HLG10";
                    } else if (iOrdinal4 == 1) {
                        str2 = "GroupableFeature.FPS_60";
                    } else if (iOrdinal4 == 2) {
                        str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                    } else if (iOrdinal4 == 3) {
                        str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                    } else {
                        if (iOrdinal4 != 4) {
                            ore.o();
                            throw null;
                        }
                        str2 = "GroupableFeatures.UHD_RECORDING";
                    }
                    c.o(zo5.w(sb, str2, " as either a required or preferred feature."));
                    throw null;
                }
            }
        }
        this.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0012  */
    public List a(Collection collection, x7j x7jVar, ao1 ao1Var) {
        List listT1;
        qe1 qe1Var;
        boolean z = ao1Var.h;
        String str = ao1Var.a;
        boolean z2 = ao1Var.m;
        pi6 pi6Var = ao1Var.f;
        x7j x7jVar2 = x7j.a;
        r66 r66Var = r66.a;
        if (z || x7jVar != x7jVar2) {
            x7j x7jVar3 = x7j.c;
            if (z && x7jVar == x7jVar3 && (pi6Var instanceof oi6)) {
                c79 c79VarW = yab.w();
                c79VarW.addAll(collection);
                c79VarW.add(new ip1((pi6Var instanceof oi6) && !((oi6) pi6Var).a));
                listT1 = yab.j(c79VarW);
            } else if (z && x7jVar == x7jVar3 && !z2) {
                c79 c79VarW2 = yab.w();
                c79VarW2.addAll(collection);
                if (ao1Var.c != null && (qe1Var = ao1Var.g) != null && qe1Var.f && this.b) {
                    pi6 pi6Var2 = ((ao1) this.f).f;
                    if (!(pi6Var2 instanceof ji6) && !(pi6Var2 instanceof li6)) {
                        String str2 = ao1Var.l;
                        String strC = str2 != null ? v3e.c(str2) : null;
                        if (strC == null) {
                            strC = "";
                        }
                        c79VarW2.add(new hp1(strC));
                    }
                }
                listT1 = yab.j(c79VarW2);
            } else if (z && x7jVar == x7jVar2 && ((z2 || !this.b) && ao1Var.q)) {
                listT1 = r66Var;
            } else {
                listT1 = ww3.T1(collection);
            }
        } else {
            listT1 = r66Var;
        }
        int iOrdinal = x7jVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    ore.o();
                    return null;
                }
                c79 c79VarW3 = yab.w();
                c79VarW3.addAll(kpk.a(((Number) ((ny8) this.e).getValue()).intValue(), 1, str, listT1));
                return yab.j(c79VarW3);
            }
        } else if (!collection.isEmpty()) {
            return kpk.a(collection.size(), 1, str, listT1);
        }
        return r66Var;
    }

    public meg b(Map map, ll9 ll9Var, List list, fu1 fu1Var, boolean z) {
        gp1 gp1Var;
        ao1 ao1Var = (ao1) this.f;
        qgc qgcVarF = null;
        if (ao1Var.u) {
            return null;
        }
        if (ao1Var.s == yp9.b) {
            pi6 pi6Var = ao1Var.f;
            if (!(pi6Var instanceof ii6) && !(pi6Var instanceof hi6) && !(pi6Var instanceof ki6) && !ao1Var.h && ((x7j) this.g) == x7j.a && (gp1Var = (gp1) map.get(fu1Var)) != null) {
                qgcVarF = kpk.f(gp1Var, true, ao1Var.n, false);
            }
        }
        return new meg(list, ll9Var, qgcVarF, z);
    }

    public boolean c() {
        File file = (File) this.g;
        if (((byte[]) this.f) == null) {
            j(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    j(4, null);
                    return false;
                }
            } catch (IOException unused) {
                j(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            j(4, null);
            return false;
        }
        this.b = true;
        return true;
    }

    public p32 d() {
        return (p32) ((ny8) this.d).getValue();
    }

    public ll9 e(x7j x7jVar, Map map, fu1 fu1Var) {
        ll9 ll9Var;
        Object next;
        fu1 fu1Var2;
        tmc tmcVar;
        ao1 ao1Var = (ao1) this.f;
        qe1 qe1Var = ao1Var.g;
        Object obj = null;
        if (qe1Var != null) {
            ok0 ok0Var = qe1Var.d;
            CharSequence charSequence = qe1Var.b;
            Long l = qe1Var.a;
            ll9Var = new ll9(ok0Var, charSequence, l != null ? new fu1(l.longValue(), 0) : null, false, false, false, false, false, null, false, false, 3, null, null, ao1Var.n ? ao1Var.f instanceof ni6 ? 3 : 2 : 1, false);
        } else {
            ll9Var = null;
        }
        ao1 ao1Var2 = (ao1) this.f;
        Map map2 = (Map) this.j;
        gp1 gp1Var = (gp1) map2.get((fu1) this.i);
        if (gp1Var == null && (gp1Var = (gp1) map2.get(ao1Var2.r)) == null) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                fu1Var2 = (fu1) next;
                tmcVar = ao1Var2.i;
            } while (cqk.d(fu1Var2, tmcVar != null ? tmcVar.a.getId() : null));
            gp1Var = (gp1) map2.get(next);
            if (gp1Var == null) {
                gp1Var = (gp1) ww3.s1(map2.values());
            }
        }
        ao1 ao1Var3 = (ao1) this.f;
        vy1 vy1Var = ao1Var3.j;
        boolean z = ao1Var3.h;
        if (vy1Var.a() || x7jVar == x7j.c) {
            return null;
        }
        x7j x7jVar2 = x7j.a;
        if (!z && x7jVar == x7jVar2 && fu1Var == null) {
            for (Object obj2 : map.values()) {
                if (!((gp1) obj2).m) {
                    obj = obj2;
                    break;
                }
            }
            gp1 gp1Var2 = (gp1) obj;
            if (gp1Var2 != null) {
                return kpk.e(gp1Var2, (ao1) this.f, d());
            }
        } else if (!z && x7jVar == x7jVar2) {
            for (Object obj3 : map.values()) {
                if (!cqk.d(((gp1) obj3).a, fu1Var)) {
                    obj = obj3;
                    break;
                }
            }
            gp1 gp1Var3 = (gp1) obj;
            if (gp1Var3 != null) {
                return kpk.e(gp1Var3, (ao1) this.f, d());
            }
        } else if (gp1Var != null) {
            return kpk.e(gp1Var, (ao1) this.f, d());
        }
        return ll9Var;
    }

    public int f() {
        return 0;
    }

    public boolean g() {
        return this.b;
    }

    public FileInputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((lpd) this.e).c();
            return null;
        }
    }

    public ec1 i() {
        FileInputStream fileInputStreamH;
        vk5[] vk5VarArrJ;
        AssetManager assetManager = (AssetManager) this.c;
        lpd lpdVar = (lpd) this.e;
        ec1 ec1Var = null;
        if (!this.b) {
            ore.k("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return null;
        }
        byte[] bArr = (byte[]) this.f;
        if (bArr != null) {
            try {
                fileInputStreamH = h(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                lpdVar.d(6, e);
                fileInputStreamH = null;
            } catch (IOException e2) {
                lpdVar.d(7, e2);
                fileInputStreamH = null;
            }
            try {
                if (fileInputStreamH != null) {
                    try {
                        if (!Arrays.equals(l6i.a, awl.c(fileInputStreamH, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        vk5VarArrJ = l6i.j(fileInputStreamH, awl.c(fileInputStreamH, 4), (String) this.h);
                        try {
                            fileInputStreamH.close();
                        } catch (IOException e3) {
                            lpdVar.d(7, e3);
                        }
                        this.i = vk5VarArrJ;
                    } catch (IOException e4) {
                        lpdVar.d(7, e4);
                        try {
                            fileInputStreamH.close();
                        } catch (IOException e5) {
                            lpdVar.d(7, e5);
                        }
                        vk5VarArrJ = null;
                    } catch (IllegalStateException e6) {
                        lpdVar.d(8, e6);
                        fileInputStreamH.close();
                        vk5VarArrJ = null;
                    }
                }
                vk5[] vk5VarArr = (vk5[]) this.i;
                if (vk5VarArr != null && Build.VERSION.SDK_INT >= 31) {
                    try {
                        FileInputStream fileInputStreamH2 = h(assetManager, "dexopt/baseline.profm");
                        if (fileInputStreamH2 != null) {
                            try {
                                if (!Arrays.equals(l6i.b, awl.c(fileInputStreamH2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                this.i = l6i.g(fileInputStreamH2, awl.c(fileInputStreamH2, 4), bArr, vk5VarArr);
                                fileInputStreamH2.close();
                                ec1Var = this;
                            } catch (Throwable th) {
                                try {
                                    fileInputStreamH2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (fileInputStreamH2 != null) {
                            fileInputStreamH2.close();
                        }
                    } catch (FileNotFoundException e7) {
                        lpdVar.d(9, e7);
                    } catch (IOException e8) {
                        lpdVar.d(7, e8);
                    } catch (IllegalStateException e9) {
                        this.i = null;
                        lpdVar.d(8, e9);
                    }
                    if (ec1Var != null) {
                        return ec1Var;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamH.close();
                } catch (IOException e10) {
                    lpdVar.d(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    public void j(int i, Serializable serializable) {
        ((Executor) this.d).execute(new uc2(this, i, serializable, 4));
    }

    public void k() {
        lpd lpdVar = (lpd) this.e;
        vk5[] vk5VarArr = (vk5[]) this.i;
        byte[] bArr = (byte[]) this.f;
        if (vk5VarArr == null || bArr == null) {
            return;
        }
        if (!this.b) {
            ore.k("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(l6i.a);
                byteArrayOutputStream.write(bArr);
                if (l6i.l(byteArrayOutputStream, bArr, vk5VarArr)) {
                    this.j = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.i = null;
                } else {
                    lpdVar.d(5, null);
                    this.i = null;
                    byteArrayOutputStream.close();
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            lpdVar.d(7, e);
        } catch (IllegalStateException e2) {
            lpdVar.d(8, e2);
        }
    }

    public boolean l() {
        byte[] bArr = (byte[]) this.j;
        if (bArr != null) {
            if (!this.b) {
                ore.k("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream((File) this.g);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[np0.o];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i <= 0) {
                                                    j(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    this.j = null;
                                                    this.i = null;
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, i);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (fileLockTryLock != null) {
                                            try {
                                                fileLockTryLock.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } catch (Throwable th3) {
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (FileNotFoundException e) {
                    j(6, e);
                    this.j = null;
                    this.i = null;
                    return false;
                } catch (IOException e2) {
                    j(7, e2);
                    this.j = null;
                    this.i = null;
                    return false;
                }
            } catch (Throwable th9) {
                this.j = null;
                this.i = null;
                throw th9;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.h) + ", frameRateRange=" + ((Range) this.e) + ", requiredFeatureGroup=" + ((Set) this.f) + ", preferredFeatureGroup=" + ((List) this.g) + ", effects=" + ((List) this.d) + ", viewPort=" + ((b9j) this.c) + '}';
            default:
                return super.toString();
        }
    }

    public ec1(k4f k4fVar, ny8 ny8Var) {
        this.a = 1;
        this.c = k4fVar;
        this.d = ny8Var;
        this.e = rx8.P(3, new yk1(13, this));
        this.f = new ao1(false, null, false, false, 16777215);
        this.g = x7j.a;
        this.b = true;
        this.j = s66.a;
    }

    public ec1(AssetManager assetManager, Executor executor, lpd lpdVar, String str, File file) {
        byte[] bArr;
        this.a = 2;
        this.b = false;
        this.c = assetManager;
        this.d = executor;
        this.e = lpdVar;
        this.h = str;
        this.g = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = hvi.a;
        } else {
            switch (i) {
                case 26:
                    bArr = hvi.d;
                    break;
                case 27:
                    bArr = hvi.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = hvi.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f = bArr;
    }

    public ec1(CallAnalyticsSender callAnalyticsSender, g85 g85Var, esh eshVar) {
        this.a = 0;
        callAnalyticsSender.getClass();
        eshVar.getClass();
        this.c = callAnalyticsSender;
        this.d = g85Var;
        this.e = eshVar;
        this.b = true;
        this.i = new ft0(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec1(List list) {
        this(list, (b9j) null, r66.a);
        this.a = 3;
    }
}
