package defpackage;

import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class na5 implements p86 {
    public final nf2 c;
    public final List d;
    public final bwi e;
    public final ifh f = new ifh(new pe3(27, this));
    public final LinkedHashMap g = new LinkedHashMap();

    public na5(nf2 nf2Var, List list, bwi bwiVar) {
        this.c = nf2Var;
        this.d = list;
        this.e = bwiVar;
    }

    public static ih0 c(na5 na5Var, int i, int i2, int i3) {
        return new ih0(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    @Override // defpackage.p86
    public final boolean a(int i) {
        return d(i) != null;
    }

    @Override // defpackage.p86
    public final r86 b(int i) {
        return d(i);
    }

    public final r86 d(int i) {
        int i2;
        Object next;
        int i3;
        ih0 ih0VarC;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.g;
        if (linkedHashMap.containsKey(numValueOf)) {
            return (r86) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                i2 = i;
                next = null;
                break;
            }
            next = it.next();
            i2 = i;
        } while (((pi0) next).a != i2);
        pi0 pi0Var = next instanceof pi0 ? (pi0) next : null;
        if (pi0Var != null) {
            Iterator it2 = pi0Var.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    ih0VarC = null;
                    break;
                }
                Size size = (Size) it2.next();
                if (((List) this.f.getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (pi0Var.equals(pi0.h)) {
                        i3 = 40000000;
                    } else if (pi0Var.equals(pi0.g)) {
                        i3 = 10000000;
                    } else if (pi0Var.equals(pi0.f)) {
                        i3 = 4000000;
                    } else {
                        if (!pi0Var.equals(pi0.e)) {
                            qr7.y(pi0Var, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i3 = 2000000;
                    }
                    ih0VarC = c(this, width, height, i3);
                    this.e.getClass();
                    awi awiVarA = bwi.a("video/avc");
                    if (awiVarA != null && awiVarA.f(width, height)) {
                        Integer num = (Integer) awiVarA.h().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            ih0VarC = c(this, width, height, num.intValue());
                        }
                    } else {
                        ih0VarC = null;
                    }
                    if (ih0VarC != null) {
                        break;
                    }
                }
            }
        } else {
            ih0VarC = null;
            break;
        }
        hh0 hh0VarE = ih0VarC != null ? hh0.e(60, 2, Collections.singletonList(new gh0(3, 96000, 44100, 1, 2, "audio/mp4a-latm")), Collections.singletonList(ih0VarC)) : null;
        linkedHashMap.put(Integer.valueOf(i2), hh0VarE);
        return hh0VarE;
    }
}
