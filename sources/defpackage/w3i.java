package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.main.MainScreen;
import one.me.transparent.TransparentWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class w3i extends mdh implements qf7 {
    public final /* synthetic */ x3i e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3i(x3i x3iVar, Bundle bundle, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = x3iVar;
        this.f = bundle;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new w3i(this.e, this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        w3i w3iVar = (w3i) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        w3iVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        lve lveVar;
        boolean z2;
        boolean z3;
        a4c a4cVar;
        je9 je9Var;
        lve lveVar2;
        br4 br4Var;
        MainScreen mainScreen;
        boolean zEquals;
        br4 br4Var2;
        sbi sbiVar = sbi.a;
        ch3.d0(obj);
        x3i x3iVar = this.e;
        zv8[] zv8VarArr = x3i.w;
        hve hveVarW1 = x3iVar.e().w1();
        ArrayList arrayListE = hveVarW1.e();
        if (!arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                if (((lve) it.next()).a instanceof TransparentWidget) {
                }
            }
            lve lveVar3 = new lve(new TransparentWidget(this.f), null, null, null, false, -1);
            z = false;
            lveVar3.c(new r7g(false));
            lveVar3.a(new r7g(true));
            lveVar = (lve) ww3.t1(this.e.e().w1().e());
            if (lveVar != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.g) {
                    lveVar2 = (lve) ww3.t1(this.e.e().w1().e());
                    if (lveVar2 != null) {
                        br4Var = lveVar2.a;
                    } else {
                        br4Var = null;
                    }
                    if (br4Var instanceof MainScreen) {
                        mainScreen = (MainScreen) br4Var;
                    } else {
                        mainScreen = null;
                    }
                    if (mainScreen == null) {
                        zEquals = false;
                    } else {
                        pk9.c.getClass();
                        zEquals = ((rxb) mainScreen.y1().i.a.getValue()).d.equals(v65.a(pk9.g.a));
                    }
                    if (zEquals) {
                        z = true;
                    }
                } else {
                    z = true;
                }
            }
            zv8[] zv8VarArr2 = x3i.w;
            z3 = this.g;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "TransparentLogic", zo5.q("Try show transparent popup, onlyChats:", ", showOnMain:", z3, z), null);
                }
            }
            if (!this.h) {
            }
            hveVarW1.I(lveVar3);
            return sbiVar;
        }
        lve lveVar4 = new lve(new TransparentWidget(this.f), null, null, null, false, -1);
        z = false;
        lveVar4.c(new r7g(false));
        lveVar4.a(new r7g(true));
        lveVar = (lve) ww3.t1(this.e.e().w1().e());
        if (lveVar != null || (br4Var2 = lveVar.a) == null) {
            z2 = false;
        } else {
            z2 = br4Var2 instanceof MainScreen;
        }
        if (z2 && hveVarW1.e().size() == 1) {
            if (this.g) {
                z = true;
            } else {
                lveVar2 = (lve) ww3.t1(this.e.e().w1().e());
                if (lveVar2 != null) {
                    br4Var = lveVar2.a;
                } else {
                    br4Var = null;
                }
                if (br4Var instanceof MainScreen) {
                    mainScreen = (MainScreen) br4Var;
                } else {
                    mainScreen = null;
                }
                if (mainScreen == null) {
                    zEquals = false;
                } else {
                    pk9.c.getClass();
                    zEquals = ((rxb) mainScreen.y1().i.a.getValue()).d.equals(v65.a(pk9.g.a));
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        zv8[] zv8VarArr3 = x3i.w;
        z3 = this.g;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "TransparentLogic", zo5.q("Try show transparent popup, onlyChats:", ", showOnMain:", z3, z), null);
            }
        }
        if (!this.h || z) {
            hveVarW1.I(lveVar4);
            return sbiVar;
        }
        return sbiVar;
    }
}
