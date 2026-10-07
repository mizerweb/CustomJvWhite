package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ekg extends sia {
    public ikg[] a;
    public Map b;

    public ekg() {
        if (ikg.g == null) {
            synchronized (ck8.b) {
                try {
                    if (ikg.g == null) {
                        ikg.g = new ikg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = ikg.g;
        this.b = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        ikg[] ikgVarArr = this.a;
        int i = 0;
        if (ikgVarArr != null && ikgVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ikg[] ikgVarArr2 = this.a;
                if (i >= ikgVarArr2.length) {
                    break;
                }
                ikg ikgVar = ikgVarArr2[i];
                if (ikgVar != null) {
                    i2 = uu3.i(1, ikgVar) + i2;
                }
                i++;
            }
            i = i2;
        }
        Map map = this.b;
        return map != null ? ck8.a(map, 2, 9, 11) + i : i;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        su3 su3Var2;
        em9 em9Var = cqk.c;
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                su3Var2 = su3Var;
                int I = sb8.I(su3Var2, 10);
                ikg[] ikgVarArr = this.a;
                int length = ikgVarArr == null ? 0 : ikgVarArr.length;
                int i = I + length;
                ikg[] ikgVarArr2 = new ikg[i];
                if (length != 0) {
                    System.arraycopy(ikgVarArr, 0, ikgVarArr2, 0, length);
                }
                while (length < i - 1) {
                    ikg ikgVar = new ikg();
                    ikgVarArr2[length] = ikgVar;
                    su3Var2.j(ikgVar);
                    su3Var2.s();
                    length++;
                }
                ikg ikgVar2 = new ikg();
                ikgVarArr2[length] = ikgVar2;
                su3Var2.j(ikgVar2);
                this.a = ikgVarArr2;
            } else if (iS == 18) {
                su3Var2 = su3Var;
                this.b = ck8.b(su3Var2, this.b, em9Var, 9, 11, new fkg(), 10, 18);
            } else {
                if (!su3Var.u(iS)) {
                    break;
                }
                su3Var2 = su3Var;
            }
            su3Var = su3Var2;
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws IOException {
        ikg[] ikgVarArr = this.a;
        if (ikgVarArr != null && ikgVarArr.length > 0) {
            int i = 0;
            while (true) {
                ikg[] ikgVarArr2 = this.a;
                if (i >= ikgVarArr2.length) {
                    break;
                }
                ikg ikgVar = ikgVarArr2[i];
                if (ikgVar != null) {
                    uu3Var.y(1, ikgVar);
                }
                i++;
            }
        }
        Map map = this.b;
        if (map != null) {
            ck8.d(uu3Var, map, 2, 9, 11);
        }
    }
}
