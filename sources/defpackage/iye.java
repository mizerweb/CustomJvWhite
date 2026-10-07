package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class iye implements Iterable {
    public eye a;
    public eye b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public eye a(Object obj) {
        eye eyeVar = this.a;
        while (eyeVar != null && !eyeVar.a.equals(obj)) {
            eyeVar = eyeVar.c;
        }
        return eyeVar;
    }

    public Object b(Object obj) {
        eye eyeVarA = a(obj);
        if (eyeVarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((hye) it.next()).a(eyeVarA);
            }
        }
        eye eyeVar = eyeVarA.d;
        eye eyeVar2 = eyeVarA.c;
        if (eyeVar != null) {
            eyeVar.c = eyeVar2;
        } else {
            this.a = eyeVar2;
        }
        eye eyeVar3 = eyeVarA.c;
        if (eyeVar3 != null) {
            eyeVar3.d = eyeVar;
        } else {
            this.b = eyeVar;
        }
        eyeVarA.c = null;
        eyeVarA.d = null;
        return eyeVarA.b;
    }

    public final boolean equals(Object obj) {
        gye gyeVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iye)) {
            return false;
        }
        iye iyeVar = (iye) obj;
        if (this.d != iyeVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = iyeVar.iterator();
        while (true) {
            gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                break;
            }
            gye gyeVar2 = (gye) it2;
            if (!gyeVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) gyeVar.next();
            Object next = gyeVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (gyeVar.hasNext() || ((gye) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            gye gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) gyeVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        cye cyeVar = new cye(this.a, this.b);
        this.c.put(cyeVar, Boolean.FALSE);
        return cyeVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            gye gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) gyeVar.next()).toString());
            if (gyeVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
