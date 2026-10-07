package defpackage;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class al2 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new x44(false));
    public final mj0 c;
    public final mj0 d;

    public al2(vn0 vn0Var, int i) {
        pi0 pi0Var = pi0.e;
        Iterator it = new ArrayList(pi0.m).iterator();
        while (true) {
            mj0 mj0Var = null;
            if (!it.hasNext()) {
                break;
            }
            pi0 pi0Var2 = (pi0) it.next();
            qyj.l("Currently only support ConstantQuality", pi0Var2 instanceof pi0);
            r86 r86VarD = vn0Var.d(pi0Var2.a(i));
            if (r86VarD != null) {
                tvj.a("CapabilitiesByQuality", "profiles = " + r86VarD);
                if (!r86VarD.b().isEmpty()) {
                    int iA = r86VarD.a();
                    int iC = r86VarD.c();
                    List listD = r86VarD.d();
                    List listB = r86VarD.b();
                    qyj.h("Should contain at least one VideoProfile.", !listB.isEmpty());
                    mj0Var = new mj0(iA, iC, Collections.unmodifiableList(new ArrayList(listD)), Collections.unmodifiableList(new ArrayList(listB)), listD.isEmpty() ? null : (gh0) listD.get(0), (ih0) listB.get(0));
                }
                if (mj0Var == null) {
                    tvj.g("CapabilitiesByQuality", "EncoderProfiles of quality " + pi0Var2 + " has no video validated profiles.");
                } else {
                    this.b.put(mj0Var.f.a(), pi0Var2);
                    this.a.put(pi0Var2, mj0Var);
                }
            }
        }
        if (this.a.isEmpty()) {
            tvj.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (mj0) arrayDeque.peekFirst();
            this.d = (mj0) arrayDeque.peekLast();
        }
    }

    public final mj0 a(Size size) {
        Object value;
        Size size2 = mag.a;
        TreeMap treeMap = this.b;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        pi0 pi0Var = (pi0) value;
        if (pi0Var == null) {
            pi0Var = pi0.k;
        }
        tvj.a("CapabilitiesByQuality", "Using supported quality of " + pi0Var + " for size " + size);
        if (pi0Var != pi0.k) {
            mj0 mj0VarB = b(pi0Var);
            if (mj0VarB != null) {
                return mj0VarB;
            }
            c.e("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }

    public final mj0 b(pi0 pi0Var) {
        qyj.h("Unknown quality: " + pi0Var, pi0.l.contains(pi0Var));
        if (pi0Var == pi0.j) {
            return this.c;
        }
        return pi0Var == pi0.i ? this.d : (mj0) this.a.get(pi0Var);
    }
}
