package defpackage;

import android.view.VelocityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import one.me.android.root.RootController;
import one.me.mediapicker.crop.AspectRatiosBottomSheet;
import one.me.mediapicker.crop.CropPhotoScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fx4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CropPhotoScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx4(lq4 lq4Var, CropPhotoScreen cropPhotoScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = cropPhotoScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CropPhotoScreen cropPhotoScreen = this.g;
        switch (i) {
            case 0:
                fx4 fx4Var = new fx4(lq4Var, cropPhotoScreen, 0);
                fx4Var.f = obj;
                return fx4Var;
            case 1:
                fx4 fx4Var2 = new fx4(lq4Var, cropPhotoScreen, 1);
                fx4Var2.f = obj;
                return fx4Var2;
            default:
                fx4 fx4Var3 = new fx4(lq4Var, cropPhotoScreen, 2);
                fx4Var3.f = obj;
                return fx4Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((fx4) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((fx4) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((fx4) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028b  */
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
    public final Object invokeSuspend(Object obj) {
        yw4 yw4Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = null;
        CropPhotoScreen cropPhotoScreen = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                wx4 wx4Var = (wx4) obj3;
                j8e j8eVar = cropPhotoScreen.k;
                zv8[] zv8VarArr = CropPhotoScreen.p;
                ((rcc) j8eVar.m(cropPhotoScreen, zv8VarArr[4])).setLeftActionEnabled(wx4Var.a);
                ((rcc) cropPhotoScreen.k.m(cropPhotoScreen, zv8VarArr[4])).setRightPrimaryActionEnabled(wx4Var.b);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj3;
                if (cqk.d(rbbVar, jk0.b)) {
                    tnh tnhVar = new tnh(R.string.common_error);
                    zv8[] zv8VarArr2 = CropPhotoScreen.p;
                    h8c h8cVar = new h8c(cropPhotoScreen);
                    h8cVar.m(tnhVar);
                    h8cVar.p();
                    c1a.b.b().f();
                } else if (cqk.d(rbbVar, lk0.b)) {
                    tnh tnhVar2 = new tnh(R.string.min_avatar_size_error);
                    zv8[] zv8VarArr3 = CropPhotoScreen.p;
                    h8c h8cVar2 = new h8c(cropPhotoScreen);
                    h8cVar2.m(tnhVar2);
                    h8cVar2.p();
                } else if (rbbVar instanceof kk0) {
                    kk0 kk0Var = (kk0) rbbVar;
                    long j = kk0Var.d;
                    if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f || Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
                        tnh tnhVar3 = new tnh(R.string.min_avatar_size_error);
                        zv8[] zv8VarArr4 = CropPhotoScreen.p;
                        h8c h8cVar3 = new h8c(cropPhotoScreen);
                        h8cVar3.m(tnhVar3);
                        h8cVar3.p();
                    } else {
                        cropPhotoScreen.l.set(0.0f, 0.0f, 1.0f, 1.0f);
                        hve router = cropPhotoScreen.getRouter();
                        zv zvVar = new zv();
                        zvVar.addLast(router);
                        while (!zvVar.isEmpty()) {
                            ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                            int iO0 = xw3.O0(arrayListE);
                            while (true) {
                                if (-1 < iO0) {
                                    br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                                    if (br4Var instanceof yw4) {
                                        obj2 = br4Var;
                                        yw4Var = (yw4) obj2;
                                        if (yw4Var != null) {
                                            yw4Var.A0(new suc(cropPhotoScreen.l, kk0Var.b, kk0Var.c, kk0Var.f));
                                        }
                                    } else {
                                        Iterator it = new upe(br4Var.getChildRouters()).iterator();
                                        while (true) {
                                            ListIterator listIterator = ((tpe) it).b;
                                            if (listIterator.hasPrevious()) {
                                                zvVar.addLast((hve) listIterator.previous());
                                            }
                                        }
                                        iO0--;
                                    }
                                }
                            }
                        }
                        yw4Var = (yw4) obj2;
                        if (yw4Var != null) {
                            yw4Var.A0(new suc(cropPhotoScreen.l, kk0Var.b, kk0Var.c, kk0Var.f));
                        }
                    }
                } else if (cqk.d(rbbVar, rt3.b)) {
                    c1a.b.b().f();
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                sw4 sw4Var = (sw4) obj3;
                if (sw4Var instanceof kw4) {
                    zv8[] zv8VarArr5 = CropPhotoScreen.p;
                    cropPhotoScreen.t1().H();
                    return sbiVar;
                }
                if (sw4Var instanceof gw4) {
                    zv8[] zv8VarArr6 = CropPhotoScreen.p;
                    cropPhotoScreen.t1().B();
                    return sbiVar;
                }
                if (sw4Var instanceof hw4) {
                    zv8[] zv8VarArr7 = CropPhotoScreen.p;
                    z0c z0cVarS1 = cropPhotoScreen.s1();
                    z0cVarS1.v.forceFinished(true);
                    z0cVarS1.c(0.0f);
                    return sbiVar;
                }
                if (sw4Var instanceof qw4) {
                    zv8[] zv8VarArr8 = CropPhotoScreen.p;
                    z0c z0cVarS2 = cropPhotoScreen.s1();
                    zv8[] zv8VarArr9 = z0c.z;
                    z0cVarS2.v.forceFinished(true);
                    boolean z = z0cVarS2.x;
                    z0cVarS2.x = false;
                    VelocityTracker velocityTracker = z0cVarS2.w;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    z0cVarS2.w = null;
                    z0cVarS2.y = z0cVarS2.a(z0cVarS2.q);
                    z0cVarS2.invalidate();
                    if (!z) {
                        return sbiVar;
                    }
                    z0cVarS2.b();
                    y0c y0cVar = z0cVarS2.u;
                    if (y0cVar == null) {
                        return sbiVar;
                    }
                    a8j.x(((CropPhotoScreen) y0cVar).v1().j, fw4.a);
                    return sbiVar;
                }
                if (sw4Var instanceof jw4) {
                    zv8[] zv8VarArr10 = CropPhotoScreen.p;
                    cropPhotoScreen.t1().G();
                    return sbiVar;
                }
                if (sw4Var instanceof ew4) {
                    float f = ((ew4) sw4Var).a;
                    zv8[] zv8VarArr11 = CropPhotoScreen.p;
                    cropPhotoScreen.t1().t(f);
                    return sbiVar;
                }
                if (sw4Var instanceof lw4) {
                    float f2 = ((lw4) sw4Var).a;
                    zv8[] zv8VarArr12 = CropPhotoScreen.p;
                    cropPhotoScreen.s1().setAngle(f2);
                    return sbiVar;
                }
                if (sw4Var instanceof mw4) {
                    zv8[] zv8VarArr13 = CropPhotoScreen.p;
                    mx4 mx4VarT1 = cropPhotoScreen.t1();
                    mw4 mw4Var = (mw4) sw4Var;
                    int i2 = mw4Var.a;
                    int i3 = mw4Var.b;
                    if (mx4VarT1.K(mx4VarT1.getWidth(), mx4VarT1.getHeight()) || i2 <= 0 || i3 <= 0) {
                        return sbiVar;
                    }
                    mx4VarT1.s();
                    mx4VarT1.o(i2 / i3);
                    return sbiVar;
                }
                if (sw4Var instanceof iw4) {
                    zv8[] zv8VarArr14 = CropPhotoScreen.p;
                    mx4 mx4VarT2 = cropPhotoScreen.t1();
                    if (mx4VarT2.K(mx4VarT2.getWidth(), mx4VarT2.getHeight())) {
                        return sbiVar;
                    }
                    mx4VarT2.s();
                    float f3 = mx4VarT2.H / mx4VarT2.I;
                    if (mx4VarT2.L1 % 2 != 0) {
                        f3 = 1.0f / f3;
                    }
                    mx4VarT2.o(f3);
                    return sbiVar;
                }
                if (sw4Var instanceof nw4) {
                    zv8[] zv8VarArr15 = CropPhotoScreen.p;
                    zv8[] zv8VarArr16 = BottomSheetWidget.t;
                    AspectRatiosBottomSheet aspectRatiosBottomSheet = new AspectRatiosBottomSheet(cropPhotoScreen.b, cropPhotoScreen.v1().d);
                    aspectRatiosBottomSheet.setTargetController(cropPhotoScreen);
                    br4 parentController = cropPhotoScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 == null) {
                        return sbiVar;
                    }
                    lve lveVar = new lve(aspectRatiosBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                    return sbiVar;
                }
                if (sw4Var instanceof ow4) {
                    mrk.d(cropPhotoScreen);
                    return sbiVar;
                }
                if (!(sw4Var instanceof rw4)) {
                    if (sw4Var instanceof pw4) {
                        zv8[] zv8VarArr17 = CropPhotoScreen.p;
                        cropPhotoScreen.t1().L();
                        return sbiVar;
                    }
                    if (!(sw4Var instanceof fw4)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr18 = CropPhotoScreen.p;
                    cropPhotoScreen.t1().x();
                    return sbiVar;
                }
                rw4 rw4Var = (rw4) sw4Var;
                zv8[] zv8VarArr19 = CropPhotoScreen.p;
                mx4 mx4VarT3 = cropPhotoScreen.t1();
                mx4VarT3.H1 = rw4Var.a;
                mx4VarT3.M();
                rx4 rx4VarV1 = cropPhotoScreen.v1();
                float f4 = rw4Var.b;
                if (rx4VarV1.c != jx4.b) {
                    return sbiVar;
                }
                a8j.x(rx4VarV1.j, new lw4(f4));
                return sbiVar;
        }
    }
}
