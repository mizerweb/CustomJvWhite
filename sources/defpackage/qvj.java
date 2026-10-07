package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qvj {
    public final ArrayList a;

    public qvj(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final kvj b() {
        Object next;
        kzi kziVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            kvj kvjVar = (kvj) next;
            if (kvjVar.a == jvj.e && (kziVar = kvjVar.b) != null && ((String) kziVar.b).length() > 0) {
                return (kvj) next;
            }
        }
        next = null;
        return (kvj) next;
    }

    public final kzi c() {
        Object next;
        kzi kziVar;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kvj kvjVar = (kvj) next;
            jvj jvjVar = kvjVar.a;
            kzi kziVar2 = kvjVar.b;
            if ((jvjVar == jvj.c && kziVar2 != null && ((String) kziVar2.b).length() > 0) || (kvjVar.a == jvj.d && kziVar2 != null && ((String) kziVar2.b).length() > 0)) {
                break;
            }
        }
        kvj kvjVar2 = (kvj) next;
        return (kvjVar2 == null || (kziVar = kvjVar2.b) == null) ? kzi.e : kziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvj) && this.a.equals(((qvj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Widget(contents=" + this.a + ")";
    }
}
