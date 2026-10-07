package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class z58 extends cli {
    public static final w58 F = new w58();
    public hmf A;
    public g85 B;
    public qhh C;
    public imf D;
    public final b1k E;
    public final int u;
    public final AtomicReference v;
    public final int w;
    public int x;
    public Rational y;
    public i4f z;

    public z58(a68 a68Var) {
        super(a68Var);
        this.v = new AtomicReference(null);
        this.x = -1;
        this.y = null;
        this.E = new b1k(17, this);
        a68 a68Var2 = (a68) this.i;
        bh0 bh0Var = a68.b;
        if (a68Var2.f(bh0Var)) {
            this.u = ((Integer) a68Var2.i(bh0Var)).intValue();
        } else {
            this.u = 1;
        }
        this.w = ((Integer) a68Var2.b(a68.i, 0)).intValue();
        this.z = new i4f((x58) a68Var2.b(a68.k, null));
    }

    public static boolean M(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cli
    public final yi0 A(t94 t94Var) {
        this.A.a(t94Var);
        Object[] objArr = {this.A.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        tw5 tw5VarB = this.j.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        tvj.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yi0Var + ", secondaryStreamSpec " + yi0Var2);
        hmf hmfVarK = K(g(), (a68) this.i, yi0Var);
        this.A = hmfVarK;
        Object[] objArr = {hmfVarK.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        this.e = 1;
        t();
        return yi0Var;
    }

    @Override // defpackage.cli
    public final void C() {
        i4f i4fVar = this.z;
        i4fVar.c();
        i4fVar.b();
        qhh qhhVar = this.C;
        if (qhhVar != null) {
            qhhVar.b();
        }
        J(false);
        f().h(null);
    }

    public final void J(boolean z) {
        qhh qhhVar;
        Log.d("ImageCapture", "clearPipeline");
        wxl.a();
        imf imfVar = this.D;
        if (imfVar != null) {
            imfVar.b();
            this.D = null;
        }
        g85 g85Var = this.B;
        if (g85Var != null) {
            g85Var.y();
            this.B = null;
        }
        if (!z && (qhhVar = this.C) != null) {
            qhhVar.b();
            this.C = null;
        }
        f().b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x035f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0361  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:114:0x0434  */
    /* JADX WARN: Code duplicated, block: B:115:0x0436  */
    /* JADX WARN: Code duplicated, block: B:127:0x048e  */
    /* JADX WARN: Code duplicated, block: B:135:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:146:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:148:0x04df  */
    /* JADX WARN: Code duplicated, block: B:149:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:38:0x015a  */
    /* JADX WARN: Code duplicated, block: B:43:0x017e A[Catch: Exception -> 0x0181, TRY_LEAVE, TryCatch #1 {Exception -> 0x0181, blocks: (B:41:0x016e, B:43:0x017e), top: B:156:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0189  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0207  */
    /* JADX WARN: Code duplicated, block: B:59:0x020c  */
    /* JADX WARN: Code duplicated, block: B:64:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x021f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0227  */
    /* JADX WARN: Code duplicated, block: B:72:0x023d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0265  */
    /* JADX WARN: Code duplicated, block: B:80:0x027a  */
    /* JADX WARN: Code duplicated, block: B:81:0x027c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0282  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x032f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0331  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final hmf K(String str, a68 a68Var, yi0 yi0Var) {
        int i;
        HashSet hashSet;
        int i2;
        ?? r10;
        ?? r6;
        nf2 nf2Var;
        boolean zContains;
        boolean zContains2;
        Object objK;
        CameraCharacteristics cameraCharacteristics;
        g85 g85Var;
        xxi xxiVar;
        ji2 ji2Var;
        final js8 js8Var;
        final fjd fjdVar;
        Executor executor;
        int i3;
        ?? r4;
        ArrayList arrayList;
        Integer num;
        Integer num2;
        int inputFormat;
        zg0 zg0Var;
        ?? r11;
        ad2 ad2Var;
        int i4;
        ug4 ug4Var;
        qwa qwaVar;
        zc2 zc2VarA;
        zc2 zc2Var;
        o78 o78Var;
        boolean z;
        qhh qhhVar;
        js8 js8Var2;
        boolean z2;
        ls9 ls9Var;
        hmf hmfVarD;
        zg0 zg0Var2;
        fx5 fx5Var;
        i88 i88Var;
        t94 t94Var;
        imf imfVar;
        i88 i88Var2;
        boolean z3;
        zc2 zc2VarA2;
        qwa qwaVar2;
        wxl.a();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + yi0Var + ")");
        Size size = yi0Var.a;
        pf2 pf2VarE = e();
        Objects.requireNonNull(pf2VarE);
        boolean zP = pf2VarE.p();
        boolean z4 = zP ^ true;
        if (this.B != null) {
            qyj.l(null, z4);
            this.B.y();
        }
        nf2 nf2VarA = e().a();
        int iIntValue = 4101;
        if (nf2VarA instanceof ja) {
            i = 0;
            t94 t94VarA = ((fmi) ((ja) nf2VarA).c.b(pd2.P, fmi.a)).a(emi.a, 1);
            if (t94VarA != null) {
                bh0 bh0Var = v68.C0;
                dhc dhcVar = (dhc) t94VarA;
                if (dhcVar.a.containsKey(bh0Var)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) dhcVar.i(bh0Var)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            if (hashSet != null) {
                i2 = 2;
            } else {
                hashSet = new HashSet();
                hashSet.add(0);
                if (nf2VarA != null) {
                    i2 = 2;
                    zContains2 = nf2VarA.L().contains(4101);
                } else {
                    i2 = 2;
                    r10 = i;
                }
                if (r10 != 0) {
                    r10 = zContains2;
                    hashSet.add(1);
                }
                if (nf2VarA != null) {
                    nf2Var = nf2VarA;
                    if (nf2Var.r().contains(3)) {
                        zContains = nf2Var.L().contains(32);
                    } else {
                        r6 = i;
                    }
                } else {
                    r6 = i;
                }
                if (r6 != 0) {
                    r6 = zContains;
                    hashSet.add(Integer.valueOf(i2));
                    hashSet.add(3);
                }
            }
            r6 = zContains;
            cmi cmiVar = this.i;
            bh0 bh0Var2 = a68.f;
            Integer num3 = (Integer) cmiVar.b(bh0Var2, 0);
            num3.getClass();
            boolean zContains3 = hashSet.contains(num3);
            StringBuilder sb = new StringBuilder("The specified output format (");
            Integer num4 = (Integer) this.i.b(bh0Var2, 0);
            num4.getClass();
            sb.append(num4.intValue());
            sb.append(") is not supported by current configuration. Supported output formats: ");
            sb.append(hashSet);
            qyj.h(sb.toString(), zContains3);
            if (((Boolean) this.i.b(a68.l, Boolean.FALSE)).booleanValue()) {
                a68Var.getInputFormat();
                e().e().s();
            }
            if (e() != null) {
                try {
                    objK = e().j().k();
                    if (objK instanceof CameraCharacteristics) {
                        cameraCharacteristics = (CameraCharacteristics) objK;
                    } else {
                        cameraCharacteristics = null;
                    }
                } catch (Exception e) {
                    Log.e("ImageCapture", "getCameraCharacteristics failed", e);
                }
            } else {
                cameraCharacteristics = null;
            }
            xxiVar = this.p;
            g85Var = new g85();
            wxl.a();
            g85Var.a = a68Var;
            ji2Var = (ji2) a68Var.b(cmi.Y0, null);
            if (ji2Var != null) {
                qr7.x((String) a68Var.b(wih.S0, a68Var.toString()), "Implementation is missing option unpacker for ");
                throw null;
            }
            j28 j28Var = new j28();
            ji2Var.a(a68Var, j28Var);
            g85Var.b = j28Var.q();
            js8Var = new js8();
            js8Var.a = null;
            js8Var.f = null;
            g85Var.c = js8Var;
            Executor executor2 = (Executor) a68Var.b(vm8.G0, zjl.c());
            Objects.requireNonNull(executor2);
            executor = executor2;
            if (xxiVar == null) {
                i3 = i;
                if (xxiVar.a == 4) {
                    r4 = 1;
                } else {
                    r4 = i3;
                }
                qyj.i(r4);
                throw null;
            }
            fjdVar = new fjd(executor, cameraCharacteristics);
            g85Var.d = fjdVar;
            arrayList = new ArrayList();
            if (((Integer) a68Var.b(n68.t0, Integer.valueOf(i))).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(Integer.valueOf(np0.n));
            } else {
                num = (Integer) a68Var.b(a68.e, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    num2 = (Integer) a68Var.b(n68.s0, null);
                    if (num2 != null || num2.intValue() != 4101) {
                        if (num2 == null && num2.intValue() == 32) {
                            iIntValue = 32;
                        } else {
                            iIntValue = np0.n;
                        }
                    }
                }
                arrayList.add(Integer.valueOf(iIntValue));
            }
            inputFormat = a68Var.getInputFormat();
            if (a68Var.b(a68.g, null) == null) {
                ore.m();
                throw null;
            }
            ux5 ux5Var = new ux5();
            ux5 ux5Var2 = new ux5();
            zg0Var = new zg0(size, inputFormat, arrayList, z4, ux5Var, ux5Var2);
            g85Var.e = zg0Var;
            if (((zg0) js8Var.e) == null || ((ls9) js8Var.b) != null) {
                r11 = i;
            } else {
                r11 = 1;
            }
            qyj.l("CaptureNode does not support recreation yet.", r11);
            js8Var.e = zg0Var;
            ad2Var = new ad2(1, js8Var);
            if (arrayList.size() > 1) {
                i4 = 1;
            } else {
                i4 = i;
            }
            if (zP) {
                if (i4 != 0) {
                    qwa qwaVar3 = new qwa(size.getWidth(), size.getHeight(), np0.n, 4);
                    ad2 ad2Var2 = qwaVar3.b;
                    zc2[] zc2VarArr = new zc2[2];
                    zc2VarArr[i] = ad2Var;
                    zc2VarArr[1] = ad2Var2;
                    zc2 zc2VarA3 = vhl.a(zc2VarArr);
                    qwaVar = new qwa(size.getWidth(), size.getHeight(), 32, 4);
                    ad2 ad2Var3 = qwaVar.b;
                    zc2[] zc2VarArr2 = new zc2[2];
                    zc2VarArr2[i] = ad2Var;
                    zc2VarArr2[1] = ad2Var3;
                    zc2VarA = vhl.a(zc2VarArr2);
                    zc2VarA2 = zc2VarA3;
                    qwaVar2 = qwaVar3;
                } else {
                    qwa qwaVar4 = new qwa(size.getWidth(), size.getHeight(), inputFormat, 4);
                    ad2 ad2Var4 = qwaVar4.b;
                    zc2[] zc2VarArr3 = new zc2[2];
                    zc2VarArr3[i] = ad2Var;
                    zc2VarArr3[1] = ad2Var4;
                    zc2VarA2 = vhl.a(zc2VarArr3);
                    qwaVar = null;
                    zc2VarA = null;
                    qwaVar2 = qwaVar4;
                }
                zc2 zc2Var2 = zc2VarA2;
                final int i5 = i;
                ug4Var = new ug4() { // from class: ml2
                    @Override // defpackage.ug4
                    public final void accept(Object obj) {
                        int i6 = i5;
                        js8 js8Var3 = js8Var;
                        switch (i6) {
                            case 0:
                                js8Var3.q((hjd) obj);
                                break;
                            case 1:
                                hjd hjdVar = (hjd) obj;
                                js8Var3.q(hjdVar);
                                xp9 xp9Var = (xp9) js8Var3.f;
                                qyj.l("Pending request should be null", ((hjd) xp9Var.c) == null);
                                xp9Var.c = hjdVar;
                                break;
                            default:
                                js8Var3.s((fj0) obj);
                                break;
                        }
                    }
                };
                zc2Var = zc2Var2;
                o78Var = qwaVar2;
            } else {
                i4 = i4;
                xp9 xp9Var = new xp9(24, d3m.a(size.getWidth(), size.getHeight(), inputFormat, 4));
                js8Var.f = xp9Var;
                final int i6 = 1;
                ug4Var = new ug4() { // from class: ml2
                    @Override // defpackage.ug4
                    public final void accept(Object obj) {
                        int i7 = i6;
                        js8 js8Var3 = js8Var;
                        switch (i7) {
                            case 0:
                                js8Var3.q((hjd) obj);
                                break;
                            case 1:
                                hjd hjdVar = (hjd) obj;
                                js8Var3.q(hjdVar);
                                xp9 xp9Var2 = (xp9) js8Var3.f;
                                qyj.l("Pending request should be null", ((hjd) xp9Var2.c) == null);
                                xp9Var2.c = hjdVar;
                                break;
                            default:
                                js8Var3.s((fj0) obj);
                                break;
                        }
                    }
                };
                qwaVar = null;
                zc2VarA = null;
                zc2Var = ad2Var;
                o78Var = xp9Var;
            }
            zg0Var.a = zc2Var;
            if (i4 != 0 && zc2VarA != null) {
                zg0Var.b = zc2VarA;
            }
            Surface surface = o78Var.getSurface();
            Objects.requireNonNull(surface);
            if (zg0Var.c == null) {
                z = true;
            } else {
                z = false;
            }
            qyj.l("The surface is already set.", z);
            zg0Var.c = new i88(surface, size, inputFormat);
            js8Var.b = new ls9(o78Var);
            o78Var.D(new ot4(21, js8Var), zjl.d());
            if (i4 != 0 && qwaVar != null) {
                Surface surface2 = qwaVar.getSurface();
                if (zg0Var.d == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qyj.l("The secondary surface is already set.", z3);
                zg0Var.d = new i88(surface2, size, inputFormat);
                js8Var.c = new ls9(qwaVar);
                qwaVar.D(new ot4(21, js8Var), zjl.d());
            }
            ux5Var.b = ug4Var;
            final int i7 = 2;
            ux5Var2.b = new ug4() { // from class: ml2
                @Override // defpackage.ug4
                public final void accept(Object obj) {
                    int i8 = i7;
                    js8 js8Var3 = js8Var;
                    switch (i8) {
                        case 0:
                            js8Var3.q((hjd) obj);
                            break;
                        case 1:
                            hjd hjdVar = (hjd) obj;
                            js8Var3.q(hjdVar);
                            xp9 xp9Var2 = (xp9) js8Var3.f;
                            qyj.l("Pending request should be null", ((hjd) xp9Var2.c) == null);
                            xp9Var2.c = hjdVar;
                            break;
                        default:
                            js8Var3.s((fj0) obj);
                            break;
                    }
                }
            };
            ux5 ux5Var3 = new ux5();
            ux5 ux5Var4 = new ux5();
            li0 li0Var = new li0(ux5Var3, ux5Var4, inputFormat, arrayList);
            js8Var.d = li0Var;
            fjdVar.b = li0Var;
            final int i8 = 0;
            ux5Var3.b = new ug4() { // from class: djd
                @Override // defpackage.ug4
                public final void accept(Object obj) throws Exception {
                    int i9 = i8;
                    fjd fjdVar2 = fjdVar;
                    mi0 mi0Var = (mi0) obj;
                    switch (i9) {
                        case 0:
                            if (!mi0Var.a.g.g) {
                                fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 1));
                            } else {
                                mi0Var.b.close();
                            }
                            break;
                        default:
                            if (!mi0Var.a.g.g) {
                                fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 0));
                            } else {
                                tvj.g("ProcessingNode", "The postview image is closed due to request aborted");
                                mi0Var.b.close();
                            }
                            break;
                    }
                }
            };
            final int i9 = 1;
            ux5Var4.b = new ug4() { // from class: djd
                @Override // defpackage.ug4
                public final void accept(Object obj) throws Exception {
                    int i10 = i9;
                    fjd fjdVar2 = fjdVar;
                    mi0 mi0Var = (mi0) obj;
                    switch (i10) {
                        case 0:
                            if (!mi0Var.a.g.g) {
                                fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 1));
                            } else {
                                mi0Var.b.close();
                            }
                            break;
                        default:
                            if (!mi0Var.a.g.g) {
                                fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 0));
                            } else {
                                tvj.g("ProcessingNode", "The postview image is closed due to request aborted");
                                mi0Var.b.close();
                            }
                            break;
                    }
                }
            };
            fjdVar.c = new yr8(6);
            fjdVar.d = new zo7(fjdVar.j, 17);
            fjdVar.f = new dul(29);
            fjdVar.e = new so2(18);
            fjdVar.g = new yr8(0);
            fjdVar.i = new zpe(29);
            if (inputFormat != 35 || fjdVar.k) {
                fjdVar.h = new xr8();
            }
            this.B = g85Var;
            if (this.C == null) {
                Objects.requireNonNull((ami) this.i.b(cmi.k1, new ami()));
                this.C = new qhh(this.E);
            }
            qhhVar = this.C;
            g85 g85Var2 = this.B;
            qhhVar.getClass();
            wxl.a();
            qhhVar.c = g85Var2;
            g85Var2.getClass();
            wxl.a();
            js8Var2 = (js8) g85Var2.c;
            js8Var2.getClass();
            wxl.a();
            if (((ls9) js8Var2.b) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            qyj.l("The ImageReader is not initialized.", z2);
            ls9Var = (ls9) js8Var2.b;
            synchronized (ls9Var.a) {
                ls9Var.f = qhhVar;
            }
            g85 g85Var3 = this.B;
            hmfVarD = hmf.d((a68) g85Var3.a, yi0Var.a);
            zg0Var2 = (zg0) g85Var3.e;
            i88 i88Var3 = zg0Var2.c;
            Objects.requireNonNull(i88Var3);
            fx5Var = fx5.d;
            g85 g85VarA = ui0.a(i88Var3);
            g85VarA.e = fx5Var;
            hmfVarD.a.add(g85VarA.x());
            if (zg0Var2.h.size() > 1 && (i88Var2 = zg0Var2.d) != null) {
                g85 g85VarA2 = ui0.a(i88Var2);
                g85VarA2.e = fx5Var;
                hmfVarD.a.add(g85VarA2.x());
            }
            i88Var = zg0Var2.e;
            if (i88Var != null) {
                hmfVarD.i = ui0.a(i88Var).x();
            }
            hmfVarD.h = yi0Var.d;
            if (this.u == 2 && !yi0Var.g) {
                f().a(hmfVarD);
            }
            t94Var = yi0Var.f;
            if (t94Var != null) {
                hmfVarD.b.o(t94Var);
            }
            imfVar = this.D;
            if (imfVar != null) {
                imfVar.b();
            }
            imf imfVar2 = new imf(new v58(0, this));
            this.D = imfVar2;
            hmfVarD.f = imfVar2;
            return hmfVarD;
        }
        i = 0;
        hashSet = null;
        if (hashSet != null) {
            i2 = 2;
        } else {
            hashSet = new HashSet();
            hashSet.add(0);
            if (nf2VarA != null) {
                i2 = 2;
                zContains2 = nf2VarA.L().contains(4101);
            } else {
                i2 = 2;
                r10 = i;
            }
            if (r10 != 0) {
                r10 = zContains2;
                hashSet.add(1);
            }
            if (nf2VarA != null) {
                nf2Var = nf2VarA;
                if (nf2Var.r().contains(3)) {
                    r6 = i;
                } else {
                    zContains = nf2Var.L().contains(32);
                }
            } else {
                r6 = i;
            }
            if (r6 != 0) {
                r6 = zContains;
                hashSet.add(Integer.valueOf(i2));
                hashSet.add(3);
            }
        }
        r6 = zContains;
        cmi cmiVar2 = this.i;
        bh0 bh0Var3 = a68.f;
        Integer num5 = (Integer) cmiVar2.b(bh0Var3, 0);
        num5.getClass();
        boolean zContains4 = hashSet.contains(num5);
        StringBuilder sb2 = new StringBuilder("The specified output format (");
        Integer num6 = (Integer) this.i.b(bh0Var3, 0);
        num6.getClass();
        sb2.append(num6.intValue());
        sb2.append(") is not supported by current configuration. Supported output formats: ");
        sb2.append(hashSet);
        qyj.h(sb2.toString(), zContains4);
        if (((Boolean) this.i.b(a68.l, Boolean.FALSE)).booleanValue()) {
            a68Var.getInputFormat();
            e().e().s();
        }
        if (e() != null) {
            objK = e().j().k();
            if (objK instanceof CameraCharacteristics) {
                cameraCharacteristics = (CameraCharacteristics) objK;
            } else {
                cameraCharacteristics = null;
            }
        } else {
            cameraCharacteristics = null;
        }
        xxiVar = this.p;
        g85Var = new g85();
        wxl.a();
        g85Var.a = a68Var;
        ji2Var = (ji2) a68Var.b(cmi.Y0, null);
        if (ji2Var != null) {
            qr7.x((String) a68Var.b(wih.S0, a68Var.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        j28 j28Var2 = new j28();
        ji2Var.a(a68Var, j28Var2);
        g85Var.b = j28Var2.q();
        js8Var = new js8();
        js8Var.a = null;
        js8Var.f = null;
        g85Var.c = js8Var;
        Executor executor3 = (Executor) a68Var.b(vm8.G0, zjl.c());
        Objects.requireNonNull(executor3);
        executor = executor3;
        if (xxiVar == null) {
            i3 = i;
            if (xxiVar.a == 4) {
                r4 = 1;
            } else {
                r4 = i3;
            }
            qyj.i(r4);
            throw null;
        }
        fjdVar = new fjd(executor, cameraCharacteristics);
        g85Var.d = fjdVar;
        arrayList = new ArrayList();
        if (((Integer) a68Var.b(n68.t0, Integer.valueOf(i))).intValue() != 0) {
            arrayList.add(32);
            arrayList.add(Integer.valueOf(np0.n));
        } else {
            num = (Integer) a68Var.b(a68.e, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                num2 = (Integer) a68Var.b(n68.s0, null);
                if (num2 != null) {
                    if (num2 == null) {
                        iIntValue = np0.n;
                    } else {
                        iIntValue = np0.n;
                    }
                } else if (num2 == null) {
                    iIntValue = np0.n;
                } else {
                    iIntValue = np0.n;
                }
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        inputFormat = a68Var.getInputFormat();
        if (a68Var.b(a68.g, null) == null) {
            ore.m();
            throw null;
        }
        ux5 ux5Var5 = new ux5();
        ux5 ux5Var6 = new ux5();
        zg0Var = new zg0(size, inputFormat, arrayList, z4, ux5Var5, ux5Var6);
        g85Var.e = zg0Var;
        if (((zg0) js8Var.e) == null) {
            r11 = i;
        } else {
            r11 = i;
        }
        qyj.l("CaptureNode does not support recreation yet.", r11);
        js8Var.e = zg0Var;
        ad2Var = new ad2(1, js8Var);
        if (arrayList.size() > 1) {
            i4 = 1;
        } else {
            i4 = i;
        }
        if (zP) {
            if (i4 != 0) {
                qwa qwaVar5 = new qwa(size.getWidth(), size.getHeight(), np0.n, 4);
                ad2 ad2Var5 = qwaVar5.b;
                zc2[] zc2VarArr4 = new zc2[2];
                zc2VarArr4[i] = ad2Var;
                zc2VarArr4[1] = ad2Var5;
                zc2 zc2VarA4 = vhl.a(zc2VarArr4);
                qwaVar = new qwa(size.getWidth(), size.getHeight(), 32, 4);
                ad2 ad2Var6 = qwaVar.b;
                zc2[] zc2VarArr5 = new zc2[2];
                zc2VarArr5[i] = ad2Var;
                zc2VarArr5[1] = ad2Var6;
                zc2VarA = vhl.a(zc2VarArr5);
                zc2VarA2 = zc2VarA4;
                qwaVar2 = qwaVar5;
            } else {
                qwa qwaVar6 = new qwa(size.getWidth(), size.getHeight(), inputFormat, 4);
                ad2 ad2Var7 = qwaVar6.b;
                zc2[] zc2VarArr6 = new zc2[2];
                zc2VarArr6[i] = ad2Var;
                zc2VarArr6[1] = ad2Var7;
                zc2VarA2 = vhl.a(zc2VarArr6);
                qwaVar = null;
                zc2VarA = null;
                qwaVar2 = qwaVar6;
            }
            zc2 zc2Var3 = zc2VarA2;
            final int i10 = i;
            ug4Var = new ug4() { // from class: ml2
                @Override // defpackage.ug4
                public final void accept(Object obj) {
                    int i11 = i10;
                    js8 js8Var3 = js8Var;
                    switch (i11) {
                        case 0:
                            js8Var3.q((hjd) obj);
                            break;
                        case 1:
                            hjd hjdVar = (hjd) obj;
                            js8Var3.q(hjdVar);
                            xp9 xp9Var2 = (xp9) js8Var3.f;
                            qyj.l("Pending request should be null", ((hjd) xp9Var2.c) == null);
                            xp9Var2.c = hjdVar;
                            break;
                        default:
                            js8Var3.s((fj0) obj);
                            break;
                    }
                }
            };
            zc2Var = zc2Var3;
            o78Var = qwaVar2;
        } else {
            i4 = i4;
            xp9 xp9Var2 = new xp9(24, d3m.a(size.getWidth(), size.getHeight(), inputFormat, 4));
            js8Var.f = xp9Var2;
            final int i11 = 1;
            ug4Var = new ug4() { // from class: ml2
                @Override // defpackage.ug4
                public final void accept(Object obj) {
                    int i12 = i11;
                    js8 js8Var3 = js8Var;
                    switch (i12) {
                        case 0:
                            js8Var3.q((hjd) obj);
                            break;
                        case 1:
                            hjd hjdVar = (hjd) obj;
                            js8Var3.q(hjdVar);
                            xp9 xp9Var3 = (xp9) js8Var3.f;
                            qyj.l("Pending request should be null", ((hjd) xp9Var3.c) == null);
                            xp9Var3.c = hjdVar;
                            break;
                        default:
                            js8Var3.s((fj0) obj);
                            break;
                    }
                }
            };
            qwaVar = null;
            zc2VarA = null;
            zc2Var = ad2Var;
            o78Var = xp9Var2;
        }
        zg0Var.a = zc2Var;
        if (i4 != 0) {
            zg0Var.b = zc2VarA;
        }
        Surface surface3 = o78Var.getSurface();
        Objects.requireNonNull(surface3);
        if (zg0Var.c == null) {
            z = true;
        } else {
            z = false;
        }
        qyj.l("The surface is already set.", z);
        zg0Var.c = new i88(surface3, size, inputFormat);
        js8Var.b = new ls9(o78Var);
        o78Var.D(new ot4(21, js8Var), zjl.d());
        if (i4 != 0) {
            Surface surface4 = qwaVar.getSurface();
            if (zg0Var.d == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            qyj.l("The secondary surface is already set.", z3);
            zg0Var.d = new i88(surface4, size, inputFormat);
            js8Var.c = new ls9(qwaVar);
            qwaVar.D(new ot4(21, js8Var), zjl.d());
        }
        ux5Var5.b = ug4Var;
        final int i12 = 2;
        ux5Var6.b = new ug4() { // from class: ml2
            @Override // defpackage.ug4
            public final void accept(Object obj) {
                int i13 = i12;
                js8 js8Var3 = js8Var;
                switch (i13) {
                    case 0:
                        js8Var3.q((hjd) obj);
                        break;
                    case 1:
                        hjd hjdVar = (hjd) obj;
                        js8Var3.q(hjdVar);
                        xp9 xp9Var3 = (xp9) js8Var3.f;
                        qyj.l("Pending request should be null", ((hjd) xp9Var3.c) == null);
                        xp9Var3.c = hjdVar;
                        break;
                    default:
                        js8Var3.s((fj0) obj);
                        break;
                }
            }
        };
        ux5 ux5Var7 = new ux5();
        ux5 ux5Var8 = new ux5();
        li0 li0Var2 = new li0(ux5Var7, ux5Var8, inputFormat, arrayList);
        js8Var.d = li0Var2;
        fjdVar.b = li0Var2;
        final int i13 = 0;
        ux5Var7.b = new ug4() { // from class: djd
            @Override // defpackage.ug4
            public final void accept(Object obj) throws Exception {
                int i14 = i13;
                fjd fjdVar2 = fjdVar;
                mi0 mi0Var = (mi0) obj;
                switch (i14) {
                    case 0:
                        if (!mi0Var.a.g.g) {
                            fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 1));
                        } else {
                            mi0Var.b.close();
                        }
                        break;
                    default:
                        if (!mi0Var.a.g.g) {
                            fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 0));
                        } else {
                            tvj.g("ProcessingNode", "The postview image is closed due to request aborted");
                            mi0Var.b.close();
                        }
                        break;
                }
            }
        };
        final int i14 = 1;
        ux5Var8.b = new ug4() { // from class: djd
            @Override // defpackage.ug4
            public final void accept(Object obj) throws Exception {
                int i15 = i14;
                fjd fjdVar2 = fjdVar;
                mi0 mi0Var = (mi0) obj;
                switch (i15) {
                    case 0:
                        if (!mi0Var.a.g.g) {
                            fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 1));
                        } else {
                            mi0Var.b.close();
                        }
                        break;
                    default:
                        if (!mi0Var.a.g.g) {
                            fjdVar2.a.execute(new ejd(fjdVar2, mi0Var, 0));
                        } else {
                            tvj.g("ProcessingNode", "The postview image is closed due to request aborted");
                            mi0Var.b.close();
                        }
                        break;
                }
            }
        };
        fjdVar.c = new yr8(6);
        fjdVar.d = new zo7(fjdVar.j, 17);
        fjdVar.f = new dul(29);
        fjdVar.e = new so2(18);
        fjdVar.g = new yr8(0);
        fjdVar.i = new zpe(29);
        if (inputFormat != 35) {
            fjdVar.h = new xr8();
        } else {
            fjdVar.h = new xr8();
        }
        this.B = g85Var;
        if (this.C == null) {
            Objects.requireNonNull((ami) this.i.b(cmi.k1, new ami()));
            this.C = new qhh(this.E);
        }
        qhhVar = this.C;
        g85 g85Var4 = this.B;
        qhhVar.getClass();
        wxl.a();
        qhhVar.c = g85Var4;
        g85Var4.getClass();
        wxl.a();
        js8Var2 = (js8) g85Var4.c;
        js8Var2.getClass();
        wxl.a();
        if (((ls9) js8Var2.b) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        qyj.l("The ImageReader is not initialized.", z2);
        ls9Var = (ls9) js8Var2.b;
        synchronized (ls9Var.a) {
            ls9Var.f = qhhVar;
            g85 g85Var5 = this.B;
            hmfVarD = hmf.d((a68) g85Var5.a, yi0Var.a);
            zg0Var2 = (zg0) g85Var5.e;
            i88 i88Var4 = zg0Var2.c;
            Objects.requireNonNull(i88Var4);
            fx5Var = fx5.d;
            g85 g85VarA3 = ui0.a(i88Var4);
            g85VarA3.e = fx5Var;
            hmfVarD.a.add(g85VarA3.x());
            if (zg0Var2.h.size() > 1) {
                g85 g85VarA4 = ui0.a(i88Var2);
                g85VarA4.e = fx5Var;
                hmfVarD.a.add(g85VarA4.x());
            }
            i88Var = zg0Var2.e;
            if (i88Var != null) {
                hmfVarD.i = ui0.a(i88Var).x();
            }
            hmfVarD.h = yi0Var.d;
            if (this.u == 2) {
                f().a(hmfVarD);
            }
            t94Var = yi0Var.f;
            if (t94Var != null) {
                hmfVarD.b.o(t94Var);
            }
            imfVar = this.D;
            if (imfVar != null) {
                imfVar.b();
            }
            imf imfVar3 = new imf(new v58(0, this));
            this.D = imfVar3;
            hmfVarD.f = imfVar3;
            return hmfVarD;
        }
    }

    public final int L() {
        int iIntValue;
        synchronized (this.v) {
            iIntValue = this.x;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((a68) this.i).b(a68.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void N(int i) {
        int iM = m();
        if (!E(i) || this.y == null) {
            return;
        }
        this.y = f3m.b(Math.abs(njl.c(i) - njl.c(iM)), this.y);
    }

    public final void O(Executor executor, gj2 gj2Var) {
        int i;
        int iRound;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zjl.d().execute(new d86(this, executor, gj2Var, 9));
            return;
        }
        wxl.a();
        if (L() == 3 && this.z.a == null) {
            ore.p("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        pf2 pf2VarE = e();
        Rect rect = null;
        if (pf2VarE == null || !this.a) {
            gj2Var.M(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        boolean z = ((Integer) this.i.b(n68.t0, 0)).intValue() != 0;
        qhh qhhVar = this.C;
        Objects.requireNonNull(qhhVar);
        Rect rect2 = this.l;
        Size sizeD = d();
        Objects.requireNonNull(sizeD);
        if (rect2 != null) {
            rect = rect2;
            i = 2;
        } else {
            Rational rational = this.y;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                i = 2;
                rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
            } else {
                pf2 pf2VarE2 = e();
                Objects.requireNonNull(pf2VarE2);
                int iJ = j(pf2VarE2, false);
                Rational rational2 = new Rational(this.y.getDenominator(), this.y.getNumerator());
                if (!y1i.c(iJ)) {
                    rational2 = this.y;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    i = 2;
                    tvj.g("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeD.getWidth();
                    int height = sizeD.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    i = 2;
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i4 = (height - iRound2) / 2;
                        i3 = iRound2;
                        iRound = width;
                        i2 = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i2 = (width - iRound) / 2;
                        i3 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i2, i4, iRound + i2, i3 + i4);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.m;
        int iJ2 = j(pf2VarE, false);
        a68 a68Var = (a68) this.i;
        bh0 bh0Var = a68.j;
        if (a68Var.f(bh0Var)) {
            iIntValue = ((Integer) a68Var.i(bh0Var)).intValue();
        } else {
            int i5 = this.u;
            if (i5 == 0) {
                iIntValue = 100;
            } else {
                if (i5 != 1 && i5 != i) {
                    ore.k(c0a.k(i5, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        gj0 gj0Var = new gj0(executor, gj2Var, rect, matrix, iJ2, iIntValue, this.u, z, Collections.unmodifiableList(this.A.e));
        if (z) {
            Boolean bool = Boolean.FALSE;
            HashMap map = gj0Var.b;
            map.put(32, bool);
            map.put(Integer.valueOf(np0.n), bool);
        }
        wxl.a();
        qhhVar.a.offer(gj0Var);
        qhhVar.c();
    }

    public final void P() {
        synchronized (this.v) {
            try {
                if (this.v.get() != null) {
                    return;
                }
                f().g(L());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        F.getClass();
        a68 a68Var = w58.a;
        t94 t94VarA = fmiVar.a(a68Var.L(), this.u);
        if (z) {
            t94VarA = t94.I(t94VarA, a68Var);
        }
        if (t94VarA == null) {
            return null;
        }
        return new a68(dhc.a(((r48) n(t94VarA)).b));
    }

    @Override // defpackage.cli
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new r48(w8b.h(t94Var), 1);
    }

    @Override // defpackage.cli
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return "ImageCapture:".concat(i());
    }

    @Override // defpackage.cli
    public final void u() {
        qyj.k(e(), "Attached camera cannot be null");
        if (L() == 3) {
            pf2 pf2VarE = e();
            if ((pf2VarE != null ? pf2VarE.a().j() : -1) == 0) {
                return;
            }
            ore.p("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // defpackage.cli
    public final void v() {
        tvj.a("ImageCapture", "onCameraControlReady");
        P();
        f().h(this.z);
    }

    @Override // defpackage.cli
    public final cmi w(nf2 nf2Var, bmi bmiVar) {
        Integer numValueOf = Integer.valueOf(np0.n);
        HashSet<kr7> hashSet = this.h;
        boolean z = false;
        if (hashSet != null) {
            for (kr7 kr7Var : hashSet) {
            }
            bmiVar.g().m(a68.f, 0);
        }
        if (nf2Var.p().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            w8b w8bVarG = bmiVar.g();
            bh0 bh0Var = a68.h;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(w8bVarG.b(bh0Var, bool2))) {
                tvj.g("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                tvj.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bmiVar.g().m(bh0Var, bool2);
            }
        }
        w8b w8bVarG2 = bmiVar.g();
        Boolean bool3 = Boolean.TRUE;
        bh0 bh0Var2 = a68.h;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(w8bVarG2.b(bh0Var2, bool4))) {
            if (e() != null) {
                e().e().s();
            }
            Integer num = (Integer) w8bVarG2.b(a68.e, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                tvj.g("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                tvj.g("ImageCapture", "Unable to support software JPEG. Disabling.");
                w8bVarG2.m(bh0Var2, bool4);
            }
        }
        Integer num2 = (Integer) bmiVar.g().b(a68.e, null);
        if (num2 != null) {
            if (e() != null) {
                e().e().s();
            }
            bmiVar.g().m(n68.s0, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            w8b w8bVarG3 = bmiVar.g();
            bh0 bh0Var3 = a68.f;
            if (Objects.equals(w8bVarG3.b(bh0Var3, null), 2)) {
                bmiVar.g().m(n68.s0, 32);
            } else if (Objects.equals(bmiVar.g().b(bh0Var3, null), 3)) {
                bmiVar.g().m(n68.s0, 32);
                bmiVar.g().m(n68.t0, numValueOf);
            } else if (Objects.equals(bmiVar.g().b(bh0Var3, null), 1)) {
                bmiVar.g().m(n68.s0, 4101);
                bmiVar.g().m(n68.u0, fx5.c);
            } else if (z) {
                bmiVar.g().m(n68.s0, 35);
            } else {
                List list = (List) bmiVar.g().b(v68.C0, null);
                if (list == null || M(np0.n, list)) {
                    bmiVar.g().m(n68.s0, numValueOf);
                } else if (M(35, list)) {
                    bmiVar.g().m(n68.s0, 35);
                }
            }
        }
        return bmiVar.q();
    }

    @Override // defpackage.cli
    public final void x(int i) {
        N(i);
    }

    @Override // defpackage.cli
    public final void z() {
        i4f i4fVar = this.z;
        i4fVar.c();
        i4fVar.b();
        qhh qhhVar = this.C;
        if (qhhVar != null) {
            qhhVar.b();
        }
    }
}
