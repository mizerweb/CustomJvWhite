package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ie6 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ie6(int i) {
        this.a = i;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                ue6[] ue6VarArr = le6.c;
                return i < 4;
            default:
                int i2 = this.b;
                ue6[] ue6VarArr2 = le6.c;
                return i2 < 4;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                for (ue6 ue6Var : le6.d[this.b]) {
                    map.put(ue6Var.b, ue6Var);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
