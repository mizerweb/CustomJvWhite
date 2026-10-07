package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vhl {
    public static zc2 a(zc2... zc2VarArr) {
        List listAsList = Arrays.asList(zc2VarArr);
        if (listAsList.isEmpty()) {
            return new bd2();
        }
        return listAsList.size() == 1 ? (zc2) listAsList.get(0) : new ad2(listAsList);
    }

    public static final int b(fif fifVar, fif[] fifVarArr) {
        int iHashCode = (fifVar.i().hashCode() * 31) + Arrays.hashCode(fifVarArr);
        int iE = fifVar.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strI = fifVar.h(fifVar.e() - iE).i();
            if (strI != null) {
                iHashCode2 = strI.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = fifVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            lvb lvbVarD = fifVar.h(fifVar.e() - iE2).d();
            iHashCode3 = i5 + (lvbVarD != null ? lvbVarD.hashCode() : 0);
            iE2 = i4;
        }
    }
}
