package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import one.me.startconversation.StartConversationScreen;
import one.me.stories.core.workers.StoryPublishWorker;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ryf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryf(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    private final Object l(Object obj) {
        Object poeVar;
        ynh xnhVar;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                pvb pvbVar = (pvb) ((x7i) this.h).d.getValue();
                vsb vsbVar = new vsb();
                this.g = null;
                this.f = 1;
                obj = pvbVar.D(vsbVar, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            poeVar = (md0) obj;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        x7i x7iVar = (x7i) this.h;
        if (!(poeVar instanceof poe)) {
            ic6 ic6Var = x7iVar.g;
            n7i n7iVar = n7i.b;
            String str = ((md0) poeVar).c;
            n7iVar.getClass();
            bc1.q(":settings/privacy/creation-twofa?track_id=" + str + "&src=settings", ic6Var);
        }
        x7i x7iVar2 = (x7i) this.h;
        Throwable thA = roe.a(poeVar);
        if (thA != null && (thA instanceof TamErrorException)) {
            ic6 ic6Var2 = x7iVar2.f;
            dih dihVarA = svl.a(((TamErrorException) thA).a);
            if (dihVarA.equals(zhh.a)) {
                xnhVar = new tnh(R.string.common_error_base_retry);
            } else if (dihVarA.equals(aih.a)) {
                xnhVar = new tnh(R.string.common_network_error);
            } else if (dihVarA.equals(bih.a)) {
                xnhVar = new tnh(R.string.common_service_error);
            } else {
                if (!(dihVarA instanceof cih)) {
                    ore.o();
                    return null;
                }
                xnhVar = new xnh(((cih) dihVarA).a);
            }
            a8j.x(ic6Var2, new k7i(0, 6, xnhVar));
        }
        ((x7i) this.h).h = null;
        return sbi.a;
    }

    private final Object n(Object obj) throws Throwable {
        Object poeVar;
        p8i p8iVar = (p8i) this.h;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                pvb pvbVar = (pvb) p8iVar.j.getValue();
                vsb vsbVar = new vsb(p8iVar.c, (String) null);
                this.g = null;
                this.f = 1;
                obj = pvbVar.D(vsbVar, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            poeVar = (oe0) obj;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            mjg mjgVar = p8iVar.m;
            Long l = new Long(((oe0) poeVar).e);
            mjgVar.getClass();
            mjgVar.j(null, l);
            sgg sggVar = p8iVar.q;
            if (sggVar != null) {
                sggVar.b(null);
            }
            p8iVar.q = null;
            p8iVar.q = a8j.t(p8iVar, null, new aug(p8iVar, null, 2), 3);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            a8j.x(p8iVar.o, new k7i(0, 6, vzl.b(thA)));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086 A[LOOP:0: B:20:0x0080->B:22:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    private final Object o(Object obj) {
        mjg mjgVar;
        ?? SingletonList;
        mjg mjgVar2;
        Object value;
        jci jciVar = (jci) this.h;
        mjg mjgVar3 = jciVar.n;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            mh4 mh4Var = (mh4) jciVar.e.getValue();
            long j = jciVar.d;
            this.f = 1;
            if (mh4Var.a(j, this) != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mjgVar = (mjg) this.g;
            ch3.d0(obj);
        }
        mjgVar.setValue(obj);
        if (((Collection) mjgVar3.getValue()).isEmpty()) {
            SingletonList = Collections.singletonList(new wbi(7, new tnh(R.string.unknown_call_block_default_block_reason)));
        } else {
            Iterable<h54> iterable = (Iterable) mjgVar3.getValue();
            SingletonList = new ArrayList(yw3.W0(iterable, 10));
            for (h54 h54Var : iterable) {
                SingletonList.add(new wbi(h54Var.a, new xnh(h54Var.b)));
            }
        }
        mjgVar2 = jciVar.o;
        do {
            value = mjgVar2.getValue();
        } while (!mjgVar2.h(value, new ici(new tnh(R.string.unknown_call_botton_sheet_blocking_title), new tnh(R.string.unknown_call_botton_sheet_blocking_subtitle), SingletonList, 2)));
        sa2.i(jciVar.B(), jciVar.c);
        return sbi.a;
        this.g = mjgVar3;
        this.f = 2;
        obj = yab.K0(((n0c) ((xhh) jciVar.h.getValue())).b(), new ryf(jciVar, null, 26), this);
        if (obj != hu4Var) {
            mjgVar = mjgVar3;
            mjgVar.setValue(obj);
            if (((Collection) mjgVar3.getValue()).isEmpty()) {
                Iterable<h54> iterable2 = (Iterable) mjgVar3.getValue();
                SingletonList = new ArrayList(yw3.W0(iterable2, 10));
                while (r9.hasNext()) {
                    SingletonList.add(new wbi(h54Var.a, new xnh(h54Var.b)));
                }
            } else {
                SingletonList = Collections.singletonList(new wbi(7, new tnh(R.string.unknown_call_block_default_block_reason)));
            }
            mjgVar2 = jciVar.o;
            do {
                value = mjgVar2.getValue();
            } while (!mjgVar2.h(value, new ici(new tnh(R.string.unknown_call_botton_sheet_blocking_title), new tnh(R.string.unknown_call_botton_sheet_blocking_subtitle), SingletonList, 2)));
            sa2.i(jciVar.B(), jciVar.c);
            return sbi.a;
        }
        return hu4Var;
    }

    private final Object p(Object obj) {
        vfi vfiVar = (vfi) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            if (vfiVar.a()) {
                zgi zgiVar = (zgi) this.h;
                this.g = null;
                this.f = 1;
                Object objJ = zgiVar.j(vfiVar, this);
                hu4 hu4Var = hu4.a;
                if (objJ == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new ryf((a4c) this.g, (syf) obj2, lq4Var, 0);
            case 1:
                return new ryf((xde) obj2, lq4Var, 1);
            case 2:
                return new ryf((qf7) this.g, (tg8) obj2, lq4Var, 2);
            case 3:
                return new ryf((StartConversationScreen) this.g, (qn7) obj2, lq4Var, 3);
            case 4:
                ryf ryfVar = new ryf((xhg) obj2, lq4Var, 4);
                ryfVar.g = obj;
                return ryfVar;
            case 5:
                return new ryf((xhg) this.g, (pj4) obj2, lq4Var, 5);
            case 6:
                ryf ryfVar2 = new ryf((gjg) obj2, lq4Var, 6);
                ryfVar2.g = obj;
                return ryfVar2;
            case 7:
                return new ryf((eog) obj2, lq4Var, 7);
            case 8:
                return new ryf((spg) this.g, (Set) obj2, lq4Var, 8);
            case 9:
                ryf ryfVar3 = new ryf((kpg) obj2, lq4Var, 9);
                ryfVar3.g = obj;
                return ryfVar3;
            case 10:
                return new ryf((List) this.g, (bqg) obj2, lq4Var, 10);
            case 11:
                return new ryf((vzg) this.g, (rzg) obj2, lq4Var, 11);
            case 12:
                ryf ryfVar4 = new ryf((StoryPublishWorker) obj2, lq4Var, 12);
                ryfVar4.g = obj;
                return ryfVar4;
            case 13:
                return new ryf((x9h) this.g, (CharSequence) obj2, lq4Var, 13);
            case 14:
                ryf ryfVar5 = new ryf((jah) obj2, lq4Var, 14);
                ryfVar5.g = obj;
                return ryfVar5;
            case 15:
                return new ryf((jah) obj2, lq4Var, 15);
            case 16:
                return new ryf((jah) obj2, lq4Var, 16);
            case 17:
                return new ryf((ldh) this.g, (ArrayList) obj2, lq4Var, 17);
            case 18:
                return new ryf((jaf) this.g, (vdh) obj2, lq4Var, 18);
            case 19:
                return new ryf((ceh) this.g, (ArrayList) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ryf((hgh) this.g, (SystemServicesManager$PushTokenGeneratedListener) obj2, lq4Var, 20);
            case 21:
                return new ryf((hgh) obj2, lq4Var, 21);
            case 22:
                return new ryf((j6i) this.g, (CharSequence) obj2, lq4Var, 22);
            case 23:
                ryf ryfVar6 = new ryf((b7i) obj2, lq4Var, 23);
                ryfVar6.g = obj;
                return ryfVar6;
            case 24:
                ryf ryfVar7 = new ryf((x7i) obj2, lq4Var, 24);
                ryfVar7.g = obj;
                return ryfVar7;
            case 25:
                ryf ryfVar8 = new ryf((p8i) obj2, lq4Var, 25);
                ryfVar8.g = obj;
                return ryfVar8;
            case 26:
                ryf ryfVar9 = new ryf((jci) obj2, lq4Var, 26);
                ryfVar9.g = obj;
                return ryfVar9;
            case 27:
                return new ryf((jci) obj2, lq4Var, 27);
            case 28:
                ryf ryfVar10 = new ryf((zgi) obj2, lq4Var, 28);
                ryfVar10.g = obj;
                return ryfVar10;
            default:
                return new ryf((UploadFileAttachWorker) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((ryf) create((vj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((ryf) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            case 7:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((ryf) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((ryf) create((x2h) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((ryf) create((c11) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((ryf) create((vfi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ryf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:281:0x04de  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:285:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:290:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:362:0x0664  */
    /* JADX WARN: Code duplicated, block: B:508:0x099d A[PHI: r3 r5
  0x099d: PHI (r3v11 a9g) = (r3v17 a9g), (r3v20 a9g) binds: [B:512:0x09c6, B:507:0x0994] A[DONT_GENERATE, DONT_INLINE]
  0x099d: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:512:0x09c6, B:507:0x0994] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dd, code lost:
    
        if (defpackage.j6i.B(r1, r0, r10, r19) == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e6, code lost:
    
        if (defpackage.j6i.D(r1, r0, r19) == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0351, code lost:
    
        if (r0 == r2) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x039c, code lost:
    
        if (defpackage.jah.b(r3, r5, r0, r19) == r2) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x039f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04d4, code lost:
    
        if (r1 == r14) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05cf, code lost:
    
        if (r12.emit(r10, r19) == r14) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0685, code lost:
    
        if (r0.v(r19) == r1) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0783, code lost:
    
        if (r3.i(r5, r19) == r2) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0798, code lost:
    
        if (r3.n(r5, r19) == r2) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x09d1, code lost:
    
        if (r3.invoke(r5, r19) == r2) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v97, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v72 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:515:0x09d1 -> B:517:0x09d5). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryf(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
