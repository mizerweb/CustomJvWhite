package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v13 extends kih {
    public ArrayList c;
    public int d;
    public int e;
    public long f;
    public long g;

    public v13(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.f = fkaVar.I0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = hm4.a(fkaVar);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.d = fkaVar.D0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.e = fkaVar.D0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.g = fkaVar.I0();
                        return;
                    }
                    break;
            }
        }
        fkaVar.x();
    }

    public final List h() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return ww3.T1(arrayList);
    }

    @Override // defpackage.sq0
    public final String toString() {
        int size = h().size();
        int i = this.d;
        int i2 = this.e;
        long j = this.f;
        long j2 = this.g;
        StringBuilder sbP = qv1.p("{messages=", size, ", pos=", i, ", total=");
        c0a.v(sbP, i2, ", forward=", j);
        return zo5.k(j2, ", backward=", "}", sbP);
    }
}
