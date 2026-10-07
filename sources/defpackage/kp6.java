package defpackage;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kp6 {
    public static final /* synthetic */ int c = 0;
    public final hbg a = new hbg(16);
    public boolean b;

    static {
        new kp6(0);
    }

    public kp6(int i) {
        a();
        a();
    }

    public static void b(vu3 vu3Var, rxj rxjVar, int i, Object obj) throws IOException {
        if (rxjVar == rxj.d) {
            vu3Var.G(i, 3);
            ((a) obj).c(vu3Var);
            vu3Var.G(i, 4);
        }
        vu3Var.G(i, rxjVar.b);
        switch (rxjVar.ordinal()) {
            case 0:
                vu3Var.z(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                vu3Var.x(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                vu3Var.K(((Long) obj).longValue());
                break;
            case 3:
                vu3Var.K(((Long) obj).longValue());
                break;
            case 4:
                vu3Var.B(((Integer) obj).intValue());
                break;
            case 5:
                vu3Var.z(((Long) obj).longValue());
                break;
            case 6:
                vu3Var.x(((Integer) obj).intValue());
                break;
            case 7:
                vu3Var.r(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof c71)) {
                    vu3Var.F((String) obj);
                } else {
                    vu3Var.v((c71) obj);
                }
                break;
            case 9:
                ((a) obj).c(vu3Var);
                break;
            case 10:
                a aVar = (a) obj;
                vu3Var.I(aVar.a());
                aVar.c(vu3Var);
                break;
            case 11:
                if (!(obj instanceof c71)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    vu3Var.I(length);
                    vu3Var.s(bArr, 0, length);
                } else {
                    vu3Var.v((c71) obj);
                }
                break;
            case 12:
                vu3Var.I(((Integer) obj).intValue());
                break;
            case 13:
                vu3Var.B(((Integer) obj).intValue());
                break;
            case 14:
                vu3Var.x(((Integer) obj).intValue());
                break;
            case 15:
                vu3Var.z(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                vu3Var.I((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                vu3Var.K((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        hbg hbgVar = this.a;
        if (!hbgVar.d) {
            if (hbgVar.b.size() > 0) {
                hbgVar.c(0).getKey().getClass();
                ore.m();
                return;
            } else {
                Iterator it = hbgVar.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    ore.m();
                    return;
                }
            }
        }
        if (!hbgVar.d) {
            hbgVar.c = hbgVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hbgVar.c);
            hbgVar.f = hbgVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hbgVar.f);
            hbgVar.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        kp6 kp6Var = new kp6();
        hbg hbgVar = this.a;
        if (hbgVar.b.size() > 0) {
            Map.Entry entryC = hbgVar.c(0);
            if (entryC.getKey() != null) {
                ore.m();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = hbgVar.d().iterator();
        if (!it.hasNext()) {
            return kp6Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ore.m();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kp6) {
            return this.a.equals(((kp6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kp6() {
    }
}
