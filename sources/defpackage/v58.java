package defpackage;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v58 implements jmf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v58(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jmf
    public final void a(lmf lmfVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                z58 z58Var = (z58) obj;
                if (z58Var.e() != null) {
                    qhh qhhVar = z58Var.C;
                    qhhVar.getClass();
                    wxl.a();
                    qhhVar.f = true;
                    qme qmeVar = qhhVar.d;
                    if (qmeVar != null) {
                        wxl.a();
                        if (!qmeVar.d.b.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
                            wxl.a();
                            qmeVar.g = true;
                            bp2 bp2Var = qmeVar.i;
                            Objects.requireNonNull(bp2Var);
                            bp2Var.cancel(true);
                            qmeVar.e.d(imageCaptureException);
                            qmeVar.f.b(null);
                            qhh qhhVar2 = qmeVar.b;
                            gj0 gj0Var = qmeVar.a;
                            wxl.a();
                            tvj.a("TakePictureManagerImpl", "Add a new request for retrying.");
                            qhhVar2.a.addFirst(gj0Var);
                            qhhVar2.c();
                        }
                    }
                    z58Var.J(true);
                    String strG = z58Var.g();
                    a68 a68Var = (a68) z58Var.i;
                    yi0 yi0Var = z58Var.j;
                    yi0Var.getClass();
                    hmf hmfVarK = z58Var.K(strG, a68Var, yi0Var);
                    z58Var.A = hmfVarK;
                    Object[] objArr = {hmfVarK.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    z58Var.H(Collections.unmodifiableList(arrayList));
                    z58Var.s();
                    qhh qhhVar3 = z58Var.C;
                    qhhVar3.getClass();
                    wxl.a();
                    qhhVar3.f = false;
                    qhhVar3.c();
                    break;
                }
                break;
            case 1:
                igd igdVar = (igd) obj;
                if (igdVar.e() != null) {
                    igdVar.L((ugd) igdVar.i, igdVar.j);
                    igdVar.s();
                    break;
                }
                break;
            case 2:
                Iterator it = ((kmf) obj).n.iterator();
                while (it.hasNext()) {
                    ((jmf) it.next()).a(lmfVar);
                }
                break;
            default:
                ((bui) obj).S();
                break;
        }
    }
}
