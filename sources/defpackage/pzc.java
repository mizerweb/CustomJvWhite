package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import one.me.pinbars.PinBarsWidget;
import one.me.pinbars.pinnedmessage.b;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pzc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ pzc(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, InvocationTargetException {
        rt2 rt2Var;
        bci bciVar;
        rt2 rt2Var2;
        rt2 rt2Var3;
        b bVar;
        int i = this.a;
        i65 i65VarJ = null;
        byte b = 0;
        PinBarsWidget pinBarsWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PinBarsWidget.z;
                pinBarsWidget.t1().v.b();
                break;
            case 1:
                zv8[] zv8VarArr2 = PinBarsWidget.z;
                nzc nzcVarT1 = pinBarsWidget.t1();
                i65 i65VarC = ((t3d) nzcVarT1.v.c).c();
                if (i65VarC != null) {
                    a8j.x(nzcVarT1.J, new hzc(i65VarC));
                }
                break;
            case 2:
                zv8[] zv8VarArr3 = PinBarsWidget.z;
                zpc zpcVar = pinBarsWidget.t1().o;
                if (zpcVar != null) {
                    mjg mjgVar = zpcVar.b;
                    mjgVar.getClass();
                    mjgVar.j(null, cqc.a);
                }
                break;
            case 3:
                zv8[] zv8VarArr4 = PinBarsWidget.z;
                zpc zpcVar2 = pinBarsWidget.t1().o;
                if (zpcVar2 != null && (rt2Var = (rt2) zpcVar2.a.getValue()) != null) {
                    zpcVar2.d.a(new aqc(rt2Var.a));
                    break;
                }
                break;
            case 4:
                zv8[] zv8VarArr5 = PinBarsWidget.z;
                this.b.u1(R.string.pinbars_report_and_leave_dialog_title, R.string.pinbars_report_and_leave_dialog_description, R.id.pinbars_report_and_leave_dialog_confirm, R.string.pinbars_report_and_leave_dialog_confirm_button, R.id.pinbars_report_and_leave_dialog_cancel, R.string.pinbars_report_and_leave_dialog_cancel_button);
                break;
            case 5:
                zv8[] zv8VarArr6 = PinBarsWidget.z;
                z18 z18Var = pinBarsWidget.t1().n;
                if (z18Var != null) {
                    mjg mjgVar2 = (mjg) z18Var.f;
                    ((qke) mjgVar2.getValue()).getClass();
                    mjgVar2.j(null, new qke(false));
                    yab.i0((gu4) z18Var.a, null, 0, new nke(z18Var, null, 1), 3);
                }
                break;
            case 6:
                zv8[] zv8VarArr7 = PinBarsWidget.z;
                nzc nzcVarT2 = pinBarsWidget.t1();
                int iP1 = pinBarsWidget.p1();
                if (((f5d) ((wo6) nzcVarT2.g.getValue())).y()) {
                    ((lh4) nzcVarT2.h.getValue()).b(1);
                }
                if (((Boolean) ((f5d) ((wo6) nzcVarT2.g.getValue())).a.B2.a(e5d.S6[183]).i()).booleanValue()) {
                    bci bciVar2 = (bci) nzcVarT2.r.getValue();
                    if (bciVar2 != null) {
                        long j = bciVar2.a;
                        ((ah4) nzcVarT2.i.getValue()).a(j);
                        a8j.x(nzcVarT2.J, new gzc(j));
                    }
                    break;
                } else {
                    v05 v05Var = nzcVarT2.l;
                    if (v05Var != null && (bciVar = (bci) ((r8e) v05Var.m).a.getValue()) != null) {
                        yab.i0((gu4) v05Var.b, ((n0c) ((xhh) v05Var.d)).b(), 0, new cci(v05Var, bciVar.a, null, 0), 2);
                        ((mjg) v05Var.l).setValue(null);
                        h8c h8cVar = (h8c) ((ny8) v05Var.h).getValue();
                        h8cVar.c(new o8c(0, 0, iP1, 11));
                        h8cVar.h(new w8c(R.drawable.icon_check_round_fill));
                        h8cVar.m(new tnh(R.string.oneme_unknown_contact_snackbar_add_contact));
                        h8cVar.p();
                        break;
                    }
                }
                break;
            case 7:
                zv8[] zv8VarArr8 = PinBarsWidget.z;
                nzc nzcVarT3 = pinBarsWidget.t1();
                if (!((f5d) ((wo6) nzcVarT3.g.getValue())).y()) {
                    v05 v05Var2 = nzcVarT3.l;
                    if (v05Var2 != null) {
                        v05Var2.b();
                    }
                } else {
                    ((lh4) nzcVarT3.h.getValue()).b(2);
                    a8j.x(nzcVarT3.J, izc.a);
                }
                break;
            case 8:
                zv8[] zv8VarArr9 = PinBarsWidget.z;
                nzc nzcVarT4 = pinBarsWidget.t1();
                ((lh4) nzcVarT4.h.getValue()).b(3);
                v05 v05Var3 = nzcVarT4.l;
                if (v05Var3 != null && (rt2Var2 = (rt2) ((gjg) v05Var3.a).getValue()) != null) {
                    yab.i0((gu4) v05Var3.b, ((n0c) ((xhh) v05Var3.d)).b(), 0, new cci(v05Var3, rt2Var2.A(), null, 2), 2);
                    ((mjg) v05Var3.l).setValue(null);
                    break;
                }
                break;
            case 9:
                zv8[] zv8VarArr10 = PinBarsWidget.z;
                nzc nzcVarT5 = pinBarsWidget.t1();
                int iP2 = pinBarsWidget.p1();
                b bVar2 = nzcVarT5.k;
                if (bVar2 != null) {
                    sgg sggVar = bVar2.l;
                    if ((sggVar == null || !sggVar.isActive()) && (rt2Var3 = (rt2) bVar2.a.getValue()) != null) {
                        long jA = rt2Var3.A();
                        fda fdaVar = rt2Var3.e;
                        long j2 = fdaVar != null ? fdaVar.a.b : rt2Var3.b.M;
                        if (j2 != 0) {
                            bVar2.l = yab.i0(bVar2.d, ((n0c) bVar2.b).b(), 0, new o0d(iP2, jA, j2, rt2Var3, null, bVar2), 2);
                        } else {
                            gm0.Y(bVar2.n, "onPinnedMessageCloseRequested: no pin");
                        }
                    }
                }
                break;
            case 10:
                zv8[] zv8VarArr11 = PinBarsWidget.z;
                nzc nzcVarT6 = pinBarsWidget.t1();
                kzc kzcVar = nzcVarT6.c;
                Object value = nzcVarT6.q.a.getValue();
                w0d w0dVar = value instanceof w0d ? (w0d) value : null;
                if ((w0dVar != null ? w0dVar.e : null) != u5c.b) {
                    Long l = kzcVar.d;
                    if (l != null && (bVar = nzcVarT6.k) != null) {
                        long jLongValue = l.longValue();
                        boolean z = kzcVar.e == 1;
                        boolean z2 = kzcVar.f;
                        Object value2 = bVar.m.getValue();
                        w0d w0dVar2 = value2 instanceof w0d ? (w0d) value2 : null;
                        if (w0dVar2 != null) {
                            long j3 = w0dVar2.a;
                            b0d.b.getClass();
                            i65VarJ = b0d.j(jLongValue, j3, z, z2);
                        }
                        if (i65VarJ != null) {
                            a8j.x(nzcVarT6.J, new hzc(i65VarJ));
                        }
                    }
                } else {
                    a8j.x(kzcVar.g, sbi.a);
                }
                break;
            case 11:
                zv8[] zv8VarArr12 = PinBarsWidget.z;
                ae8 ae8Var = pinBarsWidget.t1().z;
                if (ae8Var != null) {
                    yab.i0(ae8Var.a, null, 0, new qy3(ae8Var, b == true ? 1 : 0, 27), 3);
                }
                break;
            default:
                zv8[] zv8VarArr13 = PinBarsWidget.z;
                nzc nzcVarT7 = pinBarsWidget.t1();
                ((b2a) nzcVarT7.f.getValue()).c();
                nzcVarT7.v.a();
                nzcVarT7.p.a();
                mvh mvhVar = pinBarsWidget.e;
                if (mvhVar != null) {
                    mvhVar.dismiss();
                }
                pinBarsWidget.e = null;
                break;
        }
    }
}
