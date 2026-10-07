package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.sdk.vendor.rustore.push.RustoreMessagingService;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class gce extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gce(xqf xqfVar, lq4 lq4Var, xqf xqfVar2) {
        super(2, lq4Var);
        this.e = 26;
        this.g = xqfVar;
        this.h = xqfVar2;
    }

    private final Object l(Object obj) {
        ArrayList<vg4> arrayList;
        Object value;
        LinkedHashMap linkedHashMap;
        brf brfVar = (brf) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            ArrayList arrayList2 = new ArrayList(((no4) brfVar.e.getValue()).a.g(bi4.l, bi4.o));
            mm4 mm4Var = (mm4) brfVar.g.getValue();
            this.g = arrayList2;
            this.f = 1;
            Object objA = mm4Var.a(arrayList2, this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
            arrayList = arrayList2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.g;
            ch3.d0(obj);
        }
        mjg mjgVar = brfVar.k;
        do {
            value = mjgVar.getValue();
            int iP0 = wm9.P0(yw3.W0(arrayList, 10));
            if (iP0 < 16) {
                iP0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iP0);
            for (vg4 vg4Var : arrayList) {
                linkedHashMap.put(new Long(vg4Var.v()), brf.B(brfVar, vg4Var));
            }
        } while (!mjgVar.h(value, linkedHashMap));
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                gce gceVar = new gce((jce) obj2, lq4Var, 0);
                gceVar.g = obj;
                return gceVar;
            case 1:
                gce gceVar2 = new gce((RecordControlsWidget) obj2, lq4Var, 1);
                gceVar2.g = obj;
                return gceVar2;
            case 2:
                gce gceVar3 = new gce((dge) obj2, lq4Var, 2);
                gceVar3.g = obj;
                return gceVar3;
            case 3:
                return new gce((dme) this.g, (aq) obj2, lq4Var, 3);
            case 4:
                return new gce((dme) this.g, (ah9) obj2, lq4Var, 4);
            case 5:
                return new gce((kwe) this.g, (Context) obj2, lq4Var, 5);
            case 6:
                return new gce((RustoreMessagingService) obj2, lq4Var, 6);
            case 7:
                gce gceVar4 = new gce((mye) obj2, lq4Var, 7);
                gceVar4.g = obj;
                return gceVar4;
            case 8:
                gce gceVar5 = new gce((n5f) obj2, lq4Var, 8);
                gceVar5.g = obj;
                return gceVar5;
            case 9:
                return new gce((r8f) this.g, (r73) obj2, lq4Var, 9);
            case 10:
                return new gce((r8f) this.g, (yq0) obj2, lq4Var, 10);
            case 11:
                gce gceVar6 = new gce((w8f) obj2, lq4Var, 11);
                gceVar6.g = obj;
                return gceVar6;
            case 12:
                gce gceVar7 = new gce((d9f) obj2, lq4Var, 12);
                gceVar7.g = obj;
                return gceVar7;
            case 13:
                gce gceVar8 = new gce(lq4Var, (SelectedMediaBottomBarWidget) obj2);
                gceVar8.g = obj;
                return gceVar8;
            case 14:
                gce gceVar9 = new gce((ygf) obj2, lq4Var, 14);
                gceVar9.g = obj;
                return gceVar9;
            case 15:
                return new gce((ahf) this.g, (azg) obj2, lq4Var, 15);
            case 16:
                return new gce((wjf) this.g, (Long) obj2, lq4Var, 16);
            case 17:
                return new gce((fkf) obj2, lq4Var, 17);
            case 18:
                return new gce((rkf) obj2, lq4Var, 18);
            case 19:
                return new gce((wkf) this.g, (sfa) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new gce((ipf) this.g, (gpf) obj2, lq4Var, 20);
            case 21:
                return new gce((kpf) this.g, (fof) obj2, lq4Var, 21);
            case 22:
                return new gce((kpf) this.g, (cof) obj2, lq4Var, 22);
            case 23:
                return new gce((kpf) this.g, (yq0) obj2, lq4Var, 23);
            case 24:
                gce gceVar10 = new gce((xpf) obj2, lq4Var, 24);
                gceVar10.g = obj;
                return gceVar10;
            case 25:
                return new gce((xpf) this.g, (dqe) obj2, lq4Var, 25);
            case 26:
                return new gce((xqf) this.g, lq4Var, (xqf) obj2);
            case 27:
                return new gce((xqf) this.g, (mui) obj2, lq4Var, 27);
            case 28:
                return new gce((brf) obj2, lq4Var, 28);
            default:
                return new gce((s71) this.g, (kwf) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((gce) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((gce) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((gce) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((gce) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((gce) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((gce) create((d4b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((gce) create((u8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((gce) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0407  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:356:0x06c6 A[PHI: r3 r10
  0x06c6: PHI (r3v35 java.lang.Object) = (r3v56 java.lang.Object), (r3v64 java.lang.Object) binds: [B:354:0x06c2, B:351:0x0697] A[DONT_GENERATE, DONT_INLINE]
  0x06c6: PHI (r10v9 h41) = (r10v10 h41), (r10v12 h41) binds: [B:354:0x06c2, B:351:0x0697] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:358:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:360:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:364:0x0700  */
    /* JADX WARN: Code duplicated, block: B:366:0x0704  */
    /* JADX WARN: Code duplicated, block: B:368:0x072d  */
    /* JADX WARN: Code duplicated, block: B:370:0x0786  */
    /* JADX WARN: Code duplicated, block: B:372:0x078a  */
    /* JADX WARN: Code duplicated, block: B:373:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:375:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:378:0x07cb A[LOOP:2: B:376:0x07c5->B:378:0x07cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:380:0x07e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:383:0x0802  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102, types: [int] */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v147 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v50 java.lang.Object, still in use, count: 2, list:
          (r8v50 java.lang.Object) from 0x0081: PHI (r8 I:??) = (r8v47 java.lang.Object), (r8v50 java.lang.Object) binds: [B:24:0x0080, B:578:0x0081] A[DONT_GENERATE, DONT_INLINE]
          (r8v50 java.lang.Object) from 0x0079: CHECK_CAST (r71) (r8v50 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 3114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gce.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gce(lq4 lq4Var, SelectedMediaBottomBarWidget selectedMediaBottomBarWidget) {
        super(2, lq4Var);
        this.e = 13;
        this.h = selectedMediaBottomBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gce(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gce(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
