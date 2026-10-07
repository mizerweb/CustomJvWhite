package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Arrays;
import java.util.Collection;
import java.util.MissingFormatArgumentException;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class up4 implements pp4 {
    public final Bundle a;

    public up4(ha9 ha9Var) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
    }

    public static boolean A(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String C(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public Bundle B() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.pp4
    public pp4 a() {
        Rect rect = tv7.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.pp4
    public pp4 b() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.pp4
    public qp4 build() {
        return new ContextMenuBottomSheet(new Bundle(this.a));
    }

    @Override // defpackage.pp4
    public pp4 f(View view) {
        if (view.getId() == -1) {
            ore.k("Check failed.");
            return null;
        }
        int id = view.getId();
        Bundle bundle = this.a;
        bundle.putInt("anchor_id", id);
        bundle.putSerializable("anchor_class", view.getClass());
        return this;
    }

    @Override // defpackage.pp4
    public pp4 g() {
        zpe zpeVar = BaseBottomSheetWidget.i;
        zv8[] zv8VarArr = ContextMenuBottomSheet.C;
        BaseBottomSheetWidget.i.getClass();
        this.a.putBoolean(BaseBottomSheetWidget.k, true);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 h(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 l(Collection collection) {
        this.a.putBundle("actions", mpl.a(collection));
        return this;
    }

    @Override // defpackage.pp4
    public pp4 o(float f) {
        Rect rect = tv7.b;
        Rect rect2 = tv7.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 p(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 q() {
        this.a.putInt("parent_id", R.id.messages_list_recycler_view);
        return this;
    }

    @Override // defpackage.pp4
    public pp4 t(ynh ynhVar) {
        this.a.putParcelable("header", ynhVar);
        return this;
    }

    public boolean v(String str) {
        String strZ = z(str);
        return "1".equals(strZ) || Boolean.parseBoolean(strZ);
    }

    public Integer w(String str) {
        String strZ = z(str);
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strZ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + C(str) + "(" + strZ + ") into an int");
            return null;
        }
    }

    public JSONArray x(String str) {
        String strZ = z(str);
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        try {
            return new JSONArray(strZ);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + C(str) + ": " + strZ + ", falling back to default");
            return null;
        }
    }

    public String y(Resources resources, String str, String str2) {
        String[] strArr;
        String strZ = z(str2);
        if (!TextUtils.isEmpty(strZ)) {
            return strZ;
        }
        String strZ2 = z(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strZ2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strZ2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayX = x(str2.concat("_loc_args"));
        if (jSONArrayX == null) {
            strArr = null;
        } else {
            int length = jSONArrayX.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayX.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + C(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String z(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public up4(Bundle bundle) {
        this.a = new Bundle(bundle);
    }
}
