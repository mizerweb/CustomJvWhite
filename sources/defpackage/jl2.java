package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jl2 {
    public final hmi a;
    public final a2k b;
    public final omi c;
    public final plh d;
    public final boolean e;

    public jl2(kg2 kg2Var, hmi hmiVar, a2k a2kVar, omi omiVar, plh plhVar) {
        this.a = hmiVar;
        this.b = a2kVar;
        this.c = omiVar;
        this.d = plhVar;
        ag2 ag2Var = bg2.U;
        bg2 bg2Var = kg2Var.b;
        ag2Var.getClass();
        this.e = ag2.b(bg2Var);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final fle a(hl2 hl2Var, int i, t94 t94Var, List list) {
        di8 di8Var;
        l78 l78VarF;
        il2 il2Var;
        int i2 = hl2Var.c;
        List listUnmodifiableList = Collections.unmodifiableList(hl2Var.a);
        Object di8Var2 = null;
        if (listUnmodifiableList.isEmpty()) {
            qr7.r(hl2Var, "Attempted to issue a capture without surfaces using ");
            return null;
        }
        List<wf5> list2 = listUnmodifiableList;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (wf5 wf5Var : list2) {
            Object obj = ((Map) this.a.f.getValue()).get(wf5Var);
            if (obj == null) {
                qr7.r(wf5Var, "Attempted to issue a capture with an unrecognized surface: ");
                return null;
            }
            arrayList.add(new j4h(((j4h) obj).a));
        }
        yc2 yc2Var = new yc2();
        Iterator it = hl2Var.d.iterator();
        while (it.hasNext()) {
            yc2Var.a((zc2) it.next(), this.c.e);
        }
        dhc dhcVar = hl2Var.b;
        TreeMap treeMap = dhcVar.a;
        w8b w8bVarE = w8b.e();
        for (bh0 bh0Var : t94Var.c()) {
            w8bVarE.l(bh0Var, t94Var.g(bh0Var), t94Var.i(bh0Var));
        }
        for (bh0 bh0Var2 : dhcVar.c()) {
            w8bVarE.l(bh0Var2, dhcVar.g(bh0Var2), dhcVar.i(bh0Var2));
        }
        bh0 bh0Var3 = hl2.f;
        if (treeMap.containsKey(bh0Var3)) {
            w8bVarE.m(shl.a(CaptureRequest.JPEG_ORIENTATION), dhcVar.i(bh0Var3));
        }
        bh0 bh0Var4 = hl2.g;
        if (treeMap.containsKey(bh0Var4)) {
            w8bVarE.m(shl.a(CaptureRequest.JPEG_QUALITY), Byte.valueOf((byte) ((Number) dhcVar.i(bh0Var4)).intValue()));
        }
        if (i2 == 5) {
            a2k a2kVar = this.b;
            if (a2kVar.c() || a2kVar.h() || (l78VarF = a2kVar.f()) == null) {
                di8Var = 0;
            } else {
                m68 imageInfo = l78VarF.getImageInfo();
                gd2 gd2Var = imageInfo instanceof hd2 ? ((hd2) imageInfo).a : null;
                if (gd2Var == null) {
                    il2Var = null;
                } else {
                    if (!(gd2Var instanceof sm2)) {
                        qr7.r(gd2Var.getClass(), "Unexpected capture result type: ");
                        return null;
                    }
                    Image imageH0 = l78VarF.H0();
                    if (imageH0 == null) {
                        ore.k("Required value was null.");
                        return null;
                    }
                    zg zgVar = new zg(imageH0);
                    Object objW = ((sm2) gd2Var).W(zfe.a(pc7.class));
                    if (objW == null) {
                        ore.k("Required value was null.");
                        return null;
                    }
                    di8Var2 = new di8(zgVar, (pc7) objW);
                    il2Var = new il2(new AtomicReference(l78VarF));
                }
                di8Var = di8Var2;
                di8Var2 = il2Var;
            }
        } else {
            di8Var = 0;
        }
        if (di8Var == 0) {
            int i3 = (i != 3 || this.e) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
            if (i3 != -1) {
                i2 = i3;
            }
        }
        LinkedHashMap linkedHashMapT0 = wm9.T0(this.d.b(new pme(i2)), shl.c(new jc2(dhc.a(w8bVarE))));
        c79 c79VarW = yab.w();
        c79VarW.add(yc2Var);
        if (di8Var2 != null) {
            c79VarW.add(di8Var2);
        }
        c79VarW.addAll(list);
        return new fle(arrayList, linkedHashMapT0, Collections.singletonMap(ihh.a, hl2Var.e), yab.j(c79VarW), new pme(i2), di8Var);
    }
}
