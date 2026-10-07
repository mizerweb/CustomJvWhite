package one.me.sdk.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a8g;
import defpackage.c23;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.ic4;
import defpackage.kbc;
import defpackage.kc4;
import defpackage.lc4;
import defpackage.mc4;
import defpackage.ny8;
import defpackage.ore;
import defpackage.pc4;
import defpackage.pe3;
import defpackage.poe;
import defpackage.pq3;
import defpackage.qfg;
import defpackage.qt4;
import defpackage.rc4;
import defpackage.rx8;
import defpackage.tre;
import defpackage.vv;
import defpackage.ww3;
import defpackage.xbd;
import defpackage.y3f;
import defpackage.ynh;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo3;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "jc4", "pc4", "ic4", "kc4", "lc4", "mc4", "bottom-sheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] G = {new dwd(ConfirmationBottomSheet.class, "icon", "getIcon()Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Icon;", 0), zo5.f(zfe.a, ConfirmationBottomSheet.class, "avatar", "getAvatar()Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Avatar;", 0), new dwd(ConfirmationBottomSheet.class, "title", "getTitle()Lone/me/sdk/textsource/TextSource;", 0), new dwd(ConfirmationBottomSheet.class, "description", "getDescription()Lone/me/sdk/textsource/TextSource;", 0), new dwd(ConfirmationBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new dwd(ConfirmationBottomSheet.class, "checkBoxRow", "getCheckBoxRow()Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$CheckBoxRow;", 0), new dwd(ConfirmationBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new z8b(ConfirmationBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final vv A;
    public final boolean B;
    public final vv C;
    public zo3 D;
    public final d4f E;
    public final ny8 F;
    public final vv u;
    public final vv v;
    public final vv w;
    public final vv x;
    public final vv y;
    public final vv z;

    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    public ConfirmationBottomSheet(Bundle bundle) {
        Object poeVar;
        d4f d4fVarF;
        super(bundle);
        this.u = new vv(pc4.class, null, "icon");
        this.v = new vv(ic4.class, null, "avatar");
        this.w = new vv("title", ynh.class);
        this.x = new vv(ynh.class, null, "description");
        this.y = new vv(ArrayList.class, new ArrayList(), "buttons");
        this.z = new vv(lc4.class, null, "option_row");
        this.A = new vv(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.B = getArgs().getBoolean("memorize_keyboard", true);
        this.C = new vv(Boolean.class, Boolean.FALSE, "callback_sent");
        String string = getArgs().getString("stat_screen");
        if (string != null) {
            try {
                poeVar = y3f.valueOf(string);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            y3f y3fVar = (y3f) (poeVar instanceof poe ? null : poeVar);
            if (y3fVar != null) {
                d4fVarF = tre.F(this, y3fVar);
            } else {
                d4fVarF = super.getU();
            }
        } else {
            d4fVarF = super.getU();
        }
        this.E = d4fVarF;
        this.F = rx8.P(3, new pe3(8, this));
    }

    public static void J1(ImageView imageView, pc4 pc4Var) {
        int iIntValue;
        int iIntValue2;
        if (pc4Var == null) {
            return;
        }
        int iD = qt4.D(pc4Var.w());
        a8g a8gVar = pq3.j;
        if (iD == 0) {
            imageView.setBackground(null);
            a8gVar.h(imageView);
            iIntValue = 0;
        } else if (iD == 1) {
            imageView.setBackground(new ShapeDrawable(new OvalShape()));
            iIntValue = a8gVar.h(imageView).h().b;
        } else if (iD == 2) {
            imageView.setBackground(new ShapeDrawable(new qfg(2.3d)));
            iIntValue = a8gVar.h(imageView).h().b;
        } else {
            if (iD != 3) {
                ore.o();
                return;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new qfg(2.3d));
            shapeDrawable.setAlpha(40);
            imageView.setBackground(shapeDrawable);
            iIntValue = a8gVar.h(imageView).h().a;
        }
        int iD2 = qt4.D(pc4Var.w());
        if (iD2 == 0) {
            iIntValue2 = a8gVar.h(imageView).getIcon().b;
        } else if (iD2 == 1 || iD2 == 2) {
            iIntValue2 = a8gVar.h(imageView).getIcon().c;
        } else {
            if (iD2 != 3) {
                ore.o();
                return;
            }
            iIntValue2 = a8gVar.h(imageView).getIcon().h;
        }
        Integer numZ = pc4Var.z();
        if (numZ != null) {
            iIntValue2 = numZ.intValue();
        }
        imageView.setImageTintList(ColorStateList.valueOf(iIntValue2));
        Drawable background = imageView.getBackground();
        if (background != null) {
            Integer numQ = pc4Var.q();
            if (numQ != null) {
                iIntValue = numQ.intValue();
            }
            background.setTint(iIntValue);
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        zv8[] zv8VarArr = G;
        zv8 zv8Var = zv8VarArr[2];
        CharSequence charSequenceB = ((ynh) this.w.a(this)).b(getContext());
        if (charSequenceB == null) {
            ore.p("Required value was null.");
            return null;
        }
        ynh ynhVarF1 = F1();
        CharSequence charSequenceB2 = ynhVarF1 != null ? ynhVarF1.b(layoutInflater.getContext()) : null;
        zv8 zv8Var2 = zv8VarArr[4];
        ArrayList arrayList = (ArrayList) this.y.a(this);
        kc4 kc4Var = (kc4) ww3.t1(arrayList);
        return new rc4(this, charSequenceB, charSequenceB2, arrayList, kc4Var != null ? Integer.valueOf(kc4Var.a) : null, layoutInflater.getContext());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* JADX INFO: renamed from: E1, reason: from getter */
    public final boolean getB() {
        return this.B;
    }

    public final ynh F1() {
        zv8 zv8Var = G[3];
        return (ynh) this.x.a(this);
    }

    public final pc4 G1() {
        zv8 zv8Var = G[0];
        return (pc4) this.u.a(this);
    }

    public final Bundle H1() {
        zv8 zv8Var = G[6];
        return (Bundle) this.A.a(this);
    }

    public final boolean I1() {
        zv8 zv8Var = G[7];
        return ((Boolean) this.C.a(this)).booleanValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate, reason: from getter */
    public final d4f getU() {
        return this.E;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new c23(this, 1);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return (kbc) this.F.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        Object targetController = getTargetController();
        mc4 mc4Var = targetController instanceof mc4 ? (mc4) targetController : null;
        if (mc4Var != null) {
            mc4Var.D0();
        }
        if (I1()) {
            return;
        }
        Object targetController2 = getTargetController();
        mc4 mc4Var2 = targetController2 instanceof mc4 ? (mc4) targetController2 : null;
        if (mc4Var2 != null) {
            mc4Var2.H(H1());
        }
    }
}
