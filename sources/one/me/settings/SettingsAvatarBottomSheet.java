package one.me.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dwd;
import defpackage.j95;
import defpackage.jqf;
import defpackage.ore;
import defpackage.vv;
import defpackage.ynh;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "iqf", "settings-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] y = {new dwd(SettingsAvatarBottomSheet.class, "title", "getTitle()Lone/me/sdk/textsource/TextSource;", 0), zo5.f(zfe.a, SettingsAvatarBottomSheet.class, "description", "getDescription()Lone/me/sdk/textsource/TextSource;", 0), new dwd(SettingsAvatarBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new dwd(SettingsAvatarBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new z8b(SettingsAvatarBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final vv u;
    public final vv v;
    public final vv w;
    public final vv x;

    public SettingsAvatarBottomSheet() {
        super(new Bundle());
        this.u = new vv("title", ynh.class);
        this.v = new vv(ynh.class, null, "description");
        this.w = new vv(ArrayList.class, new ArrayList(), "buttons");
        this.x = new vv(Boolean.class, Boolean.FALSE, "callback_sent");
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        zv8[] zv8VarArr = y;
        zv8 zv8Var = zv8VarArr[0];
        CharSequence charSequenceB = ((ynh) this.u.a(this)).b(getContext());
        if (charSequenceB == null) {
            ore.p("Required value was null.");
            return null;
        }
        zv8 zv8Var2 = zv8VarArr[1];
        ynh ynhVar = (ynh) this.v.a(this);
        CharSequence charSequenceB2 = ynhVar != null ? ynhVar.b(layoutInflater.getContext()) : null;
        zv8 zv8Var3 = zv8VarArr[2];
        return new jqf(this, charSequenceB, charSequenceB2, (ArrayList) this.w.a(this), layoutInflater.getContext());
    }

    public SettingsAvatarBottomSheet(Bundle bundle, j95 j95Var) {
        super(bundle);
        this.u = new vv("title", ynh.class);
        this.v = new vv(ynh.class, null, "description");
        this.w = new vv(ArrayList.class, new ArrayList(), "buttons");
        this.x = new vv(Boolean.class, Boolean.FALSE, "callback_sent");
    }
}
