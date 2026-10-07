package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nmf {
    public final Collection a;
    public final boolean b;
    public final ifh c;
    public final ifh d;
    public final ifh e;
    public final ifh f;
    public final ifh g;

    public nmf(Collection collection, boolean z) {
        this.a = collection;
        this.b = z;
        final int i = 0;
        this.c = new ifh(new af7(this) { // from class: mmf
            public final /* synthetic */ nmf b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0256  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x0256, please report this as an issue */
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                nmf nmfVar = this.b;
                switch (i2) {
                    case 0:
                        ArrayList<lmf> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (cli cliVar : nmfVar.a) {
                            arrayList.add(nmfVar.b ? cliVar.s : cliVar.t);
                            arrayList2.add(cliVar.i);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((lmf) it.next()).g.c == 5) {
                                    if (tvj.f(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return s66.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        bh0 bh0Var = v4h.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (lmf lmfVar : arrayList) {
                            if (lmfVar.g.b.a.containsKey(bh0Var) && lmfVar.b().size() != 1) {
                                if (!tvj.f(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + lmfVar.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (lmfVar.g.b.a.containsKey(bh0Var)) {
                                int i3 = 0;
                                for (lmf lmfVar2 : arrayList) {
                                    if (((cmi) arrayList3.get(i3)).L() == emi.f) {
                                        qyj.l("MeteringRepeating should contain a surface", !lmfVar2.b().isEmpty());
                                        linkedHashMap.put(lmfVar2.b().get(0), 1L);
                                    } else if (lmfVar2.g.b.a.containsKey(bh0Var) && !lmfVar2.b().isEmpty()) {
                                        linkedHashMap.put(lmfVar2.b().get(0), lmfVar2.g.b.i(bh0Var));
                                    }
                                    i3++;
                                }
                                if (tvj.f(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (tvj.f(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<cli> collection2 = nmfVar.a;
                        ArrayList<lmf> arrayList4 = new ArrayList(yw3.W0(collection2, 10));
                        for (cli cliVar2 : collection2) {
                            arrayList4.add(nmfVar.b ? cliVar2.s : cliVar2.t);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (lmf lmfVar3 : arrayList4) {
                            List<wf5> listB = lmfVar3.b();
                            hl2 hl2Var = lmfVar3.g;
                            for (wf5 wf5Var : listB) {
                                dhc dhcVar = hl2Var.b;
                                bh0 bh0Var2 = jc2.h;
                                if (!dhcVar.a.containsKey(bh0Var2) || dhcVar.i(bh0Var2) == null) {
                                    linkedHashMap2.put(wf5Var, Long.valueOf(cqk.d(wf5Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(wf5Var, dhcVar.i(bh0Var2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        kmf kmfVar = new kmf();
                        for (cli cliVar3 : nmfVar.a) {
                            kmfVar.a(nmfVar.b ? cliVar3.s : cliVar3.t);
                        }
                        return kmfVar;
                    case 3:
                        ifh ifhVar = nmfVar.e;
                        if (((kmf) ifhVar.getValue()).c()) {
                            return ((kmf) ifhVar.getValue()).b();
                        }
                        ore.k("Check failed.");
                        return null;
                    default:
                        ifh ifhVar2 = nmfVar.f;
                        if (!((kmf) nmfVar.e.getValue()).c()) {
                            ore.k("Check failed.");
                            return null;
                        }
                        ui0 ui0Var = ((lmf) ifhVar2.getValue()).b;
                        if (ui0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((lmf) ifhVar2.getValue()).b());
                            arrayList5.add(ui0Var.a);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((lmf) ifhVar2.getValue()).b();
                }
            }
        });
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: mmf
            public final /* synthetic */ nmf b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0256  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x0256, please report this as an issue */
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                nmf nmfVar = this.b;
                switch (i3) {
                    case 0:
                        ArrayList<lmf> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (cli cliVar : nmfVar.a) {
                            arrayList.add(nmfVar.b ? cliVar.s : cliVar.t);
                            arrayList2.add(cliVar.i);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((lmf) it.next()).g.c == 5) {
                                    if (tvj.f(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return s66.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        bh0 bh0Var = v4h.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (lmf lmfVar : arrayList) {
                            if (lmfVar.g.b.a.containsKey(bh0Var) && lmfVar.b().size() != 1) {
                                if (!tvj.f(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + lmfVar.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (lmfVar.g.b.a.containsKey(bh0Var)) {
                                int i4 = 0;
                                for (lmf lmfVar2 : arrayList) {
                                    if (((cmi) arrayList3.get(i4)).L() == emi.f) {
                                        qyj.l("MeteringRepeating should contain a surface", !lmfVar2.b().isEmpty());
                                        linkedHashMap.put(lmfVar2.b().get(0), 1L);
                                    } else if (lmfVar2.g.b.a.containsKey(bh0Var) && !lmfVar2.b().isEmpty()) {
                                        linkedHashMap.put(lmfVar2.b().get(0), lmfVar2.g.b.i(bh0Var));
                                    }
                                    i4++;
                                }
                                if (tvj.f(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (tvj.f(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<cli> collection2 = nmfVar.a;
                        ArrayList<lmf> arrayList4 = new ArrayList(yw3.W0(collection2, 10));
                        for (cli cliVar2 : collection2) {
                            arrayList4.add(nmfVar.b ? cliVar2.s : cliVar2.t);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (lmf lmfVar3 : arrayList4) {
                            List<wf5> listB = lmfVar3.b();
                            hl2 hl2Var = lmfVar3.g;
                            for (wf5 wf5Var : listB) {
                                dhc dhcVar = hl2Var.b;
                                bh0 bh0Var2 = jc2.h;
                                if (!dhcVar.a.containsKey(bh0Var2) || dhcVar.i(bh0Var2) == null) {
                                    linkedHashMap2.put(wf5Var, Long.valueOf(cqk.d(wf5Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(wf5Var, dhcVar.i(bh0Var2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        kmf kmfVar = new kmf();
                        for (cli cliVar3 : nmfVar.a) {
                            kmfVar.a(nmfVar.b ? cliVar3.s : cliVar3.t);
                        }
                        return kmfVar;
                    case 3:
                        ifh ifhVar = nmfVar.e;
                        if (((kmf) ifhVar.getValue()).c()) {
                            return ((kmf) ifhVar.getValue()).b();
                        }
                        ore.k("Check failed.");
                        return null;
                    default:
                        ifh ifhVar2 = nmfVar.f;
                        if (!((kmf) nmfVar.e.getValue()).c()) {
                            ore.k("Check failed.");
                            return null;
                        }
                        ui0 ui0Var = ((lmf) ifhVar2.getValue()).b;
                        if (ui0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((lmf) ifhVar2.getValue()).b());
                            arrayList5.add(ui0Var.a);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((lmf) ifhVar2.getValue()).b();
                }
            }
        });
        final int i3 = 2;
        this.e = new ifh(new af7(this) { // from class: mmf
            public final /* synthetic */ nmf b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0256  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x0256, please report this as an issue */
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                nmf nmfVar = this.b;
                switch (i4) {
                    case 0:
                        ArrayList<lmf> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (cli cliVar : nmfVar.a) {
                            arrayList.add(nmfVar.b ? cliVar.s : cliVar.t);
                            arrayList2.add(cliVar.i);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((lmf) it.next()).g.c == 5) {
                                    if (tvj.f(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return s66.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        bh0 bh0Var = v4h.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (lmf lmfVar : arrayList) {
                            if (lmfVar.g.b.a.containsKey(bh0Var) && lmfVar.b().size() != 1) {
                                if (!tvj.f(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + lmfVar.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (lmfVar.g.b.a.containsKey(bh0Var)) {
                                int i5 = 0;
                                for (lmf lmfVar2 : arrayList) {
                                    if (((cmi) arrayList3.get(i5)).L() == emi.f) {
                                        qyj.l("MeteringRepeating should contain a surface", !lmfVar2.b().isEmpty());
                                        linkedHashMap.put(lmfVar2.b().get(0), 1L);
                                    } else if (lmfVar2.g.b.a.containsKey(bh0Var) && !lmfVar2.b().isEmpty()) {
                                        linkedHashMap.put(lmfVar2.b().get(0), lmfVar2.g.b.i(bh0Var));
                                    }
                                    i5++;
                                }
                                if (tvj.f(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (tvj.f(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<cli> collection2 = nmfVar.a;
                        ArrayList<lmf> arrayList4 = new ArrayList(yw3.W0(collection2, 10));
                        for (cli cliVar2 : collection2) {
                            arrayList4.add(nmfVar.b ? cliVar2.s : cliVar2.t);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (lmf lmfVar3 : arrayList4) {
                            List<wf5> listB = lmfVar3.b();
                            hl2 hl2Var = lmfVar3.g;
                            for (wf5 wf5Var : listB) {
                                dhc dhcVar = hl2Var.b;
                                bh0 bh0Var2 = jc2.h;
                                if (!dhcVar.a.containsKey(bh0Var2) || dhcVar.i(bh0Var2) == null) {
                                    linkedHashMap2.put(wf5Var, Long.valueOf(cqk.d(wf5Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(wf5Var, dhcVar.i(bh0Var2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        kmf kmfVar = new kmf();
                        for (cli cliVar3 : nmfVar.a) {
                            kmfVar.a(nmfVar.b ? cliVar3.s : cliVar3.t);
                        }
                        return kmfVar;
                    case 3:
                        ifh ifhVar = nmfVar.e;
                        if (((kmf) ifhVar.getValue()).c()) {
                            return ((kmf) ifhVar.getValue()).b();
                        }
                        ore.k("Check failed.");
                        return null;
                    default:
                        ifh ifhVar2 = nmfVar.f;
                        if (!((kmf) nmfVar.e.getValue()).c()) {
                            ore.k("Check failed.");
                            return null;
                        }
                        ui0 ui0Var = ((lmf) ifhVar2.getValue()).b;
                        if (ui0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((lmf) ifhVar2.getValue()).b());
                            arrayList5.add(ui0Var.a);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((lmf) ifhVar2.getValue()).b();
                }
            }
        });
        final int i4 = 3;
        this.f = new ifh(new af7(this) { // from class: mmf
            public final /* synthetic */ nmf b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0256  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x0256, please report this as an issue */
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                nmf nmfVar = this.b;
                switch (i5) {
                    case 0:
                        ArrayList<lmf> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (cli cliVar : nmfVar.a) {
                            arrayList.add(nmfVar.b ? cliVar.s : cliVar.t);
                            arrayList2.add(cliVar.i);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((lmf) it.next()).g.c == 5) {
                                    if (tvj.f(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return s66.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        bh0 bh0Var = v4h.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (lmf lmfVar : arrayList) {
                            if (lmfVar.g.b.a.containsKey(bh0Var) && lmfVar.b().size() != 1) {
                                if (!tvj.f(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + lmfVar.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (lmfVar.g.b.a.containsKey(bh0Var)) {
                                int i6 = 0;
                                for (lmf lmfVar2 : arrayList) {
                                    if (((cmi) arrayList3.get(i6)).L() == emi.f) {
                                        qyj.l("MeteringRepeating should contain a surface", !lmfVar2.b().isEmpty());
                                        linkedHashMap.put(lmfVar2.b().get(0), 1L);
                                    } else if (lmfVar2.g.b.a.containsKey(bh0Var) && !lmfVar2.b().isEmpty()) {
                                        linkedHashMap.put(lmfVar2.b().get(0), lmfVar2.g.b.i(bh0Var));
                                    }
                                    i6++;
                                }
                                if (tvj.f(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (tvj.f(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<cli> collection2 = nmfVar.a;
                        ArrayList<lmf> arrayList4 = new ArrayList(yw3.W0(collection2, 10));
                        for (cli cliVar2 : collection2) {
                            arrayList4.add(nmfVar.b ? cliVar2.s : cliVar2.t);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (lmf lmfVar3 : arrayList4) {
                            List<wf5> listB = lmfVar3.b();
                            hl2 hl2Var = lmfVar3.g;
                            for (wf5 wf5Var : listB) {
                                dhc dhcVar = hl2Var.b;
                                bh0 bh0Var2 = jc2.h;
                                if (!dhcVar.a.containsKey(bh0Var2) || dhcVar.i(bh0Var2) == null) {
                                    linkedHashMap2.put(wf5Var, Long.valueOf(cqk.d(wf5Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(wf5Var, dhcVar.i(bh0Var2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        kmf kmfVar = new kmf();
                        for (cli cliVar3 : nmfVar.a) {
                            kmfVar.a(nmfVar.b ? cliVar3.s : cliVar3.t);
                        }
                        return kmfVar;
                    case 3:
                        ifh ifhVar = nmfVar.e;
                        if (((kmf) ifhVar.getValue()).c()) {
                            return ((kmf) ifhVar.getValue()).b();
                        }
                        ore.k("Check failed.");
                        return null;
                    default:
                        ifh ifhVar2 = nmfVar.f;
                        if (!((kmf) nmfVar.e.getValue()).c()) {
                            ore.k("Check failed.");
                            return null;
                        }
                        ui0 ui0Var = ((lmf) ifhVar2.getValue()).b;
                        if (ui0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((lmf) ifhVar2.getValue()).b());
                            arrayList5.add(ui0Var.a);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((lmf) ifhVar2.getValue()).b();
                }
            }
        });
        final int i5 = 4;
        this.g = new ifh(new af7(this) { // from class: mmf
            public final /* synthetic */ nmf b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0256  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x0256, please report this as an issue */
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                nmf nmfVar = this.b;
                switch (i6) {
                    case 0:
                        ArrayList<lmf> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (cli cliVar : nmfVar.a) {
                            arrayList.add(nmfVar.b ? cliVar.s : cliVar.t);
                            arrayList2.add(cliVar.i);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((lmf) it.next()).g.c == 5) {
                                    if (tvj.f(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return s66.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        bh0 bh0Var = v4h.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (lmf lmfVar : arrayList) {
                            if (lmfVar.g.b.a.containsKey(bh0Var) && lmfVar.b().size() != 1) {
                                if (!tvj.f(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + lmfVar.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (lmfVar.g.b.a.containsKey(bh0Var)) {
                                int i7 = 0;
                                for (lmf lmfVar2 : arrayList) {
                                    if (((cmi) arrayList3.get(i7)).L() == emi.f) {
                                        qyj.l("MeteringRepeating should contain a surface", !lmfVar2.b().isEmpty());
                                        linkedHashMap.put(lmfVar2.b().get(0), 1L);
                                    } else if (lmfVar2.g.b.a.containsKey(bh0Var) && !lmfVar2.b().isEmpty()) {
                                        linkedHashMap.put(lmfVar2.b().get(0), lmfVar2.g.b.i(bh0Var));
                                    }
                                    i7++;
                                }
                                if (tvj.f(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (tvj.f(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<cli> collection2 = nmfVar.a;
                        ArrayList<lmf> arrayList4 = new ArrayList(yw3.W0(collection2, 10));
                        for (cli cliVar2 : collection2) {
                            arrayList4.add(nmfVar.b ? cliVar2.s : cliVar2.t);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (lmf lmfVar3 : arrayList4) {
                            List<wf5> listB = lmfVar3.b();
                            hl2 hl2Var = lmfVar3.g;
                            for (wf5 wf5Var : listB) {
                                dhc dhcVar = hl2Var.b;
                                bh0 bh0Var2 = jc2.h;
                                if (!dhcVar.a.containsKey(bh0Var2) || dhcVar.i(bh0Var2) == null) {
                                    linkedHashMap2.put(wf5Var, Long.valueOf(cqk.d(wf5Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(wf5Var, dhcVar.i(bh0Var2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        kmf kmfVar = new kmf();
                        for (cli cliVar3 : nmfVar.a) {
                            kmfVar.a(nmfVar.b ? cliVar3.s : cliVar3.t);
                        }
                        return kmfVar;
                    case 3:
                        ifh ifhVar = nmfVar.e;
                        if (((kmf) ifhVar.getValue()).c()) {
                            return ((kmf) ifhVar.getValue()).b();
                        }
                        ore.k("Check failed.");
                        return null;
                    default:
                        ifh ifhVar2 = nmfVar.f;
                        if (!((kmf) nmfVar.e.getValue()).c()) {
                            ore.k("Check failed.");
                            return null;
                        }
                        ui0 ui0Var = ((lmf) ifhVar2.getValue()).b;
                        if (ui0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((lmf) ifhVar2.getValue()).b());
                            arrayList5.add(ui0Var.a);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((lmf) ifhVar2.getValue()).b();
                }
            }
        });
    }

    public final void a(wf5 wf5Var) {
        lq4 lq4Var;
        Object next;
        cli cliVar;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Unavailable " + wf5Var + ", notify SessionConfig invalid");
        }
        Iterator it = this.a.iterator();
        do {
            lq4Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                cliVar = (cli) next;
            }
        } while (!(this.b ? cliVar.s : cliVar.t).b().contains(wf5Var));
        cli cliVar2 = (cli) next;
        lmf lmfVar = cliVar2 != null ? cliVar2.s : null;
        ao5 ao5Var = ao5.a;
        yab.i0(cqk.a(rk9.a.S0()), null, 0, new c37(lmfVar, lq4Var, 29), 3);
    }
}
