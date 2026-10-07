package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r5e {
    public final rre a;

    public r5e(rre rreVar) {
        this.a = rreVar;
    }

    public final void a(qxe qxeVar, mw mwVar) {
        iw iwVar = (iw) mwVar.keySet();
        mw mwVar2 = iwVar.a;
        if (mwVar2.isEmpty()) {
            return;
        }
        if (mwVar.c > 999) {
            snl.b(mwVar, new q5e(this, qxeVar, 0));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        vd7.b(sbC, mwVar2.c);
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        Iterator it = iwVar.iterator();
        int i = 1;
        while (true) {
            zc8 zc8Var = (zc8) it;
            if (!zc8Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            }
            vxeVarO0.B(i, (String) zc8Var.next());
            i++;
        }
        int iN = qyj.n(vxeVarO0, "work_spec_id");
        if (iN == -1) {
            vxeVarO0.close();
            return;
        }
        while (vxeVarO0.M0()) {
            List list = (List) mwVar.get(vxeVarO0.B0(iN));
            if (list != null) {
                byte[] blob = vxeVarO0.getBlob(0);
                d25 d25Var = d25.b;
                list.add(f55.i(blob));
            }
        }
        vxeVarO0.close();
    }

    public final void b(qxe qxeVar, mw mwVar) {
        iw iwVar = (iw) mwVar.keySet();
        mw mwVar2 = iwVar.a;
        if (mwVar2.isEmpty()) {
            return;
        }
        if (mwVar.c > 999) {
            snl.b(mwVar, new q5e(this, qxeVar, 1));
            return;
        }
        StringBuilder sbC = nbh.C("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        vd7.b(sbC, mwVar2.c);
        sbC.append(")");
        vxe vxeVarO0 = qxeVar.O0(sbC.toString());
        Iterator it = iwVar.iterator();
        int i = 1;
        while (true) {
            zc8 zc8Var = (zc8) it;
            if (!zc8Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            }
            vxeVarO0.B(i, (String) zc8Var.next());
            i++;
        }
        int iN = qyj.n(vxeVarO0, "work_spec_id");
        if (iN == -1) {
            vxeVarO0.close();
            return;
        }
        while (vxeVarO0.M0()) {
            List list = (List) mwVar.get(vxeVarO0.B0(iN));
            if (list != null) {
                list.add(vxeVarO0.B0(0));
            }
        }
        vxeVarO0.close();
    }
}
