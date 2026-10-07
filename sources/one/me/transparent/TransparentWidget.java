package one.me.transparent;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a4c;
import defpackage.a4i;
import defpackage.af7;
import defpackage.bb;
import defpackage.br4;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.gm0;
import defpackage.hve;
import defpackage.jc4;
import defpackage.je9;
import defpackage.kc4;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mol;
import defpackage.n0c;
import defpackage.ny8;
import defpackage.oc4;
import defpackage.ore;
import defpackage.p;
import defpackage.p7g;
import defpackage.rx8;
import defpackage.svj;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.u3i;
import defpackage.vhe;
import defpackage.vv;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.x3i;
import defpackage.xb9;
import defpackage.xhh;
import defpackage.xnh;
import defpackage.yab;
import defpackage.ynh;
import defpackage.yr8;
import defpackage.ysc;
import defpackage.z3i;
import defpackage.z5h;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.informer.InformerBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/transparent/TransparentWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "yr8", "beta"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TransparentWidget extends Widget implements mc4 {
    public final vv a;
    public final vv b;
    public final wtc c;
    public final vv d;
    public final x3i e;
    public final xhh f;
    public final ny8 g;
    public final ny8 h;
    public InformerBottomSheet i;
    public af7 j;
    public final String k;
    public final ny8 l;
    public static final /* synthetic */ zv8[] n = {new dwd(TransparentWidget.class, "messageId", "getMessageId()Ljava/lang/Long;", 0), zo5.f(zfe.a, TransparentWidget.class, "informerId", "getInformerId()Ljava/lang/String;", 0), new dwd(TransparentWidget.class, "isPrimaryAction", "isPrimaryAction()Z", 0), new z8b(TransparentWidget.class, "version", "getVersion()Ljava/lang/CharSequence;")};
    public static final yr8 m = new yr8(13);

    public TransparentWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Long.class, null, "message_id");
        this.a = new vv(String.class, null, "informer_id");
        this.b = new vv(Boolean.class, Boolean.FALSE, "is_primary");
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = new vv(CharSequence.class, "", "ver");
        this.e = wtcVar.h();
        xhh xhhVar = (xhh) wtcVar.getAccessor().c(23);
        this.f = xhhVar;
        this.g = wtcVar.getAccessor().d(136);
        this.h = ysc.a.a();
        this.k = TransparentWidget.class.getName();
        this.l = rx8.P(3, new z3i(this, 0));
        zv8 zv8Var = n[0];
        Long l = (Long) vvVar.a(this);
        if (l != null) {
            yab.i0(getLifecycleScope(), ((n0c) xhhVar).a(), 0, new p7g(this, l, (lq4) null, 12), 2);
        } else {
            addLifecycleListener(new a4i(this, 1));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        je9 je9Var = je9.d;
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onButtonClick " + i + ", " + bundle, null);
        }
        if (i == 0) {
            xb9 xb9Var = (xb9) this.e.j.getValue();
            xb9Var.c1.B(xb9Var, xb9.g1[47], Long.valueOf(System.currentTimeMillis()));
        } else if (i != 1) {
            if (i == 2) {
                if (!o1().c(wsc.o)) {
                    o1().o(new svj(this, 1));
                    return;
                } else {
                    x3i x3iVar = this.e;
                    yab.i0(x3iVar.d, null, 0, new u3i(x3iVar, null, 2), 3);
                }
            }
        } else {
            if (p1()) {
                return;
            }
            boolean zC = o1().c(wsc.o);
            String str2 = this.k;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.s("onButtonClick: permissions.checkStoragePermission()=", zC), null);
            }
            String str3 = this.k;
            if (!zC) {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, "onButtonClick: permissions.requestStorageNoRationale", null);
                }
                o1().o(new svj(this, 1));
                return;
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str3, "onButtonClick: request primary action", null);
            }
            x3i x3iVar2 = this.e;
            yab.i0(x3iVar2.d, null, 0, new u3i(x3iVar2, null, 3), 3);
        }
        getRouter().C(this);
    }

    public final wsc o1() {
        return (wsc) this.h.getValue();
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        PackageManager packageManager;
        super.onActivityResult(i, i2, intent);
        if (i == 130 && (packageManager = getContext().getPackageManager()) != null && packageManager.canRequestPackageInstalls()) {
            r1();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(layoutInflater.getContext());
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        InformerBottomSheet informerBottomSheet = this.i;
        if (informerBottomSheet != null) {
            informerBottomSheet.v1(false);
        }
        this.i = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (o1().c(wsc.o)) {
            r1();
        }
    }

    public final boolean p1() {
        PackageManager packageManager = getContext().getPackageManager();
        if (packageManager == null || packageManager.canRequestPackageInstalls()) {
            return false;
        }
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onButtonClick: req permission", null);
            }
        }
        startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getContext().getPackageName())), 130);
        return true;
    }

    public final boolean q1() {
        if (Build.VERSION.SDK_INT > 29 || o1().c(wsc.o)) {
            return false;
        }
        o1().o(new svj(this, 1));
        return true;
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
    public final void r1() {
        String str;
        ynh tnhVar;
        xnh xnhVar;
        hve hveVarU1;
        String str2;
        Map map;
        Map map2;
        TransparentWidget transparentWidget = this;
        gm0.n(transparentWidget.k, "Show model");
        vv vvVar = transparentWidget.a;
        zv8[] zv8VarArr = n;
        zv8 zv8Var = zv8VarArr[1];
        if (((String) vvVar.a(transparentWidget)) != null) {
            gm0.n(transparentWidget.k, "Show informer model");
            if (transparentWidget.i != null) {
                String str3 = transparentWidget.k;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "Informer already visible", null);
                    return;
                }
                return;
            }
            zv8[] zv8VarArr2 = BottomSheetWidget.t;
            t3f b = transparentWidget.getB();
            vv vvVar2 = transparentWidget.a;
            zv8 zv8Var2 = zv8VarArr[1];
            String str4 = (String) vvVar2.a(transparentWidget);
            if (str4 == null) {
                ore.p("Required value was null.");
                return;
            }
            InformerBottomSheet informerBottomSheet = new InformerBottomSheet(b, str4);
            transparentWidget.i = informerBottomSheet;
            informerBottomSheet.w = transparentWidget;
            informerBottomSheet.setTargetController(transparentWidget);
            br4 parentController = transparentWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(informerBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
                return;
            }
            return;
        }
        vhe vheVar = (vhe) ((e5d) transparentWidget.c.getAccessor().c(26)).h6.a(e5d.S6[373]).i();
        if (vheVar == null || (map2 = vheVar.g) == null || (str = (String) map2.get((String) transparentWidget.l.getValue())) == null) {
            str = vheVar != null ? vheVar.f : null;
        }
        String strJ0 = str != null ? z5h.J0(str, "\\n", "\n") : null;
        vv vvVar3 = transparentWidget.b;
        zv8 zv8Var3 = zv8VarArr[2];
        int i = ((Boolean) vvVar3.a(transparentWidget)).booleanValue() ? R.drawable.icon_change_camera : R.drawable.icon_download;
        vv vvVar4 = transparentWidget.b;
        zv8 zv8Var4 = zv8VarArr[2];
        if (((Boolean) vvVar4.a(transparentWidget)).booleanValue()) {
            if (vheVar == null || (map = vheVar.e) == null || (str2 = (String) map.get((String) transparentWidget.l.getValue())) == null) {
                str2 = vheVar != null ? vheVar.b : "";
            }
            tnhVar = new xnh(str2);
        } else {
            tnhVar = new tnh(R.string.download);
        }
        ynh ynhVar = tnhVar;
        vv vvVar5 = transparentWidget.b;
        zv8 zv8Var5 = zv8VarArr[2];
        kc4 kc4Var = new kc4(((Boolean) vvVar5.a(transparentWidget)).booleanValue() ? 1 : 2, ynhVar, 3, true, 3, 4);
        kc4 kc4Var2 = new kc4(0, new tnh(R.string.no), 2, 32);
        String str5 = vheVar != null ? vheVar.a : null;
        jc4 jc4VarA = mol.a(new xnh(str5 != null ? str5 : ""), null, null, 6);
        jc4VarA.h(new oc4(i, 1, 4));
        vv vvVar6 = transparentWidget.d;
        if (strJ0 != null) {
            zv8 zv8Var6 = zv8VarArr[3];
            xnhVar = new xnh(String.format(strJ0, Arrays.copyOf(new Object[]{(CharSequence) vvVar6.a(transparentWidget)}, 1)));
        } else {
            zv8 zv8Var7 = zv8VarArr[3];
            xnhVar = new xnh((CharSequence) vvVar6.a(transparentWidget));
        }
        jc4VarA.g(xnhVar);
        jc4VarA.a.putBoolean("memorize_keyboard", false);
        jc4VarA.a(kc4Var);
        jc4VarA.a(kc4Var2);
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(transparentWidget);
        ln5 ln5Var = new ln5(confirmationBottomSheetF, new z3i(transparentWidget, 1));
        if (confirmationBottomSheetF.getRouter() != null) {
            confirmationBottomSheetF.getRouter().a(ln5Var);
        } else {
            confirmationBottomSheetF.addLifecycleListener(new bb(confirmationBottomSheetF, ln5Var, 17));
        }
        zv8[] zv8VarArr3 = BottomSheetWidget.t;
        confirmationBottomSheetF.setTargetController(transparentWidget);
        br4 parentController2 = transparentWidget;
        while (parentController2.getParentController() != null) {
            parentController2 = parentController2.getParentController();
        }
        RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
        hveVarU1 = rootController2 != null ? rootController2.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
            p.k(false, lveVar2, true, "BottomSheetWidget");
            hveVarU1.I(lveVar2);
        }
    }
}
