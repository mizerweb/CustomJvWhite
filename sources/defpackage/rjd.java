package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class rjd {
    public final ifh A;
    public final ifh B;
    public final ifh C;
    public final ContentResolver a;
    public final ojd b;
    public final sb8 c;
    public final boolean d;
    public final fbc e;
    public final at5 f;
    public final boolean g;
    public final y78 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final ifh l;
    public final ifh m;
    public final ifh n;
    public final ifh o;
    public final ifh p;
    public final ifh q;
    public final ifh r;
    public final ifh s;
    public final ifh t;
    public final ifh u;
    public final ifh v;
    public final ifh w;
    public final ifh x;
    public final ifh y;
    public final ifh z;

    public rjd(ContentResolver contentResolver, ojd ojdVar, sb8 sb8Var, boolean z, fbc fbcVar, at5 at5Var, boolean z2, d5b d5bVar, c76 c76Var) {
        this.a = contentResolver;
        this.b = ojdVar;
        this.c = sb8Var;
        this.d = z;
        this.e = fbcVar;
        this.f = at5Var;
        this.g = z2;
        this.h = d5bVar;
        this.i = c76Var;
        new LinkedHashMap();
        final int i = 0;
        this.l = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i2 = 0;
                switch (i) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i2);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i2);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i2);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i2));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i2 = 17;
        this.m = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i3);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i3);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i3);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i3));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i3 = 1;
        this.n = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i4 = 0;
                switch (i3) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i4);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i4);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i4);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i4));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i4 = 2;
        this.o = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i5 = 0;
                switch (i4) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i5);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i5);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i5);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i5));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i5 = 3;
        this.p = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i6 = 0;
                switch (i5) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i6);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i6);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i6);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i6));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i6 = 4;
        this.q = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i7 = 0;
                switch (i6) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i7);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i7);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i7);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i7));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i7 = 5;
        this.r = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i8 = 0;
                switch (i7) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i8);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i8);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i8);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i8));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i8 = 6;
        this.s = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i9 = 0;
                switch (i8) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i9);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i9);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i9);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i9));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i9 = 7;
        this.t = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i10 = 0;
                switch (i9) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i10);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i10);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i10);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i10));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i10 = 8;
        this.u = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i11);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i11);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i11);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i11));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i11 = 9;
        this.v = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i12 = 0;
                switch (i11) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i12);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i12);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i12);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i12));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i12 = 10;
        this.w = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i13);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i13);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i13);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i13));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i13 = 11;
        this.x = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i14);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i14);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i14);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i14));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i14 = 12;
        this.y = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i15 = 0;
                switch (i14) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i15);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i15);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i15);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i15));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i15 = 13;
        this.z = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i16 = 0;
                switch (i15) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i16);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i16);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i16);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i16));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i16 = 14;
        this.A = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i17 = 0;
                switch (i16) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i17);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i17);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i17);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i17));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i17 = 15;
        this.B = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i18 = 0;
                switch (i17) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i18);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i18);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i18);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i18));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
        final int i18 = 16;
        this.C = new ifh(new af7(this) { // from class: qjd
            public final /* synthetic */ rjd b;

            {
                this.b = this;
            }

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
            @Override // defpackage.af7
            public final Object invoke() throws Throwable {
                ane aneVarA;
                boolean z3 = true;
                boolean z4 = true;
                int i19 = 0;
                switch (i18) {
                    case 0:
                        rjd rjdVar = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar.p.getValue(), 0);
                    case 1:
                        rjd rjdVar2 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar2.u.getValue(), 0);
                    case 2:
                        rjd rjdVar3 = this.b;
                        qe7.v();
                        return rjdVar3.g((mjd) rjdVar3.r.getValue());
                    case 3:
                        rjd rjdVar4 = this.b;
                        fbc fbcVar2 = rjdVar4.e;
                        ojd ojdVar2 = rjdVar4.b;
                        qe7.v();
                        mjd mjdVar = (mjd) rjdVar4.r.getValue();
                        ojdVar2.getClass();
                        return new lqh(mjdVar, fbcVar2, i19);
                    case 4:
                        rjd rjdVar5 = this.b;
                        ojd ojdVar3 = rjdVar5.b;
                        qe7.v();
                        mjd mjdVar2 = (mjd) rjdVar5.p.getValue();
                        ojdVar3.getClass();
                        return new aje(mjdVar2, 1);
                    case 5:
                        rjd rjdVar6 = this.b;
                        sb8 sb8Var2 = rjdVar6.c;
                        qe7.v();
                        synchronized (rjdVar6) {
                            try {
                                qe7.v();
                                ojd ojdVar4 = rjdVar6.b;
                                gb gbVar = new gb(rjdVar6.i(new vm5(ojdVar4.j, ojdVar4.d, sb8Var2, 2)));
                                ojd ojdVar5 = rjdVar6.b;
                                if (!rjdVar6.d || rjdVar6.f == at5.c) {
                                    z3 = false;
                                }
                                aneVarA = ojdVar5.a(gbVar, z3, rjdVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return aneVarA;
                    case 6:
                        rjd rjdVar7 = this.b;
                        ojd ojdVar6 = rjdVar7.b;
                        qe7.v();
                        mjd mjdVar3 = (mjd) rjdVar7.t.getValue();
                        ojdVar6.getClass();
                        return new aje(mjdVar3, 1);
                    case 7:
                        rjd rjdVar8 = this.b;
                        fbc fbcVar3 = rjdVar8.e;
                        ojd ojdVar7 = rjdVar8.b;
                        qe7.v();
                        return new lqh(rjdVar8.i(new k25(ojdVar7.i.p(), ojdVar7.j)), fbcVar3, i19);
                    case 8:
                        rjd rjdVar9 = this.b;
                        fbc fbcVar4 = rjdVar9.e;
                        ojd ojdVar8 = rjdVar9.b;
                        qe7.v();
                        return new lqh(rjdVar9.i(new oa9(ojdVar8.i.p(), ojdVar8.j, ojdVar8.a, 0)), fbcVar4, i19);
                    case 9:
                        rjd rjdVar10 = this.b;
                        ojd ojdVar9 = rjdVar10.b;
                        return rjdVar10.h(new k25(ojdVar9.i.p(), ojdVar9.j), new rrh[]{new ua9(ojdVar9.i.q(), ojdVar9.j, ojdVar9.a)});
                    case 10:
                        rjd rjdVar11 = this.b;
                        ojd ojdVar10 = rjdVar11.b;
                        return rjdVar11.f(new bc9(ojdVar10.i.p(), ojdVar10.a, z4 ? 1 : 0));
                    case 11:
                        rjd rjdVar12 = this.b;
                        ojd ojdVar11 = rjdVar12.b;
                        ExecutorService executorServiceP = ojdVar11.i.p();
                        qg7 qg7Var = ojdVar11.j;
                        ContentResolver contentResolver2 = ojdVar11.a;
                        oa9 oa9Var = new oa9(executorServiceP, qg7Var, contentResolver2, 0);
                        ee6 ee6Var = ojdVar11.i;
                        return rjdVar12.h(oa9Var, new rrh[]{new pa9(ee6Var.p(), qg7Var, contentResolver2), new ua9(ee6Var.q(), qg7Var, contentResolver2)});
                    case 12:
                        rjd rjdVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        ojd ojdVar12 = rjdVar13.b;
                        return rjdVar13.f(new bc9(ojdVar12.i.l(), ojdVar12.a, i19));
                    case 13:
                        rjd rjdVar14 = this.b;
                        ojd ojdVar13 = rjdVar14.b;
                        return rjdVar14.h(new oa9(ojdVar13.i.p(), ojdVar13.j, ojdVar13.a, 1), new rrh[]{new ua9(ojdVar13.i.q(), ojdVar13.j, ojdVar13.a)});
                    case 14:
                        rjd rjdVar15 = this.b;
                        ojd ojdVar14 = rjdVar15.b;
                        return rjdVar15.h(new yb9(ojdVar14.i.p(), ojdVar14.j, ojdVar14.b), new rrh[]{new ua9(ojdVar14.i.q(), ojdVar14.j, ojdVar14.a)});
                    case 15:
                        rjd rjdVar16 = this.b;
                        ojd ojdVar15 = rjdVar16.b;
                        return rjdVar16.h(new oa9(ojdVar15.i.p(), ojdVar15.j, ojdVar15.c, 2), new rrh[]{new ua9(ojdVar15.i.q(), ojdVar15.j, ojdVar15.a)});
                    case 16:
                        rjd rjdVar17 = this.b;
                        ojd ojdVar16 = rjdVar17.b;
                        return rjdVar17.g(ojdVar16.a(new gb(new k25(ojdVar16.j)), true, rjdVar17.h));
                    default:
                        rjd rjdVar18 = this.b;
                        qe7.v();
                        return new aje((mjd) rjdVar18.t.getValue(), 0);
                }
            }
        });
    }

    public final mjd a(v78 v78Var) {
        qe7.v();
        Uri uri = v78Var.b;
        int i = v78Var.c;
        if (i == 0) {
            return (mjd) this.o.getValue();
        }
        ifh ifhVar = this.w;
        switch (i) {
            case 2:
                return v78Var.c() ? d() : (mjd) ifhVar.getValue();
            case 3:
                return v78Var.c() ? d() : (mjd) this.v.getValue();
            case 4:
                if (v78Var.c()) {
                    return d();
                }
                return y7a.b(this.a.getType(uri)) ? (mjd) ifhVar.getValue() : (mjd) this.x.getValue();
            case 5:
                return (mjd) this.B.getValue();
            case 6:
                return (mjd) this.A.getValue();
            case 7:
                return (mjd) this.C.getValue();
            case 8:
                return (mjd) this.z.getValue();
            default:
                Set set = this.i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        throw qt4.h(it);
                    }
                }
                ore.p("Unsupported uri scheme! Uri is: ".concat(cy5.j(uri)));
                return null;
        }
    }

    public final mjd b(v78 v78Var) {
        cy5.k(v78Var);
        int i = v78Var.c;
        if (i == 0) {
            return (mjd) this.q.getValue();
        }
        if (i == 2 || i == 3) {
            return (mjd) this.s.getValue();
        }
        ore.p("Unsupported uri scheme for encoded image fetch! Uri is: ".concat(cy5.j(v78Var.b)));
        return null;
    }

    public final mjd c(v78 v78Var) {
        int i = v78Var.c;
        Uri uri = v78Var.b;
        qe7.v();
        cy5.k(v78Var);
        if (i == 0) {
            return (mjd) this.l.getValue();
        }
        if (i == 2 || i == 3) {
            return (mjd) this.m.getValue();
        }
        if (i == 4) {
            return (mjd) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                qt4.A(it.next());
                throw null;
            }
        }
        ore.p("Unsupported uri scheme for encoded image fetch! Uri is: ".concat(cy5.j(uri)));
        return null;
    }

    public final mjd d() {
        return (mjd) this.y.getValue();
    }

    public final synchronized mjd e(mjd mjdVar) {
        mjd mjdVar2;
        mjdVar2 = (mjd) this.j.get(mjdVar);
        if (mjdVar2 == null) {
            ojd ojdVar = this.b;
            vm5 vm5Var = new vm5(mjdVar, ojdVar.o, ojdVar.i.l());
            ojd ojdVar2 = this.b;
            vm5 vm5Var2 = new vm5(ojdVar2.m, ojdVar2.n, vm5Var, 3);
            this.j.put(mjdVar, vm5Var2);
            mjdVar2 = vm5Var2;
        }
        return mjdVar2;
    }

    public final mjd f(mjd mjdVar) {
        ojd ojdVar = this.b;
        taa taaVar = ojdVar.m;
        j85 j85Var = ojdVar.n;
        return new zx0(ojdVar.m, j85Var, new lqh(new by0(j85Var, new dy0(taaVar, j85Var, mjdVar, 0)), this.e, 0), 0);
    }

    public final mjd g(mjd mjdVar) {
        qe7.v();
        ojd ojdVar = this.b;
        return f(new q55(ojdVar.d, ojdVar.i.j(), ojdVar.e, ojdVar.f, ojdVar.g, ojdVar.h, mjdVar, ojdVar.q, ojdVar.p));
    }

    public final mjd h(ya9 ya9Var, rrh[] rrhVarArr) {
        gb gbVar = new gb(i(ya9Var));
        ojd ojdVar = this.b;
        y78 y78Var = this.h;
        hrh hrhVar = new hrh(ojdVar.i.b(), ojdVar.a(gbVar, true, y78Var));
        return g(new lqh(ojdVar.a(new gb(rrhVarArr), true, y78Var), hrhVar, 1));
    }

    public final by0 i(mjd mjdVar) {
        boolean z = this.g;
        ojd ojdVar = this.b;
        if (z) {
            qe7.v();
            oah oahVar = ojdVar.k;
            j85 j85Var = ojdVar.n;
            mjdVar = new vm5(oahVar, j85Var, new vm5(oahVar, j85Var, mjdVar, 1), 0);
        }
        taa taaVar = ojdVar.l;
        j85 j85Var2 = ojdVar.n;
        return new by0(j85Var2, (mjd) new dy0(taaVar, j85Var2, mjdVar, 1));
    }
}
