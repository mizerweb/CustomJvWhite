package one.me.sdk.permissionhost;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import defpackage.a4c;
import defpackage.bb;
import defpackage.br4;
import defpackage.gm0;
import defpackage.id8;
import defpackage.isc;
import defpackage.iua;
import defpackage.j95;
import defpackage.jd8;
import defpackage.je9;
import defpackage.jsc;
import defpackage.kd8;
import defpackage.ksc;
import defpackage.ld8;
import defpackage.ln5;
import defpackage.lsc;
import defpackage.ny8;
import defpackage.ore;
import defpackage.poe;
import defpackage.roe;
import defpackage.sbi;
import defpackage.svj;
import defpackage.vv;
import defpackage.wsc;
import defpackage.ysc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.info.InfoBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003BG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0002\u0010\u000eBK\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lone/me/sdk/permissionhost/PermissionBottomSheet;", "Lone/me/sdk/bottomsheet/info/InfoBottomSheetWidget;", "<init>", "()V", "", "", "permissions", "", "requestCode", "titleId", "rationaleId", "positiveButtonId", "Llsc;", "icon", "([Ljava/lang/String;IIIILlsc;)V", "Landroid/content/Intent;", "customSettingsIntent", "", "showCancelButton", "openSettingsButtonTextRes", "(ILjava/lang/Integer;Llsc;Landroid/content/Intent;ZLjava/lang/Integer;)V", "permission-host"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PermissionBottomSheet extends InfoBottomSheetWidget {
    public static final /* synthetic */ zv8[] Y = {new z8b(PermissionBottomSheet.class, "settingsMode", "getSettingsMode()Z"), zo5.e(zfe.a, PermissionBottomSheet.class, "showCancelButton", "getShowCancelButton()Z"), new z8b(PermissionBottomSheet.class, "customSettingsIntent", "getCustomSettingsIntent()Landroid/content/Intent;"), new z8b(PermissionBottomSheet.class, "titleId", "getTitleId()I"), new z8b(PermissionBottomSheet.class, "rationaleId", "getRationaleId()Ljava/lang/Integer;"), new z8b(PermissionBottomSheet.class, "positiveButtonId", "getPositiveButtonId()I"), new z8b(PermissionBottomSheet.class, "requestedPermissions", "getRequestedPermissions()[Ljava/lang/String;"), new z8b(PermissionBottomSheet.class, "requestCode", "getRequestCode()I"), new z8b(PermissionBottomSheet.class, "isCallbackSent", "isCallbackSent()Z"), new z8b(PermissionBottomSheet.class, "icon", "getIcon()Lone/me/sdk/permissions/PermissionIcon;"), new z8b(PermissionBottomSheet.class, "openSettingsButtonTextRes", "getOpenSettingsButtonTextRes()I")};
    public final vv A;
    public final vv B;
    public final vv C;
    public final vv D;
    public final vv E;
    public final vv F;
    public final vv G;
    public final vv H;
    public final vv I;
    public final vv J;
    public final vv K;
    public boolean X;
    public final ny8 z;

    public PermissionBottomSheet() {
        super(null, 1, null);
        this.z = ysc.a.a();
        this.A = new vv(Boolean.class, Boolean.TRUE, "PermissionBottomSheet.settings_mode");
        Boolean bool = Boolean.FALSE;
        this.B = new vv(Boolean.class, bool, "PermissionBottomSheet.show_cancel_button");
        this.C = new vv(Intent.class, null, "PermissionBottomSheet.custom_settings_intent");
        Class<Integer> cls = Integer.class;
        this.D = new vv("PermissionBottomSheet.title_res", cls);
        this.E = new vv("PermissionBottomSheet.rationale_res", cls);
        this.F = new vv("PermissionBottomSheet.positive_button_res", cls);
        this.G = new vv("PermissionBottomSheet.permissions", String[].class);
        this.H = new vv("PermissionBottomSheet.request_code", cls);
        this.I = new vv(Boolean.class, bool, "callback_sent");
        this.J = new vv("PermissionBottomSheet.icon", lsc.class);
        this.K = new vv("PermissionBottomSheet.key_open_settings_button_text_res", cls);
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: F1 */
    public final int getU() {
        return R.string.permissions_dialog_no;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final ld8 G1() {
        zv8 zv8Var = Y[9];
        lsc lscVar = (lsc) this.J.a(this);
        if (lscVar != null) {
            if (lscVar instanceof ksc) {
                return new kd8(((ksc) lscVar).a);
            }
            if (lscVar instanceof jsc) {
                return new jd8(((jsc) lscVar).a);
            }
            if (lscVar instanceof isc) {
                isc iscVar = (isc) lscVar;
                return new id8(iscVar.a, iscVar.b, iscVar.c, iscVar.d);
            }
            ore.o();
        }
        return null;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final int H1() {
        zv8[] zv8VarArr = Y;
        zv8 zv8Var = zv8VarArr[0];
        if (((Boolean) this.A.a(this)).booleanValue()) {
            zv8 zv8Var2 = zv8VarArr[10];
            return ((Number) this.K.a(this)).intValue();
        }
        zv8 zv8Var3 = zv8VarArr[5];
        return ((Number) this.F.a(this)).intValue();
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: I1 */
    public final int getX() {
        return R.id.oneme_permissions_positive;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final Integer J1() {
        zv8 zv8Var = Y[4];
        return (Integer) this.E.a(this);
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: K1 */
    public final int getW() {
        return R.id.oneme_permissions_rationale;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final boolean L1() {
        zv8 zv8Var = Y[1];
        return ((Boolean) this.B.a(this)).booleanValue();
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final int M1() {
        zv8 zv8Var = Y[3];
        return ((Number) this.D.a(this)).intValue();
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: N1 */
    public final int getV() {
        return R.id.oneme_permissions_title;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final void O1() {
        v1(true);
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final void P1() {
        Object poeVar;
        this.X = true;
        vv vvVar = this.A;
        zv8[] zv8VarArr = Y;
        zv8 zv8Var = zv8VarArr[0];
        if (((Boolean) vvVar.a(this)).booleanValue()) {
            try {
                vv vvVar2 = this.C;
                zv8 zv8Var2 = zv8VarArr[2];
                Intent intent = (Intent) vvVar2.a(this);
                if (intent == null) {
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getContext().getPackageName(), null));
                }
                startActivity(intent);
                poeVar = sbi.a;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String name = PermissionBottomSheet.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.r("Error while opening settings: ", thA), null);
                    }
                }
            }
        } else {
            wsc wscVar = (wsc) this.z.getValue();
            br4 targetController = getTargetController();
            Widget widget = targetController instanceof Widget ? (Widget) targetController : null;
            if (widget == null) {
                ore.p("Required value was null.");
                return;
            }
            svj svjVar = new svj(widget, 1);
            vv vvVar3 = this.G;
            zv8 zv8Var3 = zv8VarArr[6];
            String[] strArr = (String[]) vvVar3.a(this);
            if (strArr == null) {
                strArr = new String[0];
            }
            vv vvVar4 = this.H;
            zv8 zv8Var4 = zv8VarArr[7];
            wscVar.m(svjVar, strArr, ((Number) vvVar4.a(this)).intValue());
        }
        v1(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        ln5 ln5Var = new ln5(this, new iua(18, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 11));
        }
    }

    public PermissionBottomSheet(String[] strArr, int i, int i2, int i3, int i4, lsc lscVar) {
        this(i2, Integer.valueOf(i3), lscVar, null, false, null, 40, null);
        vv vvVar = this.G;
        zv8[] zv8VarArr = Y;
        zv8 zv8Var = zv8VarArr[6];
        vvVar.b(this, strArr);
        vv vvVar2 = this.H;
        zv8 zv8Var2 = zv8VarArr[7];
        vvVar2.b(this, Integer.valueOf(i));
        vv vvVar3 = this.F;
        zv8 zv8Var3 = zv8VarArr[5];
        vvVar3.b(this, Integer.valueOf(i4));
        vv vvVar4 = this.A;
        zv8 zv8Var4 = zv8VarArr[0];
        vvVar4.b(this, Boolean.FALSE);
    }

    public /* synthetic */ PermissionBottomSheet(int i, Integer num, lsc lscVar, Intent intent, boolean z, Integer num2, int i2, j95 j95Var) {
        this(i, num, lscVar, (i2 & 8) != 0 ? null : intent, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : num2);
    }

    public PermissionBottomSheet(int i, Integer num, lsc lscVar, Intent intent, boolean z, Integer num2) {
        this();
        vv vvVar = this.D;
        zv8[] zv8VarArr = Y;
        zv8 zv8Var = zv8VarArr[3];
        vvVar.b(this, Integer.valueOf(i));
        vv vvVar2 = this.E;
        zv8 zv8Var2 = zv8VarArr[4];
        vvVar2.b(this, num);
        vv vvVar3 = this.J;
        zv8 zv8Var3 = zv8VarArr[9];
        vvVar3.b(this, lscVar);
        vv vvVar4 = this.C;
        zv8 zv8Var4 = zv8VarArr[2];
        vvVar4.b(this, intent);
        vv vvVar5 = this.B;
        zv8 zv8Var5 = zv8VarArr[1];
        vvVar5.b(this, Boolean.valueOf(z));
        int iIntValue = num2 != null ? num2.intValue() : R.string.permissions_dialog_open_setting;
        vv vvVar6 = this.K;
        zv8 zv8Var6 = zv8VarArr[10];
        vvVar6.b(this, Integer.valueOf(iIntValue));
    }
}
