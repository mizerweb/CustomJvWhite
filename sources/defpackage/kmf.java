package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kmf extends gmf {
    public final sc8 j = new sc8();
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(lmf lmfVar) {
        hl2 hl2Var = lmfVar.g;
        int i = hl2Var.c;
        dhc dhcVar = hl2Var.b;
        j28 j28Var = this.b;
        if (i != -1) {
            this.m = true;
            int i2 = j28Var.b;
            List list = lmf.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            j28Var.b = i;
        }
        Range rangeA = hl2Var.a();
        Range range = yi0.h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb = this.l;
        if (!zEquals) {
            w8b w8bVar = (w8b) j28Var.d;
            bh0 bh0Var = hl2.h;
            boolean zEquals2 = ((Range) w8bVar.b(bh0Var, range)).equals(range);
            w8b w8bVar2 = (w8b) j28Var.d;
            if (zEquals2) {
                w8bVar2.m(bh0Var, rangeA);
            } else if (!((Range) w8bVar2.b(bh0Var, range)).equals(rangeA)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((w8b) j28Var.d).b(bh0Var, range)) + ", new = " + rangeA;
                tvj.c("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        bh0 bh0Var2 = cmi.h1;
        Integer num = (Integer) dhcVar.b(bh0Var2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            j28Var.getClass();
            if (iIntValue != 0) {
                ((w8b) j28Var.d).m(bh0Var2, num);
            }
        }
        bh0 bh0Var3 = cmi.i1;
        Integer num2 = (Integer) dhcVar.b(bh0Var3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0) {
            j28Var.getClass();
            if (iIntValue2 != 0) {
                ((w8b) j28Var.d).m(bh0Var3, num2);
            }
        }
        ghh ghhVar = hl2Var.e;
        g9b g9bVar = (g9b) j28Var.f;
        HashSet hashSet = (HashSet) j28Var.c;
        g9bVar.a.putAll((Map) ghhVar.a);
        this.c.addAll(lmfVar.c);
        this.d.addAll(lmfVar.d);
        j28Var.m(hl2Var.d);
        this.e.addAll(lmfVar.e);
        jmf jmfVar = lmfVar.f;
        if (jmfVar != null) {
            this.n.add(jmfVar);
        }
        InputConfiguration inputConfiguration = lmfVar.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = lmfVar.a;
        LinkedHashSet<ui0> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(hl2Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (ui0 ui0Var : linkedHashSet) {
            arrayList2.add(ui0Var.a);
            Iterator it = ui0Var.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((wf5) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            tvj.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = lmfVar.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            tvj.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        ui0 ui0Var2 = lmfVar.b;
        if (ui0Var2 != null) {
            ui0 ui0Var3 = this.i;
            if (ui0Var3 == ui0Var2 || ui0Var3 == null) {
                this.i = ui0Var2;
            } else {
                tvj.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        j28Var.o(dhcVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[EDGE_INSN: B:38:0x00a2->B:39:0x00d3 BREAK  A[LOOP:0: B:16:0x0036->B:48:?]] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a2, please report this as an issue */
    public final lmf b() {
        bh0 bh0Var;
        Range range;
        if (!this.k) {
            ore.p("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.a);
        sc8 sc8Var = this.j;
        if (sc8Var.b) {
            Collections.sort(arrayList, new z70(7, sc8Var));
        }
        int i = this.h;
        j28 j28Var = this.b;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (cqk.d(((ui0) it.next()).a.j, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) j28Var.c;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                w8b w8bVar = (w8b) j28Var.d;
                                bh0Var = hl2.h;
                                range = (Range) w8bVar.b(bh0Var, yi0.h);
                                if (range != null) {
                                    break;
                                }
                                if (((Number) range.getUpper()).intValue() >= 120) {
                                    range = null;
                                } else {
                                    range = null;
                                }
                                if (range != null) {
                                    break;
                                }
                                Range range2 = new Range(30, range.getUpper());
                                tvj.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                ((w8b) j28Var.d).m(bh0Var, range2);
                                break;
                            }
                            if (cqk.d(((wf5) it2.next()).j, MediaCodec.class)) {
                                break;
                            }
                        }
                    } else {
                        w8b w8bVar2 = (w8b) j28Var.d;
                        bh0Var = hl2.h;
                        range = (Range) w8bVar2.b(bh0Var, yi0.h);
                        if (range != null) {
                            break;
                        }
                        if (((Number) range.getUpper()).intValue() >= 120 || !cqk.d(range.getLower(), range.getUpper())) {
                            range = null;
                        }
                        if (range != null) {
                            break;
                        }
                        Range range3 = new Range(30, range.getUpper());
                        tvj.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range3);
                        ((w8b) j28Var.d).m(bh0Var, range3);
                        break;
                    }
                }
            }
        }
        return new lmf(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), j28Var.q(), this.n.isEmpty() ? null : new v58(2, this), this.g, this.h, this.i);
    }

    public final boolean c() {
        return this.m && this.k;
    }
}
