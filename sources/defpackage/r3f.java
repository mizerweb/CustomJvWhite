package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import scout.exception.ElementCreationFailedException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* JADX INFO: loaded from: classes.dex */
public final class r3f {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final h5 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final int l;

    public r3f(String str, ArrayList arrayList, HashMap map, HashMap map2, HashMap map3, HashSet hashSet) {
        List listUnmodifiableList;
        this.a = str;
        this.b = arrayList;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = hashSet;
        this.g = gm0.j ? new zl5(this) : new s4i(this);
        boolean zIsEmpty = arrayList.isEmpty();
        List listUnmodifiableList2 = r66.a;
        if (zIsEmpty) {
            listUnmodifiableList = listUnmodifiableList2;
        } else {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (int iO0 = xw3.O0(arrayList); iO0 >= 0; iO0--) {
                r3f r3fVar = (r3f) arrayList.get(iO0);
                if (hashSet2.add(r3fVar)) {
                    arrayList2.add(r3fVar);
                }
                for (r3f r3fVar2 : r3fVar.h) {
                    if (hashSet2.add(r3fVar2)) {
                        arrayList2.add(r3fVar2);
                    }
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.h = listUnmodifiableList;
        List<r3f> list = this.b;
        if (!list.isEmpty()) {
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (r3f r3fVar3 : list) {
                for (r3f r3fVar4 : r3fVar3.i) {
                    if (hashSet3.add(r3fVar4)) {
                        arrayList3.add(r3fVar4);
                    }
                }
                if (hashSet3.add(r3fVar3)) {
                    arrayList3.add(r3fVar3);
                }
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList3);
        }
        this.i = listUnmodifiableList2;
        List list2 = this.h;
        this.j = list2;
        this.k = listUnmodifiableList2;
        this.l = list2.size();
    }

    public static final void a(StringBuilder sb, r3f r3fVar, int i) {
        sb.append('\n');
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("   ");
        }
        sb.append("⌞ " + r3fVar + " (object factories: " + r3fVar.c.size() + ", collection factories: " + r3fVar.d.size() + ", association factories: " + r3fVar.e.size() + ", allowed object overrides: " + r3fVar.f.size() + ')');
        Iterator it = r3fVar.j.iterator();
        while (it.hasNext()) {
            a(sb, (r3f) it.next(), i2);
        }
    }

    public final ArrayList b(int i) {
        List list;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            list = r66.a;
            if (i2 >= this.l) {
                break;
            }
            r3f r3fVar = (r3f) this.k.get(i2);
            List list2 = (List) r3fVar.d.get(Integer.valueOf(i));
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    arrayList.add(((si8) list.get(i3)).a(r3fVar.g));
                } catch (Exception e) {
                    throw new ElementCreationFailedException(i, this, e);
                }
            }
            i2++;
        }
        List list3 = (List) this.d.get(Integer.valueOf(i));
        if (list3 != null) {
            list = list3;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            try {
                arrayList.add(((si8) list.get(i4)).a(this.g));
            } catch (Exception e2) {
                throw new ElementCreationFailedException(i, this, e2);
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    public final Object c(int i, boolean z) {
        si8 si8Var = (si8) this.c.get(Integer.valueOf(i));
        if (si8Var != null) {
            try {
                Object objA = si8Var.a(this.g);
                if (objA == null && z) {
                    throw new ObjectNullabilityException(i, this);
                }
                return objA;
            } catch (Exception e) {
                throw new ObjectCreationFailedException(i, this, e);
            }
        }
        for (int i2 = 0; i2 < this.l; i2++) {
            r3f r3fVar = (r3f) this.j.get(i2);
            si8 si8Var2 = (si8) r3fVar.c.get(Integer.valueOf(i));
            if (si8Var2 != null) {
                try {
                    Object objA2 = si8Var2.a(r3fVar.g);
                    if (objA2 == null && z) {
                        throw new ObjectNullabilityException(i, this);
                    }
                    return objA2;
                } catch (Exception e2) {
                    throw new ObjectCreationFailedException(i, this, e2);
                }
            }
        }
        if (z) {
            throw new MissingObjectFactoryException(i, this);
        }
        return null;
    }

    public final String toString() {
        return xol.a(this.a);
    }
}
