package defpackage;

import java.util.Iterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class s18 implements Iterable, uv8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s18(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(String str) {
        for (r18 r18Var : (r18[]) this.b) {
            if (r18Var.a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x001f A[RETURN] */
    public String b(String str) {
        for (r18 r18Var : (r18[]) this.b) {
            if (r18Var.a.equalsIgnoreCase("Geo-Position")) {
                if (r18Var != null) {
                    return r18Var.b;
                }
                return null;
            }
        }
        r18Var = null;
        if (r18Var != null) {
            return r18Var.b;
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new y1(1, (r18[]) obj);
            case 1:
                return ((ohf) obj).iterator();
            default:
                return new bw((ka6) obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return c0a.o("[", a.h1((r18[]) this.b, ", ", null, null, null, 62), "]");
            default:
                return super.toString();
        }
    }
}
