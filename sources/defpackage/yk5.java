package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yk5 {
    public static final String a = n1g.Z("DiagnosticsWrkr");

    public static final String a(czj czjVar, szj szjVar, ufh ufhVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mzj mzjVar = (mzj) it.next();
            iyj iyjVarN = wk8.n(mzjVar);
            String str = mzjVar.a;
            tfh tfhVar = (tfh) ch3.G(ufhVar.a, true, false, new yqe(iyjVarN.a, iyjVarN.b, 1));
            Integer numValueOf = tfhVar != null ? Integer.valueOf(tfhVar.c) : null;
            String strZ1 = ww3.z1((List) ch3.G(czjVar.a, true, false, new qo1(str, 19)), ",", null, null, null, 62);
            String strZ2 = ww3.z1((List) ch3.G(szjVar.a, true, false, new rh5(str, 15)), ",", null, null, null, 62);
            StringBuilder sbV = qt4.v("\n", str, "\t ");
            sbV.append(mzjVar.c);
            sbV.append("\t ");
            sbV.append(numValueOf);
            sbV.append("\t ");
            sbV.append(mzjVar.b.name());
            sbV.append("\t ");
            sbV.append(strZ1);
            sbV.append("\t ");
            sbV.append(strZ2);
            sbV.append('\t');
            sb.append(sbV.toString());
        }
        return sb.toString();
    }
}
