package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class yd2 implements be2 {
    public final kg2 b;
    public final ix6 c;
    public final o17 d;
    public final dqg e;
    public final iwh f;
    public final kj9 g;
    public final o1k h;
    public final a2k i;
    public final eb2 j;
    public final kmi k;
    public final omi l;
    public final p5j m;

    public yd2(kg2 kg2Var, ix6 ix6Var, o17 o17Var, dqg dqgVar, iwh iwhVar, kj9 kj9Var, o1k o1kVar, a2k a2kVar, eb2 eb2Var, kmi kmiVar, omi omiVar, p5j p5jVar) {
        this.b = kg2Var;
        this.c = ix6Var;
        this.d = o17Var;
        this.e = dqgVar;
        this.f = iwhVar;
        this.g = kj9Var;
        this.h = o1kVar;
        this.i = a2kVar;
        this.j = eb2Var;
        this.k = kmiVar;
        this.l = omiVar;
        this.m = p5jVar;
    }

    @Override // defpackage.be2
    public final void a(hmf hmfVar) {
        this.i.a(hmfVar);
    }

    @Override // defpackage.be2
    public final void b() {
        this.i.b();
    }

    @Override // defpackage.be2
    public final void c() {
        g40 g40Var = this.m.a;
        g40Var.getClass();
        int iDecrementAndGet = g40.b.decrementAndGet(g40Var);
        if (iDecrementAndGet >= 0) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "decrementUsage: videoUsage = " + iDecrementAndGet);
                return;
            }
            return;
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "decrementUsage: videoUsage = " + iDecrementAndGet + ", which is less than 0!");
        }
    }

    @Override // defpackage.be2
    public final e89 d(float f) {
        float fE;
        o1k o1kVar = this.h;
        o1kVar.getClass();
        if (f > 1.0f || f < 0.0f) {
            return new g88(1, new IllegalArgumentException(p.e("Requested linearZoom ", " is not within valid range [0, 1]", f)));
        }
        float f2 = o1kVar.b;
        float f3 = o1kVar.c;
        float f4 = f - 1.0f;
        if (Math.abs(f4) < ((double) Math.ulp(Math.abs(f4))) * 2.0d) {
            fE = f3;
        } else {
            float f5 = f - 0.0f;
            if (Math.abs(f5) < ((double) Math.ulp(Math.abs(f5))) * 2.0d) {
                fE = f2;
            } else {
                float f6 = 1.0f / f2;
                fE = np4.e(1.0f / (f6 - ((f6 - (1.0f / f3)) * f)), f2, f3);
            }
        }
        return o1kVar.a(new t1k(fE, f2, f3), true, true);
    }

    @Override // defpackage.be2
    public final void e(t94 t94Var) {
        eb2 eb2Var = this.j;
        uik uikVar = new uik(6);
        t94Var.j(new hu(uikVar, 6, t94Var));
        dhc dhcVarA = dhc.a((w8b) uikVar.b);
        fb2 fb2Var = eb2Var.a;
        synchronized (fb2Var.a) {
            for (bh0 bh0Var : dhcVarA.c()) {
                ((w8b) fb2Var.c.a).l(bh0Var, s94.a, dhcVarA.i(bh0Var));
            }
        }
        i64 i64VarA = eb2Var.a.a(eb2Var.d, true);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            i64VarA.Y(new w14(r72Var, 9, i64VarA));
            r72Var.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            u72Var.c(e);
        }
        o9b.g(u72Var);
    }

    @Override // defpackage.be2
    public final e89 f(float f) {
        o1k o1kVar = this.h;
        float f2 = o1kVar.b;
        float f3 = o1kVar.c;
        if (f <= f3 && f >= f2) {
            return o1kVar.a(new t1k(f, f2, f3), true, true);
        }
        StringBuilder sbN = bc1.n("Requested zoomRatio ", f, " is not within valid range [", f2, ", ");
        sbN.append(f3);
        sbN.append(']');
        return new g88(1, new IllegalArgumentException(sbN.toString()));
    }

    @Override // defpackage.be2
    public final void g(int i) {
        boolean z = true;
        this.c.d(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.i.d(z);
    }

    @Override // defpackage.be2
    public final void h(x58 x58Var) {
        this.c.h = x58Var;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v4 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v4 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v4 ??, new type: java.util.Collection
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.be2
    public final defpackage.e89 i(defpackage.q36 r22) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd2.i(q36):e89");
    }

    @Override // defpackage.be2
    public final e89 j(boolean z) {
        Integer num;
        ag2 ag2Var = bg2.U;
        bg2 bg2Var = this.b.b;
        ag2Var.getClass();
        int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (!(iArr == null ? false : a.L0(6, iArr)) || ((num = (Integer) this.g.f.d()) != null && num.intValue() == -1)) {
            return o9b.g(o9b.j(lg7.c(rpl.a(iwh.a(this.f, z, 6))), new due(new hs4(7)), zjl.a()));
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new g88(1, new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
    }

    @Override // defpackage.be2
    public final t94 k() {
        i1m i1mVar;
        fb2 fb2Var = this.j.a;
        synchronized (fb2Var.a) {
            jc2 jc2VarR = fb2Var.c.r();
            uik uikVar = new uik(6);
            jc2VarR.j(new hu(uikVar, 6, jc2VarR));
            i1mVar = new i1m(dhc.a((w8b) uikVar.b));
        }
        return i1mVar;
    }

    @Override // defpackage.be2
    public final void l() {
        g40 g40Var = this.m.a;
        g40Var.getClass();
        int iIncrementAndGet = g40.b.incrementAndGet(g40Var);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "incrementUsage: videoUsage = " + iIncrementAndGet);
        }
    }

    @Override // defpackage.be2
    public final e89 m(ArrayList arrayList, int i, int i2) {
        dqg dqgVar = this.e;
        dqgVar.getClass();
        i64 i64Var = new i64();
        yab.i0(dqgVar.b.f, null, 0, new g0f(arrayList, i, i2, i64Var, dqgVar, null), 3);
        return o9b.g(rpl.a(i64Var));
    }

    @Override // defpackage.be2
    public final void n() {
        eb2 eb2Var = this.j;
        fb2 fb2Var = eb2Var.a;
        synchronized (fb2Var.a) {
            fb2Var.c = new ft0();
        }
        i64 i64VarA = eb2Var.a.a(eb2Var.d, true);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            i64VarA.Y(new w14(r72Var, 9, i64VarA));
            r72Var.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            u72Var.c(e);
        }
        o9b.g(u72Var);
    }

    @Override // defpackage.be2
    public final e89 o(int i) {
        hli hliVarH = this.k.h();
        if (hliVarH == null) {
            return new g88(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        dq4 dq4Var = this.l.f;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = xd2.class;
        try {
            r72Var.a = yab.i0(dq4Var, null, 0, new tm(r72Var, null, hliVarH, i, this), 3);
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }
}
