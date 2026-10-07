package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class vn0 implements p86 {
    public final /* synthetic */ int c = 1;
    public final HashMap d = new HashMap();
    public final p86 e;
    public final Object f;

    public vn0(p86 p86Var, fx5 fx5Var) {
        this.e = p86Var;
        this.f = fx5Var;
    }

    @Override // defpackage.p86
    public final boolean a(int i) {
        switch (this.c) {
            case 0:
                return ((vn0) this.e).a(i) && c(i) != null;
            case 1:
                return this.e.a(i) && d(i) != null;
            default:
                return this.e.a(i) && e(i) != null;
        }
    }

    @Override // defpackage.p86
    public final r86 b(int i) {
        switch (this.c) {
            case 0:
                return c(i);
            case 1:
                return d(i);
            default:
                return e(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, r86] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    public r86 c(int i) {
        ih0 ih0Var;
        ih0 ih0Var2;
        int i2;
        ih0 ih0Var3;
        ?? E;
        vn0 vn0Var = (vn0) this.e;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            return (r86) map.get(Integer.valueOf(i));
        }
        if (!vn0Var.a(i)) {
            return null;
        }
        r86 r86VarE = vn0Var.e(i);
        if (r86VarE == null) {
            E = 0;
        } else {
            ArrayList arrayList = new ArrayList(r86VarE.b());
            Iterator it = r86VarE.b().iterator();
            do {
                if (!it.hasNext()) {
                    ih0Var = null;
                    break;
                }
                ih0Var = (ih0) it.next();
            } while (ih0Var.j != 0);
            if (ih0Var == null) {
                ih0Var3 = null;
                ih0Var2 = null;
            } else {
                int i3 = ih0Var.a;
                String str = ih0Var.b;
                int i4 = ih0Var.g;
                if (1 != ih0Var.j) {
                    i3 = 5;
                    str = "video/hevc";
                    i4 = 2;
                }
                int i5 = i3;
                String str2 = str;
                int i6 = i4;
                int i7 = ih0Var.c;
                int i8 = ih0Var.h;
                if (10 == i8) {
                    i2 = i7;
                    ih0Var2 = null;
                } else {
                    int iDoubleValue = (int) (((double) i7) * new Rational(10, i8).doubleValue());
                    if (tvj.f(3, "BackupHdrProfileEncoderProfilesProvider")) {
                        ih0Var2 = null;
                        tvj.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i7), 10, Integer.valueOf(i8), Integer.valueOf(iDoubleValue)));
                    } else {
                        ih0Var2 = null;
                    }
                    i2 = iDoubleValue;
                }
                ih0Var3 = new ih0(i5, str2, i2, ih0Var.d, ih0Var.e, ih0Var.f, i6, 10, ih0Var.i, 1);
            }
            bwi bwiVar = (bwi) this.f;
            if (ih0Var3 == null) {
                ih0Var3 = ih0Var2;
            } else {
                String str3 = ih0Var3.b;
                bwiVar.getClass();
                awi awiVarA = bwi.a(str3);
                if (awiVarA == null || !awiVarA.f(ih0Var3.e, ih0Var3.f)) {
                    ih0Var3 = ih0Var2;
                } else {
                    int i9 = ih0Var3.c;
                    int iIntValue = ((Integer) awiVarA.h().clamp(Integer.valueOf(i9))).intValue();
                    if (iIntValue != i9) {
                        ih0Var3 = new ih0(ih0Var3.a, ih0Var3.b, iIntValue, ih0Var3.d, ih0Var3.e, ih0Var3.f, ih0Var3.g, ih0Var3.h, ih0Var3.i, ih0Var3.j);
                    }
                }
            }
            if (ih0Var3 != null) {
                arrayList.add(ih0Var3);
            }
            E = arrayList.isEmpty() ? ih0Var2 : hh0.e(r86VarE.a(), r86VarE.c(), r86VarE.d(), arrayList);
        }
        map.put(Integer.valueOf(i), E);
        return E;
    }

    public r86 d(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            return (r86) map.get(Integer.valueOf(i));
        }
        p86 p86Var = this.e;
        hh0 hh0VarE = null;
        if (p86Var.a(i)) {
            r86 r86VarB = p86Var.b(i);
            fx5 fx5Var = (fx5) this.f;
            if (r86VarB != null) {
                ArrayList arrayList = new ArrayList();
                for (ih0 ih0Var : r86VarB.b()) {
                    if (nx5.a(ih0Var, fx5Var)) {
                        arrayList.add(ih0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    hh0VarE = hh0.e(r86VarB.a(), r86VarB.c(), r86VarB.d(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), hh0VarE);
        }
        return hh0VarE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    public r86 e(int i) {
        r86 r86VarE;
        Size size;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            return (r86) map.get(Integer.valueOf(i));
        }
        p86 p86Var = this.e;
        if (p86Var.a(i)) {
            r86 r86VarB = p86Var.b(i);
            Objects.requireNonNull(r86VarB);
            Iterator it = ((s2e) this.f).c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                        if (i == 4) {
                            size = new Size(640, 480);
                            break;
                        }
                        if (i == 5) {
                            size = new Size(960, 720);
                            break;
                        }
                        if (i == 6) {
                            size = new Size(1440, 1080);
                            break;
                        }
                        break;
                    }
                }
                size = null;
                break;
            }
            if (size == null) {
                r86VarE = r86VarB;
            } else {
                ArrayList arrayList = new ArrayList();
                for (ih0 ih0Var : r86VarB.b()) {
                    arrayList.add(new ih0(ih0Var.a, ih0Var.b, ih0Var.c, ih0Var.d, size.getWidth(), size.getHeight(), ih0Var.g, ih0Var.h, ih0Var.i, ih0Var.j));
                }
                if (arrayList.isEmpty()) {
                    r86VarE = null;
                } else {
                    r86VarE = hh0.e(r86VarB.a(), r86VarB.c(), r86VarB.d(), arrayList);
                }
            }
        } else {
            r86VarE = null;
        }
        map.put(Integer.valueOf(i), r86VarE);
        return r86VarE;
    }

    public vn0(p86 p86Var, s2e s2eVar) {
        this.e = p86Var;
        this.f = s2eVar;
    }

    public vn0(vn0 vn0Var, bwi bwiVar) {
        this.e = vn0Var;
        this.f = bwiVar;
    }
}
