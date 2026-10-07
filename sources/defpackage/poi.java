package defpackage;

import android.content.Context;
import android.net.Uri;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class poi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poi(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.g = obj3;
        this.j = obj4;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                poi poiVar = new poi((gpi) obj2, (lsg) obj3, lq4Var);
                poiVar.g = obj;
                return poiVar;
            case 1:
                poi poiVar2 = new poi((sfj) this.h, (ifj) obj3, (vfj) obj2, lq4Var, 1);
                poiVar2.g = obj;
                return poiVar2;
            case 2:
                return new poi(2, lq4Var, (String) this.h, (egj) obj3, (sfj) this.g, (ifj) obj2);
            case 3:
                poi poiVar3 = new poi((sfj) this.h, (ifj) obj3, (egj) obj2, lq4Var, 3);
                poiVar3.g = obj;
                return poiVar3;
            case 4:
                poi poiVar4 = new poi((phj) this.h, (jhj) obj3, (shj) obj2, lq4Var, 4);
                poiVar4.g = obj;
                return poiVar4;
            case 5:
                poi poiVar5 = new poi((jij) this.h, (gij) obj3, (cij) obj2, lq4Var, 5);
                poiVar5.g = obj;
                return poiVar5;
            case 6:
                poi poiVar6 = new poi((ujj) this.h, (pjj) obj3, (tij) obj2, lq4Var, 6);
                poiVar6.g = obj;
                return poiVar6;
            case 7:
                poi poiVar7 = new poi((ujj) this.h, (pjj) obj3, (uij) obj2, lq4Var, 7);
                poiVar7.g = obj;
                return poiVar7;
            case 8:
                poi poiVar8 = new poi((ujj) this.h, (pjj) obj3, (vij) obj2, lq4Var, 8);
                poiVar8.g = obj;
                return poiVar8;
            case 9:
                poi poiVar9 = new poi((qlj) this.h, (klj) obj3, (tlj) obj2, lq4Var, 9);
                poiVar9.g = obj;
                return poiVar9;
            case 10:
                poi poiVar10 = new poi((qlj) this.h, (klj) obj3, (vkj) obj2, lq4Var, 10);
                poiVar10.g = obj;
                return poiVar10;
            case 11:
                poi poiVar11 = new poi((qmj) this.h, (nmj) obj3, (lmj) obj2, lq4Var, 11);
                poiVar11.g = obj;
                return poiVar11;
            case 12:
                poi poiVar12 = new poi((ioj) obj3, (Uri) obj2, lq4Var);
                poiVar12.g = obj;
                return poiVar12;
            case 13:
                poi poiVar13 = new poi((dqj) this.h, (xpj) obj3, (jqj) obj2, lq4Var, 13);
                poiVar13.g = obj;
                return poiVar13;
            case 14:
                poi poiVar14 = new poi((krj) this.h, (frj) obj3, (sqj) obj2, lq4Var, 14);
                poiVar14.g = obj;
                return poiVar14;
            case 15:
                poi poiVar15 = new poi((krj) this.h, (frj) obj3, (nrj) obj2, lq4Var, 15);
                poiVar15.g = obj;
                return poiVar15;
            case 16:
                poi poiVar16 = new poi((gsj) this.h, (dsj) obj3, (rsi) obj2, lq4Var, 16);
                poiVar16.g = obj;
                return poiVar16;
            case 17:
                poi poiVar17 = new poi((pij) this.h, (osj) obj3, (msj) obj2, lq4Var, 17);
                poiVar17.g = obj;
                return poiVar17;
            case 18:
                return new poi(18, lq4Var, (m89) this.h, (mzj) obj3, (hyj) this.g, (Context) obj2);
            case 19:
                return new poi((kdk) obj3, (CallingAppIds) this.g, (AsyncCallback) obj2, lq4Var);
            default:
                return new poi(20, lq4Var, (hgk) this.h, (CallingAppIds) obj3, (AsyncCallback) this.g, (List) obj2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((poi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((poi) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((poi) create((by8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((poi) create((umj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((poi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((poi) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((poi) create((ssi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((poi) create((c9j) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((poi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((poi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((poi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:324:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:326:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d A[PHI: r4 r15
  0x010d: PHI (r4v39 java.lang.String) = (r4v38 java.lang.String), (r4v43 java.lang.String) binds: [B:52:0x00f4, B:57:0x010a] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r15v65 java.lang.Object) = (r15v61 java.lang.Object), (r15v71 java.lang.Object) binds: [B:52:0x00f4, B:57:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r15 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        if (r15.g(r0, r14) == r8) goto L80;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:326:0x07d8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poi(gpi gpiVar, lsg lsgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.j = gpiVar;
        this.i = lsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poi(ioj iojVar, Uri uri, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 12;
        this.i = iojVar;
        this.j = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poi(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poi(kdk kdkVar, CallingAppIds callingAppIds, AsyncCallback asyncCallback, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 19;
        this.i = kdkVar;
        this.g = callingAppIds;
        this.j = asyncCallback;
    }
}
