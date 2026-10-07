package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class awa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awa(t84 t84Var, int i, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 16;
        this.g = t84Var;
        this.f = i;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new awa((bwa) this.g, (s5e) obj2, lq4Var, 0);
            case 1:
                awa awaVar = new awa((pza) obj2, lq4Var, 1);
                awaVar.g = obj;
                return awaVar;
            case 2:
                return new awa((eh9) this.g, (rza) obj2, lq4Var, 2);
            case 3:
                return new awa((rza) this.g, (List) obj2, lq4Var, 3);
            case 4:
                awa awaVar2 = new awa((y6b) obj2, lq4Var, 4);
                awaVar2.g = obj;
                return awaVar2;
            case 5:
                return new awa((cdb) this.g, (njd) obj2, lq4Var, 5);
            case 6:
                awa awaVar3 = new awa((deb) obj2, lq4Var, 6);
                awaVar3.g = obj;
                return awaVar3;
            case 7:
                return new awa((ArrayList) this.g, (pfb) obj2, lq4Var, 7);
            case 8:
                return new awa((bib) this.g, (m8b) obj2, lq4Var, 8);
            case 9:
                return new awa((gvb) obj2, lq4Var, 9);
            case 10:
                return new awa((t2c) this.g, (at7) obj2, lq4Var, 10);
            case 11:
                return new awa((o3c) this.g, (eq8) obj2, lq4Var, 11);
            case 12:
                return new awa((wec) this.g, (zui) obj2, lq4Var, 12);
            case 13:
                awa awaVar4 = new awa((zui) obj2, lq4Var, 13);
                awaVar4.g = obj;
                return awaVar4;
            case 14:
                return new awa((cic) this.g, (m8b) obj2, lq4Var, 14);
            case 15:
                return new awa((Long) this.g, (cic) obj2, lq4Var, 15);
            case 16:
                return new awa((t84) this.g, this.f, (String) obj2, lq4Var);
            case 17:
                return new awa((pnc) this.g, (pw) obj2, lq4Var, 17);
            case 18:
                return new awa((ovc) this.g, (Resources) obj2, lq4Var, 18);
            case 19:
                return new awa((iwc) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new awa((ywc) obj2, lq4Var, 20);
            case 21:
                awa awaVar5 = new awa((dxc) obj2, lq4Var, 21);
                awaVar5.g = obj;
                return awaVar5;
            case 22:
                return new awa((hxc) this.g, (g73) obj2, lq4Var, 22);
            case 23:
                return new awa((hxc) this.g, (yq0) obj2, lq4Var, 23);
            case 24:
                awa awaVar6 = new awa((txc) obj2, lq4Var, 24);
                awaVar6.g = obj;
                return awaVar6;
            case 25:
                return new awa(this.g, lq4Var, (dyc) obj2);
            case 26:
                awa awaVar7 = new awa((vyc) obj2, lq4Var, 26);
                awaVar7.g = obj;
                return awaVar7;
            case 27:
                awa awaVar8 = new awa((czc) obj2, lq4Var, 27);
                awaVar8.g = obj;
                return awaVar8;
            case 28:
                return new awa((czc) this.g, (String) obj2, lq4Var, 28);
            default:
                awa awaVar9 = new awa((v5c) obj2, lq4Var, 29);
                awaVar9.g = obj;
                return awaVar9;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((awa) create((Map) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((awa) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((awa) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((awa) create((gxc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((awa) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((awa) create((vj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((awa) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((awa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:248:0x04e2 A[PHI: r0
  0x04e2: PHI (r0v68 java.lang.Object) = (r0v67 java.lang.Object), (r0v71 java.lang.Object) binds: [B:246:0x04de, B:231:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:253:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:492:0x04fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x072a, code lost:
    
        if (r2.emit((defpackage.fgd) r0, r22) == r3) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0736, code lost:
    
        if (r2.emit(r6, r22) == r3) goto L389;
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
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awa(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awa(Object obj, lq4 lq4Var, dyc dycVar) {
        super(2, lq4Var);
        this.e = 25;
        this.g = obj;
        this.h = dycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awa(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
