package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e1e implements p86 {
    public final p86 c;
    public final HashMap d;

    public e1e(p86 p86Var, s2e s2eVar, nf2 nf2Var, bwi bwiVar) {
        List listB;
        this.c = p86Var;
        ArrayList arrayListC = s2eVar.c(ExtraSupportedQualityQuirk.class);
        if (arrayListC.isEmpty()) {
            return;
        }
        Map map = null;
        qyj.l(null, arrayListC.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListC.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(nf2Var.g()) && !p86Var.a(4)) {
            r86 r86VarB = p86Var.b(1);
            ih0 ih0Var = (r86VarB == null || (listB = r86VarB.b()) == null) ? null : (ih0) ww3.t1(listB);
            if (ih0Var != null) {
                String str = ih0Var.b;
                bwiVar.getClass();
                awi awiVarA = bwi.a(str);
                Range rangeH = awiVarA != null ? awiVarA.h() : Range.create(0, Integer.MAX_VALUE);
                Size size = mag.d;
                int i = ih0Var.c;
                int i2 = ih0Var.h;
                int i3 = ih0Var.d;
                hh0 hh0VarE = hh0.e(r86VarB.a(), r86VarB.c(), r86VarB.d(), Collections.singletonList(new ih0(ih0Var.a, ih0Var.b, ((Number) rangeH.clamp(Integer.valueOf(qui.d(i, i2, i2, i3, i3, size.getWidth(), ih0Var.e, size.getHeight(), ih0Var.f)))).intValue(), ih0Var.d, size.getWidth(), size.getHeight(), ih0Var.g, ih0Var.h, ih0Var.i, ih0Var.j)));
                HashMap map2 = new HashMap();
                map2.put(4, hh0VarE);
                Size sizeA = ih0Var.a();
                if (size.getHeight() * size.getWidth() > sizeA.getHeight() * sizeA.getWidth()) {
                    map2.put(1, hh0VarE);
                }
                map = map2;
            }
        }
        if (map != null) {
            this.d = new HashMap(map);
        }
    }

    @Override // defpackage.p86
    public final boolean a(int i) {
        return c(i) != null;
    }

    @Override // defpackage.p86
    public final r86 b(int i) {
        return c(i);
    }

    public final r86 c(int i) {
        HashMap map = this.d;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? this.c.b(i) : (r86) map.get(Integer.valueOf(i));
    }
}
