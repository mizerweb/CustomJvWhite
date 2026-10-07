package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aa1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aa1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[PHI: r7
  0x00d8: PHI (r7v3 ynh) = (r7v2 ynh), (r7v13 ynh) binds: [B:43:0x00c2, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qxb qxbVar;
        pxb pxbVar;
        Integer numValueOf;
        n6g n6gVar;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                cb1 cb1Var = (cb1) obj2;
                due dueVar = (due) obj;
                View view2 = ((ba1) obj3).a;
                ny8 ny8Var = ((atf) view2).o;
                boolean z = !(ny8Var.d() ? ((v9c) ny8Var.getValue()).isChecked() : false);
                ksf ksfVar = cb1Var.g;
                ksf ksfVar2 = ksfVar != null ? ksfVar : null;
                if (ksfVar2 != null) {
                    ksfVar2.a = z;
                    ((atf) view2).setEndView(ksfVar2);
                }
                dueVar.D(cb1Var.d, z);
                break;
            case 1:
                txb txbVar = (txb) obj3;
                List<mxb> list = (List) obj2;
                al9 al9Var = (al9) obj;
                if (!list.isEmpty()) {
                    txbVar.c();
                    ArrayList arrayList = new ArrayList();
                    for (mxb mxbVar : list) {
                        ynh tnhVar = mxbVar.d;
                        if (tnhVar != null) {
                            ynh ynhVar = tnhVar;
                            int i2 = mxbVar.b;
                            qxbVar = mxbVar.a.b;
                            if (qxbVar instanceof pxb) {
                                pxbVar = (pxb) qxbVar;
                            } else {
                                pxbVar = null;
                            }
                            if (pxbVar != null) {
                                numValueOf = Integer.valueOf(pxbVar.a);
                            } else {
                                numValueOf = null;
                            }
                            Integer num = mxbVar.e;
                            n6gVar = new n6g(i2, ynhVar, num, numValueOf, num);
                        } else {
                            Integer num2 = mxbVar.c;
                            tnhVar = num2 != null ? new tnh(num2.intValue()) : null;
                            if (tnhVar == null) {
                                n6gVar = null;
                            } else {
                                ynh ynhVar2 = tnhVar;
                                int i3 = mxbVar.b;
                                qxbVar = mxbVar.a.b;
                                if (qxbVar instanceof pxb) {
                                    pxbVar = (pxb) qxbVar;
                                } else {
                                    pxbVar = null;
                                }
                                if (pxbVar != null) {
                                    numValueOf = Integer.valueOf(pxbVar.a);
                                } else {
                                    numValueOf = null;
                                }
                                Integer num3 = mxbVar.e;
                                n6gVar = new n6g(i3, ynhVar2, num3, numValueOf, num3);
                            }
                        }
                        if (n6gVar != null) {
                            arrayList.add(n6gVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        o6g o6gVar = new o6g(txbVar.getContext(), false, arrayList, new lh9(18, al9Var));
                        o6gVar.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        o6gVar.showAsDropDown(view, 0, -zo5.b(8.0f, yl5.d().getDisplayMetrics().density, view.getHeight() + o6gVar.getContentView().getMeasuredHeight()), 8388613);
                        txbVar.d = o6gVar;
                        break;
                    }
                }
                break;
            case 2:
                tcc.d((tcc) obj3, (cf7) obj2, (mcc) obj);
                break;
            default:
                rhc rhcVar = (rhc) obj3;
                dud dudVar = (dud) obj2;
                xqd xqdVar = (xqd) obj;
                String str = rhcVar.b;
                int i4 = (str == null || str.length() == 0) ? 1 : 2;
                jic jicVar = (jic) dudVar.g.getValue();
                Long l = xqdVar.e;
                long jLongValue = l != null ? l.longValue() : 0L;
                int i5 = xqdVar.f;
                int i6 = i5 != 0 ? i5 : 2;
                Long l2 = xqdVar.g;
                jicVar.a(2, jLongValue, i6, l2 != null ? l2.longValue() : 0L, 1, i4, null);
                dvd dvdVarV1 = dudVar.f.v1();
                dvdVarV1.getClass();
                String str2 = rhcVar.b;
                if (str2 != null) {
                    String str3 = str2.length() != 0 ? str2 : null;
                    if (str3 != null) {
                        dvdVarV1.G(str3);
                    }
                }
                Long l3 = rhcVar.c;
                if (l3 != null) {
                    long jLongValue2 = l3.longValue();
                    ic6 ic6Var = dvdVarV1.C;
                    trd trdVar = trd.b;
                    Long lJ = dvdVarV1.p1.j();
                    String str4 = rhcVar.d;
                    trdVar.getClass();
                    a8j.x(ic6Var, trd.q(jLongValue2, bdj.ORGANIZATION_IN_PROFILE, lJ, str4));
                }
                break;
        }
    }
}
