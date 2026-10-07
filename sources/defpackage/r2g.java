package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import one.me.android.root.RootController;
import one.me.location.map.show.ShowLocationScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r2g extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ShowLocationScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2g(lq4 lq4Var, ShowLocationScreen showLocationScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = showLocationScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ShowLocationScreen showLocationScreen = this.g;
        switch (i) {
            case 0:
                r2g r2gVar = new r2g(lq4Var, showLocationScreen, 0);
                r2gVar.f = obj;
                return r2gVar;
            case 1:
                r2g r2gVar2 = new r2g(lq4Var, showLocationScreen, 1);
                r2gVar2.f = obj;
                return r2gVar2;
            default:
                r2g r2gVar3 = new r2g(lq4Var, showLocationScreen, 2);
                r2gVar3.f = obj;
                return r2gVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((r2g) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((r2g) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((r2g) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01db  */
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
        String str;
        in9 neVar;
        cok tnkVar;
        kc4 kc4Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        ShowLocationScreen showLocationScreen = this.g;
        String str2 = null;
        str2 = null;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                v2g v2gVar = (v2g) obj2;
                u2g u2gVar = v2gVar.a;
                if (showLocationScreen.o == null && u2gVar != null) {
                    LatLng latLng = u2gVar.a;
                    po7 po7Var = showLocationScreen.r;
                    if (po7Var != null) {
                        jn9 jn9Var = new jn9();
                        jn9Var.i = false;
                        jn9Var.j = 0.0f;
                        jn9Var.k = 0.5f;
                        jn9Var.l = 0.0f;
                        jn9Var.m = 1.0f;
                        jn9Var.o = 0;
                        jn9Var.a = latLng;
                        jn9Var.e = 0.5f;
                        jn9Var.f = 0.95f;
                        jn9Var.h = true;
                        jn9Var.d = oel.b(u2gVar.c);
                        try {
                            y8l y8lVar = po7Var.a;
                            Parcel parcelL0 = y8lVar.l0();
                            duk.c(parcelL0, jn9Var);
                            Parcel parcelK0 = y8lVar.k0(11, parcelL0);
                            IBinder strongBinder = parcelK0.readStrongBinder();
                            int i2 = xnk.d;
                            if (strongBinder == null) {
                                tnkVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                                tnkVar = iInterfaceQueryLocalInterface instanceof cok ? (cok) iInterfaceQueryLocalInterface : new tnk(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 2);
                            }
                            parcelK0.recycle();
                            if (tnkVar != null) {
                                neVar = jn9Var.q == 1 ? new ne(tnkVar) : new in9(tnkVar);
                            } else {
                                neVar = null;
                            }
                        } catch (RemoteException e) {
                            f4a.d(e);
                            return null;
                        }
                    } else {
                        neVar = null;
                    }
                    showLocationScreen.o = neVar;
                    float f = v2gVar.a.b;
                    po7 po7Var2 = showLocationScreen.r;
                    if (po7Var2 != null) {
                        po7Var2.b(wjl.d(latLng, f));
                    }
                }
                yc9 yc9Var = (yc9) showLocationScreen.q.m(showLocationScreen, ShowLocationScreen.v[10]);
                yc9Var.f.setText(v2gVar.f);
                ynh ynhVar = v2gVar.b;
                yc9Var.d.setText(ynhVar != null ? ynhVar.d(yc9Var) : null);
                String str3 = v2gVar.c;
                s2g s2gVar = new s2g(showLocationScreen, 0);
                yc9Var.e.setText(str3);
                yc9Var.setOnClickListener(s2gVar);
                ynh ynhVar2 = v2gVar.d;
                if (ynhVar2 != null && (str = v2gVar.e) != null) {
                    str2 = str + " " + ((Object) ynhVar2.d(yc9Var));
                }
                s2g s2gVar2 = new s2g(showLocationScreen, 1);
                TextView textView = yc9Var.g;
                textView.setText(str2);
                qe7.H(textView, 300L, s2gVar2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                n2g n2gVar = (n2g) obj2;
                if (cqk.d(n2gVar, m2g.a)) {
                    zv8[] zv8VarArr = ShowLocationScreen.v;
                    wsc wscVar = (wsc) showLocationScreen.t.getValue();
                    svj svjVar = (svj) showLocationScreen.j.getValue();
                    wscVar.getClass();
                    wsc.q(wscVar, svjVar, wsc.l, 169, R.string.permissions_location_rationale_description, R.string.permissions_location_rationale_title, null, 32);
                    return sbiVar;
                }
                if (!(n2gVar instanceof l2g)) {
                    ore.o();
                    return null;
                }
                l2g l2gVar = (l2g) n2gVar;
                Float f2 = l2gVar.c;
                double d = l2gVar.a;
                double d2 = l2gVar.b;
                ex8 ex8VarC = f2 == null ? wjl.c(new LatLng(d, d2)) : wjl.d(new LatLng(d, d2), f2.floatValue());
                po7 po7Var3 = showLocationScreen.r;
                if (po7Var3 == null) {
                    return sbiVar;
                }
                po7Var3.b(ex8VarC);
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof o2g) {
                    ArrayList<km5> arrayList = ((o2g) rbbVar).b;
                    zv8[] zv8VarArr2 = ShowLocationScreen.v;
                    jc4 jc4VarC = p.c(R.string.oneme_location_map_open_in, null, null, 6);
                    for (km5 km5Var : arrayList) {
                        switch (km5Var.b) {
                            case "yandex_navigator":
                                kc4Var = new kc4(2, new tnh(R.string.oneme_location_map_open_in_ya_nav), 2, 48);
                                break;
                            case "yandex_maps":
                                kc4Var = new kc4(1, new tnh(R.string.oneme_location_map_open_in_ya_maps), 2, 48);
                                break;
                            case "google_maps":
                                kc4Var = new kc4(4, new tnh(R.string.oneme_location_map_open_in_g_maps), 2, 48);
                                break;
                            case "2gis":
                                kc4Var = new kc4(3, new tnh(R.string.oneme_location_map_open_in_tg_maps), 2, 48);
                                break;
                            default:
                                kc4Var = null;
                                break;
                        }
                        if (kc4Var != null) {
                            jc4VarC.a(kc4Var);
                            showLocationScreen.s.put(Integer.valueOf(kc4Var.a), km5Var.a);
                        }
                    }
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(showLocationScreen);
                    confirmationBottomSheetF.setTargetController(showLocationScreen);
                    br4 parentController = showLocationScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbiVar;
        }
    }
}
