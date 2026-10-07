package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o17 implements fli, jmi {
    public final kg2 a;
    public final kxa b;
    public final ejg c;
    public final omi d;
    public final m1k e;
    public kli f;
    public Rational g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final ArrayList l;
    public final ArrayList m;
    public i64 n;
    public i64 o;
    public sgg p;
    public sgg q;

    public o17(kg2 kg2Var, kxa kxaVar, ejg ejgVar, omi omiVar, m1k m1kVar) {
        ArrayList arrayList;
        Object next;
        this.a = kg2Var;
        this.b = kxaVar;
        this.c = ejgVar;
        this.d = omiVar;
        this.e = m1kVar;
        bg2 bg2Var = kg2Var.b;
        Object obj = 0;
        qb2 qb2Var = (qb2) bg2Var;
        Object objC = qb2Var.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        this.h = (Integer) (objC == null ? obj : objC);
        Object objC2 = qb2Var.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        this.i = (Integer) (objC2 == null ? obj : objC2);
        Object objC3 = qb2Var.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.j = (Integer) (objC3 != null ? objC3 : 0);
        bg2.U.getClass();
        this.k = ag2.a(bg2Var);
        int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = oe.b;
                arrayList.add(trk.c(i));
            }
        } else {
            arrayList = null;
        }
        this.l = arrayList;
        int[] iArr2 = (int[]) ((qb2) this.a.b).c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = pe.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((pe) next).a != i2);
                arrayList3.add((pe) next);
            }
            arrayList2 = arrayList3;
        }
        this.m = arrayList2;
    }

    @Override // defpackage.jmi
    public final void a(LinkedHashSet linkedHashSet) {
        Size sizeD;
        this.g = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            if ((cliVar instanceof igd) && (sizeD = ((igd) cliVar).d()) != null) {
                this.g = new Rational(sizeD.getWidth(), sizeD.getHeight());
            }
        }
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.f = kliVar;
    }

    public final Rational c() {
        Rational rational = this.g;
        if (rational != null) {
            return rational;
        }
        m1k m1kVar = this.e;
        return new Rational(m1kVar.B().width(), m1kVar.B().height());
    }

    @Override // defpackage.fli
    public final void reset() throws IllegalAccessException, InvocationTargetException {
        this.g = null;
        i64 i64Var = new i64();
        kli kliVar = this.f;
        if (kliVar == null) {
            bc1.p("Camera is not active.", i64Var);
            return;
        }
        sgg sggVar = this.p;
        if (sggVar != null) {
            sggVar.b(null);
        }
        sgg sggVar2 = this.q;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        i64 i64Var2 = this.o;
        if (i64Var2 != null) {
            bc1.p("Cancelled by another cancelFocusAndMetering()", i64Var2);
        }
        this.o = i64Var;
        i64 i64Var3 = this.n;
        if (i64Var3 != null) {
            bc1.p("Cancelled by cancelFocusAndMetering()", i64Var3);
        }
        ejg ejgVar = this.c;
        synchronized (ejgVar.d) {
            ejgVar.l = null;
        }
        ejgVar.f();
        rpl.d(kliVar.e(), i64Var);
    }
}
