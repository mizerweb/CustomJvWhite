package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fh2 {
    public static final fh2 b;
    public static final fh2 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new b09(0));
        b = new fh2(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new b09(1));
        c = new fh2(linkedHashSet2);
    }

    public fh2(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((re2) it.next()).a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (re2 re2Var : this.a) {
            if (re2Var instanceof b09) {
                Integer numValueOf = Integer.valueOf(((b09) re2Var).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    ore.k("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final pf2 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((pf2) it.next()).a());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            pf2 pf2Var = (pf2) it2.next();
            if (listA.contains(pf2Var.a())) {
                linkedHashSet2.add(pf2Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (pf2) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            nf2 nf2VarJ = ((pf2) it4.next()).j();
            sb.append(" Id:" + nf2VarJ.g() + "  Lens:" + nf2VarJ.j());
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        LinkedHashSet<re2> linkedHashSet3 = this.a;
        sb2.append("PhyId:null  Filters:" + linkedHashSet3.size());
        for (re2 re2Var : linkedHashSet3) {
            sb2.append(" Id:");
            re2Var.getClass();
            sb2.append(re2.a);
            if (re2Var instanceof b09) {
                sb2.append(" LensFilter:");
                sb2.append(((b09) re2Var).b);
            }
        }
        ore.p(qv1.l("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }
}
